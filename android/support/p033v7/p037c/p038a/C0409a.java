package android.support.p033v7.p037c.p038a;

import android.support.p033v7.p040e.C0425g;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: android.support.v7.c.a.a */
/* compiled from: PG */
public final class C0409a {

    /* renamed from: b */
    private static final Object f1384b = new Object();

    /* renamed from: c */
    private static Executor f1385c;

    /* renamed from: a */
    public Executor f1386a;

    /* renamed from: d */
    private final C0425g f1387d;

    public C0409a(C0425g gVar) {
        this.f1387d = gVar;
    }

    /* renamed from: a */
    public final C0410b mo1378a() {
        if (this.f1386a == null) {
            synchronized (f1384b) {
                if (f1385c == null) {
                    f1385c = Executors.newFixedThreadPool(2);
                }
            }
            this.f1386a = f1385c;
        }
        return new C0410b(this.f1386a, this.f1387d);
    }
}
