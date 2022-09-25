package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.av */
/* compiled from: PG */
final class C97563av extends C90888av {

    /* renamed from: a */
    final /* synthetic */ String f272498a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97563av(String str) {
        super("throwUncheckedExceptionFromTaskRunnerTask.nonUi", 2, 0);
        this.f272498a = str;
    }

    public final void run() {
        throw new RuntimeException(this.f272498a);
    }
}
