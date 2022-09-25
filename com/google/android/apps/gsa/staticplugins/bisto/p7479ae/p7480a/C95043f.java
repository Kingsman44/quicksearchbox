package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.apps.gsa.shared.bisto.p7029b.C89640k;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.f */
/* compiled from: PG */
public abstract class C95043f implements C95047j {

    /* renamed from: a */
    public static final C59071e f265896a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.a.f");

    /* renamed from: b */
    public final C37335b f265897b;

    /* renamed from: c */
    public final String f265898c;

    /* renamed from: d */
    public final C89640k f265899d;

    /* renamed from: e */
    public int f265900e;

    /* renamed from: f */
    boolean f265901f;

    /* renamed from: g */
    private final C60888db f265902g;

    /* renamed from: h */
    private final Executor f265903h;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C95043f(com.google.common.util.concurrent.C60888db r2, java.util.concurrent.Executor r3, com.google.android.libraries.search.p2904c.p2907ab.C37335b r4, com.google.android.apps.gsa.shared.bisto.p7029b.C89640k r5, java.lang.String r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f265902g = r2
            r1.f265897b = r4
            r1.f265898c = r6
            r1.f265899d = r5
            int r2 = r6.hashCode()
            r4 = -515978800(0xffffffffe13ec9d0, float:-2.1996397E20)
            r0 = 1
            if (r2 == r4) goto L_0x0025
            r4 = 1495486459(0x59234ffb, float:2.87302254E15)
            if (r2 == r4) goto L_0x001b
            goto L_0x002f
        L_0x001b:
            java.lang.String r2 = "DirectDecoder"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x002f
            r2 = 1
            goto L_0x0030
        L_0x0025:
            java.lang.String r2 = "SbcDecoder"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x002f
            r2 = 0
            goto L_0x0030
        L_0x002f:
            r2 = -1
        L_0x0030:
            if (r2 == 0) goto L_0x0038
            if (r2 == r0) goto L_0x0035
            goto L_0x003a
        L_0x0035:
            java.lang.String r6 = "pcm"
            goto L_0x003a
        L_0x0038:
            java.lang.String r6 = "sbc"
        L_0x003a:
            r5.mo83524c(r6)
            com.google.common.util.concurrent.dr r2 = new com.google.common.util.concurrent.dr
            r2.<init>(r3)
            r1.f265903h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95043f.<init>(com.google.common.util.concurrent.db, java.util.concurrent.Executor, com.google.android.libraries.search.c.ab.b, com.google.android.apps.gsa.shared.bisto.b.k, java.lang.String):void");
    }

    /* renamed from: a */
    public abstract C60870cx mo88961a(byte[] bArr);

    /* renamed from: b */
    public void mo88962b() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: c */
    public final void mo88963c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f265901f = true;
        this.f265903h.execute(new C95041d(this));
    }

    /* renamed from: d */
    public final void mo88964d(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f265901f) {
            C59052c cVar = (C59052c) f265896a.mo56225c();
            cVar.mo56378ag(C58975e.f156826a, this.f265898c);
            ((C59052c) cVar.mo56372aa(18098)).mo56386p("processAudioData after finishAudioProcessing");
            return;
        }
        C60856cj.m92911t(C60922j.m93044g(C60838bs.m92859i(mo88961a(bArr)), new C95040c(this, bArr), this.f265903h), new C95042e(this), this.f265902g);
    }
}
