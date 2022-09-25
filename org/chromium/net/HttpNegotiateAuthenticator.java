package org.chromium.net;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import java.util.Map;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.C72382h;
import org.chromium.base.C72387m;
import org.chromium.base.ThreadUtils;
import p000J.C0000N;

/* compiled from: PG */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "net_auth";
    private final String mAccountType;
    private Bundle mSpnegoContext;

    protected HttpNegotiateAuthenticator(String str) {
        this.mAccountType = str;
    }

    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    /* access modifiers changed from: private */
    public void processResult(Bundle bundle, C72438h hVar) {
        this.mSpnegoContext = bundle.getBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i = -9;
        switch (bundle.getInt(HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1)) {
            case 0:
                i = 0;
                break;
            case 2:
                i = -3;
                break;
            case 3:
                i = NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                break;
            case 4:
                i = NetError.ERR_INVALID_RESPONSE;
                break;
            case 5:
                i = NetError.ERR_INVALID_AUTH_CREDENTIALS;
                break;
            case 6:
                i = NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case 7:
                i = NetError.ERR_MISSING_AUTH_CREDENTIALS;
                break;
            case 8:
                i = NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                break;
            case 9:
                i = NetError.ERR_MALFORMED_IDENTITY;
                break;
        }
        C0000N.M0s8NeYn(hVar.f192659a, this, i, bundle.getString("authtoken"));
    }

    private void requestTokenWithActivity(Context context, Activity activity, C72438h hVar, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", false)) {
            C72387m.m107041b(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS");
            C0000N.M0s8NeYn(hVar.f192659a, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, (String) null);
            return;
        }
        hVar.f192660b.getAuthTokenByFeatures(this.mAccountType, hVar.f192662d, strArr, activity, (Bundle) null, hVar.f192661c, new C72437g(this, hVar), new Handler(ThreadUtils.m107028a().getLooper()));
    }

    private void requestTokenWithoutActivity(Context context, C72438h hVar, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            C72387m.m107041b(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
            C0000N.M0s8NeYn(hVar.f192659a, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, (String) null);
            return;
        }
        hVar.f192660b.getAccountsByTypeAndFeatures(this.mAccountType, strArr, new C72435e(this, hVar), new Handler(ThreadUtils.m107028a().getLooper()));
    }

    /* access modifiers changed from: package-private */
    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = C72382h.f192527a;
        C72438h hVar = new C72438h();
        hVar.f192662d = HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE.concat(String.valueOf(str));
        hVar.f192660b = AccountManager.get(context);
        hVar.f192659a = j;
        String[] strArr = {HttpNegotiateConstants.SPNEGO_FEATURE};
        hVar.f192661c = new Bundle();
        if (str2 != null) {
            hVar.f192661c.putString(HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, str2);
        }
        Bundle bundle = this.mSpnegoContext;
        if (bundle != null) {
            hVar.f192661c.putBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle);
        }
        hVar.f192661c.putBoolean(HttpNegotiateConstants.KEY_CAN_DELEGATE, z);
        Map map = ApplicationStatus.f192472a;
        requestTokenWithoutActivity(context, hVar, strArr);
    }

    public boolean lacksPermission(Context context, String str, boolean z) {
        return !z && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0;
    }
}
