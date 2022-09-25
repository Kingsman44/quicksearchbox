package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2037n.C24794e;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.p2069am.C25347w;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27815ac;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27818af;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.android.libraries.p1657ba.p1664c.p1666b.p1667a.C19647a;
import com.google.android.libraries.p1657ba.p1664c.p1666b.p1667a.C19648b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19650a;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19651b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.lens.p4701g.C62309ce;
import com.google.lens.p4701g.C62310cf;
import com.google.lens.p4701g.C62331d;
import com.google.lens.p4709l.p4710a.C62614b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.z */
/* compiled from: PG */
public final /* synthetic */ class C27909z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C27852ai f76020a;

    /* renamed from: b */
    public final /* synthetic */ C27850ag f76021b;

    public /* synthetic */ C27909z(C27852ai aiVar, C27850ag agVar) {
        this.f76020a = aiVar;
        this.f76021b = agVar;
    }

    public final Object apply(Object obj) {
        C27852ai aiVar = this.f76020a;
        C58495hd hdVar = (C58495hd) obj;
        C27886c cVar = (C27886c) this.f76021b;
        if (C28130s.m52412c(cVar.f75993a, C56306df.TEXT)) {
            if (!aiVar.f75930k) {
                C27854ak c = C27855al.m51882c();
                c.mo33338c(false);
                c.mo33337b(C58485gu.m89845m());
                return c.mo33336a();
            }
            C58480gp e = C58485gu.m89837e();
            C27892i iVar = aiVar.f75924e;
            C58833ax a = aiVar.f75925f.mo33326a(hdVar, C62614b.LOTS_FEATURE_TEXT);
            C62614b bVar = C62614b.LOTS_FEATURE_TEXT;
            C58836b bVar2 = C58836b.f156633a;
            e.mo55395g(iVar.mo33369b(a, bVar, bVar2, bVar2, false));
            C27892i iVar2 = aiVar.f75924e;
            C27815ac acVar = aiVar.f75923d;
            C58833ax k = C58833ax.m90834k(acVar.mo33318b(C27815ac.m51832a((long) acVar.f75880a)).mo33315b());
            C62614b bVar3 = C62614b.LOTS_FEATURE_TEXT;
            C58836b bVar4 = C58836b.f156633a;
            e.mo55395g(iVar2.mo33369b(k, bVar3, bVar4, bVar4, false));
            C27854ak c2 = C27855al.m51882c();
            c2.mo33338c(false);
            c2.mo33337b(C27852ai.m51872b(e.mo55394f()));
            return c2.mo33336a();
        } else if (C28130s.m52412c(cVar.f75993a, C56306df.TRANSLATE)) {
            String str = (String) Collection.EL.stream(cVar.f75993a.f149994a).filter(C27903t.f76014a).map(C27904u.f76015a).findFirst().orElse("auto");
            String str2 = (String) Collection.EL.stream(cVar.f75993a.f149994a).filter(C27907x.f76018a).map(C27908y.f76019a).findFirst().orElse("en");
            if (aiVar.f75928i || (cVar.f75994b && aiVar.f75931l && !aiVar.f75929j)) {
                return aiVar.mo33332a(hdVar, C58833ax.m90834k(str), C58833ax.m90834k(str2), aiVar.f75928i);
            }
            C58480gp e2 = C58485gu.m89837e();
            e2.mo55395g(aiVar.f75924e.mo33369b(aiVar.f75925f.mo33326a(hdVar, C62614b.LOTS_FEATURE_OFFLINE_TRANSLATE), C62614b.LOTS_FEATURE_OFFLINE_TRANSLATE, C58833ax.m90834k(str), C58833ax.m90834k(str2), false));
            e2.mo55395g(aiVar.f75924e.mo33368a(C27818af.m51835a(C25347w.PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V4_LEGACY).mo33315b(), C62614b.LOTS_FEATURE_OFFLINE_TRANSLATE, C58833ax.m90834k(str), C58833ax.m90834k(str2), false));
            C27854ak c3 = C27855al.m51882c();
            c3.mo33338c(false);
            c3.mo33337b(C27852ai.m51872b(e2.mo55394f()));
            return c3.mo33336a();
        } else if (C28130s.m52412c(cVar.f75993a, C56306df.AUTO_FILTER)) {
            C58480gp e3 = C58485gu.m89837e();
            if (aiVar.f75927h) {
                if (aiVar.f75921b.mo31462g(C26239a.HINTS_REGION_DETECTION_ENABLED)) {
                    C27890g f = C27891h.m51941f();
                    f.mo33310b(C62331d.HINT_WITH_REGION_CASCADE);
                    C19647a aVar = (C19647a) C19648b.f54652d.createBuilder();
                    aVar.copyOnWrite();
                    C19648b bVar5 = (C19648b) aVar.instance;
                    bVar5.f54654a |= 8;
                    bVar5.f54656c = 3;
                    C19648b bVar6 = (C19648b) aVar.build();
                    C19650a aVar2 = (C19650a) C19651b.f54657d.createBuilder();
                    aVar2.copyOnWrite();
                    C19651b bVar7 = (C19651b) aVar2.instance;
                    bVar7.f54659a |= 128;
                    bVar7.f54661c = 1;
                    C19651b bVar8 = (C19651b) aVar2.build();
                    C62309ce ceVar = (C62309ce) C62310cf.f168209d.createBuilder();
                    ceVar.copyOnWrite();
                    C62310cf cfVar = (C62310cf) ceVar.instance;
                    bVar6.getClass();
                    cfVar.f168212b = bVar6;
                    cfVar.f168211a |= 1;
                    ceVar.copyOnWrite();
                    C62310cf cfVar2 = (C62310cf) ceVar.instance;
                    bVar8.getClass();
                    cfVar2.f168213c = bVar8;
                    cfVar2.f168211a |= 2;
                    C62310cf cfVar3 = (C62310cf) ceVar.build();
                    C24794e eVar = (C24794e) C24795f.f67747l.createBuilder();
                    eVar.copyOnWrite();
                    C24795f fVar = (C24795f) eVar.instance;
                    cfVar3.getClass();
                    fVar.f67752d = cfVar3;
                    fVar.f67749a |= 4;
                    f.mo33311c((C24795f) eVar.build());
                    e3.mo55395g(f.mo33309a());
                }
                C27890g f2 = C27891h.m51941f();
                f2.mo33310b(C62331d.HINT_WITH_RECONCILIATION_CASCADE);
                e3.mo55395g(f2.mo33309a());
                C27890g f3 = C27891h.m51941f();
                f3.mo33310b(C62331d.HINT_CASCADE);
                e3.mo55395g(f3.mo33309a());
            } else if (aiVar.f75921b.mo31462g(C26239a.ENABLE_MOBILE_STARBURST_V5_WITHOUT_BYTES_IN_LENS_REQUEST)) {
                C27890g f4 = C27891h.m51941f();
                f4.mo33310b(C62331d.EMBEDDING_CASCADE);
                f4.mo33311c(C27898o.m51954a(aiVar.f75921b));
                e3.mo55395g(f4.mo33309a());
            }
            C27854ak c4 = C27855al.m51882c();
            c4.mo33338c(false);
            c4.mo33337b(e3.mo55394f());
            return c4.mo33336a();
        } else {
            C27854ak c5 = C27855al.m51882c();
            c5.mo33338c(false);
            c5.mo33337b(C58485gu.m89845m());
            return c5.mo33336a();
        }
    }
}
