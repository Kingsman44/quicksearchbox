package com.google.android.apps.gsa.nga.shared.p6344g;

import java.util.ArrayDeque;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.g.a */
/* compiled from: PG */
public final class C81067a extends ArrayDeque {

    /* renamed from: a */
    private final int f222183a;

    public C81067a(int i) {
        this.f222183a = i;
    }

    /* renamed from: a */
    private final void m129017a() {
        while (size() > this.f222183a) {
            removeFirst();
        }
    }

    public final boolean add(Object obj) {
        boolean add = super.add(obj);
        m129017a();
        return add;
    }

    public final boolean addAll(Collection collection) {
        boolean addAll = super.addAll(collection);
        m129017a();
        return addAll;
    }

    public final void addFirst(Object obj) {
        if (size() < this.f222183a) {
            super.addFirst(obj);
        }
    }

    public final void addLast(Object obj) {
        super.addLast(obj);
        m129017a();
    }
}
