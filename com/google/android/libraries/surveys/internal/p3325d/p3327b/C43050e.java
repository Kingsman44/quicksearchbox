package com.google.android.libraries.surveys.internal.p3325d.p3327b;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.surveys.C43169j;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import com.google.common.p4522b.C58485gu;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56565cv;
import com.google.p4281bu.p4282a.C56582h;
import com.google.p4651h.p4652a.C61644a;
import com.google.p4651h.p4652a.C61647d;
import java.util.Date;

/* renamed from: com.google.android.libraries.surveys.internal.d.b.e */
/* compiled from: PG */
public class C43050e {

    /* renamed from: a */
    public final Context f112599a;

    /* renamed from: b */
    public final String f112600b;

    /* renamed from: c */
    public final String f112601c;

    /* renamed from: d */
    protected final String f112602d;

    /* renamed from: e */
    public C43169j f112603e;

    /* renamed from: f */
    public final Handler f112604f = new Handler(Looper.getMainLooper());

    public C43050e(Context context, String str, String str2, String str3) {
        this.f112599a = context;
        this.f112600b = str;
        this.f112601c = str2;
        this.f112602d = str3;
    }

    /* renamed from: e */
    public final SurveyData mo46073e(C56582h hVar) {
        String str = this.f112600b;
        String str2 = hVar.f151075e;
        C56532bp bpVar = hVar.f151072b;
        if (bpVar == null) {
            bpVar = C56532bp.f150963g;
        }
        C56532bp bpVar2 = bpVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        } else if (bpVar2 != null) {
            C56565cv cvVar = hVar.f151071a;
            if (cvVar == null) {
                cvVar = C56565cv.f151038c;
            }
            C56565cv cvVar2 = cvVar;
            String str3 = hVar.f151073c;
            long currentTimeMillis = System.currentTimeMillis();
            C58485gu j = C58485gu.m89842j(hVar.f151074d);
            if (currentTimeMillis != 0) {
                return new SurveyDataImpl(str, str2, currentTimeMillis, cvVar2, bpVar2, str3, j);
            }
            throw new IllegalStateException("Trigger time is not set");
        } else {
            throw new IllegalArgumentException("Payload is null.");
        }
    }

    /* renamed from: f */
    public final C61647d mo46074f() {
        if (!TextUtils.isEmpty(this.f112601c)) {
            try {
                return new C61647d(new C61644a(C142914n.m231859g(this.f112599a, new Account(this.f112601c, "com.google"), "oauth2:https://www.googleapis.com/auth/supportcontent"), (Date) null));
            } catch (UserRecoverableAuthException e) {
                Log.e("SurveyNetworkConnection", "User recoverable exception happened while getting authentication token. You need to allowlist your application.", e);
                return null;
            } catch (Exception e2) {
                Log.e("SurveyNetworkConnection", "Exception occurred while getting auth credentials", e2);
                return null;
            }
        } else {
            Log.w("SurveyNetworkConnection", "Account was not set.");
            return null;
        }
    }

    /* renamed from: g */
    public final void mo46075g(int i) {
        if (this.f112603e != null) {
            this.f112604f.post(new C43046a(this));
        } else {
            Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
        }
    }
}
