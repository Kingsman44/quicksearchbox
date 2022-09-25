package com.google.android.apps.gsa.nga.engine.p6273z;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6044n.C76467g;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80944e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.z.m */
/* compiled from: PG */
public final class C80042m extends C79356f {

    /* renamed from: a */
    public final Context f219636a;

    /* renamed from: b */
    public final C91142g f219637b;

    /* renamed from: c */
    public final C80944e f219638c;

    /* renamed from: d */
    public final C80036g f219639d;

    /* renamed from: e */
    public final C76467g f219640e;

    /* renamed from: f */
    public final C22871g f219641f;

    /* renamed from: g */
    public final C83305i f219642g;

    /* renamed from: h */
    public final Object f219643h = new Object();

    /* renamed from: i */
    public Optional f219644i = Optional.empty();

    /* renamed from: j */
    private final C76092h f219645j;

    /* renamed from: k */
    private final C22871g f219646k;

    public C80042m(Context context, C91142g gVar, C76092h hVar, C80944e eVar, C80036g gVar2, C76467g gVar3, C22871g gVar4, C22871g gVar5, C79359i iVar, C83305i iVar2) {
        super(iVar, new C58759qy(Integer.valueOf(C90126fx.f251277fl.f248757a)));
        this.f219636a = context;
        this.f219637b = gVar;
        this.f219645j = hVar;
        this.f219638c = eVar;
        this.f219639d = gVar2;
        this.f219640e = gVar3;
        this.f219641f = gVar4;
        this.f219646k = gVar5;
        this.f219642g = iVar2;
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f219645j.mo72021b().mo72041f() && this.f219637b.mo85405j(C90126fx.f251277fl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return this.f219646k.mo28201a("[NGA] NgaInteractorMemoryMonitor.initialize", new C80039j(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return this.f219646k.mo28201a("[NGA] NgaInteractorMemoryMonitor.uninitialize", new C80037h(this));
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "NgaInteractorMemoryMonitor";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 30;
    }
}
