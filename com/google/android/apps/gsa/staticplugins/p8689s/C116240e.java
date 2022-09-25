package com.google.android.apps.gsa.staticplugins.p8689s;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6753q.C85552a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87808ei;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87809ej;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87811el;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87812em;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87813en;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87822ew;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87824ey;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87825ez;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87827fa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* renamed from: com.google.android.apps.gsa.staticplugins.s.e */
/* compiled from: PG */
public final class C116240e extends C86734a implements C85552a {

    /* renamed from: a */
    public static final C59071e f322325a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.s.e");

    /* renamed from: b */
    private final Context f322326b;

    /* renamed from: c */
    private final C22871g f322327c;

    /* renamed from: f */
    private final C116237b f322328f;

    /* renamed from: g */
    private final C116242g f322329g;

    /* renamed from: h */
    private final C68214a f322330h;

    public C116240e(Context context, C22871g gVar, C116237b bVar, C116242g gVar2, C68214a aVar) {
        super(C118575h.WORKER_BIOMETRIC_AUTH, "biometricauth");
        this.f322326b = context;
        this.f322327c = gVar;
        this.f322328f = bVar;
        this.f322329g = gVar2;
        this.f322330h = aVar;
    }

    /* renamed from: g */
    private static C87827fa m192781g(C58833ax axVar, boolean z) {
        C87813en enVar = (C87813en) C87827fa.f237637c.createBuilder();
        if (axVar.mo56113h()) {
            axVar.mo56107c();
            if (z) {
                C87809ej ejVar = (C87809ej) C87812em.f237614c.createBuilder();
                C87811el a = C87811el.m142769a(((Integer) axVar.mo56107c()).intValue());
                ejVar.copyOnWrite();
                C87812em emVar = (C87812em) ejVar.instance;
                emVar.f237617b = a.f237613e;
                emVar.f237616a |= 1;
                C87812em emVar2 = (C87812em) ejVar.build();
                enVar.copyOnWrite();
                C87827fa faVar = (C87827fa) enVar.instance;
                emVar2.getClass();
                faVar.f237640b = emVar2;
                faVar.f237639a = 6;
            } else {
                C87822ew ewVar = (C87822ew) C87825ez.f237627c.createBuilder();
                int a2 = C87824ey.m142771a(((Integer) axVar.mo56107c()).intValue());
                ewVar.copyOnWrite();
                C87825ez ezVar = (C87825ez) ewVar.instance;
                int i = a2 - 1;
                if (a2 != 0) {
                    ezVar.f237630b = i;
                    ezVar.f237629a |= 1;
                    C87825ez ezVar2 = (C87825ez) ewVar.build();
                    enVar.copyOnWrite();
                    C87827fa faVar2 = (C87827fa) enVar.instance;
                    ezVar2.getClass();
                    faVar2.f237640b = ezVar2;
                    faVar2.f237639a = 5;
                } else {
                    throw null;
                }
            }
        } else {
            C87812em emVar3 = C87812em.f237614c;
            enVar.copyOnWrite();
            C87827fa faVar3 = (C87827fa) enVar.instance;
            emVar3.getClass();
            faVar3.f237640b = emVar3;
            faVar3.f237639a = 6;
        }
        return (C87827fa) enVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r2.getPackageManager().hasSystemFeature("android.hardware.fingerprint") == false) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo79061a() {
        /*
            r5 = this;
            r0 = 0
            com.google.android.apps.gsa.staticplugins.s.b r1 = r5.f322328f     // Catch:{ SecurityException -> 0x0061 }
            android.content.Context r2 = r5.f322326b     // Catch:{ SecurityException -> 0x0061 }
            boolean r1 = r1.mo102632a()     // Catch:{ SecurityException -> 0x0061 }
            r3 = 1
            if (r1 == 0) goto L_0x0025
            java.lang.Class<android.hardware.biometrics.BiometricManager> r1 = android.hardware.biometrics.BiometricManager.class
            java.lang.Object r1 = r2.getSystemService(r1)     // Catch:{ SecurityException -> 0x0061 }
            android.hardware.biometrics.BiometricManager r1 = (android.hardware.biometrics.BiometricManager) r1     // Catch:{ SecurityException -> 0x0061 }
            if (r1 == 0) goto L_0x0031
            int r2 = r1.canAuthenticate()     // Catch:{ SecurityException -> 0x0061 }
            if (r2 == r3) goto L_0x0031
            int r1 = r1.canAuthenticate()     // Catch:{ SecurityException -> 0x0061 }
            r2 = 12
            if (r1 != r2) goto L_0x0042
            goto L_0x0031
        L_0x0025:
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ SecurityException -> 0x0061 }
            java.lang.String r2 = "android.hardware.fingerprint"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch:{ SecurityException -> 0x0061 }
            if (r1 != 0) goto L_0x0042
        L_0x0031:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ SecurityException -> 0x0061 }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ SecurityException -> 0x0061 }
            com.google.android.apps.gsa.search.shared.service.b.fa r1 = m192781g(r1, r0)     // Catch:{ SecurityException -> 0x0061 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ SecurityException -> 0x0061 }
            return r0
        L_0x0042:
            com.google.android.libraries.gsa.k.g r0 = r5.f322327c
            com.google.android.apps.gsa.staticplugins.s.b r1 = r5.f322328f
            android.content.Context r2 = r5.f322326b
            com.google.android.libraries.gsa.k.g r1 = r1.f322321a
            com.google.android.apps.gsa.staticplugins.s.a r3 = new com.google.android.apps.gsa.staticplugins.s.a
            r3.<init>(r2)
            java.lang.String r2 = "fetchKeyguardSecureInfo"
            com.google.common.util.concurrent.cx r1 = r1.mo28201a(r2, r3)
            com.google.android.apps.gsa.staticplugins.s.c r2 = new com.google.android.apps.gsa.staticplugins.s.c
            r2.<init>(r5)
            java.lang.String r3 = "checkBiometricAvailability"
            com.google.common.util.concurrent.cx r0 = r0.mo28209i(r1, r3, r2)
            return r0
        L_0x0061:
            r1 = move-exception
            com.google.common.f.e r2 = f322325a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Don't have android.permission.USE_BIOMETRIC permission."
            r4 = 14489(0x3899, float:2.0303E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            com.google.android.apps.gsa.search.shared.service.b.fa r0 = m192781g(r1, r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8689s.C116240e.mo79061a():com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo79062b() {
        try {
            return C60856cj.m92900i(this.f322329g.mo102635a());
        } catch (KeyPermanentlyInvalidatedException e) {
            ((C59052c) ((C59052c) ((C59052c) f322325a.mo56226d()).mo56382g(e)).mo56372aa(14490)).mo56386p("Key can no longer be used because it has been permanently invalidated.");
            return C60866ct.f164955a;
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) f322325a.mo56226d()).mo56382g(e2)).mo56372aa(14491)).mo56386p("Error creating the CryptoObject.");
            return C60866ct.f164955a;
        }
    }

    /* renamed from: c */
    public final C60870cx mo79063c() {
        try {
            this.f322329g.mo102637c(this.f322329g.mo102636b());
            return C60856cj.m92900i(C118826c.f331422a);
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            ((C59052c) ((C59052c) ((C59052c) f322325a.mo56225c()).mo56382g(e)).mo56372aa(14492)).mo56386p("Failed to resetFingerprintKey.");
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: d */
    public final void mo79064d() {
        this.f322327c.mo28211k(mo79061a(), "BiometricAuthWorker", new C116239d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ C87827fa mo102633e(Boolean bool) {
        if (!bool.booleanValue()) {
            return m192781g(C58833ax.m90834k(2), true);
        }
        try {
            if (this.f322328f.mo102632a()) {
                C116237b bVar = this.f322328f;
                Context context = this.f322326b;
                if (bVar.mo102632a()) {
                    BiometricManager biometricManager = (BiometricManager) context.getSystemService(BiometricManager.class);
                    if (biometricManager != null && biometricManager.canAuthenticate() == 0) {
                    }
                }
                return m192781g(C58833ax.m90834k(1), true);
            }
            this.f322329g.mo102635a();
            return m192781g(C58836b.f156633a, false);
        } catch (KeyPermanentlyInvalidatedException e) {
            ((C59052c) ((C59052c) ((C59052c) f322325a.mo56226d()).mo56382g(e)).mo56372aa(14487)).mo56386p("The user has added a new fingerprint, disabled till call to resetFingerprintKey().");
            return m192781g(C58833ax.m90834k(3), true);
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) f322325a.mo56226d()).mo56382g(e2)).mo56372aa(14488)).mo56386p("Can't use FingerprintManager.");
            return m192781g(C58833ax.m90834k(0), false);
        }
    }

    /* renamed from: f */
    public final void mo102634f(C87827fa faVar) {
        C86775r rVar = ((C86610af) this.f322330h.mo27525b()).f233977l;
        if (rVar == null) {
            ((C59052c) ((C59052c) f322325a.mo56225c()).mo56372aa(14493)).mo56389s("No attached client found, Can't send back %s", faVar);
            return;
        }
        C87684al alVar = new C87684al(C88244um.FINGERPRINT_AUTH_SERVICE_EVENT);
        alVar.mo81965b(C87808ei.f237606a, faVar);
        rVar.f234383e.mo80379b(alVar.mo81964a());
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
