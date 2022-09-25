package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60852cf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.cn */
/* compiled from: PG */
public final /* synthetic */ class C77069cn implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212697a;

    /* renamed from: b */
    public final /* synthetic */ long f212698b;

    /* renamed from: c */
    public final /* synthetic */ af f212699c;

    /* renamed from: d */
    public final /* synthetic */ String f212700d;

    /* renamed from: e */
    public final /* synthetic */ C77140u f212701e;

    /* renamed from: f */
    public final /* synthetic */ C80399l f212702f;

    /* renamed from: g */
    public final /* synthetic */ C80303ay f212703g;

    public /* synthetic */ C77069cn(C77089dg dgVar, long j, af afVar, String str, C77140u uVar, C80399l lVar, C80303ay ayVar) {
        this.f212697a = dgVar;
        this.f212698b = j;
        this.f212699c = afVar;
        this.f212700d = str;
        this.f212701e = uVar;
        this.f212702f = lVar;
        this.f212703g = ayVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77089dg dgVar = this.f212697a;
        long j = this.f212698b;
        af afVar = this.f212699c;
        String str = this.f212700d;
        C77140u uVar = this.f212701e;
        C80399l lVar = this.f212702f;
        C80303ay ayVar = this.f212703g;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C118826c.f331423b;
        }
        C74851z zVar = (C74851z) optional.get();
        C60870cx g = dgVar.f212749c.g(j);
        C60870cx j2 = dgVar.f212749c.j(j);
        C60870cx g2 = afVar.g(j);
        C60870cx h = afVar.h(zVar, str);
        C60852cf d = C60856cj.m92895d(g, j2, g2, h);
        C77076cu cuVar = r1;
        C77076cu cuVar2 = new C77076cu(dgVar, j, afVar, str, uVar, lVar, ayVar, zVar, g, j2, g2, h);
        return d.mo57335b(cuVar, C60826bg.f164896a);
    }
}
