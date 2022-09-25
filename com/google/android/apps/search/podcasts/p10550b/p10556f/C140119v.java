package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97905bd;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.common.util.concurrent.C60866ct;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.f.v */
/* compiled from: PG */
public final /* synthetic */ class C140119v implements Function {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380759a;

    /* renamed from: b */
    public final /* synthetic */ List f380760b;

    public /* synthetic */ C140119v(C140097al alVar, List list) {
        this.f380759a = alVar;
        this.f380760b = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C140097al alVar = this.f380759a;
        List list = this.f380760b;
        C140088ac acVar = (C140088ac) obj;
        if (list.isEmpty()) {
            return C60866ct.f164955a;
        }
        acVar.getClass();
        List d = acVar.mo115446d(list);
        acVar.mo115456n();
        alVar.f380723c.mo115458a(acVar);
        if (!d.isEmpty()) {
            C140085a aVar = alVar.f380727g;
            C97905bd bdVar = (C97905bd) C97908bg.f273364e.createBuilder();
            bdVar.copyOnWrite();
            C97908bg bgVar = (C97908bg) bdVar.instance;
            bgVar.f273367b = 2;
            bgVar.f273366a |= 1;
            bdVar.mo90842a(d);
            aVar.mo115440c((C97908bg) bdVar.build());
        }
        C97905bd bdVar2 = (C97905bd) C97908bg.f273364e.createBuilder();
        bdVar2.copyOnWrite();
        C97908bg bgVar2 = (C97908bg) bdVar2.instance;
        bgVar2.f273367b = 1;
        bgVar2.f273366a |= 1;
        bdVar2.mo90842a(list);
        bdVar2.copyOnWrite();
        C97908bg bgVar3 = (C97908bg) bdVar2.instance;
        bgVar3.f273366a |= 2;
        bgVar3.f273369d = true;
        alVar.mo115465j((C97908bg) bdVar2.build());
        return C60866ct.f164955a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
