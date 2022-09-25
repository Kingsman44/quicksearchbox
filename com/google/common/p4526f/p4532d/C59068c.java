package com.google.common.p4526f.p4532d;

import com.google.common.p4526f.p4528b.C59028c;

/* renamed from: com.google.common.f.d.c */
/* compiled from: PG */
public abstract class C59068c {

    /* renamed from: a */
    public final int f157033a;

    /* renamed from: b */
    public final C59028c f157034b;

    protected C59068c(C59028c cVar, int i) {
        if (cVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        } else if (i >= 0) {
            this.f157033a = i;
            this.f157034b = cVar;
        } else {
            throw new IllegalArgumentException("invalid index: " + i);
        }
    }

    /* renamed from: a */
    public abstract void mo56336a(C59069d dVar, Object obj);
}
