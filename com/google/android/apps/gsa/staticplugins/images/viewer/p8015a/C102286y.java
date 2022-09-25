package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.staticplugins.images.p8013a.C102253c;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102296i;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102299l;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.protobuf.C62921ba;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64630a;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.y */
/* compiled from: PG */
public final class C102286y extends C23056g implements C102296i {

    /* renamed from: a */
    public final C102299l f285397a;

    /* renamed from: b */
    public final C22871g f285398b;

    /* renamed from: c */
    public final C85142a f285399c;

    /* renamed from: d */
    public final C87290c f285400d;

    /* renamed from: e */
    private final C86054o f285401e;

    public C102286y(C23052c cVar, C102299l lVar, C87290c cVar2, C86054o oVar, C23058i iVar, C22871g gVar, C85142a aVar) {
        super(cVar);
        this.f285397a = lVar;
        this.f285400d = cVar2;
        this.f285401e = oVar;
        this.f285398b = gVar;
        this.f285399c = aVar;
        iVar.mo28500a(cVar, new C102278q(this));
        C23015k kVar = (C23015k) cVar;
        kVar.f63315j.mo28433w(C102283v.class, new C102279r(this));
        kVar.f63315j.mo28433w(C102284w.class, new C102280s(this));
        kVar.f63315j.mo28433w(C102285x.class, new C102281t(this));
    }

    /* renamed from: h */
    public static C64631b m169551h(C64631b bVar) {
        C64630a aVar = (C64630a) bVar.toBuilder();
        C65926d dVar = ((C64631b) aVar.instance).f175200b;
        if (dVar == null) {
            dVar = C65926d.f179289b;
        }
        int min = Math.min(dVar.f179291a.size() - 1, Math.max(0, ((C64631b) aVar.instance).f175201c));
        aVar.copyOnWrite();
        C64631b bVar2 = (C64631b) aVar.instance;
        bVar2.f175199a |= 2;
        bVar2.f175201c = min;
        if (bVar2.f175208j) {
            aVar.copyOnWrite();
            C64631b bVar3 = (C64631b) aVar.instance;
            bVar3.f175199a |= 256;
            bVar3.f175207i = true;
        }
        if (((C64631b) aVar.instance).f175207i) {
            aVar.copyOnWrite();
            C64631b bVar4 = (C64631b) aVar.instance;
            bVar4.f175199a |= 64;
            bVar4.f175205g = false;
            aVar.copyOnWrite();
            C64631b bVar5 = (C64631b) aVar.instance;
            bVar5.f175199a |= 128;
            bVar5.f175206h = false;
        }
        if ((((C64631b) aVar.instance).f175199a & 4) == 0) {
            aVar.copyOnWrite();
            C64631b bVar6 = (C64631b) aVar.instance;
            bVar6.f175199a |= 64;
            bVar6.f175205g = false;
        }
        return (C64631b) aVar.build();
    }

    /* renamed from: e */
    public final C23186f mo93059e() {
        return ((Boolean) ((C102265d) this.f285397a).f285345g.f63720e).booleanValue() ? ((C102265d) this.f285397a).f285347i : ((C102265d) this.f285397a).f285344f;
    }

    /* renamed from: f */
    public final C23186f mo93060f() {
        return ((Boolean) ((C102265d) this.f285397a).f285345g.f63720e).booleanValue() ? ((C102265d) this.f285397a).f285344f : ((C102265d) this.f285397a).f285347i;
    }

    /* renamed from: i */
    public final void mo93061i() {
        String F = this.f285401e.mo79659F();
        if (F != null) {
            ((C102265d) this.f285397a).f285339a.mo28730f(F, false);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C64631b bVar = (C64631b) C23245b.m43557b(protoParcelable, C64631b.f175197n.getParserForType(), C62921ba.m95368a(), true);
        if (bVar == null || bVar.equals(C64631b.f175197n)) {
            bVar = C102253c.f285314a;
            C102253c.f285314a = C64631b.f175197n;
        }
        if ((bVar.f175199a & 1) != 0) {
            C65926d dVar = bVar.f175200b;
            if (dVar == null) {
                dVar = C65926d.f179289b;
            }
            if (dVar.f179291a.size() > 0) {
                C64631b h = m169551h(bVar);
                ((C102265d) this.f285397a).f285340b.mo28730f(h, false);
                ((C102265d) this.f285397a).f285344f.mo28624e("imageviewer", C23245b.m43556a(h));
                ((C102265d) this.f285397a).f285345g.mo28730f(true, false);
                mo93061i();
                return;
            }
        }
        this.f285400d.mo80935a();
    }
}
