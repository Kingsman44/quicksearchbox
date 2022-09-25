package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.b.gw */
/* compiled from: PG */
public class C58487gw extends C58512hu implements C58585km {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient C58487gw f156116a;

    public C58487gw(C58495hd hdVar, int i) {
        super(hdVar, i);
    }

    /* renamed from: d */
    public static C58487gw m89866d(C58671nr nrVar) {
        if (nrVar.mo54954G()) {
            return C58422el.f156033a;
        }
        if (nrVar instanceof C58487gw) {
            C58487gw gwVar = (C58487gw) nrVar;
            if (!gwVar.map.mo55193c()) {
                return gwVar;
            }
        }
        return m89868p(nrVar.mo54950C().entrySet());
    }

    /* renamed from: e */
    public static C58487gw m89867e(Object obj, Object obj2) {
        C58486gv gvVar = new C58486gv();
        gvVar.mo55419c(obj, obj2);
        return gvVar.mo55417a();
    }

    /* renamed from: p */
    static C58487gw m89868p(Collection collection) {
        if (collection.isEmpty()) {
            return C58422el.f156033a;
        }
        C58490gz gzVar = new C58490gz(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            C58485gu j = C58485gu.m89842j((Collection) entry.getValue());
            if (!j.isEmpty()) {
                gzVar.mo55429h(key, j);
                i += j.size();
            }
        }
        return new C58487gw(gzVar.mo55427f(true), i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C58490gz gzVar = new C58490gz(4);
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C58480gp e = C58485gu.m89837e();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        e.mo55395g(objectInputStream.readObject());
                    }
                    gzVar.mo55429h(readObject, e.mo55394f());
                    i2 += readInt2;
                    i++;
                } else {
                    throw new InvalidObjectException("Invalid value count " + readInt2);
                }
            }
            try {
                C58508hq.f156149a.mo55857b(this, gzVar.mo55427f(true));
                C58508hq.f156150b.mo55856a(this, i2);
            } catch (IllegalArgumentException e2) {
                throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
            }
        } else {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C58742qh.m90627f(this, objectOutputStream);
    }

    /* renamed from: b */
    public final C58485gu mo55277g(Object obj) {
        C58485gu guVar = (C58485gu) this.map.get(obj);
        return guVar == null ? C58485gu.m89845m() : guVar;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C58512hu mo55425f() {
        C58487gw gwVar = this.f156116a;
        if (gwVar != null) {
            return gwVar;
        }
        C58486gv gvVar = new C58486gv();
        C58800sl lA = mo54948A().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            gvVar.mo55419c(entry.getValue(), entry.getKey());
        }
        C58487gw a = gvVar.mo55417a();
        a.f156116a = this;
        this.f156116a = a;
        return a;
    }

    @Deprecated
    /* renamed from: h */
    public final /* synthetic */ List mo55278h(Object obj) {
        throw null;
    }

    @Deprecated
    /* renamed from: i */
    public final /* synthetic */ List mo55279i(Object obj, Iterable iterable) {
        throw new UnsupportedOperationException();
    }
}
