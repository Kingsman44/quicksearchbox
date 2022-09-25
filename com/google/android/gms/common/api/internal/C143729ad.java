package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146010af;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.gms.common.api.internal.ad */
/* compiled from: PG */
public final class C143729ad {

    /* renamed from: a */
    public final Map f389650a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f389651b = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo119125a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f389650a) {
            hashMap = new HashMap(this.f389650a);
        }
        synchronized (this.f389651b) {
            hashMap2 = new HashMap(this.f389651b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo119110m(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C146010af) entry2.getKey()).f394698a.mo122509w(new C143842n(status));
            }
        }
    }
}
