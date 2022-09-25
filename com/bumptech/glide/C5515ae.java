package com.bumptech.glide;

import com.bumptech.glide.p287f.p289b.C5580d;
import com.bumptech.glide.p287f.p289b.C5583g;
import com.bumptech.glide.p291h.C5630q;

/* renamed from: com.bumptech.glide.ae */
/* compiled from: PG */
public class C5515ae implements Cloneable {

    /* renamed from: a */
    public C5583g f16699a = C5580d.f16875b;

    /* renamed from: a */
    public final C5515ae clone() {
        try {
            return (C5515ae) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final void mo11893b(C5583g gVar) {
        C5630q.m14607d(gVar, "Argument must not be null");
        this.f16699a = gVar;
    }
}
