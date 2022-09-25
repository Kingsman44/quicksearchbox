package com.google.android.libraries.social.populous.p3296e.p3298b;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.google.android.libraries.social.populous.e.b.k */
/* compiled from: PG */
public abstract class C42432k {

    /* renamed from: a */
    private final Queue f111341a = new LinkedList();

    /* renamed from: b */
    private boolean f111342b = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo45488a(Object obj);

    /* renamed from: b */
    public final synchronized void mo45489b(Object obj) {
        if (this.f111342b) {
            this.f111341a.add(obj);
        } else {
            mo45488a(obj);
        }
    }

    /* renamed from: c */
    public final synchronized void mo45490c() {
        while (!this.f111341a.isEmpty()) {
            mo45488a(this.f111341a.poll());
        }
        this.f111342b = false;
    }
}
