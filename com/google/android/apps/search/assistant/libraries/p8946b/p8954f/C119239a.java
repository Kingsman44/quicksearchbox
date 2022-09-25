package com.google.android.apps.search.assistant.libraries.p8946b.p8954f;

import android.content.pm.PackageInfo;
import com.google.assistant.p3825an.p3834e.p3835a.C49363e;
import com.google.assistant.p3825an.p3834e.p3835a.C49364f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.f.a */
/* compiled from: PG */
public final /* synthetic */ class C119239a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C119239a f332527a = new C119239a();

    private /* synthetic */ C119239a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        PackageInfo packageInfo = (PackageInfo) obj;
        C49363e eVar = (C49363e) C49364f.f127597d.createBuilder();
        String str = packageInfo.packageName;
        eVar.copyOnWrite();
        C49364f fVar = (C49364f) eVar.instance;
        str.getClass();
        fVar.f127599a |= 1;
        fVar.f127600b = str;
        long longVersionCode = packageInfo.getLongVersionCode();
        eVar.copyOnWrite();
        C49364f fVar2 = (C49364f) eVar.instance;
        fVar2.f127599a |= 2;
        fVar2.f127601c = longVersionCode;
        return (C49364f) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
