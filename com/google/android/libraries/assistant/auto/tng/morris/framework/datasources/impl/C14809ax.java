package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.common.base.C58894dd;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ax */
/* compiled from: PG */
public final /* synthetic */ class C14809ax implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C14820bh f44609a;

    public /* synthetic */ C14809ax(C14820bh bhVar) {
        this.f44609a = bhVar;
    }

    public final void execute(Runnable runnable) {
        if (!this.f44609a.f44633f.post(runnable)) {
            throw new C58894dd("TiktokHandler execution failed");
        }
    }
}
