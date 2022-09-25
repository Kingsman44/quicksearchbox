package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.i.ad */
/* compiled from: PG */
final class C23829ad extends C23840ao {

    /* renamed from: a */
    final /* synthetic */ C60888db f65250a;

    public C23829ad(C60888db dbVar) {
        this.f65250a = dbVar;
    }

    public final void execute(Runnable runnable) {
        this.f65250a.execute(new C23830ae(runnable));
    }

    /* renamed from: h */
    public final /* synthetic */ C60887da mo29168h() {
        return this.f65250a;
    }

    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f65250a;
    }

    /* renamed from: i */
    public final /* synthetic */ ExecutorService mo29169i() {
        return this.f65250a;
    }

    /* renamed from: j */
    public final C60888db mo29175j() {
        return this.f65250a;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String obj = this.f65250a.toString();
        return "ErrorLogging[" + obj + "]";
    }
}
