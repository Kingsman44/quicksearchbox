package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.dj */
/* compiled from: PG */
public final class C66893dj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66893dj f181858c;

    /* renamed from: d */
    public static final C62940bt f181859d;

    /* renamed from: e */
    private static volatile C63010eb f181860e;

    /* renamed from: a */
    public int f181861a;

    /* renamed from: b */
    public C67150mx f181862b;

    static {
        C66893dj djVar = new C66893dj();
        f181858c = djVar;
        C62942bv.registerDefaultInstance(C66893dj.class, djVar);
        f181859d = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, djVar, djVar, (C62958ce) null, 338360505, C63066gd.MESSAGE, C66893dj.class);
    }

    private C66893dj() {
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
                return newMessageInfo(f181858c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66893dj();
            case 4:
                return new C66892di();
            case 5:
                return f181858c;
            case 6:
                C63010eb ebVar = f181860e;
                if (ebVar == null) {
                    synchronized (C66893dj.class) {
                        ebVar = f181860e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181858c);
                            f181860e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
