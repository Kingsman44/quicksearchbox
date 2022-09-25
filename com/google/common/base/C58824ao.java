package com.google.common.base;

import java.util.Iterator;

/* renamed from: com.google.common.base.ao */
/* compiled from: PG */
public final class C58824ao extends C58827ar {

    /* renamed from: a */
    final /* synthetic */ C58827ar f156617a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58824ao(C58827ar arVar, C58827ar arVar2) {
        super(arVar2);
        this.f156617a = arVar;
    }

    /* renamed from: b */
    public final void mo56092b(Appendable appendable, Iterator it) {
        C58838bb.m90866a(it, "parts");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(this.f156617a.mo56091a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.f156617a.f156623c);
                appendable.append(this.f156617a.mo56091a(next2));
            }
        }
    }
}
