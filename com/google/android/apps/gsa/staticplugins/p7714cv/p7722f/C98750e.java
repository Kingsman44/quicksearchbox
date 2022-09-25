package com.google.android.apps.gsa.staticplugins.p7714cv.p7722f;

import android.content.Context;
import com.google.android.apps.gsa.c.f.e;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118949c;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118950d;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89957y;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.p7139a.C90515g;
import com.google.android.apps.gsa.shared.speech.p7139a.C90524p;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.C90768bl;
import com.google.android.apps.gsa.speech.audio.C92209t;
import com.google.android.apps.gsa.speech.p7269b.C92217b;
import com.google.android.apps.gsa.speech.p7292i.C92429a;
import com.google.android.apps.gsa.speech.p7294j.C92431a;
import com.google.android.apps.gsa.speech.p7294j.C92435e;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2904c.p2976v.C38120a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.f.e */
/* compiled from: PG */
public final class C98750e implements C118950d {

    /* renamed from: a */
    private static final C59071e f275848a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.f.e");

    /* renamed from: b */
    private final C98747b f275849b;

    /* renamed from: c */
    private final C118949c f275850c;

    /* renamed from: d */
    private final C98752g f275851d;

    /* renamed from: e */
    private final C68214a f275852e;

    /* renamed from: f */
    private final C90021c f275853f;

    /* renamed from: g */
    private final C89994f f275854g;

    /* renamed from: h */
    private final C58833ax f275855h;

    /* renamed from: i */
    private final C68214a f275856i;

    /* renamed from: j */
    private final C22871g f275857j;

    /* renamed from: k */
    private final u f275858k;

    /* renamed from: l */
    private final C92209t f275859l;

    /* renamed from: m */
    private final Context f275860m;

    public C98750e(C118949c cVar, C98752g gVar, C68214a aVar, C90021c cVar2, C98747b bVar, C89994f fVar, C58833ax axVar, C68214a aVar2, u uVar, C22871g gVar2, C92209t tVar, Context context) {
        this.f275849b = bVar;
        this.f275858k = uVar;
        this.f275850c = cVar;
        this.f275851d = gVar;
        this.f275852e = aVar;
        this.f275853f = cVar2;
        this.f275854g = fVar;
        this.f275855h = axVar;
        this.f275856i = aVar2;
        this.f275857j = gVar2;
        this.f275859l = tVar;
        this.f275860m = context;
    }

    /* renamed from: d */
    private final synchronized void m163584d(C92473f fVar, C92217b bVar, List list, boolean z, C58833ax axVar) {
        List a = this.f275850c.mo91287a(list);
        if (z) {
            this.f275849b.mo91283c(a, fVar, bVar, axVar);
        } else {
            this.f275849b.mo91282b(a, bVar, axVar);
        }
    }

    /* renamed from: e */
    private final synchronized boolean m163585e(List list, C92435e eVar, long j) {
        if (!list.isEmpty()) {
            return true;
        }
        C90524p pVar = new C90524p();
        C89886e b = ((C89911f) this.f275852e.mo27525b()).mo83756b(pVar);
        b.mo83725d(j);
        b.mo83721a();
        eVar.mo87095a(pVar);
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo91288a(C92473f fVar, C92435e eVar, C92217b bVar, List list, boolean z, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h()) {
            if (C38120a.m67298b(this.f275860m, "android.permission.RECORD_AUDIO")) {
                if (mo91290c(fVar, eVar)) {
                    this.f275859l.mo86889b(2);
                    if (fVar.f258014b != C90536a.HOTWORD) {
                        C89949q.m146526k(C89957y.m146539b(C39191a.m68623b(fVar.f258032t)));
                    }
                    int ordinal = fVar.f258014b.ordinal();
                    if (ordinal == 4) {
                        C89949q.m146526k(C89957y.m146540c(5));
                    } else if (ordinal != 5) {
                        C89949q.m146526k(C89957y.m146540c(1));
                    } else {
                        C89949q.m146526k(C89957y.m146540c(7));
                    }
                    if (m163585e(list, eVar, fVar.f258032t)) {
                        m163584d(fVar, bVar, list, z, axVar);
                        return;
                    }
                    return;
                }
            }
            this.f275858k.g("RecognizerImpl", axVar, false);
        }
    }

    /* renamed from: b */
    public final synchronized void mo91289b(C92473f fVar, C92435e eVar, C22871g gVar, C58833ax axVar) {
        C92435e eVar2 = eVar;
        synchronized (this) {
            if (eVar2 == null) {
                C59104x d = f275848a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "RecognizerImpl");
                ((C59052c) ((C59052c) d).mo56372aa(31074)).mo56386p("Cannot start listening with no listener");
                return;
            }
            C98746a aVar = new C98746a((C92435e) C90768bl.m148268a(gVar, C92435e.class, eVar2), axVar, this.f275858k);
            C98752g gVar2 = this.f275851d;
            C92473f fVar2 = fVar;
            C92429a aVar2 = new C92429a(gVar2.f275866a, fVar2, this.f275854g, gVar2.f275867b);
            mo91288a(fVar, aVar, C98752g.m163596a(fVar, this.f275849b, aVar, (C92541i) this.f275856i.mo27525b(), this.f275853f, this.f275852e, this.f275855h, aVar2.mo87091a(), aVar2.mo87092b(), axVar, this.f275858k), aVar2.mo87093c(), true, axVar);
        }
    }

    /* renamed from: c */
    public final boolean mo91290c(C92473f fVar, C92431a aVar) {
        boolean a = this.f275859l.mo86888a(fVar.f258015c, fVar.f258014b == C90536a.HOTWORD);
        if (!a) {
            e.a((C89911f) this.f275852e.mo27525b(), aVar, new C90515g("Another recognition in progress", 524299, false), Long.valueOf(fVar.f258032t));
        }
        return a;
    }
}
