package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* renamed from: com.google.common.b.hf */
/* compiled from: PG */
abstract class C58497hf extends C58528ij {
    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return mo55438b().mo55193c();
    }

    /* renamed from: b */
    public abstract C58495hd mo55438b();

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = mo55438b().get(entry.getKey());
            if (obj2 == null || !obj2.equals(entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(mo55438b().entrySet());
    }

    public final int size() {
        return mo55438b().size();
    }

    /* renamed from: v */
    public final boolean mo55230v() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58496he(mo55438b());
    }
}
