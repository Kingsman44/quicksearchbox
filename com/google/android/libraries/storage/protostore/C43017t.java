package com.google.android.libraries.storage.protostore;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.storage.protostore.t */
/* compiled from: PG */
final class C43017t extends BroadcastReceiver {

    /* renamed from: a */
    public final SettableFuture f112492a = new SettableFuture();

    /* renamed from: b */
    public final Set f112493b;

    /* renamed from: c */
    public final Object f112494c;

    public C43017t(Set set) {
        HashSet hashSet = new HashSet();
        this.f112493b = hashSet;
        this.f112494c = new Object();
        hashSet.addAll(set);
        m75920a();
    }

    /* renamed from: a */
    private final void m75920a() {
        synchronized (this.f112494c) {
            if (this.f112493b.isEmpty()) {
                this.f112492a.mo57356n((Object) null);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String g = C58837ba.m90858g(intent.getPackage());
        synchronized (this.f112494c) {
            this.f112493b.remove(g);
        }
        m75920a();
    }
}
