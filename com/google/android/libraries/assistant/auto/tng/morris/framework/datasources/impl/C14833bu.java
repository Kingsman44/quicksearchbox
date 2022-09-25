package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.common.base.C58894dd;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bu */
/* compiled from: PG */
public final /* synthetic */ class C14833bu implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C14842cc f44668a;

    public /* synthetic */ C14833bu(C14842cc ccVar) {
        this.f44668a = ccVar;
    }

    public final void execute(Runnable runnable) {
        if (!this.f44668a.f44686e.post(runnable)) {
            throw new C58894dd("TiktokHandler execution failed");
        }
    }
}
