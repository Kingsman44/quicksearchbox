package com.google.apps.p3589d.p3592c;

import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3600k.C45945j;
import java.util.Iterator;

/* renamed from: com.google.apps.d.c.f */
/* compiled from: PG */
public final class C45730f implements Iterator {

    /* renamed from: a */
    final /* synthetic */ C45731g f120237a;

    /* renamed from: b */
    private int f120238b = 0;

    public C45730f(C45731g gVar) {
        this.f120237a = gVar;
    }

    /* renamed from: a */
    public final C45755n next() {
        C45945j.m82041c(hasNext());
        C45731g gVar = this.f120237a;
        int b = gVar.mo49837b();
        int i = this.f120238b;
        this.f120238b = i + 1;
        return gVar.mo49856j(b + i);
    }

    public final boolean hasNext() {
        return this.f120238b < this.f120237a.mo49836a();
    }
}
