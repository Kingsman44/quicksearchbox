package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.protos.p4946az.C64356d;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.b */
/* compiled from: PG */
public final /* synthetic */ class C125491b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C125491b f346052a = new C125491b();

    private /* synthetic */ C125491b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C125503i iVar = C125503i.f346078a;
        return Collection.EL.stream(((C64356d) obj).f173959a).map(C125501g.f346076a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
