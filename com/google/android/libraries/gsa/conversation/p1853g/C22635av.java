package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.conversation.g.av */
/* compiled from: PG */
public final /* synthetic */ class C22635av implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C22654bn f62349a;

    /* renamed from: b */
    public final /* synthetic */ boolean f62350b;

    /* renamed from: c */
    public final /* synthetic */ C22618ae f62351c;

    public /* synthetic */ C22635av(C22654bn bnVar, boolean z, C22618ae aeVar) {
        this.f62349a = bnVar;
        this.f62350b = z;
        this.f62351c = aeVar;
    }

    public final Object call() {
        C22654bn bnVar = this.f62349a;
        boolean z = this.f62350b;
        C22618ae aeVar = this.f62351c;
        if (!z) {
            aeVar.mo27740a();
            return null;
        }
        C60888db dbVar = bnVar.f62405c;
        Objects.requireNonNull(aeVar);
        bnVar.f62412j = dbVar.mo29164d(new C22625al(aeVar), 15, TimeUnit.SECONDS);
        return null;
    }
}
