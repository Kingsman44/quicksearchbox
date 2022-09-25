package com.google.common.p4522b;

import com.google.common.base.C58881cr;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.common.b.oe */
/* compiled from: PG */
public final class C58685oe extends C58322at {
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    transient C58881cr f156412d;

    public C58685oe(Map map, C58881cr crVar) {
        super(map);
        this.f156412d = crVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f156412d = (C58881cr) objectInputStream.readObject();
        mo54918v((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f156412d);
        objectOutputStream.writeObject(this.f155873a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo54900a() {
        return (Set) this.f156412d.mo6453a();
    }

    /* renamed from: e */
    public final Collection mo54904e(Collection collection) {
        if (collection instanceof NavigableSet) {
            return C58758qx.m90651i((NavigableSet) collection);
        }
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        return Collections.unmodifiableSet((Set) collection);
    }

    /* renamed from: f */
    public final Collection mo54905f(Object obj, Collection collection) {
        if (collection instanceof NavigableSet) {
            return new C58304ab(this, obj, (NavigableSet) collection, (C58807y) null);
        }
        if (collection instanceof SortedSet) {
            return new C58306ad(this, obj, (SortedSet) collection, (C58807y) null);
        }
        return new C58305ac(this, obj, (Set) collection);
    }

    /* renamed from: q */
    public final Map mo54913q() {
        return mo54914r();
    }

    /* renamed from: s */
    public final Set mo54915s() {
        return mo54916t();
    }
}
