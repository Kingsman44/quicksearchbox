package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.Intent;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.db */
/* compiled from: PG */
public final /* synthetic */ class C14868db implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C14871de f44751a;

    public /* synthetic */ C14868db(C14871de deVar) {
        this.f44751a = deVar;
    }

    public final Object call() {
        C14871de deVar = this.f44751a;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        return (List) Collection.EL.stream(deVar.f44756c.getPackageManager().queryIntentActivities(intent, 0)).map(C14869dc.f44752a).collect(Collectors.toCollection(C14870dd.f44753a));
    }
}
