package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.r */
/* compiled from: PG */
final class C63080r extends C63081s {

    /* renamed from: a */
    final /* synthetic */ C63088z f170234a;

    /* renamed from: b */
    private int f170235b = 0;

    /* renamed from: c */
    private final int f170236c;

    public C63080r(C63088z zVar) {
        this.f170234a = zVar;
        this.f170236c = zVar.mo59031d();
    }

    /* renamed from: a */
    public final byte mo59020a() {
        int i = this.f170235b;
        if (i < this.f170236c) {
            this.f170235b = i + 1;
            return this.f170234a.mo59030b(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f170235b < this.f170236c;
    }
}
