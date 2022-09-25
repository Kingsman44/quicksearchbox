package com.google.android.apps.search.googleapp.incognito.p10329g;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.C0897aa;
import androidx.biometric.C0898ab;
import androidx.biometric.C0899ac;
import androidx.biometric.C0903ag;
import androidx.biometric.C0908al;
import androidx.biometric.C0916at;
import androidx.biometric.C0917au;
import androidx.biometric.C0925bb;
import androidx.biometric.C0926bc;
import androidx.biometric.C0927bd;
import androidx.biometric.C0928be;
import androidx.biometric.C0932f;
import androidx.biometric.C0948v;
import androidx.biometric.C0951y;
import androidx.biometric.C0952z;
import androidx.core.content.C1881g;
import androidx.core.p085a.p086a.C1782c;
import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.googleapp.incognito.p10320b.p10321a.C136231b;
import com.google.android.apps.search.googleapp.incognito.p10331h.p10332a.C136342d;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.j */
/* compiled from: PG */
public final class C136320j {

    /* renamed from: a */
    public static final C59071e f371170a = C59071e.m91332i("com.google.android.apps.search.googleapp.incognito.g.j");

    /* renamed from: b */
    public final Context f371171b;

    /* renamed from: c */
    public final C136318h f371172c;

    /* renamed from: d */
    public final AccountId f371173d;

    /* renamed from: e */
    public final C136231b f371174e;

    /* renamed from: f */
    public final C46801dp f371175f;

    /* renamed from: g */
    public final C136342d f371176g;

    /* renamed from: h */
    private final Activity f371177h;

    /* renamed from: com.google.android.apps.search.googleapp.incognito.g.j$a */
    /* compiled from: PG */
    final class C136321a implements C46792di {

        /* renamed from: b */
        private final C136231b f371179b;

