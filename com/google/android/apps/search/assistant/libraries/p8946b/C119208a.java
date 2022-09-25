package com.google.android.apps.search.assistant.libraries.p8946b;

import android.content.pm.PackageInfo;
import com.google.assistant.p3825an.p3830c.p3831a.C49256ab;
import com.google.assistant.p3825an.p3830c.p3831a.C49257ac;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.a */
/* compiled from: PG */
public final /* synthetic */ class C119208a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C119208a f332462a = new C119208a();

    private /* synthetic */ C119208a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        PackageInfo packageInfo = (PackageInfo) obj;
        C49256ab abVar = (C49256ab) C49257ac.f127326d.createBuilder();
        String str = packageInfo.packageName;
        abVar.copyOnWrite();
        C49257ac acVar = (C49257ac) abVar.instance;
        str.getClass();
        acVar.f127328a |= 1;
        acVar.f127329b = str;
        long longVersionCode = packageInfo.getLongVersionCode();
        abVar.copyOnWrite();
        C49257ac acVar2 = (C49257ac) abVar.instance;
        acVar2.f127328a |= 2;
        acVar2.f127330c = longVersionCode;
        return (C49257ac) abVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
