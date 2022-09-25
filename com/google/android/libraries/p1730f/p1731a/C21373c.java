package com.google.android.libraries.p1730f.p1731a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.f.a.c */
/* compiled from: PG */
final class C21373c {

    /* renamed from: a */
    public final Set f59762a = new HashSet();

    /* renamed from: b */
    public final C21371a f59763b;

    /* renamed from: c */
    private final BroadcastReceiver f59764c = new C21372b(this);

    /* renamed from: d */
    private final String f59765d;

    /* renamed from: e */
    private final Context f59766e;

    public C21373c(Context context, String str, C21371a aVar) {
        this.f59765d = str;
        this.f59766e = context;
        this.f59763b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26877a(Object obj) {
        synchronized (this.f59762a) {
            if (this.f59762a.isEmpty()) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(this.f59765d);
                this.f59766e.registerReceiver(this.f59764c, intentFilter);
            }
            this.f59762a.add(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo26878b(Object obj) {
        synchronized (this.f59762a) {
            if (this.f59762a.remove(obj) && this.f59762a.isEmpty()) {
                this.f59766e.unregisterReceiver(this.f59764c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo26879c() {
        return this.f59762a.isEmpty();
    }
}
