package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.hi */
/* compiled from: PG */
public final class C55140hi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55140hi f145150b;

    /* renamed from: d */
    private static volatile C63010eb f145151d;

    /* renamed from: a */
    public C62971cq f145152a = emptyProtobufList();

    /* renamed from: c */
    private byte f145153c = 2;

    static {
        C55140hi hiVar = new C55140hi();
        f145150b = hiVar;
        C62942bv.registerDefaultInstance(C55140hi.class, hiVar);
    }

    private C55140hi() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145153c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145153c = b;
                return null;
            case 2:
                return newMessageInfo(f145150b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55349pb.class});
            case 3:
                return new C55140hi();
            case 4:
                return new C55139hh();
            case 5:
                return f145150b;
            case 6:
                C63010eb ebVar = f145151d;
                if (ebVar == null) {
                    synchronized (C55140hi.class) {
                        ebVar = f145151d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145150b);
                            f145151d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
