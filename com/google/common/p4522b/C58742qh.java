package com.google.common.p4522b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.b.qh */
/* compiled from: PG */
final class C58742qh {
    /* renamed from: a */
    static C58741qg m90622a(Class cls, String str) {
        try {
            return new C58741qg(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    static void m90623b(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: c */
    static void m90624c(C58671nr nrVar, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection c = nrVar.mo54902c(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                c.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: d */
    static void m90625d(C58692ol olVar, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            olVar.mo54931lF(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: e */
    static void m90626e(Map map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: f */
    static void m90627f(C58671nr nrVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(nrVar.mo54950C().size());
        for (Map.Entry entry : nrVar.mo54950C().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: g */
    static void m90628g(C58692ol olVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(olVar.mo54975m().size());
        for (C58691ok okVar : olVar.mo54975m()) {
            objectOutputStream.writeObject(okVar.mo55768b());
            objectOutputStream.writeInt(okVar.mo55767a());
        }
    }
}
