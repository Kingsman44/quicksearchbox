package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132794b;
import com.google.android.apps.search.fedora.p10099e.C132795c;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132799g;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.aa */
/* compiled from: PG */
public final /* synthetic */ class C100889aa implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C100889aa f281881a = new C100889aa();

    private /* synthetic */ C100889aa() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C132800h hVar = (C132800h) obj;
        C132799g gVar = (C132799g) hVar.toBuilder();
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        C132769a aVar = (C132769a) fVar.toBuilder();
        C132798f fVar2 = hVar.f362335c;
        if (fVar2 == null) {
            fVar2 = C132798f.f362315o;
        }
        C132795c cVar = fVar2.f362328l;
        if (cVar == null) {
            cVar = C132795c.f362303c;
        }
        C132794b bVar = (C132794b) cVar.toBuilder();
        bVar.copyOnWrite();
        C132795c cVar2 = (C132795c) bVar.instance;
        cVar2.f362305a &= -2;
        cVar2.f362306b = false;
        C132795c cVar3 = (C132795c) bVar.build();
        aVar.copyOnWrite();
        C132798f fVar3 = (C132798f) aVar.instance;
        cVar3.getClass();
        fVar3.f362328l = cVar3;
        fVar3.f362317a |= 1024;
        C132798f fVar4 = (C132798f) aVar.build();
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
