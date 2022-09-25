package com.google.android.gms.cast.framework.media;

import android.util.LruCache;
import com.google.android.gms.cast.MediaQueueItem;

/* renamed from: com.google.android.gms.cast.framework.media.s */
/* compiled from: PG */
final class C143532s extends LruCache {

    /* renamed from: a */
    final /* synthetic */ C143535v f389211a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143532s(C143535v vVar) {
        super(20);
        this.f389211a = vVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj2;
        MediaQueueItem mediaQueueItem2 = (MediaQueueItem) obj3;
        if (z) {
            this.f389211a.f389219g.add(num);
        }
    }
}
