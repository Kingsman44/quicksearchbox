package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.protobuf.eu */
/* compiled from: PG */
final class C63029eu implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C63031ew f170128a;

    /* renamed from: b */
    private int f170129b = -1;

    /* renamed from: c */
    private boolean f170130c;

    /* renamed from: d */
    private Iterator f170131d;

    public C63029eu(C63031ew ewVar) {
        this.f170128a = ewVar;
    }

    /* renamed from: a */
    private final Iterator m95850a() {
        if (this.f170131d == null) {
            this.f170131d = this.f170128a.f170134b.entrySet().iterator();
        }
        return this.f170131d;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        if (this.f170129b + 1 < this.f170128a.f170133a.size()) {
            return true;
        }
        if (this.f170128a.f170134b.isEmpty() || !m95850a().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f170130c = true;
        int i = this.f170129b + 1;
        this.f170129b = i;
        if (i < this.f170128a.f170133a.size()) {
            return (Map.Entry) this.f170128a.f170133a.get(this.f170129b);
        }
        return (Map.Entry) m95850a().next();
    }

    public final void remove() {
        if (this.f170130c) {
            this.f170130c = false;
            this.f170128a.mo59073f();
            if (this.f170129b < this.f170128a.f170133a.size()) {
                C63031ew ewVar = this.f170128a;
                int i = this.f170129b;
                this.f170129b = i - 1;
                ewVar.mo59069d(i);
                return;
            }
            m95850a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
