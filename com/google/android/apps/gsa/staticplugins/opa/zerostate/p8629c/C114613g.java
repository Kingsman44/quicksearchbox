package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8629c;

import com.facebook.litho.C6411u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p417d.p418a.p419a.p420a.C8520b;
import com.google.p4283bv.p4343c.p4344a.C56949b;
import com.google.protobuf.C62917ay;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.c.g */
/* compiled from: PG */
public final class C114613g implements C21270bm {

    /* renamed from: c */
    private static final C59071e f317920c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.c.g");

    /* renamed from: a */
    public final C114742l f317921a;

    /* renamed from: b */
    public final C86124t f317922b;

    public C114613g(C86124t tVar, C114742l lVar) {
        this.f317921a = lVar;
        this.f317922b = tVar;
    }

    /* renamed from: a */
    public final C62917ay mo25837a() {
        return C8520b.f29552e;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C28293k kVar;
        C8520b bVar = (C8520b) obj;
        if (!(arVar instanceof C114610d)) {
            C59104x c = f317920c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ZSLoggingPropsCnvtr");
            ((C59052c) ((C59052c) c).mo56372aa(29353)).mo56386p("Missing ZeroStateElementBuilder in ZeroStateElementsSearchLoggingPropertiesConverter");
            return;
        }
        C114610d dVar = (C114610d) arVar;
        if ((bVar.f29554a & 2) != 0) {
            kVar = C28293k.m52908e(new C28292j(bVar.f29556c), new C28293k[0]);
            C28257a aVar = (C28257a) kVar;
            if (aVar.f76908a != null) {
                C56949b bVar2 = bVar.f29555b;
                if (bVar2 == null) {
                    bVar2 = C56949b.f151993d;
                }
                if (bVar2.f151996b) {
                    C28292j jVar = aVar.f76908a;
                    jVar.getClass();
                    jVar.mo33795i(5);
                }
            }
            if (aVar.f76908a != null) {
                C56949b bVar3 = bVar.f29555b;
                if (bVar3 == null) {
                    bVar3 = C56949b.f151993d;
                }
                if ((bVar3.f151995a & 256) != 0) {
                    C28292j jVar2 = aVar.f76908a;
                    jVar2.getClass();
                    C56949b bVar4 = bVar.f29555b;
                    if (bVar4 == null) {
                        bVar4 = C56949b.f151993d;
                    }
                    C63204j jVar3 = bVar4.f151997c;
                    if (jVar3 == null) {
                        jVar3 = C63204j.f170749e;
                    }
                    jVar2.mo33792f(jVar3);
                }
            }
        } else {
            kVar = null;
        }
        if (kVar != null) {
            if (this.f317922b.mo79746e(C90014bt.f247218cx)) {
                dVar.mo25939m(new C114611e(this, dVar, kVar, str));
            }
            C56949b bVar5 = bVar.f29555b;
            if (bVar5 == null) {
                bVar5 = C56949b.f151993d;
            }
            if (bVar5.f151996b) {
                dVar.mo25943q(new C114612f(this, dVar, kVar, str));
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }
}
