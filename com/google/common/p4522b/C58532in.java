package com.google.common.p4522b;

import com.google.common.base.C58831av;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Set;

/* renamed from: com.google.common.b.in */
/* compiled from: PG */
public class C58532in extends C58512hu implements C58743qi {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient C58528ij f156181a;
    private final transient C58528ij emptySet = m90029e((Comparator) null);

    public C58532in(C58495hd hdVar, int i) {
        super(hdVar, i);
    }

    /* renamed from: e */
    private static C58528ij m90029e(Comparator comparator) {
        if (comparator == null) {
            return C58733pz.f156496a;
        }
        return C58541iw.m90070U(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        C58526ih ihVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C58490gz gzVar = new C58490gz(4);
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        ihVar = new C58526ih();
                    } else {
                        ihVar = new C58539iu(comparator);
                    }
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        ihVar.mo55373c(objectInputStream.readObject());
                    }
                    C58528ij f = ihVar.mo55486f();
                    if (f.size() == readInt2) {
                        gzVar.mo55429h(readObject, f);
                        i2 += readInt2;
                        i++;
                    } else {
                        new StringBuilder("Duplicate key-value pairs exist for key ").append(readObject);
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(String.valueOf(readObject)));
                    }
                } else {
                    throw new InvalidObjectException("Invalid value count " + readInt2);
                }
            }
            try {
                C58508hq.f156149a.mo55857b(this, gzVar.mo55427f(true));
                C58508hq.f156150b.mo55856a(this, i2);
                C58531im.f156180a.mo55857b(this, m90029e(comparator));
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C58528ij ijVar = this.emptySet;
        objectOutputStream.writeObject(ijVar instanceof C58541iw ? ((C58541iw) ijVar).f156195b : null);
        C58742qh.m90627f(this, objectOutputStream);
    }

    /* renamed from: b */
    public final C58528ij mo55464r() {
        C58528ij ijVar = this.f156181a;
        if (ijVar != null) {
            return ijVar;
        }
        C58530il ilVar = new C58530il(this);
        this.f156181a = ilVar;
        return ilVar;
    }

    /* renamed from: d */
    public final C58528ij mo54902c(Object obj) {
        return (C58528ij) C58831av.m90830c((C58528ij) this.map.get(obj), this.emptySet);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C58512hu mo55425f() {
        throw null;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Set mo54986h(Object obj) {
        throw null;
    }
}
