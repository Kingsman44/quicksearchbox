package com.google.android.apps.gsa.staticplugins.p7850dq.p7853c.p7854a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119132n;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119133o;
import com.google.android.libraries.p11016ak.C147621ab;
import p3186j$.util.function.Function;
import p5285d.p5290b.p5291a.p5292a.C68169be;
import p5285d.p5290b.p5291a.p5292a.C68172bh;
import p5285d.p5290b.p5291a.p5292a.C68177bm;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.c.a.m */
/* compiled from: PG */
public final /* synthetic */ class C99972m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C147621ab f279636a;

    public /* synthetic */ C99972m(C147621ab abVar) {
        this.f279636a = abVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C68172bh bhVar = (C68172bh) obj;
        String str = this.f279636a.mo124381e().f184515a;
        C68169be beVar = bhVar.f184476b;
        if (beVar == null) {
            beVar = C68169be.f184463c;
        }
        int i = beVar.f184465a;
        int i2 = beVar.f184466b;
        C119132n nVar = (C119132n) C119133o.f332284f.createBuilder();
        int i3 = bhVar.f184477c;
        nVar.copyOnWrite();
        ((C119133o) nVar.instance).f332286a = i3;
        nVar.copyOnWrite();
        ((C119133o) nVar.instance).f332290e = i2;
        nVar.copyOnWrite();
        ((C119133o) nVar.instance).f332289d = i;
        String substring = str.substring(i, i2 + i);
        nVar.copyOnWrite();
        substring.getClass();
        ((C119133o) nVar.instance).f332287b = substring;
        int b = C68177bm.m98503b(bhVar.f184475a);
        if (b == 0) {
            b = 1;
        }
        if (b != 1) {
            nVar.copyOnWrite();
            ((C119133o) nVar.instance).f332288c = C68177bm.m98502a(b);
        }
        return (C119133o) nVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
