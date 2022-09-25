package com.google.common.p4522b;

import com.google.common.base.C58815af;
import com.google.common.base.C58838bb;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.common.b.lo */
/* compiled from: PG */
final class C58614lo extends C58601lb {
    private static final long serialVersionUID = 3;

    public C58614lo(C58615lp lpVar, C58615lp lpVar2, C58815af afVar, int i, ConcurrentMap concurrentMap) {
        super(lpVar, lpVar2, afVar, i, concurrentMap);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        C58598kz kzVar = new C58598kz();
        int i = kzVar.f156298b;
        boolean z = false;
        C58838bb.m90885t(i == -1, "initial capacity was already set to %s", i);
        C58838bb.m90868c(readInt >= 0);
        kzVar.f156298b = readInt;
        kzVar.mo55627f(this.f156303a);
        C58615lp lpVar = this.f156304b;
        C58615lp lpVar2 = kzVar.f156301e;
        C58838bb.m90887v(lpVar2 == null, "Value strength was already set to %s", lpVar2);
        lpVar.getClass();
        kzVar.f156301e = lpVar;
        if (lpVar != C58615lp.STRONG) {
            kzVar.f156297a = true;
        }
        C58815af afVar = this.f156305c;
        C58815af afVar2 = kzVar.f156302f;
        C58838bb.m90887v(afVar2 == null, "key equivalence was already set to %s", afVar2);
        afVar.getClass();
        kzVar.f156302f = afVar;
        kzVar.f156297a = true;
        int i2 = this.f156306d;
        int i3 = kzVar.f156299c;
        C58838bb.m90885t(i3 == -1, "concurrency level was already set to %s", i3);
        if (i2 > 0) {
            z = true;
        }
        C58838bb.m90868c(z);
        kzVar.f156299c = i2;
        this.f156307e = kzVar.mo55626e();
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                this.f156307e.put(readObject, objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private Object readResolve() {
        return this.f156307e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f156307e.size());
        for (Map.Entry entry : this.f156307e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject((Object) null);
    }
}
