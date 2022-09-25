package com.google.android.apps.search.webglide.navroot;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.protobuf.C62921ba;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.webglide.navroot.g */
/* compiled from: PG */
public final class C142232g implements C45987ay {

    /* renamed from: a */
    public final WebGlideActivity f385860a;

    /* renamed from: b */
    public final C62921ba f385861b;

    /* renamed from: c */
    public C28439i f385862c;

    /* renamed from: d */
    private final C28306ab f385863d;

    public C142232g(WebGlideActivity webGlideActivity, C45989b bVar, C28306ab abVar, C62921ba baVar) {
        this.f385860a = webGlideActivity;
        this.f385863d = abVar;
        this.f385861b = baVar;
        bVar.mo50082e(this);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C47558bi a = C47831fm.m85006a("WebGlideActivityPeer#onAccountChanged");
        try {
            AccountId accountId = awVar.f120815a.f120816a;
            C142240o oVar = new C142240o();
            C68324h.m98669f(oVar);
            C47247a.m84047b(oVar, accountId);
            C0154a aVar = new C0154a(this.f385860a.f727a.f739a.f744e);
            aVar.mo689v(R.id.webglide_fragment_container, oVar, (String) null);
            aVar.mo518o(oVar);
            aVar.mo509f();
            a.close();
            return;
        } catch (Throwable th) {
            C142231f.m230916a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C142236k kVar = new C142236k();
        C68324h.m98669f(kVar);
        C0154a aVar = new C0154a(this.f385860a.f727a.f739a.f744e);
        aVar.mo689v(R.id.webglide_fragment_container, kVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041 A[Catch:{ all -> 0x00a1, all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[Catch:{ all -> 0x00a1, all -> 0x00a6 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19985d(com.google.apps.tiktok.account.api.controller.C45986ax r8) {
        /*
            r7 = this;
            java.lang.String r0 = "WebGlideActivityPeer#onAccountReady"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
            com.google.android.apps.search.webglide.navroot.WebGlideActivity r1 = r7.f385860a     // Catch:{ all -> 0x00a1 }
            android.content.Intent r1 = r1.getIntent()     // Catch:{ all -> 0x00a1 }
            com.google.protobuf.ba r2 = r7.f385861b     // Catch:{ all -> 0x00a1 }
            com.google.android.apps.search.webglide.b.d r1 = com.google.android.apps.search.webglide.p10699b.C142174e.m230796b(r1, r2)     // Catch:{ all -> 0x00a1 }
            int r2 = r1.f385683g     // Catch:{ all -> 0x00a1 }
            int r2 = com.google.android.apps.search.webglide.p10699b.C142172c.m230794a(r2)     // Catch:{ all -> 0x00a1 }
            r3 = 2
            if (r2 != 0) goto L_0x001c
            goto L_0x002e
        L_0x001c:
            if (r2 != r3) goto L_0x002e
            com.google.android.libraries.logging.ve.ab r2 = r7.f385863d     // Catch:{ all -> 0x00a1 }
            com.google.android.libraries.logging.ve.af r2 = r2.f76990a     // Catch:{ all -> 0x00a1 }
            r4 = 118628(0x1cf64, float:1.66233E-40)
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x00a1 }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r4)     // Catch:{ all -> 0x00a1 }
            goto L_0x003d
        L_0x002e:
            com.google.android.libraries.logging.ve.ab r2 = r7.f385863d     // Catch:{ all -> 0x00a1 }
            com.google.android.libraries.logging.ve.af r2 = r2.f76990a     // Catch:{ all -> 0x00a1 }
            r4 = 152105(0x25229, float:2.13145E-40)
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x00a1 }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r4)     // Catch:{ all -> 0x00a1 }
        L_0x003d:
            com.google.android.apps.search.webglide.b.k r4 = r1.f385681e     // Catch:{ all -> 0x00a1 }
            if (r4 != 0) goto L_0x0043
            com.google.android.apps.search.webglide.b.k r4 = com.google.android.apps.search.webglide.p10699b.C142180k.f385703q     // Catch:{ all -> 0x00a1 }
        L_0x0043:
            boolean r4 = r4.f385717m     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x0073
            com.google.protobuf.bt r4 = com.google.android.libraries.search.logging.p3046g.C39197c.f103149a     // Catch:{ all -> 0x00a1 }
            com.google.common.o.nv r5 = com.google.common.p4552o.C60309nv.f163190c     // Catch:{ all -> 0x00a1 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x00a1 }
            com.google.common.o.nu r5 = (com.google.common.p4552o.C60308nu) r5     // Catch:{ all -> 0x00a1 }
            com.google.common.o.l.n r1 = r1.f385684h     // Catch:{ all -> 0x00a1 }
            if (r1 != 0) goto L_0x0057
            com.google.common.o.l.n r1 = com.google.common.p4552o.p4566l.C60214n.f162914g     // Catch:{ all -> 0x00a1 }
        L_0x0057:
            r5.copyOnWrite()     // Catch:{ all -> 0x00a1 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x00a1 }
            com.google.common.o.nv r6 = (com.google.common.p4552o.C60309nv) r6     // Catch:{ all -> 0x00a1 }
            r1.getClass()     // Catch:{ all -> 0x00a1 }
            r6.f163194b = r1     // Catch:{ all -> 0x00a1 }
            r6.f163193a = r3     // Catch:{ all -> 0x00a1 }
            com.google.protobuf.bv r1 = r5.build()     // Catch:{ all -> 0x00a1 }
            com.google.common.o.nv r1 = (com.google.common.p4552o.C60309nv) r1     // Catch:{ all -> 0x00a1 }
            com.google.android.libraries.logging.ve.e r3 = new com.google.android.libraries.logging.ve.e     // Catch:{ all -> 0x00a1 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00a1 }
            r2.mo33858f(r3)     // Catch:{ all -> 0x00a1 }
        L_0x0073:
            com.google.android.libraries.logging.ve.ab r1 = r7.f385863d     // Catch:{ all -> 0x00a1 }
            com.google.android.apps.search.webglide.navroot.WebGlideActivity r3 = r7.f385860a     // Catch:{ all -> 0x00a1 }
            com.google.apps.tiktok.account.AccountId r8 = r8.f120816a     // Catch:{ all -> 0x00a1 }
            com.google.android.libraries.logging.ve.g r8 = com.google.apps.tiktok.account.p3603a.C45954d.m82060a(r8)     // Catch:{ all -> 0x00a1 }
            r2.mo33859g(r8)     // Catch:{ all -> 0x00a1 }
            r8 = 136033(0x21361, float:1.90623E-40)
            com.google.android.libraries.logging.ve.g r8 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53061c(r8)     // Catch:{ all -> 0x00a1 }
            r2.mo33859g(r8)     // Catch:{ all -> 0x00a1 }
            int r8 = com.google.android.libraries.logging.p2185ve.C28485y.f77298f     // Catch:{ all -> 0x00a1 }
            android.support.v7.app.v r8 = r3.mo1322k()     // Catch:{ all -> 0x00a1 }
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r8 = r8.mo1177e(r3)     // Catch:{ all -> 0x00a1 }
            com.google.android.libraries.logging.ve.i r8 = r1.mo33801b(r8, r2)     // Catch:{ all -> 0x00a1 }
            r7.f385862c = r8     // Catch:{ all -> 0x00a1 }
            r0.close()
            return
        L_0x00a1:
            r8 = move-exception
            r0.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r0 = move-exception
            com.google.android.apps.search.webglide.navroot.C142231f.m230916a(r8, r0)
        L_0x00aa:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.webglide.navroot.C142232g.mo19985d(com.google.apps.tiktok.account.api.controller.ax):void");
    }
}
