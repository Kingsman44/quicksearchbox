package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.as.ao */
/* compiled from: PG */
public final class C49752ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49752ao f128475c;

    /* renamed from: d */
    public static final C62940bt f128476d;

    /* renamed from: f */
    private static volatile C63010eb f128477f;

    /* renamed from: a */
    public C62971cq f128478a = emptyProtobufList();

    /* renamed from: b */
    public C49798l f128479b;

    /* renamed from: e */
    private int f128480e;

    static {
        C49752ao aoVar = new C49752ao();
        f128475c = aoVar;
        C62942bv.registerDefaultInstance(C49752ao.class, aoVar);
        f128476d = C62942bv.newSingularGeneratedExtension(C49742ae.f128440a, aoVar, aoVar, (C62958ce) null, 311287627, C63066gd.MESSAGE, C49752ao.class);
    }

    private C49752ao() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f128475c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004ဉ\u0000", new Object[]{"e", "a", C49748ak.class, "b"});
            case 3:
                return new C49752ao();
            case 4:
                return new C49751an();
            case 5:
                return f128475c;
            case 6:
                C63010eb ebVar = f128477f;
                if (ebVar == null) {
                    synchronized (C49752ao.class) {
                        ebVar = f128477f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128475c);
                            f128477f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
