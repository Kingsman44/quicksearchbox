package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface RequestedWithHeaderMode {
        public static final int APP_PACKAGE_NAME = 1;
        public static final int NO_HEADER = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface WebAuthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    int getRequestedWithHeaderMode();

    boolean getSafeBrowsingEnabled();

    int getWebAuthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z);

    void setDisabledActionModeMenuItems(int i);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z);

    void setForceDark(int i);

    void setForceDarkBehavior(int i);

    void setOffscreenPreRaster(boolean z);

    void setRequestedWithHeaderMode(int i);

    void setSafeBrowsingEnabled(boolean z);

    void setWebAuthnSupport(int i);

    void setWillSuppressErrorPage(boolean z);
}
