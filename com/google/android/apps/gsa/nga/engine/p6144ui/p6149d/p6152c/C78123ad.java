package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128078b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128082bd;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.ad */
/* compiled from: PG */
public final class C78123ad implements C70862aj {

    /* renamed from: f */
    private static final C59071e f215123f = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.d.c.ad");

    /* renamed from: a */
    public final C83363m f215124a = new C83363m();

    /* renamed from: b */
    public final C78131h f215125b;

    /* renamed from: c */
    public final C70862aj f215126c;

    /* renamed from: d */
    public final C78145v f215127d;

    /* renamed from: e */
    public C128078b f215128e = C128078b.CLIENT_UNKNOWN;

    /* renamed from: g */
    private final C22871g f215129g;

    /* renamed from: h */
    private C60870cx f215130h = C60856cj.m92898g();

    public C78123ad(C70862aj ajVar, C78131h hVar, C22871g gVar, C78145v vVar) {
        this.f215125b = hVar;
        this.f215126c = ajVar;
        this.f215129g = gVar;
        this.f215127d = vVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f215129g.mo28212l("[NGA] onCompleted", new C78146w(this));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = f215123f.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VPStateStreamConnect");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(5044)).mo56386p("onError while handling VoicePlateStateStreamConnection.");
        this.f215129g.mo28212l("[NGA] onError", new C78120aa(this, th));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        int i;
        C128082bd bdVar = (C128082bd) obj;
        C58976aa aaVar = C58975e.f156826a;
        int i2 = bdVar.f352416a;
        if (i2 != 0) {
            i = 1;
            if (i2 != 1) {
                i = 0;
            }
        } else {
            i = 2;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 0) {
            this.f215130h = this.f215129g.mo28207g("[NGA] VoicePlateStateStreamConnection.newConnection", new C78149z(this, bdVar));
        }
    }

    /* renamed from: d */
    public final void mo73093d(Consumer consumer) {
        C58976aa aaVar = C58975e.f156826a;
        this.f215128e.name();
        this.f215125b.mo73097c(this.f215128e);
        this.f215130h.cancel(false);
        consumer.accept(this.f215126c);
        this.f215124a.mo76661a();
    }
}
