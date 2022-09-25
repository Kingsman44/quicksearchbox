package com.google.common.p4541l;

import com.google.common.base.C58887cx;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.common.l.x */
/* compiled from: PG */
public final class C59341x implements Closeable {

    /* renamed from: c */
    private static final C59340w f157526c;

    /* renamed from: a */
    final C59340w f157527a;

    /* renamed from: b */
    public Throwable f157528b;

    /* renamed from: d */
    private final Deque f157529d = new ArrayDeque(4);

    static {
        C59340w wVar;
        try {
            wVar = new C59339v(Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class}));
        } catch (Throwable unused) {
            wVar = null;
        }
        if (wVar == null) {
            wVar = C59338u.f157524a;
        }
        f157526c = wVar;
    }

    public C59341x(C59340w wVar) {
        wVar.getClass();
        this.f157527a = wVar;
    }

    /* renamed from: a */
    public static C59341x m92227a() {
        return new C59341x(f157526c);
    }

    /* renamed from: b */
    public final RuntimeException mo56858b(Throwable th) {
        this.f157528b = th;
        C58887cx.m90979f(th, IOException.class);
        C58887cx.m90980g(th);
        throw new RuntimeException(th);
    }

    /* renamed from: c */
    public final void mo56859c(Closeable closeable) {
        if (closeable != null) {
            this.f157529d.addFirst(closeable);
        }
    }

    public final void close() {
        Throwable th = this.f157528b;
        while (!this.f157529d.isEmpty()) {
            Closeable closeable = (Closeable) this.f157529d.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f157527a.mo56857a(closeable, th, th2);
                }
            }
        }
        if (this.f157528b == null && th != null) {
            C58887cx.m90979f(th, IOException.class);
            C58887cx.m90980g(th);
            throw new AssertionError(th);
        }
    }
}
