package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.nga.api.b.b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.g.c */
/* compiled from: PG */
public final class C94966c implements AutoCloseable, C94965b {

    /* renamed from: a */
    public static final C59071e f265672a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.g.c");

    /* renamed from: b */
    public final b f265673b;

    /* renamed from: c */
    public final C95007y f265674c;

    /* renamed from: d */
    public Optional f265675d = Optional.empty();

    /* renamed from: e */
    public volatile boolean f265676e = false;

    public C94966c(b bVar, C95007y yVar) {
        this.f265673b = bVar;
        this.f265674c = yVar;
    }

    /* renamed from: a */
    public final void mo88876a() {
        if (this.f265675d.isPresent()) {
            this.f265673b.f((cf) this.f265675d.get());
            this.f265675d = Optional.empty();
            return;
        }
        C59104x c = f265672a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsRohanManager");
        ((C59052c) ((C59052c) c).mo56372aa(17744)).mo56386p("onCancelQuery called on unknown stream");
    }

    /* renamed from: b */
    public final void mo88877b() {
        if (this.f265675d.isPresent()) {
            this.f265673b.f((cf) this.f265675d.get());
            this.f265675d = Optional.empty();
            this.f265674c.mo88813d();
            return;
        }
        C59104x c = f265672a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsRohanManager");
        ((C59052c) ((C59052c) c).mo56372aa(17745)).mo56386p("onStopStreaming called on unknown stream");
    }

    /* renamed from: c */
    public final cf mo88878c() {
        C59104x b = f265672a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsRohanManager");
        ((C59052c) ((C59052c) b).mo56372aa(17743)).mo56386p("Creating buffer");
        cf c = this.f265673b.c();
        this.f265675d = Optional.m71637of(c);
        this.f265673b.e(c);
        return c;
    }

    public final void close() {
    }
}
