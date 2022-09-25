package com.google.android.libraries.assistant.auto.tng.common.p933q;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.f */
/* compiled from: PG */
public final /* synthetic */ class C13322f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13325i f41045a;

    /* renamed from: b */
    public final /* synthetic */ Intent f41046b;

    public /* synthetic */ C13322f(C13325i iVar, Intent intent) {
        this.f41045a = iVar;
        this.f41046b = intent;
    }

    public final Object call() {
        C13325i iVar = this.f41045a;
        ResolveInfo resolveActivity = iVar.f41050b.resolveActivity(this.f41046b, 0);
        resolveActivity.getClass();
        return resolveActivity;
    }
}
