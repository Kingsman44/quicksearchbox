package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import android.content.ComponentName;
import com.google.android.apps.auto.p450a.p451a.C8864ai;
import com.google.android.apps.auto.p450a.p451a.C8865aj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.o */
/* compiled from: PG */
public final /* synthetic */ class C16320o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C8864ai f48011a;

    public /* synthetic */ C16320o(C8864ai aiVar) {
        this.f48011a = aiVar;
    }

    public final void accept(Object obj) {
        C8864ai aiVar = this.f48011a;
        ComponentName componentName = (ComponentName) obj;
        String packageName = componentName.getPackageName();
        aiVar.copyOnWrite();
        C8865aj ajVar = (C8865aj) aiVar.instance;
        C8865aj ajVar2 = C8865aj.f30788h;
        packageName.getClass();
        ajVar.f30790a |= 4;
        ajVar.f30793d = packageName;
        String className = componentName.getClassName();
        aiVar.copyOnWrite();
        C8865aj ajVar3 = (C8865aj) aiVar.instance;
        className.getClass();
        ajVar3.f30790a |= 8;
        ajVar3.f30794e = className;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
