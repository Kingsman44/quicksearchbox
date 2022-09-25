package com.google.android.apps.gsa.staticplugins.accl.p7335e;

import android.util.Pair;
import androidx.p060c.C0983m;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118312c;
import com.google.android.apps.gsa.store.C118329t;
import com.google.android.libraries.gsa.conversation.p1858i.C22724a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.e.c */
/* compiled from: PG */
public final class C92832c implements C22724a {

    /* renamed from: a */
    public static final C59071e f259019a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.e.c");

    /* renamed from: b */
    public final C118302a f259020b = C118302a.m196461a(0);

    /* renamed from: c */
    private final C118312c f259021c;

    /* renamed from: d */
    private final C0983m f259022d;

    /* renamed from: e */
    private final String f259023e;

    /* renamed from: f */
    private final C21370a f259024f;

    public C92832c(int i, C118312c cVar, C58833ax axVar, C86124t tVar, C21370a aVar) {
        this.f259023e = i + "_" + ((String) axVar.mo56109e(BuildConfig.FLAVOR)) + "_";
        this.f259021c = cVar;
        this.f259024f = aVar;
        this.f259022d = new C92831b((int) tVar.mo79743a(C90014bt.f247143bb));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo27880a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f259023e
            java.lang.String r7 = r0.concat(r7)
            androidx.c.m r0 = r6.f259022d
            java.lang.Object r0 = r0.mo3690d(r7)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r0.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.google.android.libraries.f.a r3 = r6.f259024f
            long r3 = r3.mo26870b()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x002b
            java.lang.Object r0 = r0.first
            byte[] r0 = (byte[]) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0032
        L_0x002b:
            androidx.c.m r0 = r6.f259022d
            r0.mo3695i(r7)
        L_0x0030:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0032:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x003d
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0062
        L_0x003d:
            com.google.android.apps.gsa.store.c r0 = r6.f259021c
            com.google.android.apps.gsa.store.x r1 = r0.mo91761g()
            com.google.common.b.gp r2 = r1.f328477d
            r2.mo55395g(r7)
            com.google.android.apps.gsa.store.a r2 = r6.f259020b
            com.google.common.b.gp r3 = r1.f328474a
            r3.mo55395g(r2)
            com.google.android.apps.gsa.store.w r1 = r1.mo103674a()
            com.google.common.util.concurrent.cx r0 = r0.mo91763i(r1)
            com.google.android.apps.gsa.staticplugins.accl.e.a r1 = new com.google.android.apps.gsa.staticplugins.accl.e.a
            r1.<init>(r6, r7)
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r7)
        L_0x0062:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.p7335e.C92832c.mo27880a(java.lang.String):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo27881b(String str, byte[] bArr, long j) {
        String concat = this.f259023e.concat(str);
        long b = this.f259024f.mo26870b() + j;
        mo87470c(concat, bArr, b);
        C118329t e = this.f259021c.mo91760e();
        e.mo103668b(concat, bArr, j, TimeUnit.MILLISECONDS).mo103672a(this.f259020b, Long.valueOf(b));
        return this.f259021c.mo91762h(e.mo103669c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo87470c(String str, byte[] bArr, long j) {
        this.f259022d.mo3691e(str, Pair.create(bArr, Long.valueOf(j)));
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f259022d.f3111a) {
        }
    }
}
