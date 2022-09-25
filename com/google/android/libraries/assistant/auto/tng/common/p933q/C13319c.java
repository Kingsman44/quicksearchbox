package com.google.android.libraries.assistant.auto.tng.common.p933q;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.c */
/* compiled from: PG */
public final /* synthetic */ class C13319c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13325i f41041a;

    /* renamed from: b */
    public final /* synthetic */ Intent f41042b;

    public /* synthetic */ C13319c(C13325i iVar, Intent intent) {
        this.f41041a = iVar;
        this.f41042b = intent;
    }

    public final Object call() {
        C13325i iVar = this.f41041a;
        ResolveInfo resolveActivity = iVar.f41050b.resolveActivity(this.f41042b, 65536);
        resolveActivity.getClass();
        return resolveActivity;
    }
}
