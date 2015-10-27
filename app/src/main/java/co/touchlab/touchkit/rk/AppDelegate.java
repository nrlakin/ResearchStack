package co.touchlab.touchkit.rk;

import co.touchlab.touchkit.rk.common.Constants;
import co.touchlab.touchkit.rk.common.model.User;

public class AppDelegate
{

    public static AppDelegate instance;

    private User currentUser;

    //TODO Thread safe
    public static AppDelegate getInstance()
    {
        if(instance == null)
        {
            instance = new AppDelegate();
        }

        return instance;
    }

    private AppDelegate()
    {
        // TODO save and load user object
        currentUser = new User();
    }

    public User getCurrentUser()
    {
        return currentUser;
    }

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // File Names
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public int getStudyOverviewResourceId()
    {
        return R.raw.study_overview;
    }

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Resource Names
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    public int getLargeLogoDiseaseIcon()
    {
        return R.drawable.logo_disease_large;
    }

    public int getConsentForm()
    {
        return R.raw.study_overview_consent_form;
    }

    public String getExternalSDAppFolder()
    {
        return "demo_touchkit";
    }

    public int getAppName()
    {
        return R.string.app_name;
    }

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // Other (unorganized)
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=


    // TODO use this for deciding what info to collect during signup, hardcoded in layouts for now
    public Constants.UserInfoType[] getUserInfoTypes()
    {
        return new Constants.UserInfoType[] {
                Constants.UserInfoType.Name,
                Constants.UserInfoType.Email,
                Constants.UserInfoType.DateOfBirth,
                Constants.UserInfoType.Height,
                Constants.UserInfoType.Weight
        };
    }

}