package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.contacts.cl;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.assistant.p3897e.p3921j.C52370pf;
import com.google.assistant.p3897e.p3921j.add;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.util.List;
import java.util.Set;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70976ac;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70978ae;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70979af;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.am */
/* compiled from: PG */
public final /* synthetic */ class C93002am implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C93003an f259435a;

    /* renamed from: b */
    public final /* synthetic */ Set f259436b;

    /* renamed from: c */
    public final /* synthetic */ List f259437c;

    /* renamed from: d */
    public final /* synthetic */ List f259438d;

    /* renamed from: e */
    public final /* synthetic */ String f259439e;

    /* renamed from: f */
    public final /* synthetic */ C52370pf f259440f;

    /* renamed from: g */
    public final /* synthetic */ boolean f259441g;

    public /* synthetic */ C93002am(C93003an anVar, Set set, List list, List list2, String str, C52370pf pfVar, boolean z) {
        this.f259435a = anVar;
        this.f259436b = set;
        this.f259437c = list;
        this.f259438d = list2;
        this.f259439e = str;
        this.f259440f = pfVar;
        this.f259441g = z;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C93003an anVar = this.f259435a;
        Set set = this.f259436b;
        List list = this.f259437c;
        List list2 = this.f259438d;
        String str = this.f259439e;
        C52370pf pfVar = this.f259440f;
        boolean z = this.f259441g;
        ((C59052c) ((C59052c) C93003an.f259442a.mo56224b()).mo56372aa(13191)).mo56386p("Start IcingContactLookup.");
        List<Person> m = ((C84418a) anVar.f259443b.mo27525b()).mo77984a().m(set, list, list2, str, "opa-contact-lookup");
        if (anVar.f259448g == 5) {
            C37215b bVar = anVar.f259447f;
            C37252a c = C37176a.f97089ev.mo40805c(C62722b.OK);
            C62940bt btVar = C70977ad.f189267f;
            C70976ac acVar = (C70976ac) C70977ad.f189266e.createBuilder();
            C70978ae aeVar = (C70978ae) C70979af.f189273c.createBuilder();
            int size = m.size();
            aeVar.copyOnWrite();
            C70979af afVar = (C70979af) aeVar.instance;
            afVar.f189275a |= 1;
            afVar.f189276b = size;
            C70979af afVar2 = (C70979af) aeVar.build();
            acVar.copyOnWrite();
            C70977ad adVar = (C70977ad) acVar.instance;
            afVar2.getClass();
            adVar.f189271c = afVar2;
            adVar.f189269a |= 2;
            ((C37253b) c).mo40792p(btVar, (C70977ad) acVar.build());
            bVar.mo19974a(c);
        }
        boolean e = ((C86124t) anVar.f259446e.mo27525b()).mo79746e(C90025cd.f248142F);
        add add = (add) ade.f134877h.createBuilder();
        for (Person a : m) {
            add.mo53673a(cl.a(a, z, e));
        }
        return C93003an.m153064b((ade) add.build(), pfVar);
    }
}
