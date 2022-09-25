package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: androidx.biometric.a */
/* compiled from: PG */
final class C0896a extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ C0930d f2979a;

    public C0896a(C0930d dVar) {
        this.f2979a = dVar;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        C0905ai aiVar = (C0905ai) this.f2979a;
        if (aiVar.f2990a.get() != null && !((C0908al) aiVar.f2990a.get()).f3002j && ((C0908al) aiVar.f2990a.get()).f3001i) {
            ((C0908al) aiVar.f2990a.get()).mo3541i(new C0933g(i, charSequence));
        }
    }

    public void onAuthenticationFailed() {
        C0905ai aiVar = (C0905ai) this.f2979a;
        if (aiVar.f2990a.get() != null && ((C0908al) aiVar.f2990a.get()).f3001i) {
            ((C0908al) aiVar.f2990a.get()).mo3542j(true);
        }
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult r7) {
        /*
            r6 = this;
            r0 = 30
            r1 = 0
            if (r7 == 0) goto L_0x0051
            android.hardware.biometrics.BiometricPrompt$CryptoObject r2 = androidx.biometric.C0923b.m2843b(r7)
            if (r2 != 0) goto L_0x000c
            goto L_0x0051
        L_0x000c:
            javax.crypto.Cipher r3 = androidx.biometric.C0913aq.m2830e(r2)
            if (r3 == 0) goto L_0x0018
            androidx.biometric.af r1 = new androidx.biometric.af
            r1.<init>((javax.crypto.Cipher) r3)
            goto L_0x0051
        L_0x0018:
            java.security.Signature r3 = androidx.biometric.C0913aq.m2829d(r2)
            if (r3 == 0) goto L_0x0024
            androidx.biometric.af r1 = new androidx.biometric.af
            r1.<init>((java.security.Signature) r3)
            goto L_0x0051
        L_0x0024:
            javax.crypto.Mac r3 = androidx.biometric.C0913aq.m2831f(r2)
            if (r3 == 0) goto L_0x0030
            androidx.biometric.af r1 = new androidx.biometric.af
            r1.<init>((javax.crypto.Mac) r3)
            goto L_0x0051
        L_0x0030:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r0) goto L_0x0040
            android.security.identity.IdentityCredential r3 = androidx.biometric.C0914ar.m2833b(r2)
            if (r3 == 0) goto L_0x0040
            androidx.biometric.af r1 = new androidx.biometric.af
            r1.<init>((android.security.identity.IdentityCredential) r3)
            goto L_0x0051
        L_0x0040:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L_0x0051
            android.security.identity.PresentationSession r2 = androidx.biometric.C0915as.m2835b(r2)
            if (r2 == 0) goto L_0x0051
            androidx.biometric.af r1 = new androidx.biometric.af
            r1.<init>((android.security.identity.PresentationSession) r2)
        L_0x0051:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 2
            r4 = -1
            if (r2 < r0) goto L_0x005e
            if (r7 == 0) goto L_0x0064
            int r7 = androidx.biometric.C0929c.m2851a(r7)
            goto L_0x0067
        L_0x005e:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r7 != r0) goto L_0x0066
        L_0x0064:
            r7 = -1
            goto L_0x0067
        L_0x0066:
            r7 = 2
        L_0x0067:
            androidx.biometric.ae r0 = new androidx.biometric.ae
            r0.<init>(r1, r7)
            androidx.biometric.d r7 = r6.f2979a
            androidx.biometric.ai r7 = (androidx.biometric.C0905ai) r7
            java.lang.ref.WeakReference r1 = r7.f2990a
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x00b3
            java.lang.ref.WeakReference r1 = r7.f2990a
            java.lang.Object r1 = r1.get()
            androidx.biometric.al r1 = (androidx.biometric.C0908al) r1
            boolean r1 = r1.f3001i
            if (r1 == 0) goto L_0x00b3
            int r1 = r0.f2982b
            if (r1 != r4) goto L_0x00a8
            androidx.biometric.ae r1 = new androidx.biometric.ae
            androidx.biometric.af r0 = r0.f2981a
            java.lang.ref.WeakReference r2 = r7.f2990a
            java.lang.Object r2 = r2.get()
            androidx.biometric.al r2 = (androidx.biometric.C0908al) r2
            int r2 = r2.mo3534a()
            r5 = r2 & 32767(0x7fff, float:4.5916E-41)
            if (r5 == 0) goto L_0x00a3
            boolean r2 = androidx.biometric.C0932f.m2852a(r2)
            if (r2 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r3 = -1
        L_0x00a4:
            r1.<init>(r0, r3)
            r0 = r1
        L_0x00a8:
            java.lang.ref.WeakReference r7 = r7.f2990a
            java.lang.Object r7 = r7.get()
            androidx.biometric.al r7 = (androidx.biometric.C0908al) r7
            r7.mo3543k(r0)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.C0896a.onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt$AuthenticationResult):void");
    }
}
