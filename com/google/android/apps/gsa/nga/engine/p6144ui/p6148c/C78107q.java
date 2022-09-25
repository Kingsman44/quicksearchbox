package com.google.android.apps.gsa.nga.engine.p6144ui.p6148c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6044n.C76467g;
import com.google.android.apps.gsa.nga.engine.p6144ui.C78018a;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.shared.android.C80955k;
import com.google.android.apps.gsa.nga.shared.android.C80958n;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.c.q */
/* compiled from: PG */
public final class C78107q extends C79356f implements C78098h {

    /* renamed from: a */
    public static final C59071e f215103a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.c.q");

    /* renamed from: b */
    public final Context f215104b;

    /* renamed from: c */
    public final LayoutInflater f215105c;

    /* renamed from: d */
    public final C76467g f215106d;

    /* renamed from: e */
    public final C22871g f215107e;

    /* renamed from: f */
    public final C78018a f215108f;

    /* renamed from: g */
    public final C78097g f215109g;

    /* renamed from: h */
    public final BroadcastReceiver f215110h;

    /* renamed from: i */
    public final C76092h f215111i;

    /* renamed from: j */
    public final C81515c f215112j;

    /* renamed from: k */
    private final C22871g f215113k;

    public C78107q(Context context, C78018a aVar, C78097g gVar, C76467g gVar2, C22871g gVar3, C22871g gVar4, C76092h hVar, C79359i iVar, C81515c cVar, C91142g gVar5) {
        super(iVar);
        this.f215104b = context;
        this.f215108f = aVar;
        this.f215109g = gVar;
        this.f215105c = LayoutInflater.from(context.createConfigurationContext(context.getResources().getConfiguration()));
        this.f215111i = hVar;
        this.f215106d = gVar2;
        this.f215107e = gVar3;
        this.f215113k = gVar4;
        this.f215112j = cVar;
        this.f215110h = new C80958n(C78099i.f215093a, gVar5, C90126fx.f251115ci);
        ((C59052c) ((C59052c) f215103a.mo56224b()).mo56372aa(5026)).mo56386p("cons");
    }

    /* renamed from: a */
    public final Intent mo71200a() {
        return C80955k.m128812b(this, C78102l.f215096a).setAction("com.google.android.apps.googlequicksearchbox.nga.SHOW_EVENTS_HISTORY").setPackage(this.f215104b.getPackageName());
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f215111i.mo72021b().mo72041f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return this.f215113k.mo28201a("[NGA] initialize", new C78104n(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return this.f215113k.mo28201a("[NGA] uninitialize", new C78103m(this));
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "EventsHistory";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 55;
    }
}
