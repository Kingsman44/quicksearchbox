package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106394s;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.x */
/* compiled from: PG */
public final class C109425x {

    /* renamed from: a */
    private final Context f304748a;

    /* renamed from: b */
    private final C109422u f304749b;

    /* renamed from: c */
    private Optional f304750c = Optional.empty();

    /* renamed from: d */
    private Optional f304751d = Optional.empty();

    public C109425x(Context context, C109422u uVar) {
        this.f304748a = context;
        this.f304749b = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (((java.lang.Boolean) r0.map(new com.google.android.apps.gsa.staticplugins.opa.p8375l.C109424w(r3)).orElse(false)).booleanValue() == false) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo97821a(java.lang.String r3) {
        /*
            r2 = this;
            j$.util.Optional r0 = r2.f304751d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
            j$.util.Optional r0 = r2.f304750c
            p3186j$.util.Objects.requireNonNull(r3)
            com.google.android.apps.gsa.staticplugins.opa.l.w r1 = new com.google.android.apps.gsa.staticplugins.opa.l.w
            r1.<init>(r3)
            j$.util.Optional r0 = r0.map(r1)
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002a
        L_0x0027:
            r2.mo97822b(r3)
        L_0x002a:
            j$.util.Optional r3 = r2.f304751d
            java.lang.Object r3 = r3.get()
            com.google.common.util.concurrent.cx r3 = (com.google.common.util.concurrent.C60870cx) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8375l.C109425x.mo97821a(java.lang.String):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final void mo97822b(String str) {
        C60870cx cxVar;
        this.f304751d.ifPresent(C109423v.f304746a);
        C109422u uVar = this.f304749b;
        if (((C106394s) uVar.f304741g.mo27525b()).mo95499a(str, this.f304748a.getResources())) {
            cxVar = C60856cj.m92900i(true);
        } else {
            C60870cx a = uVar.mo97816a();
            C60870cx b = ((C106391p) uVar.f304743i.mo27525b()).mo95493b();
            cxVar = C60856cj.m92895d(a, b).mo57335b(new C109413l(uVar, b, str, a), C60826bg.f164896a);
        }
        this.f304751d = Optional.m71637of(cxVar);
        this.f304750c = Optional.m71637of(str);
    }
}
