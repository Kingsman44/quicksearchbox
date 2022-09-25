package com.google.common.p4522b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.common.b.en */
/* compiled from: PG */
public final class C58424en extends C58464g {
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private transient Class f156035c;

    /* renamed from: d */
    private transient Class f156036d;

    public C58424en(Class cls, Class cls2) {
        super((Map) new EnumMap(cls), (Map) new EnumMap(cls2));
        this.f156035c = cls;
        this.f156036d = cls2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f156035c = (Class) objectInputStream.readObject();
        this.f156036d = (Class) objectInputStream.readObject();
        mo55356j(new EnumMap(this.f156035c), new EnumMap(this.f156036d));
        C58742qh.m90623b(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f156035c);
        objectOutputStream.writeObject(this.f156036d);
        C58742qh.m90626e(this, objectOutputStream);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo55081c(Object obj) {
        Enum enumR = (Enum) obj;
        enumR.getClass();
        return enumR;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo55082d(Object obj) {
        Enum enumR = (Enum) obj;
        enumR.getClass();
        return enumR;
    }
}
