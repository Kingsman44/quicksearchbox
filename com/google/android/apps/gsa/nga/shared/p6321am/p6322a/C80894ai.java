package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C80894ai implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f221859a;

    /* renamed from: b */
    public final /* synthetic */ String f221860b;

    public /* synthetic */ C80894ai(C22871g gVar, String str) {
        this.f221859a = gVar;
        this.f221860b = str;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f221859a;
        String str = this.f221860b;
        Objects.requireNonNull(runnable);
        gVar.mo28212l(str, new C80897al(runnable));
    }
}
