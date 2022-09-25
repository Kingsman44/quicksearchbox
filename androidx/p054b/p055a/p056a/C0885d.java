package androidx.p054b.p055a.p056a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: androidx.b.a.a.d */
/* compiled from: PG */
public final class C0885d extends C0886e {

    /* renamed from: a */
    public final Object f2961a = new Object();

    /* renamed from: b */
    public final ExecutorService f2962b = Executors.newFixedThreadPool(4, new C0884c());

    /* renamed from: c */
    public volatile Handler f2963c;

    /* renamed from: b */
    public final boolean mo3495b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
