package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p094f.C1893f;
import androidx.lifecycle.C2332ag;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.y */
/* compiled from: PG */
public final class C0951y extends Fragment {

    /* renamed from: a */
    public C0908al f3048a;

    /* renamed from: b */
    public final Handler f3049b = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3560a() {
        this.f3048a.f3000h = false;
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            C0924ba baVar = (C0924ba) parentFragmentManager.f634a.mo671c("androidx.biometric.FingerprintDialogFragment");
            if (baVar != null) {
                if (baVar.isAdded()) {
                    baVar.dismissAllowingStateLoss();
                } else {
                    C0154a aVar = new C0154a(parentFragmentManager);
                    aVar.mo516m(baVar);
                    aVar.mo505b(true);
                }
            }
        }
        C0908al alVar = this.f3048a;
        alVar.f3000h = false;
        if (!alVar.f3002j && isAdded()) {
            C0154a aVar2 = new C0154a(getParentFragmentManager());
            aVar2.mo516m(this);
            aVar2.mo505b(true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && C0917au.m2838a(context, str, R.array.delay_showing_prompt_models)) {
                C0908al alVar2 = this.f3048a;
                alVar2.f3003k = true;
                this.f3049b.postDelayed(new C0949w(alVar2), 600);
            }
        }
    }

    /* renamed from: b */
    public final void mo3561b() {
        Context context = getContext();
        CharSequence charSequence = null;
        KeyguardManager a = context != null ? C0925bb.m2845a(context) : null;
        if (a == null) {
            getString(R.string.generic_error_no_keyguard);
            mo3565f(12);
            mo3560a();
            return;
        }
        CharSequence g = this.f3048a.mo3539g();
        CharSequence f = this.f3048a.mo3538f();
        this.f3048a.mo3547p();
        if (f != null) {
            charSequence = f;
        }
        Intent a2 = C0943q.m2862a(a, g, charSequence);
        if (a2 == null) {
            getString(R.string.generic_error_no_device_credential);
            mo3565f(14);
            mo3560a();
            return;
        }
        this.f3048a.f3002j = true;
        mo3564e();
        a2.setFlags(134742016);
        startActivityForResult(a2, 1);
    }

    /* renamed from: c */
    public final void mo3562c() {
        C0908al alVar = this.f3048a;
        if (alVar.f3000h) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        alVar.f3000h = true;
        alVar.f3001i = true;
        Context context = getContext();
        if (context != null) {
            String str = Build.MANUFACTURER;
            if (Build.VERSION.SDK_INT == 29) {
                if (str != null) {
                    String[] stringArray = context.getResources().getStringArray(R.array.keyguard_biometric_and_credential_exclude_vendors);
                    int length = stringArray.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (str.equalsIgnoreCase(stringArray[i])) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                int a = this.f3048a.mo3534a();
                if (C0932f.m2854c(a) && C0932f.m2852a(a)) {
                    this.f3048a.f3005m = true;
                    mo3561b();
                    return;
                }
            }
        }
        mo3564e();
        BiometricPrompt.Builder a2 = C0944r.m2863a(requireContext().getApplicationContext());
        CharSequence g = this.f3048a.mo3539g();
        CharSequence f = this.f3048a.mo3538f();
        this.f3048a.mo3547p();
        if (g != null) {
            C0944r.m2869g(a2, g);
        }
        if (f != null) {
            C0944r.m2868f(a2, f);
        }
        CharSequence e = this.f3048a.mo3537e();
        if (!TextUtils.isEmpty(e)) {
            Executor h = this.f3048a.mo3540h();
            C0908al alVar2 = this.f3048a;
            if (alVar2.f2998f == null) {
                alVar2.f2998f = new C0907ak(alVar2);
            }
            C0944r.m2867e(a2, e, h, alVar2.f2998f);
        }
        C0903ag agVar = this.f3048a.f2995c;
        C0945s.m2870a(a2, true);
        int a3 = this.f3048a.mo3534a();
        if (Build.VERSION.SDK_INT >= 30) {
            C0946t.m2872a(a2, a3);
        } else {
            C0945s.m2871b(a2, C0932f.m2852a(a3));
        }
        BiometricPrompt b = C0944r.m2864b(a2);
        Context context2 = getContext();
        C0902af afVar = this.f3048a.f2996d;
        BiometricPrompt.CryptoObject a4 = C0916at.m2836a((C0902af) null);
        C0911ao c = this.f3048a.mo3536c();
        if (c.f3016a == null) {
            C0909am amVar = c.f3018c;
            c.f3016a = C0910an.m2819a();
        }
        CancellationSignal cancellationSignal = c.f3016a;
        C0947u uVar = new C0947u();
        C0908al alVar3 = this.f3048a;
        if (alVar3.f2997e == null) {
            alVar3.f2997e = new C0931e(new C0905ai(alVar3));
        }
        C0931e eVar = alVar3.f2997e;
        if (eVar.f3030a == null) {
            eVar.f3030a = C0923b.m2842a(eVar.f3031b);
        }
        BiometricPrompt.AuthenticationCallback authenticationCallback = eVar.f3030a;
        if (a4 == null) {
            try {
                C0944r.m2865c(b, cancellationSignal, uVar, authenticationCallback);
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
                if (context2 != null) {
                    context2.getString(R.string.default_error_msg);
                }
                mo3565f(1);
                mo3560a();
            }
        } else {
            C0944r.m2866d(b, a4, cancellationSignal, uVar, authenticationCallback);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3563d() {
        if (!this.f3048a.f3004l) {
            mo3564e();
            C0911ao c = this.f3048a.mo3536c();
            CancellationSignal cancellationSignal = c.f3016a;
            if (cancellationSignal != null) {
                try {
                    C0910an.m2820b(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                c.f3016a = null;
            }
            C1893f fVar = c.f3017b;
        }
    }

    /* renamed from: e */
    public final void mo3564e() {
        if (getContext() != null) {
            C0902af afVar = this.f3048a.f2996d;
        }
    }

    /* renamed from: f */
    public final void mo3565f(int i) {
        C0908al alVar = this.f3048a;
        if (alVar.f3002j) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!alVar.f3001i) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            alVar.f3001i = false;
            alVar.mo3540h().execute(new C0935i(this, i));
        }
    }

    /* renamed from: g */
    public final void mo3566g() {
        C0908al alVar = this.f3048a;
        if (!alVar.f3001i) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
            return;
        }
        alVar.f3001i = false;
        alVar.mo3540h().execute(new C0936j(this));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            C0908al alVar = this.f3048a;
            alVar.f3002j = false;
            if (i2 == -1) {
                if (alVar.f3005m) {
                    alVar.f3005m = false;
                }
                mo3566g();
                mo3560a();
                return;
            }
            getString(R.string.generic_error_user_canceled);
            mo3565f(10);
            mo3560a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f3048a == null) {
            this.f3048a = BiometricPrompt.m2791a(this, getArguments().getBoolean("host_activity", true));
        }
        new WeakReference(getActivity());
        C0908al alVar = this.f3048a;
        if (alVar.f3006n == null) {
            alVar.f3006n = new C2332ag();
        }
        alVar.f3006n.mo5704e(this, new C0937k(this));
        C0908al alVar2 = this.f3048a;
        if (alVar2.f3007o == null) {
            alVar2.f3007o = new C2332ag();
        }
        alVar2.f3007o.mo5704e(this, new C0938l(this));
        C0908al alVar3 = this.f3048a;
        if (alVar3.f3008p == null) {
            alVar3.f3008p = new C2332ag();
        }
        alVar3.f3008p.mo5704e(this, new C0939m(this));
        C0908al alVar4 = this.f3048a;
        if (alVar4.f3009q == null) {
            alVar4.f3009q = new C2332ag();
        }
        alVar4.f3009q.mo5704e(this, new C0940n(this));
        C0908al alVar5 = this.f3048a;
        if (alVar5.f3010r == null) {
            alVar5.f3010r = new C2332ag();
        }
        alVar5.f3010r.mo5704e(this, new C0941o(this));
        C0908al alVar6 = this.f3048a;
        if (alVar6.f3011s == null) {
            alVar6.f3011s = new C2332ag();
        }
        alVar6.f3011s.mo5704e(this, new C0942p(this));
    }

    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && C0932f.m2852a(this.f3048a.mo3534a())) {
            C0908al alVar = this.f3048a;
            alVar.f3004l = true;
            this.f3049b.postDelayed(new C0950x(alVar), 250);
        }
    }
}
