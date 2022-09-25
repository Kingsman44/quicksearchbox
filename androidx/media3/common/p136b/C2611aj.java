package androidx.media3.common.p136b;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.media3.common.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C2611aj implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f7248a;

    public /* synthetic */ C2611aj(String str) {
        this.f7248a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f7248a);
    }
}
