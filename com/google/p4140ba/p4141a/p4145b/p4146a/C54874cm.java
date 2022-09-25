package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.cm */
/* compiled from: PG */
public final class C54874cm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54874cm f144160c;

    /* renamed from: d */
    private static volatile C63010eb f144161d;

    /* renamed from: a */
    public int f144162a;

    /* renamed from: b */
    public float f144163b;

    static {
        C54874cm cmVar = new C54874cm();
        f144160c = cmVar;
        C62942bv.registerDefaultInstance(C54874cm.class, cmVar);
    }

    private C54874cm() {
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
                return newMessageInfo(f144160c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54874cm();
            case 4:
                return new C54873cl();
            case 5:
                return f144160c;
            case 6:
                C63010eb ebVar = f144161d;
                if (ebVar == null) {
                    synchronized (C54874cm.class) {
                        ebVar = f144161d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144160c);
                            f144161d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
