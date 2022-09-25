package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.youtube.elements.ci */
/* compiled from: PG */
public final class C66164ci extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66164ci f179916c;

    /* renamed from: d */
    public static final C62940bt f179917d;

    /* renamed from: e */
    private static volatile C63010eb f179918e;

    /* renamed from: a */
    public int f179919a;

    /* renamed from: b */
    public C63088z f179920b = C63088z.f170246b;

    static {
        C66164ci ciVar = new C66164ci();
        f179916c = ciVar;
        C62942bv.registerDefaultInstance(C66164ci.class, ciVar);
        f179917d = C62942bv.newSingularGeneratedExtension(C66232es.f180105a, ciVar, ciVar, (C62958ce) null, 169768054, C63066gd.MESSAGE, C66164ci.class);
    }

    private C66164ci() {
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
                return newMessageInfo(f179916c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66164ci();
            case 4:
                return new C66163ch();
            case 5:
                return f179916c;
            case 6:
                C63010eb ebVar = f179918e;
                if (ebVar == null) {
                    synchronized (C66164ci.class) {
                        ebVar = f179918e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179916c);
                            f179918e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
