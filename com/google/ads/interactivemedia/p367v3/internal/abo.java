package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abo */
/* compiled from: PG */
public final class abo {

    /* renamed from: a */
    private final CopyOnWriteArrayList f20210a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo14394a(Handler handler, abp abp) {
        mo14395b(abp);
        this.f20210a.add(new abn(handler, abp));
    }

    /* renamed from: b */
    public final void mo14395b(abp abp) {
        Iterator it = this.f20210a.iterator();
        while (it.hasNext()) {
            abn abn = (abn) it.next();
            if (abn.f20208b == abp) {
                abn.mo14393a();
                this.f20210a.remove(abn);
            }
        }
    }

    /* renamed from: c */
    public final void mo14396c(int i, long j, long j2) {
        Iterator it = this.f20210a.iterator();
        while (it.hasNext()) {
            abn abn = (abn) it.next();
            if (!abn.f20209c) {
                abn.f20207a.post(new abm(abn, i, j, j2));
            }
        }
    }
}
