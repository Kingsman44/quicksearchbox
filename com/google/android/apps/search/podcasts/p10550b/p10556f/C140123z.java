package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97905bd;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.f.z */
/* compiled from: PG */
public final /* synthetic */ class C140123z implements Function {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380765a;

    /* renamed from: b */
    public final /* synthetic */ List f380766b;

    public /* synthetic */ C140123z(C140097al alVar, List list) {
        this.f380765a = alVar;
        this.f380766b = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        C140097al alVar = this.f380765a;
        List list = this.f380766b;
        C140088ac acVar = (C140088ac) obj;
        acVar.getClass();
        C58485gu c = acVar.mo115445c(list);
        if (!c.isEmpty()) {
            acVar.mo115456n();
            alVar.f380723c.mo115458a(acVar);
            C97905bd bdVar = (C97905bd) C97908bg.f273364e.createBuilder();
            bdVar.copyOnWrite();
            C97908bg bgVar = (C97908bg) bdVar.instance;
            bgVar.f273367b = 2;
            bgVar.f273366a |= 1;
            bdVar.mo90842a(c);
            alVar.mo115465j((C97908bg) bdVar.build());
        }
        return C60866ct.f164955a;
    }
}
