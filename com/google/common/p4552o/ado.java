package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4563i.C59866ab;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.common.p4552o.p4563i.C59963m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.ado */
/* compiled from: PG */
public final class ado extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final ado f158388g;

    /* renamed from: h */
    public static final C62940bt f158389h;

    /* renamed from: i */
    private static volatile C63010eb f158390i;

    /* renamed from: a */
    public int f158391a;

    /* renamed from: b */
    public C59866ab f158392b;

    /* renamed from: c */
    public abc f158393c;

    /* renamed from: d */
    public C59963m f158394d;

    /* renamed from: e */
    public C59961k f158395e;

    /* renamed from: f */
    public C60708zx f158396f;

    static {
        ado ado = new ado();
        f158388g = ado;
        C62942bv.registerDefaultInstance(ado.class, ado);
        f158389h = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ado, ado, (C62958ce) null, 482, C63066gd.MESSAGE, ado.class);
    }

    private ado() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f158388g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\bဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new ado();
            case 4:
                return new adn();
            case 5:
                return f158388g;
            case 6:
                C63010eb ebVar = f158390i;
                if (ebVar == null) {
                    synchronized (ado.class) {
                        ebVar = f158390i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158388g);
                            f158390i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
