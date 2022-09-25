package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.ab.h */
/* compiled from: PG */
public final /* synthetic */ class C32413h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C32413h f86873a = new C32413h();

    private /* synthetic */ C32413h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C32365ag agVar = (C32365ag) obj;
        C59071e eVar = C32359aa.f86743a;
        C32397bl blVar = (C32397bl) C32398bm.f86831r.createBuilder();
        String str = agVar.f86761b;
        blVar.copyOnWrite();
        C32398bm bmVar = (C32398bm) blVar.instance;
        str.getClass();
        bmVar.f86833a |= 2048;
        bmVar.f86844l = str;
        boolean z = agVar.f86763d;
        blVar.copyOnWrite();
        C32398bm bmVar2 = (C32398bm) blVar.instance;
        bmVar2.f86833a |= 512;
        bmVar2.f86843k = z;
        blVar.copyOnWrite();
        C32398bm bmVar3 = (C32398bm) blVar.instance;
        bmVar3.f86834b = 3;
        bmVar3.f86833a |= 1;
        return (C32398bm) blVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
