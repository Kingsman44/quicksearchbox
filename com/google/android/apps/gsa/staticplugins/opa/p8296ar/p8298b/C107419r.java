package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.p6443g.C83679a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83682a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83685d;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83687f;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83692a;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107429i;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107430j;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107993at;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48840bg;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.assistant.p3803ag.p3804a.C48857bx;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.assistant.p3803ag.p3804a.C48876s;
import com.google.assistant.p3803ag.p3804a.C48877t;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abe;
import com.google.assistant.p3897e.p3921j.abf;
import com.google.assistant.p3897e.p3921j.abu;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.r */
/* compiled from: PG */
public final class C107419r implements C83693b {

    /* renamed from: a */
    public static final Duration f298944a = Duration.ofDays(7);

    /* renamed from: b */
    public static final C59071e f298945b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ar.b.r");

    /* renamed from: c */
    public final C108013bm f298946c;

    /* renamed from: d */
    public final C22871g f298947d;

    /* renamed from: e */
    public final Context f298948e;

    /* renamed from: f */
    public final C86034c f298949f;

    /* renamed from: g */
    public final C22871g f298950g;

    /* renamed from: h */
    private final C83692a f298951h;

    /* renamed from: i */
    private final C83679a f298952i;

    public C107419r(C108013bm bmVar, C83692a aVar, C22871g gVar, C83679a aVar2, Context context, C86034c cVar, C22871g gVar2) {
        this.f298946c = bmVar;
        this.f298951h = aVar;
        this.f298947d = gVar;
        this.f298952i = aVar2;
        this.f298948e = context;
        this.f298949f = cVar;
        this.f298950g = gVar2;
    }

    /* renamed from: i */
    private final C60870cx m178326i(C83683b bVar, int i) {
        C58976aa aaVar = C58975e.f156826a;
        C83692a aVar = this.f298951h;
        C48851br brVar = bVar.f228110d;
        if (brVar == null) {
            brVar = C48851br.f126412f;
        }
        C48855bv bvVar = brVar.f126417d;
        if (bvVar == null) {
            bvVar = C48855bv.f126424b;
        }
        return this.f298947d.mo28210j(aVar.mo77010b(bvVar), "clientContentListFuture", new C107417p(this, bVar, i));
    }

