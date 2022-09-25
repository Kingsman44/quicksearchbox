package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.nga.shared.p6339f.C81027b;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95029a;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95057t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96500t;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96501u;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96502v;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.q */
/* compiled from: PG */
public abstract class C95444q implements AutoCloseable, C95057t {

    /* renamed from: a */
    public static final C59071e f267052a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.q");

    /* renamed from: b */
    public final C96501u f267053b;

    /* renamed from: c */
    public final C81027b f267054c;

    /* renamed from: d */
    public C95029a f267055d;

    /* renamed from: e */
    public C96500t f267056e;

    /* renamed from: f */
    public C60870cx f267057f;

    /* renamed from: g */
    public boolean f267058g = false;

    /* renamed from: h */
    public final C96502v f267059h = new C95443p(this);

    /* renamed from: i */
    private final C22871g f267060i;

    protected C95444q(C22871g gVar, C81027b bVar, C96501u uVar, C95850a aVar) {
        this.f267060i = gVar;
        this.f267054c = bVar;
        this.f267053b = uVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: a */
    public abstract C60870cx mo89348a();

    /* renamed from: b */
    public abstract C60870cx mo89349b();

    /* renamed from: c */
    public final void mo88997c() {
        if (this.f267057f != null) {
            C59104x b = f267052a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BaseSimpleMicControl");
            ((C59052c) ((C59052c) b).mo56372aa(14901)).mo56386p("closeMic queued, another mic operation in progress");
            this.f267058g = false;
            return;
        }
        C59104x b2 = f267052a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BaseSimpleMicControl");
        ((C59052c) ((C59052c) b2).mo56372aa(14900)).mo56386p("closeMic");
        C96500t tVar = this.f267056e;
        if (tVar != null) {
            tVar.mo90183d();
            this.f267056e = null;
        }
        mo89368e(this.f267055d, C95439l.f267045a);
        this.f267058g = false;
        C60870cx a = mo89348a();
        this.f267057f = a;
        C90875ai.m148465b(new C95440m(this), a, this.f267060i, "cleanupAfterCloseMic").mo85223a(new C95441n(this));
    }

    public final void close() {
        if (this.f267056e != null) {
            mo88997c();
        }
    }

    /* renamed from: d */
    public final void mo88998d() {
        throw null;
    }

    /* renamed from: e */
    public final void mo89368e(C95029a aVar, C22864c cVar) {
        if (aVar != null) {
            this.f267060i.mo28209i(C60856cj.m92900i(aVar), "execute", cVar);
        }
    }

    /* renamed from: f */
    public final void mo88999f() {
        C59071e eVar = f267052a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BaseSimpleMicControl");
        ((C59052c) ((C59052c) b).mo56372aa(14908)).mo56386p("openMic");
        if (this.f267056e != null) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BaseSimpleMicControl");
            ((C59052c) ((C59052c) d).mo56372aa(14910)).mo56386p("openMic, bufferRecorder is not null - mic is already open");
            this.f267058g = true;
        } else if (this.f267057f != null) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BaseSimpleMicControl");
            ((C59052c) ((C59052c) b2).mo56372aa(14909)).mo56386p("openMic queued, another mic operation in progress");
            this.f267058g = true;
        } else {
            this.f267058g = true;
            C60870cx b3 = mo89349b();
            this.f267057f = b3;
            C90875ai.m148465b(new C95436i(this), b3, this.f267060i, "afterPrepareToOpenMic").mo85223a(new C95437j(this));
        }
    }

    /* renamed from: g */
    public final void mo88959g(C95029a aVar) {
        this.f267055d = aVar;
    }
}
