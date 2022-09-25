package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132799g;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.protobuf.C62942bv;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.n */
/* compiled from: PG */
public final /* synthetic */ class C101063n implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f282217a;

    /* renamed from: b */
    public final /* synthetic */ Optional f282218b;

    /* renamed from: c */
    public final /* synthetic */ List f282219c;

    /* renamed from: d */
    public final /* synthetic */ C132818z f282220d;

    public /* synthetic */ C101063n(boolean z, Optional optional, List list, C132818z zVar) {
        this.f282217a = z;
        this.f282218b = optional;
        this.f282219c = list;
        this.f282220d = zVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f282217a;
        Optional optional = this.f282218b;
        List list = this.f282219c;
        C132818z zVar = this.f282220d;
        C132800h hVar = (C132800h) obj;
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        C132769a aVar = (C132769a) fVar.toBuilder();
        aVar.copyOnWrite();
        C132798f fVar2 = (C132798f) aVar.instance;
        fVar2.f362317a |= 4;
        fVar2.f362320d = z;
        if (optional.isPresent()) {
            String str = (String) optional.get();
            aVar.copyOnWrite();
            C132798f fVar3 = (C132798f) aVar.instance;
            str.getClass();
            fVar3.f362317a |= 8;
            fVar3.f362321e = str;
        } else {
            aVar.copyOnWrite();
            C132798f fVar4 = (C132798f) aVar.instance;
            fVar4.f362317a &= -9;
            fVar4.f362321e = C132798f.f362315o.f362321e;
        }
        aVar.copyOnWrite();
        ((C132798f) aVar.instance).f362322f = C62942bv.emptyProtobufList();
        aVar.mo110905a(list);
        C132799g gVar = (C132799g) hVar.toBuilder();
        gVar.copyOnWrite();
        C132800h hVar2 = (C132800h) gVar.instance;
        zVar.getClass();
        hVar2.f362336d = zVar;
        hVar2.f362333a |= 4;
        gVar.copyOnWrite();
        C132800h hVar3 = (C132800h) gVar.instance;
        C132798f fVar5 = (C132798f) aVar.build();
        fVar5.getClass();
        hVar3.f362335c = fVar5;
        hVar3.f362333a |= 2;
        return (C132800h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
