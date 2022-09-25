package com.google.android.libraries.p11029ao.p11032c;

import android.system.Os;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ao.c.j */
/* compiled from: PG */
public final /* synthetic */ class C147809j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f398789a;

    public /* synthetic */ C147809j(String str) {
        this.f398789a = str;
    }

    public final Object call() {
        return Os.lstat(this.f398789a);
    }
}
