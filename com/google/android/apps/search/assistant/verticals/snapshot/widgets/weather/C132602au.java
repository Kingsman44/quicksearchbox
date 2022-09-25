package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.apps.search.assistant.verticals.snapshot.p10080a.C132570a;
import com.google.apps.tiktok.p3644h.p3647b.C47120c;
import com.google.assistant.p3994s.p3995a.C53259hg;
import com.google.assistant.p3994s.p3995a.C53260hh;
import com.google.assistant.p3994s.p3995a.C53261hi;
import com.google.assistant.p3994s.p3995a.C53263hk;
import com.google.assistant.p3994s.p3995a.C53348ko;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4632a.C61349j;
import com.google.frameworks.client.data.android.p4632a.C61354o;
import com.google.frameworks.client.data.android.p4632a.C61355p;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.p4631a.C61331a;
import com.google.p4017at.p4099l.p4100a.C54561b;
import com.google.p4017at.p4099l.p4100a.C54562c;
import com.google.p4479cg.C58079k;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70846h;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.au */
/* compiled from: PG */
public final /* synthetic */ class C132602au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132606ay f361874a;

    /* renamed from: b */
    public final /* synthetic */ String f361875b;

    /* renamed from: c */
    public final /* synthetic */ C53259hg f361876c;

    public /* synthetic */ C132602au(C132606ay ayVar, String str, C53259hg hgVar) {
        this.f361874a = ayVar;
        this.f361875b = str;
        this.f361876c = hgVar;
    }

    public final C60870cx apply(Object obj) {
        C132606ay ayVar = this.f361874a;
        String str = this.f361875b;
        C53259hg hgVar = this.f361876c;
        C58079k kVar = (C58079k) obj;
        C132570a aVar = ayVar.f361886c;
        C53260hh hhVar = (C53260hh) C53261hi.f139621e.createBuilder();
        hhVar.copyOnWrite();
        C53261hi hiVar = (C53261hi) hhVar.instance;
        kVar.getClass();
        hiVar.f139624b = kVar;
        hiVar.f139623a |= 1;
        hhVar.copyOnWrite();
        C53261hi hiVar2 = (C53261hi) hhVar.instance;
        str.getClass();
        hiVar2.f139623a |= 2;
        hiVar2.f139625c = str;
        hhVar.copyOnWrite();
        C53261hi hiVar3 = (C53261hi) hhVar.instance;
        hgVar.getClass();
        hiVar3.f139626d = hgVar;
        hiVar3.f139623a |= 4;
        C53261hi hiVar4 = (C53261hi) hhVar.build();
        C53348ko koVar = C53348ko.f139988b;
        C70334de deVar = new C70334de();
        deVar.mo62033h(C70297cz.m102495c(C61331a.m93818a(304380776), C70334de.f187480b), koVar.toByteArray());
        C70899n[] nVarArr = {new C70879r(deVar)};
        C70846h hVar = C61409d.f166071a;
        C47120c cVar = aVar.f361792b;
        C61349j jVar = new C61349j();
        C61354o a = C61355p.m93860a(C58528ij.m90011K("pseudonymous", "incognito"));
        a.f165916a = C58833ax.m90834k("AIzaSyCpI5XmzyrZIt3VUNe7YO60DQDYL6GlmMA");
        jVar.f165910b = C58833ax.m90834k(a.mo57929a());
        C54561b bVar = (C54561b) ((C54561b) ((C54561b) aVar.f361791a.mo17428b()).mo62576o(nVarArr)).mo62577p(hVar, new C61358s(jVar.mo57930b()));
        C70888j jVar2 = bVar.f189039a;
        C70338di diVar = C54562c.f143251b;
        if (diVar == null) {
            synchronized (C54562c.class) {
                diVar = C54562c.f143251b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.zerostateproxy.v1.ZeroStateProxy", "GenerateWeatherWidget");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53261hi.f139621e);
                    d.f187486b = C70850d.m103697c(C53263hk.f139627c);
                    diVar = d.mo62040a();
                    C54562c.f143251b = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar2.mo39510a(diVar, bVar.f189040b), hiVar4);
    }
}
