package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import android.util.Size;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.view.session.ondevice.C27970h;
import com.google.android.libraries.lens.view.session.ondevice.C27971i;
import com.google.android.libraries.lens.view.session.ondevice.C28014w;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.ba */
/* compiled from: PG */
final class C27871ba implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C56244ay f75958a;

    /* renamed from: b */
    final /* synthetic */ C24286d f75959b;

    /* renamed from: c */
    final /* synthetic */ C24286d f75960c;

    /* renamed from: d */
    final /* synthetic */ C24286d f75961d;

    /* renamed from: e */
    final /* synthetic */ Size f75962e;

    /* renamed from: f */
    final /* synthetic */ C27877bg f75963f;

    public C27871ba(C27877bg bgVar, C56244ay ayVar, C24286d dVar, C24286d dVar2, C24286d dVar3, Size size) {
        this.f75963f = bgVar;
        this.f75958a = ayVar;
        this.f75959b = dVar;
        this.f75960c = dVar2;
        this.f75961d = dVar3;
        this.f75962e = size;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56382g(th)).mo56372aa(50023)).mo56386p("Failed to get DetectionResult result");
        }
        C28014w wVar = this.f75963f.f75981g;
        C56244ay ayVar = this.f75958a;
        C27970h n = C27971i.m52077n();
        n.mo33308b(true);
        wVar.mo33463b(ayVar, n.mo33307a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.bp.f.b.a.aa} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17911gm(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.libraries.lens.view.session.ondevice.a.bg r6 = r5.f75963f     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.lens.view.session.ondevice.w r6 = r6.f75981g     // Catch:{ ExecutionException -> 0x0062 }
            com.google.bp.f.b.a.ay r0 = r5.f75958a     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.lens.view.session.ondevice.h r1 = com.google.android.libraries.lens.view.session.ondevice.C27971i.m52077n()     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.lens.ondevice.b.c.d r2 = r5.f75959b     // Catch:{ ExecutionException -> 0x0062 }
            r3 = 0
            if (r2 != 0) goto L_0x0011
            r2 = r3
            goto L_0x001b
        L_0x0011:
            com.google.common.util.concurrent.cx r2 = r2.mo29848a()     // Catch:{ ExecutionException -> 0x0062 }
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.ba.c.c.c.d r2 = (com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19665d) r2     // Catch:{ ExecutionException -> 0x0062 }
        L_0x001b:
            r4 = r1
            com.google.android.libraries.lens.view.session.ondevice.a r4 = (com.google.android.libraries.lens.view.session.ondevice.C27796a) r4     // Catch:{ ExecutionException -> 0x0062 }
            r4.f75836g = r2     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.lens.ondevice.b.c.d r2 = r5.f75960c     // Catch:{ ExecutionException -> 0x0062 }
            if (r2 != 0) goto L_0x0026
            r2 = r3
            goto L_0x0030
        L_0x0026:
            com.google.common.util.concurrent.cx r2 = r2.mo29848a()     // Catch:{ ExecutionException -> 0x0062 }
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)     // Catch:{ ExecutionException -> 0x0062 }
            com.google.bp.f.b.a.aa r2 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa) r2     // Catch:{ ExecutionException -> 0x0062 }
        L_0x0030:
            r4 = r1
            com.google.android.libraries.lens.view.session.ondevice.a r4 = (com.google.android.libraries.lens.view.session.ondevice.C27796a) r4     // Catch:{ ExecutionException -> 0x0062 }
            r4.f75837h = r2     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.lens.ondevice.b.c.d r2 = r5.f75961d     // Catch:{ ExecutionException -> 0x0062 }
            if (r2 != 0) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            com.google.common.util.concurrent.cx r2 = r2.mo29848a()     // Catch:{ ExecutionException -> 0x0062 }
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)     // Catch:{ ExecutionException -> 0x0062 }
            r3 = r2
            com.google.bp.f.b.a.aa r3 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa) r3     // Catch:{ ExecutionException -> 0x0062 }
        L_0x0045:
            r2 = r1
            com.google.android.libraries.lens.view.session.ondevice.a r2 = (com.google.android.libraries.lens.view.session.ondevice.C27796a) r2     // Catch:{ ExecutionException -> 0x0062 }
            r2.f75838i = r3     // Catch:{ ExecutionException -> 0x0062 }
            android.util.Size r2 = r5.f75962e     // Catch:{ ExecutionException -> 0x0062 }
            r3 = r1
            com.google.android.libraries.lens.view.session.ondevice.a r3 = (com.google.android.libraries.lens.view.session.ondevice.C27796a) r3     // Catch:{ ExecutionException -> 0x0062 }
            r3.f75840k = r2     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.lens.view.session.ondevice.i r1 = r1.mo33307a()     // Catch:{ ExecutionException -> 0x0062 }
            r6.mo33463b(r0, r1)     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.lens.view.session.ondevice.a.bg r6 = r5.f75963f     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.search.b.b r6 = r6.f75977c     // Catch:{ ExecutionException -> 0x0062 }
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a.f98524bh     // Catch:{ ExecutionException -> 0x0062 }
            r6.mo19974a(r0)     // Catch:{ ExecutionException -> 0x0062 }
            return
        L_0x0062:
            r6 = move-exception
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.session.ondevice.p2164a.C27877bg.f75975a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Failed to handle on-device engine result"
            r2 = 50024(0xc368, float:7.0099E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56382g(r6)).mo56372aa(r2)).mo56386p(r1)
            com.google.android.libraries.lens.view.session.ondevice.a.bg r6 = r5.f75963f
            com.google.android.libraries.lens.view.session.ondevice.w r6 = r6.f75981g
            r6.mo33462a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.ondevice.p2164a.C27871ba.mo17911gm(java.lang.Object):void");
    }
}
