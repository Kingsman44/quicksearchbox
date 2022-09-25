package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.usonia.directory.internal.c */
/* compiled from: PG */
public final class C146264c {

    /* renamed from: a */
    private final ConcurrentHashMap f395112a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C146237b f395113b;

    public C146264c(C146237b bVar) {
        this.f395113b = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.gms.usonia.directory.internal.a} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.usonia.directory.internal.C146210a mo122833a(com.google.android.gms.common.api.internal.C143784ce r3) {
        /*
            r2 = this;
            com.google.android.gms.common.api.internal.cc r0 = r3.f389806b
            java.lang.String r1 = "Key must not be null"
            com.google.android.gms.common.internal.C143919bh.m233971n(r0, r1)
            j$.util.concurrent.ConcurrentHashMap r1 = r2.f395112a
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.usonia.directory.internal.a r1 = (com.google.android.gms.usonia.directory.internal.C146210a) r1
            if (r1 != 0) goto L_0x0026
            com.google.android.gms.usonia.directory.internal.b r1 = r2.f395113b
            java.lang.Object r3 = r1.mo122807a(r3)
            r1 = r3
            com.google.android.gms.usonia.directory.internal.a r1 = (com.google.android.gms.usonia.directory.internal.C146210a) r1
            j$.util.concurrent.ConcurrentHashMap r3 = r2.f395112a
            java.lang.Object r3 = r3.putIfAbsent(r0, r1)
            com.google.android.gms.usonia.directory.internal.a r3 = (com.google.android.gms.usonia.directory.internal.C146210a) r3
            if (r3 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            return r3
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.usonia.directory.internal.C146264c.mo122833a(com.google.android.gms.common.api.internal.ce):com.google.android.gms.usonia.directory.internal.a");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C146210a mo122834b(C143784ce ceVar) {
        C143782cc ccVar = ceVar.f389806b;
        if (ccVar == null) {
            return null;
        }
        C146210a aVar = (C146210a) this.f395112a.remove(ccVar);
        if (aVar != null) {
            aVar.mo122804a();
        }
        return aVar;
    }
}
