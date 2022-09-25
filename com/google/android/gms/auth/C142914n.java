package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.p10745a.C142905a;
import com.google.android.gms.auth.p10737a.p10738a.C142846ae;
import com.google.android.gms.common.C143697a;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.C144023z;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.internal.C143890af;
import com.google.android.gms.common.internal.C143891ag;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10780c.C143858a;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.libraries.phenotype.client.C31654aj;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5304e.p5305a.p5306a.p5390n.p5391a.p5392a.C68823a;
import p5304e.p5305a.p5306a.p5390n.p5391a.p5392a.C68827e;

/* renamed from: com.google.android.gms.auth.n */
/* compiled from: PG */
public class C142914n {

    /* renamed from: b */
    public static final String[] f387818b = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: c */
    public static final String f387819c = "androidPackageName";

    /* renamed from: d */
    public static final ComponentName f387820d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: e */
    public static final C143858a f387821e = C142839a.m231773a("GoogleAuthUtil");

    /* renamed from: b */
    private static Object m231854b(C146006ab abVar) {
        try {
            return C146021aq.m237853g(abVar, 5000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof C143842n) {
                throw ((C143842n) cause);
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{"hasCapabilities "});
            f387821e.mo119307d(format, new Object[0]);
            throw new IOException(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{"hasCapabilities "});
            f387821e.mo119307d(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{"hasCapabilities "});
            f387821e.mo119307d(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    /* renamed from: c */
    public static int m231855c(Context context, HasCapabilitiesRequest hasCapabilitiesRequest) {
        if (C68823a.m99395d()) {
            Bundle bundle = new Bundle();
            m231864l(context, bundle);
            hasCapabilitiesRequest.f387644c = bundle;
        }
        if (!C68823a.m99396e() || !m231865m(context, C68823a.m99394b().f178307a)) {
            return ((Integer) m231868p(context, f387820d, new C142907g(hasCapabilitiesRequest))).intValue();
        }
        C146006ab d = new C142846ae(context).mo117781d(hasCapabilitiesRequest);
        Integer num = 3;
        try {
            num = (Integer) m231854b(d);
        } catch (C143842n e) {
            m231863k(e, "hasCapabilities ");
        } catch (TimeoutException e2) {
            f387821e.mo119307d("%s timed out using GoogleAuthServiceClient, falling back to previous approach:\n%s", "hasCapabilities ", Log.getStackTraceString(e2));
        }
        m231870r(num);
        return num.intValue();
    }

    /* renamed from: d */
    public static TokenData m231856d(Bundle bundle) {
        TokenData tokenData;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        C143919bh.m233958a(string);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        C142905a a = C142905a.m231844a(string);
        if (C142905a.m231845b(a)) {
            f387821e.mo119307d("isUserRecoverableError status: ".concat(String.valueOf(String.valueOf(a))), new Object[0]);
            throw new UserRecoverableAuthException(string, intent);
        } else if (C142905a.NETWORK_ERROR.equals(a) || C142905a.SERVICE_UNAVAILABLE.equals(a) || C142905a.INTNERNAL_ERROR.equals(a) || C142905a.AUTH_SECURITY_ERROR.equals(a) || C142905a.ACCOUNT_NOT_PRESENT.equals(a)) {
            throw new IOException(string);
        } else {
            throw new C142903e(string);
        }
    }

    /* renamed from: e */
    public static Object m231857e(C146006ab abVar, String str) {
        try {
            return C146021aq.m237852f(abVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof C143842n) {
                throw ((C143842n) cause);
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            f387821e.mo119307d(format, new Object[0]);
            throw new IOException(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            f387821e.mo119307d(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            f387821e.mo119307d(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    /* renamed from: f */
    public static String m231858f(Context context, String str) {
        C143919bh.m233970m(str, "accountName must be provided");
        C143919bh.m233965h("Calling this from your main thread can lead to deadlock");
        m231862j(context, 8400000);
        return m231861i(context, str, "^^_account_id_^^", new Bundle());
    }

    /* renamed from: g */
    public static String m231859g(Context context, Account account, String str) {
        return m231860h(context, account, str, new Bundle());
    }

    /* renamed from: h */
    public static String m231860h(Context context, Account account, String str, Bundle bundle) {
        m231853a(account);
        return m231869q(context, account, str, bundle).f387646b;
    }

    @Deprecated
    /* renamed from: i */
    public static String m231861i(Context context, String str, String str2, Bundle bundle) {
        return m231860h(context, new Account(str, "com.google"), str2, bundle);
    }

    /* renamed from: j */
    public static void m231862j(Context context, int i) {
        try {
            C143700ab.m233443e(context.getApplicationContext(), i);
        } catch (C144023z e) {
            throw new C142916p(e.f390261a, e.getMessage(), e.mo119087a());
        } catch (GooglePlayServicesIncorrectManifestValueException | C144022y e2) {
            throw new C142903e(e2.getMessage(), e2);
        }
    }

    /* renamed from: k */
    public static void m231863k(C143842n nVar, String str) {
        f387821e.mo119307d("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(nVar));
    }

    /* renamed from: l */
    public static void m231864l(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f387819c;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    /* renamed from: m */
    public static boolean m231865m(Context context, List list) {
        String str = context.getApplicationInfo().packageName;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m231866n(Context context) {
        if (C143875g.f389987a.mo119362j(context, 17895000) != 0) {
            return false;
        }
        return m231865m(context, C68827e.f184914a.mo6453a().mo60517a().f178307a);
    }

    /* renamed from: o */
    public static void m231867o(Context context, String str) {
        C143919bh.m233965h("Calling this from your main thread can lead to deadlock");
        m231862j(context, 8400000);
        Bundle bundle = new Bundle();
        m231864l(context, bundle);
        C31654aj.m58985d(context);
        if (C68827e.m99408c() && m231866n(context)) {
            C142846ae aeVar = new C142846ae(context);
            ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
            clearTokenRequest.f387807b = str;
            try {
                m231857e(aeVar.mo117778a(clearTokenRequest), "clear token");
                return;
            } catch (C143842n e) {
                m231863k(e, "clear token");
            }
        }
        m231868p(context, f387820d, new C142911k(str, bundle));
    }

    /* renamed from: p */
    public static Object m231868p(Context context, ComponentName componentName, C142913m mVar) {
        C143697a aVar = new C143697a();
        C143891ag a = C143891ag.m233922a(context);
        try {
            if (a.mo119403b(new C143890af(componentName), aVar, "GoogleAuthUtil", (Executor) null)) {
                try {
                    C143919bh.m233965h("BlockingServiceConnection.getService() called on main thread");
                    if (!aVar.f389593a) {
                        aVar.f389593a = true;
                        Object a2 = mVar.mo117809a((IBinder) aVar.f389594b.take());
                        a.mo119404c(componentName, aVar);
                        return a2;
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    a.mo119404c(componentName, aVar);
                    throw th;
                }
            } else {
                throw new IOException("Could not bind to service.");
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", new Object[]{e2.getMessage()}));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    /* renamed from: q */
    public static TokenData m231869q(Context context, Account account, String str, Bundle bundle) {
        C143919bh.m233965h("Calling this from your main thread can lead to deadlock");
        C143919bh.m233970m(str, "Scope cannot be empty or null.");
        m231853a(account);
        m231862j(context, 8400000);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m231864l(context, bundle2);
        C31654aj.m58985d(context);
        if (C68827e.m99408c() && m231866n(context)) {
            try {
                Bundle bundle3 = (Bundle) m231857e(new C142846ae(context).mo117780c(account, str, bundle2), "token retrieval");
                m231870r(bundle3);
                return m231856d(bundle3);
            } catch (C143842n e) {
                m231863k(e, "token retrieval");
            }
        }
        return (TokenData) m231868p(context, f387820d, new C142909i(account, str, bundle2));
    }

    /* renamed from: r */
    public static void m231870r(Object obj) {
        if (obj == null) {
            f387821e.mo119307d("Service call returned null.", new Object[0]);
            throw new IOException("Service unavailable.");
        }
    }

    /* renamed from: a */
    private static void m231853a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = f387818b;
            int i = 0;
            while (i < 3) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }
}
