package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.assistant.shared.p5809c.C73849a;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.j */
/* compiled from: PG */
public final class C94323j extends C83870ad {

    /* renamed from: b */
    private static final C59071e f263583b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.j");

    /* renamed from: a */
    public int f263584a = 1;

    /* renamed from: c */
    private final C83923j f263585c;

    /* renamed from: d */
    private final C90021c f263586d;

    /* renamed from: e */
    private final C94298ew f263587e;

    /* renamed from: f */
    private final C94200bf f263588f;

    /* renamed from: g */
    private final boolean f263589g;

    /* renamed from: h */
    private C94304fb f263590h;

    /* renamed from: i */
    private C94297ev f263591i;

    /* renamed from: j */
    private int f263592j = 1;

    public C94323j(C83923j jVar, boolean z, C90021c cVar, C94298ew ewVar, C94200bf bfVar) {
        this.f263585c = jVar;
        this.f263586d = cVar;
        this.f263587e = ewVar;
        this.f263588f = bfVar;
        this.f263589g = z;
    }

    /* renamed from: a */
    private final C58833ax m155626a() {
        this.f263592j = 2;
        C94304fb fbVar = new C94304fb();
        this.f263590h = fbVar;
        return C58833ax.m90834k(fbVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        C59071e eVar = f263583b;
        C59052c cVar = (C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14112);
        int i = this.f263592j;
        int i2 = i - 1;
        if (i != 0) {
            cVar.mo56387q("#getNextDelegate currentState %d", i2);
            if (!C73849a.m108439a(this.f263586d)) {
                return C58836b.f156633a;
            }
            int i3 = this.f263592j;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == 0) {
                return m155626a();
            } else {
                if (i4 == 1) {
                    C94327n nVar = this.f263590h.f263530a.f263052D;
                    if ((nVar.f263600a & 2) == 0 && !nVar.f263604f) {
                        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14113)).mo56386p("User exits at Recording step.");
                        this.f263584a = 3;
                        return C58836b.f156633a;
                    }
                    this.f263592j = 3;
                    C94298ew ewVar = this.f263587e;
                    C83923j jVar = this.f263585c;
                    boolean z = this.f263589g;
                    nVar.getClass();
                    jVar.getClass();
                    C94256dh dhVar = (C94256dh) ewVar.f263503a.mo17428b();
                    dhVar.getClass();
                    C84026u uVar = (C84026u) ewVar.f263504b.mo17428b();
                    uVar.getClass();
                    C69464a aVar = ewVar.f263505c;
                    C22871g gVar = (C22871g) ewVar.f263506d.mo17428b();
                    gVar.getClass();
                    C86124t tVar = (C86124t) ewVar.f263507e.mo17428b();
                    tVar.getClass();
                    C94297ev evVar = new C94297ev(nVar, jVar, z, dhVar, uVar, aVar, gVar, tVar);
                    this.f263591i = evVar;
                    return C58833ax.m90834k(evVar);
                } else if (i4 == 2) {
                    this.f263584a = this.f263591i.f263495c;
                    ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14114)).mo56387q("enrollResult is %d", this.f263584a);
                    if (this.f263584a != 0) {
                        return C58836b.f156633a;
                    }
                    C94200bf bfVar = this.f263588f;
                    bfVar.f263198a = new CopyOnWriteArrayList();
                    bfVar.f263199b = new AtomicReference();
                    return m155626a();
                } else {
                    throw new IllegalArgumentException("Unknown State.");
                }
            }
        } else {
            throw null;
        }
    }
}
