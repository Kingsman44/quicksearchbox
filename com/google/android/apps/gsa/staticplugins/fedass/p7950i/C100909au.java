package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132794b;
import com.google.android.apps.search.fedora.p10099e.C132795c;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132799g;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.au */
/* compiled from: PG */
public final /* synthetic */ class C100909au implements Function {

    /* renamed from: a */
    public final /* synthetic */ C100911aw f281929a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f281930b;

    public /* synthetic */ C100909au(C100911aw awVar, C65753ak akVar) {
        this.f281929a = awVar;
        this.f281930b = akVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C100911aw awVar = this.f281929a;
        C65753ak akVar = this.f281930b;
        C132800h hVar = (C132800h) obj;
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        if (!wVar.f362378n || !C100911aw.f281935b.contains(akVar)) {
            return hVar;
        }
        ((C19435g) awVar.f281937d.mo27525b()).mo24619a("Sheldon.Classic.GellerDelete.Reported");
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        C132795c cVar = fVar.f362328l;
        if (cVar == null) {
            cVar = C132795c.f362303c;
        }
        C132794b bVar = (C132794b) cVar.toBuilder();
        bVar.copyOnWrite();
        C132795c cVar2 = (C132795c) bVar.instance;
        cVar2.f362305a |= 1;
        cVar2.f362306b = true;
        C132795c cVar3 = (C132795c) bVar.build();
        C132798f fVar2 = hVar.f362335c;
        if (fVar2 == null) {
            fVar2 = C132798f.f362315o;
        }
        C132769a aVar = (C132769a) fVar2.toBuilder();
        aVar.copyOnWrite();
        C132798f fVar3 = (C132798f) aVar.instance;
        cVar3.getClass();
        fVar3.f362328l = cVar3;
        fVar3.f362317a |= 1024;
        C132798f fVar4 = (C132798f) aVar.build();
        C132799g gVar = (C132799g) hVar.toBuilder();
        gVar.copyOnWrite();
        C132800h hVar2 = (C132800h) gVar.instance;
        fVar4.getClass();
        hVar2.f362335c = fVar4;
        hVar2.f362333a |= 2;
        return (C132800h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
