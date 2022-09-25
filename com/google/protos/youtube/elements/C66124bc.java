package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.bc */
/* compiled from: PG */
public final class C66124bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66124bc f179818c;

    /* renamed from: d */
    public static final C62940bt f179819d;

    /* renamed from: f */
    private static volatile C63010eb f179820f;

    /* renamed from: a */
    public C62971cq f179821a = emptyProtobufList();

    /* renamed from: b */
    public int f179822b;

    /* renamed from: e */
    private int f179823e;

    static {
        C66124bc bcVar = new C66124bc();
        f179818c = bcVar;
        C62942bv.registerDefaultInstance(C66124bc.class, bcVar);
        f179819d = C62942bv.newSingularGeneratedExtension(C66063ay.f179656a, bcVar, bcVar, (C62958ce) null, 188490103, C63066gd.MESSAGE, C66124bc.class);
    }

    private C66124bc() {
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
                return newMessageInfo(f179818c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"e", "a", C66126be.class, "b"});
            case 3:
                return new C66124bc();
            case 4:
                return new C66123bb();
            case 5:
                return f179818c;
            case 6:
                C63010eb ebVar = f179820f;
                if (ebVar == null) {
                    synchronized (C66124bc.class) {
                        ebVar = f179820f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179818c);
                            f179820f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
