package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.ao */
/* compiled from: PG */
public final class C66053ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66053ao f179634c;

    /* renamed from: d */
    public static final C62940bt f179635d;

    /* renamed from: e */
    private static volatile C63010eb f179636e;

    /* renamed from: a */
    public int f179637a;

    /* renamed from: b */
    public C66051am f179638b;

    static {
        C66053ao aoVar = new C66053ao();
        f179634c = aoVar;
        C62942bv.registerDefaultInstance(C66053ao.class, aoVar);
        f179635d = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, aoVar, aoVar, (C62958ce) null, 409052762, C63066gd.MESSAGE, C66053ao.class);
    }

    private C66053ao() {
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
                return newMessageInfo(f179634c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66053ao();
            case 4:
                return new C66052an();
            case 5:
                return f179634c;
            case 6:
                C63010eb ebVar = f179636e;
                if (ebVar == null) {
                    synchronized (C66053ao.class) {
                        ebVar = f179636e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179634c);
                            f179636e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
