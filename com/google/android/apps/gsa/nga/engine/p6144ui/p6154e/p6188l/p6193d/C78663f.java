package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6193d;

import com.google.android.apps.gsa.assistant.shared.appactions.b.u;
import com.google.android.apps.gsa.assistant.shared.appactions.b.v;
import com.google.android.apps.gsa.assistant.shared.appactions.p5803b.C73806c;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74946b;
import com.google.android.apps.gsa.nga.engine.p5994c.p6002d.C75326a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6166a.C78237a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6179c.C78546a;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.d.f */
/* compiled from: PG */
public final class C78663f implements C78237a, C78546a {

    /* renamed from: a */
    public static final C59071e f216559a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.l.d.f");

    /* renamed from: b */
    public final C74946b f216560b;

    /* renamed from: c */
    public final u f216561c;

    /* renamed from: d */
    private final C83357g f216562d = new C83361k(Optional.empty(), C78263m.class);

    /* renamed from: e */
    private final C75326a f216563e;

    /* renamed from: f */
    private final C78253d f216564f;

    /* renamed from: g */
    private final C22871g f216565g;

    public C78663f(C75326a aVar, C74946b bVar, C78253d dVar, C22871g gVar, C73806c cVar, v vVar, i iVar) {
        this.f216563e = aVar;
        this.f216560b = bVar;
        this.f216564f = dVar;
        this.f216565g = gVar;
        this.f216561c = vVar.a(iVar, cVar);
    }

    /* renamed from: h */
    private final boolean m126376h() {
        return ((Boolean) this.f216564f.mo73214m().mo76657c()).booleanValue();
    }

    /* renamed from: a */
    public final void mo73156a(C87693ab abVar) {
        if (m126376h()) {
            this.f216560b.mo71314d();
            C80905at.m128763g(this.f216561c.c(abVar.f237120d), C78661d.f216557a);
        }
    }

    /* renamed from: b */
    public final void mo73157b(C87693ab abVar) {
        if (m126376h()) {
            this.f216563e.mo71674d(abVar);
            this.f216560b.mo71314d();
        }
    }

    /* renamed from: c */
    public final void mo73158c(C87693ab abVar) {
        if (m126376h()) {
            mo73561g(Optional.m71637of(C87693ab.f237115j));
            new C90873ag(this.f216563e.mo71671a(abVar), this.f216565g, "[NGA] Oneoff request: save shortcut", new C78658a(this, abVar)).mo85223a(new C78659b(this));
        }
    }

    /* renamed from: d */
    public final void mo73159d(C87693ab abVar) {
        if (m126376h()) {
            mo73561g(Optional.m71637of(abVar));
        }
    }

    /* renamed from: e */
    public final C83358h mo73490e() {
        return C83349aj.m132656k(this.f216564f.mo73214m(), this.f216562d, C78662e.f216558a);
    }

    /* renamed from: f */
    public final void mo73491f() {
        if (m126376h()) {
            mo73561g(Optional.empty());
        }
    }

    /* renamed from: g */
    public final void mo73561g(Optional optional) {
        C83349aj.m132647b(this.f216565g, this.f216562d, optional, "shortcutContentObserver");
    }
}
