package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import com.google.assistant.p3897e.p3902c.p3907c.C51048el;
import com.google.assistant.p3897e.p3902c.p3907c.C51049em;
import com.google.assistant.p3897e.p3921j.acl;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.h */
/* compiled from: PG */
public final /* synthetic */ class C129120h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C129120h f354711a = new C129120h();

    private /* synthetic */ C129120h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        acl acl = (acl) obj;
        C51048el elVar = (C51048el) C51049em.f132927d.createBuilder();
        String str = acl.f134815e;
        elVar.copyOnWrite();
        C51049em emVar = (C51049em) elVar.instance;
        str.getClass();
        emVar.f132929a |= 2;
        emVar.f132931c = str;
        String str2 = acl.f134814d;
        elVar.copyOnWrite();
        C51049em emVar2 = (C51049em) elVar.instance;
        str2.getClass();
        emVar2.f132929a |= 1;
        emVar2.f132930b = str2;
        return (C51049em) elVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
