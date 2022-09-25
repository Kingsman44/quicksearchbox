package com.google.android.libraries.notifications.p2301l.p2304b;

import android.content.BroadcastReceiver;
import com.google.android.libraries.notifications.p2266c.C29782a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;

/* renamed from: com.google.android.libraries.notifications.l.b.b */
/* compiled from: PG */
final class C30052b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f81310a;

    /* renamed from: b */
    final /* synthetic */ C29782a f81311b;

    /* renamed from: c */
    final /* synthetic */ boolean f81312c;

    /* renamed from: d */
    final /* synthetic */ BroadcastReceiver.PendingResult f81313d;

    /* renamed from: e */
    final /* synthetic */ int f81314e;

    public C30052b(boolean z, C29782a aVar, boolean z2, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.f81310a = z;
        this.f81311b = aVar;
        this.f81312c = z2;
        this.f81313d = pendingResult;
        this.f81314e = i;
    }

    public final void run() {
        if (this.f81310a) {
            this.f81311b.mo34977a();
        } else {
            if (this.f81312c) {
                this.f81313d.setResultCode(-1);
            }
            this.f81313d.finish();
        }
        C30058b.m55793e("ChimeExecutorApiImpl-Tiktok", "Finished Broadcast execution [%d].", Integer.valueOf(this.f81314e));
    }
}
