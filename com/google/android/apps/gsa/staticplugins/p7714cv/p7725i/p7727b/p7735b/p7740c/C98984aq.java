package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92263a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.aq */
/* compiled from: PG */
public final class C98984aq extends C68247h {

    /* renamed from: a */
    private final C68283d f276725a;

    /* renamed from: c */
    private final C68283d f276726c;

    /* renamed from: d */
    private final C68283d f276727d;

    /* renamed from: e */
    private final C68283d f276728e;

    /* renamed from: f */
    private final C68283d f276729f;

    /* renamed from: g */
    private final C68283d f276730g;

    /* renamed from: h */
    private final C69464a f276731h;

    public C98984aq(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C69464a aVar3) {
        super(aVar2, new C68277d(C98984aq.class), aVar);
        this.f276725a = C68236af.m98549d(dVar);
        this.f276726c = C68236af.m98549d(dVar2);
        this.f276727d = C68236af.m98549d(dVar3);
        this.f276728e = C68236af.m98549d(dVar4);
        this.f276729f = C68236af.m98549d(dVar5);
        this.f276730g = C68236af.m98549d(dVar6);
        this.f276731h = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        long j;
        List list = (List) obj;
        C22871g gVar = (C22871g) list.get(0);
        C86124t tVar = (C86124t) list.get(1);
        C92263a aVar = (C92263a) list.get(2);
        C92473f fVar = (C92473f) list.get(3);
        C58833ax axVar = (C58833ax) list.get(4);
        u uVar = (u) list.get(5);
        C68214a a = C68219e.m98518a(this.f276731h);
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h()) {
            C98982ao aoVar = new C98982ao(uVar, axVar);
            C92460b a2 = ((C74458k) axVar.mo56107c()).mo70774a();
            int f = a2.mo87195f();
            int bitCount = Integer.bitCount(a2.mo87190a());
            if (((C91123v) a.mo27525b()).mo85390b()) {
                j = tVar.mo79743a(C90086ek.f250526x);
            } else {
                j = tVar.mo79743a(C90086ek.f250318aq);
            }
            return gVar.mo28204d("Embedded-Recognizer", j, new C98983ap(aVar, aoVar, fVar, f, bitCount));
        }
        throw new RuntimeException("AudioListeningSessionAdapter is missing");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f276725a.mo60297gq(), this.f276726c.mo60297gq(), this.f276727d.mo60297gq(), this.f276728e.mo60297gq(), this.f276729f.mo60297gq(), this.f276730g.mo60297gq());
    }
}