    /* renamed from: a */
    public final C60870cx mo77015a() {
        C108013bm bmVar = this.f298946c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bmVar.f300493i.mo96377f(17, 30, Collections.emptySet()));
        arrayList.add(bmVar.f300493i.mo96377f(17, 28, Collections.emptySet()));
        return C118826c.m197212b(arrayList);
    }

    /* renamed from: b */
    public final C60870cx mo77016b(C48838be beVar) {
        ArrayList arrayList = new ArrayList();
        C48855bv bvVar = beVar.f126382a;
        if (bvVar == null) {
            bvVar = C48855bv.f126424b;
        }
        return this.f298947d.mo28210j(this.f298951h.mo77010b(bvVar), "deleteAllClientContentWithPrefix", new C107413l(this, arrayList, (Set) Collection.EL.stream(C107431k.m178344b(beVar)).map(C107429i.f298964a).collect(Collectors.toCollection(C107430j.f298965a))));
    }

    /* renamed from: c */
    public final C60870cx mo77017c(C83683b bVar) {
        C108013bm bmVar = this.f298946c;
        C48851br brVar = bVar.f228110d;
        if (brVar == null) {
            brVar = C48851br.f126412f;
        }
        C63088z byteString = brVar.toByteString();
        C83682a aVar = (C83682a) bVar.toBuilder();
        aVar.copyOnWrite();
        C83683b bVar2 = (C83683b) aVar.instance;
        bVar2.f228108b = 2;
        bVar2.f228107a |= 1;
        C60870cx G = bmVar.mo96356G(byteString, (C83683b) aVar.build(), f298944a);
        mo96003h(bVar);
        return C118826c.m197212b(Arrays.asList(new C60870cx[]{G, m178326i(bVar, 3)}));
    }

    /* renamed from: d */
    public final C60870cx mo77018d(C48855bv bvVar) {
        return this.f298947d.mo28210j(this.f298951h.mo77010b(bvVar), "dismissAllClientContentWithPrefix", new C107412k(this));
    }

    /* renamed from: e */
    public final C60870cx mo77019e(C63088z zVar, C83683b bVar) {
        C60870cx cxVar;
        int i = bVar.f228107a;
        if ((i & 4) == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("No selector for client content"));
        }
        int a = C83687f.m133251a(bVar.f228108b);
        if (a != 0 && a == 4) {
            if ((i & 2) != 0) {
                C48871n nVar = bVar.f228109c;
                if (nVar == null) {
                    nVar = C48871n.f126470e;
                }
                mo96002g(nVar);
            }
            mo96003h(bVar);
            cxVar = m178326i(bVar, 4);
        } else {
            cxVar = C118826c.f331423b;
        }
        return C118826c.m197212b(C58485gu.m89847o(this.f298946c.mo96356G(zVar, bVar, f298944a), cxVar));
    }

    /* renamed from: f */
    public final C60870cx mo77020f(C83685d dVar) {
        C48855bv bvVar;
        C48840bg bgVar;
        int i = dVar.f228116b;
        if (i == 1) {
            bvVar = ((C48838be) dVar.f228117c).f126382a;
            if (bvVar == null) {
                bvVar = C48855bv.f126424b;
            }
        } else {
            if (i == 4) {
                bgVar = (C48840bg) dVar.f228117c;
            } else {
                bgVar = C48840bg.f126386b;
            }
            bvVar = bgVar.f126389a;
            if (bvVar == null) {
                bvVar = C48855bv.f126424b;
            }
        }
        C108013bm bmVar = this.f298946c;
        return bmVar.f300486b.mo28210j(bmVar.f300493i.mo96378g(17, 30, C58833ax.m90834k(bvVar.toByteString().mo59174N()), dVar.toByteArray(), f298944a.toMinutes()), "updateProactiveApiClientContent", C107993at.f300462a);
    }

    /* renamed from: g */
    public final void mo96002g(C48871n nVar) {
        Object obj;
        Object obj2;
        if ((nVar.f126472a & 4) != 0) {
            C48877t tVar = nVar.f126474c;
            if (tVar == null) {
                tVar = C48877t.f126483b;
            }
            int a = C48876s.m85289a(tVar.f126485a);
            if (a != 0 && a == 201) {
                C83679a aVar = this.f298952i;
                C62940bt r1 = C62942bv.checkIsLite(C48857bx.f126428c);
                tVar.mo58887l(r1);
                Object l = tVar.f169962ag.mo58854l(r1.f169971d);
                if (l == null) {
                    obj = r1.f169969b;
                } else {
                    obj = r1.mo58889c(l);
                }
                aas aas = ((C48857bx) obj).f126430a;
                if (aas == null) {
                    aas = aas.f134661u;
                }
                C59104x b = C83679a.f228102a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ProactiveapiIntUtils");
                ((C59052c) ((C59052c) b).mo56372aa(6793)).mo56386p("#dismissNotificationContent");
                C62940bt r12 = C62942bv.checkIsLite(abu.f134764l);
                aas.mo58887l(r12);
                if (aas.f169962ag.mo58857o(r12.f169971d)) {
                    C62940bt r13 = C62942bv.checkIsLite(abu.f134764l);
                    aas.mo58887l(r13);
                    Object l2 = aas.f169962ag.mo58854l(r13.f169971d);
                    if (l2 == null) {
                        obj2 = r13.f169969b;
                    } else {
                        obj2 = r13.mo58889c(l2);
                    }
                    abf abf = (abf) ((abu) obj2).toBuilder();
                    abe abe = abe.REMOVE;
                    abf.copyOnWrite();
                    abu abu = (abu) abf.instance;
                    abu.f134775j = abe.f134714d;
                    abu.f134766a |= 512;
                    aaj aaj = (aaj) aas.toBuilder();
                    aaj.mo58885m(abu.f134764l, (abu) abf.build());
                    aas = (aas) aaj.build();
                }
                Intent intent = new Intent();
                intent.setAction("ACTION_DISMISS_NOTIFICATION");
                intent.setPackage("com.google.android.googlequicksearchbox");
                intent.putExtra("DISMISS_NOTIFICATION_EXTRA", aas.toByteArray());
                C74445c.m120396c(aVar.f228104c, intent);
            }
        }
    }

    /* renamed from: h */
    public final void mo96003h(C83683b bVar) {
        C58485gu guVar;
        int a = C48876s.m85289a(bVar.f228111e);
        if (a == 0) {
            a = 1;
        }
        switch (a - 1) {
            case 200:
                guVar = C58485gu.m89847o(C48864g.REMOVE_CONTENT, C48864g.SHOW_MOBILE_NOTIFICATION);
                break;
            case 201:
            case 202:
                guVar = C58485gu.m89847o(C48864g.REMOVE_CONTENT, C48864g.SHOW_ZERO_STATE_CARD);
                break;
            default:
                guVar = C58485gu.m89845m();
                break;
        }
        Collection.EL.stream(guVar).forEach(new C107415n(this, bVar));
    }
}
