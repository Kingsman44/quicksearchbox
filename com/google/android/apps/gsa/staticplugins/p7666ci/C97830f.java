package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123722ap;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.f */
/* compiled from: PG */
public final /* synthetic */ class C97830f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C97830f f273192a = new C97830f();

    private /* synthetic */ C97830f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        C59071e eVar = C97846r.f273217a;
        C123722ap apVar = (C123722ap) C123723aq.f341737d.createBuilder();
        String packageName = componentName.getPackageName();
        apVar.copyOnWrite();
        C123723aq aqVar = (C123723aq) apVar.instance;
        packageName.getClass();
        aqVar.f341739a |= 1;
        aqVar.f341740b = packageName;
        String className = componentName.getClassName();
        apVar.copyOnWrite();
        C123723aq aqVar2 = (C123723aq) apVar.instance;
        className.getClass();
        aqVar2.f341739a |= 2;
        aqVar2.f341741c = className;
        return (C123723aq) apVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
