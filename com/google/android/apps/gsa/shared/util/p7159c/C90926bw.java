package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.shared.util.c.bw */
/* compiled from: PG */
public final class C90926bw {

    /* renamed from: a */
    public static final C59071e f254123a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.bw");

    /* renamed from: b */
    public final Object f254124b;

    /* renamed from: c */
    private final Object f254125c = new Object();

    /* renamed from: d */
    private C60870cx f254126d;

    public C90926bw(Object obj) {
        this.f254124b = obj;
        this.f254126d = C60856cj.m92900i(obj);
    }

    /* renamed from: a */
    public final C60870cx mo85235a(Callable callable) {
        C60870cx j;
        C90924bu buVar = new C90924bu(this);
        synchronized (this.f254125c) {
            SettableFuture settableFuture = new SettableFuture();
            C60870cx g = C60846c.m92878g(settableFuture, Throwable.class, buVar, C60826bg.f164896a);
            j = C60856cj.m92901j(g);
            this.f254126d.mo4106b(new C90925bv(j, settableFuture, callable), C60826bg.f164896a);
            this.f254126d = g;
        }
        return j;
    }
}
