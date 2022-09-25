package com.google.common.p4522b;

import com.google.common.base.C58881cr;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.od */
/* compiled from: PG */
final class C58684od extends C58545j {
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    transient C58881cr f156411d;

    public C58684od(Map map, C58881cr crVar) {
        super(map);
        this.f156411d = crVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f156411d = (C58881cr) objectInputStream.readObject();
        mo54918v((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f156411d);
        objectOutputStream.writeObject(this.f155873a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo54900a() {
        return (List) this.f156411d.mo6453a();
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