        public C136321a(C136231b bVar) {
            this.f371179b = bVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C136320j.this.mo112917d(false, false);
            ((C59052c) ((C59052c) ((C59052c) C136320j.f371170a.mo56225c()).mo56382g(th)).mo56372aa(40708)).mo56386p("Failed to load Incognito biometric settings.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            Boolean bool = (Boolean) obj;
            C136320j jVar = C136320j.this;
            if (jVar.mo112915b() == null && ((C136294ab) jVar.f371172c.getChildFragmentManager().f634a.mo671c("incognito_setup_device_biometrics_dialog")) == null && ((C136312b) jVar.f371172c.getChildFragmentManager().f634a.mo671c("incognito_enable_biometrics_dialog")) == null) {
                int a = C136320j.this.mo112914a();
                if (a != 0) {
                    if (a != 11) {
                        C136320j.this.mo112917d(false, false);
                    } else {
                        C136320j.this.mo112917d(true, true);
                    }
                } else if (!this.f371179b.f371015d) {
                    C136320j jVar2 = C136320j.this;
                    AccountId accountId = jVar2.f371173d;
                    C136312b bVar = new C136312b();
                    C68324h.m98669f(bVar);
                    C47247a.m84047b(bVar, accountId);
                    bVar.showNow(jVar2.f371172c.getChildFragmentManager(), "incognito_enable_biometrics_dialog");
                } else if (bool.booleanValue()) {
                    C136320j.this.mo112916c();
                } else {
                    C136320j.this.mo112917d(true, false);
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C136320j(Context context, C136318h hVar, AccountId accountId, C136231b bVar, Activity activity, C46801dp dpVar, C136342d dVar) {
        this.f371171b = context;
        this.f371172c = hVar;
        this.f371173d = accountId;
        this.f371174e = bVar;
        this.f371177h = activity;
        this.f371175f = dpVar;
        this.f371176g = dVar;
    }

    /* renamed from: a */
    public final int mo112914a() {
        BiometricPrompt.CryptoObject a;
        C0898ab abVar = new C0898ab(this.f371171b);
        BiometricManager b = C0952z.m2881b(abVar.f2980a);
        Object obj = null;
        C1782c cVar = Build.VERSION.SDK_INT <= 29 ? new C1782c(abVar.f2980a) : null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (b != null) {
                return C0897aa.m2798a(b, PrivateKeyType.INVALID);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        } else if (!C0932f.m2853b(PrivateKeyType.INVALID)) {
            return -2;
        } else {
            if (C0925bb.m2845a(abVar.f2980a) == null) {
                return 12;
            }
            if (C0932f.m2852a(PrivateKeyType.INVALID)) {
                return C0926bc.m2847a(abVar.f2980a) ? 0 : 11;
            }
            if (Build.VERSION.SDK_INT != 29) {
                return C0899ac.m2799a(cVar);
            }
            if (C0932f.m2854c(PrivateKeyType.INVALID)) {
                return C0899ac.m2800b(b);
            }
            Method c = C0952z.m2882c();
            if (!(c == null || (a = C0916at.m2836a(C0916at.m2837b())) == null)) {
                try {
                    if (Build.VERSION.SDK_INT == 29) {
                        obj = c.invoke(b, new Object[]{a});
                    }
                    if (obj instanceof Integer) {
                        return ((Integer) obj).intValue();
                    }
                    Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                }
            }
            int b2 = C0899ac.m2800b(b);
            Context context = abVar.f2980a;
            String str = Build.MODEL;
            if ((Build.VERSION.SDK_INT < 30 && C0917au.m2838a(context, str, R.array.assume_strong_biometrics_models)) || b2 != 0) {
                return b2;
            }
            if (!C0926bc.m2847a(abVar.f2980a)) {
                return C0899ac.m2799a(cVar);
            }
            return C0899ac.m2799a(cVar) == 0 ? 0 : -1;
        }
    }

    /* renamed from: b */
    public final C136328q mo112915b() {
        return (C136328q) this.f371172c.getChildFragmentManager().f634a.mo671c("incognito_resume_dialog");
    }

    /* renamed from: c */
    public final void mo112916c() {
        if (mo112914a() != 0) {
            Dialog dialog = this.f371172c.getDialog();
            dialog.getClass();
            dialog.dismiss();
            return;
        }
        mo112918e(this.f371172c.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        C136318h hVar = this.f371172c;
        Executor a = C1881g.m5136a(this.f371171b);
        C136319i iVar = new C136319i(this);
        if (hVar == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        } else if (a != null) {
            FragmentManager childFragmentManager = hVar.getChildFragmentManager();
            C0908al alVar = (C0908al) new C2368bp(hVar).mo5770a(C0908al.class);
            hVar.f371163a.mo5790b(new BiometricPrompt.ResetCallbackObserver(alVar));
            alVar.f2993a = a;
            alVar.f2994b = iVar;
            String string = this.f371171b.getString(R.string.googleapp_incognito_biometric_prompt_title);
            String string2 = this.f371171b.getString(R.string.googleapp_incognito_biometric_prompt_subtitle);
            if (TextUtils.isEmpty(string)) {
                throw new IllegalArgumentException("Title must be set and non-empty.");
            } else if (C0932f.m2853b(33023)) {
                boolean a2 = C0932f.m2852a(33023);
                if (TextUtils.isEmpty((CharSequence) null) && !a2) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                } else if (TextUtils.isEmpty((CharSequence) null) || !a2) {
                    C0903ag agVar = new C0903ag(string, string2);
                    if (childFragmentManager == null) {
                        Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                    } else if (!childFragmentManager.mo461ab()) {
                        C0951y yVar = (C0951y) childFragmentManager.f634a.mo671c("androidx.biometric.BiometricFragment");
                        boolean z = false;
                        if (yVar == null) {
                            yVar = new C0951y();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("host_activity", false);
                            yVar.setArguments(bundle);
                            C0154a aVar = new C0154a(childFragmentManager);
                            aVar.mo685r(yVar, "androidx.biometric.BiometricFragment");
                            aVar.mo505b(true);
                            childFragmentManager.mo467ah();
                        }
                        C0908al alVar2 = yVar.f3048a;
                        alVar2.f2995c = agVar;
                        alVar2.f2996d = null;
                        alVar2.f2999g = null;
                        if (Build.VERSION.SDK_INT == 29) {
                            Bundle arguments = yVar.getArguments();
                            Context context = yVar.getContext();
                            if (!arguments.getBoolean("has_fingerprint", (context == null || context.getPackageManager() == null || !C0927bd.m2848a(context.getPackageManager())) ? false : true)) {
                                Bundle arguments2 = yVar.getArguments();
                                Context context2 = yVar.getContext();
                                if (!arguments2.getBoolean("has_face", (context2 == null || context2.getPackageManager() == null || !C0928be.m2849a(context2.getPackageManager())) ? false : true)) {
                                    Bundle arguments3 = yVar.getArguments();
                                    Context context3 = yVar.getContext();
                                    if (!(context3 == null || context3.getPackageManager() == null || !C0928be.m2850b(context3.getPackageManager()))) {
                                        z = true;
                                    }
                                    if (!arguments3.getBoolean("has_iris", z)) {
                                        yVar.f3048a.f3001i = true;
                                        yVar.mo3561b();
                                        return;
                                    }
                                }
                            }
                        }
                        if (yVar.f3048a.f3003k) {
                            yVar.f3049b.postDelayed(new C0948v(yVar), 600);
                        } else {
                            yVar.mo3562c();
                        }
                    } else {
                        Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
                    }
                } else {
                    throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                }
            } else {
                throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": BIOMETRIC_WEAK | DEVICE_CREDENTIAL");
            }
        } else {
            throw new IllegalArgumentException("Executor must not be null.");
        }
    }

    /* renamed from: d */
    public final void mo112917d(boolean z, boolean z2) {
        AccountId accountId = this.f371173d;
        C136329r rVar = (C136329r) C136330s.f371189d.createBuilder();
        rVar.copyOnWrite();
        C136330s sVar = (C136330s) rVar.instance;
        sVar.f371191a |= 1;
        sVar.f371192b = z;
        rVar.copyOnWrite();
        C136330s sVar2 = (C136330s) rVar.instance;
        sVar2.f371191a |= 2;
        sVar2.f371193c = z2;
        C136328q qVar = new C136328q();
        C68324h.m98669f(qVar);
        C47247a.m84047b(qVar, accountId);
        C47243l.m84039a(qVar, (C136330s) rVar.build());
        qVar.showNow(this.f371172c.getChildFragmentManager(), "incognito_resume_dialog");
    }

    /* renamed from: e */
    public final void mo112918e(int i) {
        try {
            this.f371177h.setRequestedOrientation(i);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f371170a.mo56225c()).mo56382g(e)).mo56372aa(40709)).mo56386p("Unable to setRequestedOrientation.");
        }
    }
}
