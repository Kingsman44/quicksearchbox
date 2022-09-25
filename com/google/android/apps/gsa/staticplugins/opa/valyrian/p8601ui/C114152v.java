package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.Animator;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.C0707ho;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.v */
/* compiled from: PG */
class C114152v extends C0707ho {

    /* renamed from: a */
    final Map f316464a = new ConcurrentHashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo101203a() {
        if (!mo2695k()) {
            mo2890n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo2687c(android.support.p033v7.widget.C0673gh r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.f316464a     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r0.remove(r2)     // Catch:{ all -> 0x0018 }
            android.animation.Animator r2 = (android.animation.Animator) r2     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0016
            boolean r0 = r2.isRunning()     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            r2.end()     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)
            return
        L_0x0016:
            monitor-exit(r1)
            return
        L_0x0018:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114152v.mo2687c(android.support.v7.widget.gh):void");
    }

    /* renamed from: d */
    public final synchronized void mo2688d() {
        for (Animator end : this.f316464a.values()) {
            end.end();
        }
        this.f316464a.clear();
    }

    /* renamed from: e */
    public final void mo2689e() {
    }

    /* renamed from: f */
    public boolean mo2690f(C0673gh ghVar) {
        throw null;
    }

    /* renamed from: g */
    public boolean mo2691g(C0673gh ghVar, C0673gh ghVar2, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: h */
    public boolean mo2692h(C0673gh ghVar, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: i */
    public boolean mo2693i(C0673gh ghVar) {
        throw null;
    }

    /* renamed from: k */
    public final synchronized boolean mo2695k() {
        return !this.f316464a.isEmpty();
    }
}
