package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.cg */
/* compiled from: PG */
public final class C95801cg implements AutoCloseable {

    /* renamed from: f */
    private static final C59071e f268243f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.cg");

    /* renamed from: a */
    public final Context f268244a;

    /* renamed from: b */
    public final C22871g f268245b;

    /* renamed from: c */
    public final String f268246c;

    /* renamed from: d */
    public String f268247d;

    /* renamed from: e */
    public BroadcastReceiver f268248e;

    /* renamed from: g */
    private final C95307m f268249g;

    /* renamed from: h */
    private final C21370a f268250h;

    /* renamed from: i */
    private final C95239o f268251i;

    public C95801cg(Context context, C22871g gVar, C95307m mVar, C21370a aVar, C95239o oVar, C95355bf bfVar) {
        this.f268244a = context;
        this.f268245b = gVar;
        this.f268249g = mVar;
        this.f268250h = aVar;
        this.f268251i = oVar;
        this.f268246c = bfVar.mo89270k();
    }

    /* renamed from: a */
    public final void mo89777a() {
        this.f268247d = null;
        BroadcastReceiver broadcastReceiver = this.f268248e;
        if (broadcastReceiver != null) {
            try {
                this.f268244a.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                C59104x d = f268243f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "StartupSoundHandler");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(15382)).mo56386p("StartupSoundHandler receiver not registered.");
            }
            this.f268248e = null;
        }
    }

    /* renamed from: b */
    public final void mo89778b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268251i.mo89167o(new C95800cf(new C95799ce(this.f268249g, this.f268250h)), false);
        mo89777a();
    }

    public final void close() {
        this.f268245b.mo28212l("close", new C95796cb(this));
    }
}
