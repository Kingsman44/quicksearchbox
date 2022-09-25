package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132799g;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.ae */
/* compiled from: PG */
public final /* synthetic */ class C101081ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f282259a;

    /* renamed from: b */
    public final /* synthetic */ boolean f282260b;

    public /* synthetic */ C101081ae(boolean z, boolean z2) {
        this.f282259a = z;
        this.f282260b = z2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f282259a;
        boolean z2 = this.f282260b;
        C132800h hVar = (C132800h) obj;
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        C132769a aVar = (C132769a) fVar.toBuilder();
        aVar.copyOnWrite();
        C132798f fVar2 = (C132798f) aVar.instance;
        fVar2.f362317a |= 1;
        fVar2.f362318b = z;
        aVar.copyOnWrite();
        C132798f fVar3 = (C132798f) aVar.instance;
        fVar3.f362317a |= 512;
        fVar3.f362327k = z2;
        aVar.copyOnWrite();
        C132798f fVar4 = (C132798f) aVar.instance;
        fVar4.f362317a |= 256;
        fVar4.f362326j = false;
        C132798f fVar5 = (C132798f) aVar.build();
        C132799g gVar = (C132799g) hVar.toBuilder();
        gVar.copyOnWrite();
        C132800h hVar2 = (C132800h) gVar.instance;
        fVar5.getClass();
        hVar2.f362335c = fVar5;
        hVar2.f362333a |= 2;
        return (C132800h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
