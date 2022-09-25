package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import android.util.ArraySet;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128078b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128113n;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128114o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.g */
/* compiled from: PG */
public final class C78130g implements C78131h {

    /* renamed from: a */
    public static final C59071e f215144a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.d.c.g");

    /* renamed from: b */
    public final ArraySet f215145b = new ArraySet();

    /* renamed from: c */
    public final ArraySet f215146c = new ArraySet();

    /* renamed from: d */
    public final C22871g f215147d;

    public C78130g(C22871g gVar) {
        this.f215147d = gVar;
    }

    /* renamed from: a */
    public final void mo73095a(C70883v vVar) {
        this.f215147d.mo28212l("[NGA] ConnectedClientsTracker.onDisconnected", new C78125b(this, vVar));
    }

    /* renamed from: b */
    public final void mo73096b(C128078b bVar) {
        this.f215147d.mo28212l("[NGA] ConnectedClientsTracker.onConnected", new C78128e(this, bVar));
    }

    /* renamed from: c */
    public final void mo73097c(C128078b bVar) {
        this.f215147d.mo28212l("[NGA] ConnectedClientsTracker.onDisconnected", new C78119a(this, bVar));
    }

    /* renamed from: d */
    public final void mo73098d(C70862aj ajVar) {
        C128113n nVar = (C128113n) C128114o.f352491c.createBuilder();
        ArraySet<C128078b> arraySet = this.f215145b;
        nVar.copyOnWrite();
        C128114o oVar = (C128114o) nVar.instance;
        C62961ch chVar = oVar.f352493a;
        if (!chVar.mo58948c()) {
            oVar.f352493a = C62942bv.mutableCopy(chVar);
        }
        for (C128078b bVar : arraySet) {
            oVar.f352493a.mo58916g(bVar.f352409d);
        }
        ajVar.mo20123c((C128114o) nVar.build());
    }

    /* renamed from: e */
    public final void mo73099e() {
        C58800sl lA = C58528ij.m90006F(this.f215146c).iterator();
        while (lA.hasNext()) {
            mo73098d((C70862aj) lA.next());
        }
    }
}
