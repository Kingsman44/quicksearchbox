package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.protos.p4946az.C64363k;
import com.google.protos.p4946az.C64364l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.g */
/* compiled from: PG */
public final /* synthetic */ class C125501g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C125501g f346076a = new C125501g();

    private /* synthetic */ C125501g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C64364l lVar = (C64364l) obj;
        C125503i iVar = C125503i.f346078a;
        C64363k kVar = lVar.f173975g;
        if (kVar == null) {
            kVar = C64363k.f173962d;
        }
        if ((kVar.f173964a & 1) == 0) {
            return lVar.f173970b;
        }
        C64363k kVar2 = lVar.f173975g;
        if (kVar2 == null) {
            kVar2 = C64363k.f173962d;
        }
        return kVar2.f173965b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
