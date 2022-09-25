package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.images.p8013a.C102254d;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102292e;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102295h;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.protobuf.C62921ba;
import com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64628a;
import com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.o */
/* compiled from: PG */
public final class C102276o extends C23056g implements C102292e {

    /* renamed from: a */
    public final C102295h f285385a;

    /* renamed from: b */
    public final Map f285386b = new HashMap();

    /* renamed from: c */
    public boolean f285387c = false;

    /* renamed from: d */
    private final C102254d f285388d;

    /* renamed from: e */
    private final C22871g f285389e;

    public C102276o(C23052c cVar, C102295h hVar, C102254d dVar, C22871g gVar, C102283v vVar, C102284w wVar, C102285x xVar) {
        super(cVar);
        this.f285385a = hVar;
        this.f285388d = dVar;
        this.f285389e = gVar;
        C23015k kVar = (C23015k) cVar;
        kVar.f63315j.mo28433w(C102283v.class, vVar);
        kVar.f63315j.mo28433w(C102284w.class, wVar);
        kVar.f63315j.mo28433w(C102285x.class, xVar);
        kVar.f63315j.mo28433w(C102275n.class, new C102273l(this));
    }

    /* renamed from: i */
    private final void m169532i() {
        if (mo93053e().f175205g && !this.f285387c) {
            int intValue = ((Integer) ((C102263b) this.f285385a).f285336c.f63720e).intValue();
            C65926d dVar = mo93053e().f175200b;
            if (dVar == null) {
                dVar = C65926d.f179289b;
            }
            if (intValue >= dVar.f179291a.size() - 5) {
                this.f285387c = true;
                C22871g gVar = this.f285389e;
                C102254d dVar2 = this.f285388d;
                String str = mo93053e().f175202d;
                C65926d dVar3 = mo93053e().f175200b;
                if (dVar3 == null) {
                    dVar3 = C65926d.f179289b;
                }
                int size = dVar3.f179291a.size() / 10;
                ArrayList arrayList = new ArrayList();
                C65926d dVar4 = mo93053e().f175200b;
                if (dVar4 == null) {
                    dVar4 = C65926d.f179289b;
                }
                int i = 0;
                while (i < dVar4.f179291a.size() && i < 100) {
                    arrayList.add(((C65930h) dVar4.f179291a.get((dVar4.f179291a.size() - i) - 1)).f179303b.replaceAll(":$", BuildConfig.FLAVOR));
                    i++;
                }
                gVar.mo28211k(dVar2.mo93041c(str, size, arrayList), "Async metadata callback", new C102274m(this));
            }
        }
    }

    /* renamed from: j */
    private final void m169533j(int i) {
        C102270i iVar = (C102270i) this.f285386b.remove(Integer.valueOf(i));
        if (iVar != null) {
            ((C102263b) this.f285385a).f285335b.mo28653g(iVar);
        }
    }

    /* renamed from: e */
    public final C64631b mo93053e() {
        return (C64631b) ((C102263b) this.f285385a).f285334a.f63720e;
    }

    /* renamed from: f */
    public final void mo93054f(int i) {
        C65926d dVar = mo93053e().f175200b;
        if (dVar == null) {
            dVar = C65926d.f179289b;
        }
        if (i >= 0 && i < dVar.f179291a.size() && !this.f285386b.containsKey(Integer.valueOf(i))) {
            C64628a aVar = (C64628a) C64629b.f175186i.createBuilder();
            C65930h hVar = (C65930h) dVar.f179291a.get(i);
            aVar.copyOnWrite();
            C64629b bVar = (C64629b) aVar.instance;
            hVar.getClass();
            bVar.f175189b = hVar;
            bVar.f175188a |= 1;
            aVar.copyOnWrite();
            C64629b bVar2 = (C64629b) aVar.instance;
            bVar2.f175188a |= 2;
            bVar2.f175190c = i;
            boolean z = mo93053e().f175207i;
            aVar.copyOnWrite();
            C64629b bVar3 = (C64629b) aVar.instance;
            bVar3.f175188a |= 32;
            bVar3.f175194g = z;
            boolean z2 = mo93053e().f175206h;
            aVar.copyOnWrite();
            C64629b bVar4 = (C64629b) aVar.instance;
            bVar4.f175188a |= 16;
            bVar4.f175193f = z2;
            boolean z3 = mo93053e().f175208j;
            aVar.copyOnWrite();
            C64629b bVar5 = (C64629b) aVar.instance;
            bVar5.f175188a |= 64;
            bVar5.f175195h = z3;
            if ((mo93053e().f175199a & 4) != 0) {
                String str = mo93053e().f175202d;
                aVar.copyOnWrite();
                C64629b bVar6 = (C64629b) aVar.instance;
                str.getClass();
                bVar6.f175188a |= 4;
                bVar6.f175191d = str;
            }
            int size = ((C102263b) this.f285385a).f285335b.f63603b.size();
            ((C102263b) this.f285385a).f285335b.mo28648b("imagepage", C23245b.m43556a((C64629b) aVar.build()), size);
            ((C102263b) this.f285385a).f285335b.mo28650d(size, new C102272k(this));
        }
    }

    /* renamed from: h */
    public final void mo93055h(int i) {
        int intValue = ((Integer) ((C102263b) this.f285385a).f285336c.f63720e).intValue();
        if (i != intValue) {
            ((C102263b) this.f285385a).f285336c.mo28730f(Integer.valueOf(i), false);
            if (i > intValue) {
                mo93054f(i + 2);
                m169533j(i - 3);
            } else if (i < intValue) {
                mo93054f(i - 2);
                m169533j(i + 3);
            }
            m169532i();
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        for (int i = 0; i < ((C102263b) this.f285385a).f285335b.f63603b.size(); i++) {
            ((C102263b) this.f285385a).f285335b.mo28650d(i, new C102272k(this));
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C64631b bVar = (C64631b) C23245b.m43557b(protoParcelable, C64631b.f175197n.getParserForType(), C62921ba.m95368a(), true);
        bVar.getClass();
        ((C102263b) this.f285385a).f285334a.mo28730f(bVar, false);
        ((C102263b) this.f285385a).f285336c.mo28730f(Integer.valueOf(bVar.f175201c), false);
        int i = mo93053e().f175201c;
        for (int i2 = i - 2; i2 <= i + 2; i2++) {
            mo93054f(i2);
        }
        m169532i();
    }
}
