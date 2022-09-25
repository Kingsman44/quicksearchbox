package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97905bd;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.f.o */
/* compiled from: PG */
public final /* synthetic */ class C140112o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380749a;

    /* renamed from: b */
    public final /* synthetic */ List f380750b;

    public /* synthetic */ C140112o(C140097al alVar, List list) {
        this.f380749a = alVar;
        this.f380750b = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        C140097al alVar = this.f380749a;
        List list = this.f380750b;
        C140088ac acVar = (C140088ac) obj;
        acVar.getClass();
        C58485gu b = acVar.mo115444b(list);
        if (!b.isEmpty()) {
            acVar.mo115456n();
            alVar.f380723c.mo115458a(acVar);
            C97905bd bdVar = (C97905bd) C97908bg.f273364e.createBuilder();
            bdVar.copyOnWrite();
            C97908bg bgVar = (C97908bg) bdVar.instance;
            bgVar.f273367b = 1;
            bgVar.f273366a = 1 | bgVar.f273366a;
            bdVar.copyOnWrite();
            C97908bg bgVar2 = (C97908bg) bdVar.instance;
            bgVar2.f273366a |= 2;
            bgVar2.f273369d = false;
            bdVar.mo90842a(b);
            alVar.mo115465j((C97908bg) bdVar.build());
        }
        return C60866ct.f164955a;
    }
}
