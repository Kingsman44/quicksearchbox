package com.google.android.gms.auth.firstparty.p10745a;

/* renamed from: com.google.android.gms.auth.firstparty.a.a */
/* compiled from: PG */
public enum C142905a {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    ILLEGAL_ARGUMENT("IllegalArgument"),
    BAD_AUTHENTICATION("BadAuthentication"),
    BAD_TOKEN_REQUEST("BAD_REQUEST"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    CHALLENGE_REQUIRED("ChallengeRequired"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    RESTRICTED_CLIENT("RESTRICTED_CLIENT"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    AUTH_SECURITY_ERROR("AuthSecurityError"),
    AUTH_BINDING_ERROR("AuthBindingError"),
    ACCOUNT_NOT_PRESENT("AccountNotPresent");
    

    /* renamed from: aj */
    private final String f387805aj;

    private C142905a(String str) {
        this.f387805aj = str;
    }

    /* renamed from: a */
    public static final C142905a m231844a(String str) {
        for (C142905a aVar : values()) {
            if (aVar.f387805aj.equals(str)) {
                return aVar;
            }
        }
        return UNKNOWN;
    }

    /* renamed from: b */
    public static boolean m231845b(C142905a aVar) {
        return BAD_AUTHENTICATION.equals(aVar) || CAPTCHA.equals(aVar) || NEED_PERMISSION.equals(aVar) || NEED_REMOTE_CONSENT.equals(aVar) || NEEDS_BROWSER.equals(aVar) || USER_CANCEL.equals(aVar) || DEVICE_MANAGEMENT_REQUIRED.equals(aVar) || DM_INTERNAL_ERROR.equals(aVar) || DM_SYNC_DISABLED.equals(aVar) || DM_ADMIN_BLOCKED.equals(aVar) || DM_ADMIN_PENDING_APPROVAL.equals(aVar) || DM_STALE_SYNC_REQUIRED.equals(aVar) || DM_DEACTIVATED.equals(aVar) || DM_REQUIRED.equals(aVar) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(aVar) || DM_SCREENLOCK_REQUIRED.equals(aVar);
    }
}
