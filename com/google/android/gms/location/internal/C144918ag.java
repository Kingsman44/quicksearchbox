package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.p060c.C0984n;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.location.C144956q;

/* renamed from: com.google.android.gms.location.internal.ag */
/* compiled from: PG */
public final class C144918ag extends C143887ac {

    /* renamed from: a */
    public final C0984n f391882a = new C0984n(0);

    /* renamed from: b */
    public final C0984n f391883b = new C0984n(0);

    /* renamed from: c */
    private final C0984n f391884c = new C0984n(0);

    /* renamed from: d */
    private final String f391885d;

    public C144918ag(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar, String str) {
        super(context, looper, 23, sVar, aaVar, cjVar);
        this.f391885d = str;
    }

    /* renamed from: N */
    public final void mo119456N(int i) {
        super.mo119456N(i);
        synchronized (this.f391882a) {
            this.f391882a.clear();
        }
        synchronized (this.f391883b) {
            this.f391883b.clear();
        }
        synchronized (this.f391884c) {
            this.f391884c.clear();
        }
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 11717000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C144930h ? (C144930h) queryLocalInterface : new C144929g(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144956q.f391919l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f391885d);
        return bundle;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120419m(com.google.android.gms.common.api.internal.C143782cc r10, boolean r11, com.google.android.gms.tasks.C146010af r12) {
        /*
            r9 = this;
            androidx.c.n r0 = r9.f391883b
            monitor-enter(r0)
            androidx.c.n r1 = r9.f391883b     // Catch:{ all -> 0x0066 }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x0066 }
            r5 = r10
            com.google.android.gms.location.internal.ab r5 = (com.google.android.gms.location.internal.C144913ab) r5     // Catch:{ all -> 0x0066 }
            if (r5 != 0) goto L_0x0017
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0066 }
            com.google.android.gms.tasks.aj r11 = r12.f394698a     // Catch:{ all -> 0x0066 }
            r11.mo122508v(r10)     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return
        L_0x0017:
            com.google.android.gms.location.internal.x r10 = r5.f391877a     // Catch:{ all -> 0x0066 }
            com.google.android.gms.location.internal.q r10 = (com.google.android.gms.location.internal.C144939q) r10     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.api.internal.ce r10 = r10.f391893a     // Catch:{ all -> 0x0066 }
            r1 = 0
            r10.f389805a = r1     // Catch:{ all -> 0x0066 }
            r10.f389806b = r1     // Catch:{ all -> 0x0066 }
            if (r11 == 0) goto L_0x005d
            com.google.android.gms.common.Feature r10 = com.google.android.gms.location.C144956q.f391917j     // Catch:{ all -> 0x0066 }
            boolean r10 = r9.mo120420q(r10)     // Catch:{ all -> 0x0066 }
            if (r10 == 0) goto L_0x0041
            android.os.IInterface r10 = r9.mo119451G()     // Catch:{ all -> 0x0066 }
            com.google.android.gms.location.internal.h r10 = (com.google.android.gms.location.internal.C144930h) r10     // Catch:{ all -> 0x0066 }
            com.google.android.gms.location.internal.LocationReceiver r11 = com.google.android.gms.location.internal.LocationReceiver.m235510a(r1, r5, r1)     // Catch:{ all -> 0x0066 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0066 }
            com.google.android.gms.location.internal.r r2 = new com.google.android.gms.location.internal.r     // Catch:{ all -> 0x0066 }
            r2.<init>(r1, r12)     // Catch:{ all -> 0x0066 }
            r10.mo120443n(r11, r2)     // Catch:{ all -> 0x0066 }
            goto L_0x0064
        L_0x0041:
            android.os.IInterface r10 = r9.mo119451G()     // Catch:{ all -> 0x0066 }
            com.google.android.gms.location.internal.h r10 = (com.google.android.gms.location.internal.C144930h) r10     // Catch:{ all -> 0x0066 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0066 }
            com.google.android.gms.location.internal.t r7 = new com.google.android.gms.location.internal.t     // Catch:{ all -> 0x0066 }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.location.internal.LocationRequestUpdateData r11 = new com.google.android.gms.location.internal.LocationRequestUpdateData     // Catch:{ all -> 0x0066 }
            r2 = 2
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0066 }
            r10.mo120444o(r11)     // Catch:{ all -> 0x0066 }
            goto L_0x0064
        L_0x005d:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0066 }
            com.google.android.gms.tasks.aj r11 = r12.f394698a     // Catch:{ all -> 0x0066 }
            r11.mo122508v(r10)     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return
        L_0x0066:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.C144918ag.mo120419m(com.google.android.gms.common.api.internal.cc, boolean, com.google.android.gms.tasks.af):void");
    }

    /* renamed from: q */
    public final boolean mo120420q(Feature feature) {
        Feature feature2;
        Feature[] A = mo119446A();
        if (A == null) {
            return false;
        }
        int length = A.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = A[i];
            if (feature.f389577a.equals(feature2.f389577a)) {
                break;
            }
            i++;
        }
        if (feature2 != null && feature2.mo119073a() >= feature.mo119073a()) {
            return true;
        }
        return false;
    }
}
