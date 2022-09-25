package com.google.p4242bp.p4243a.p4247d;

import com.google.assistant.p3988o.C53037g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.d.f */
/* compiled from: PG */
public final class C56166f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56166f f149643c;

    /* renamed from: e */
    private static volatile C63010eb f149644e;

    /* renamed from: a */
    public C62971cq f149645a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f149646b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private byte f149647d = 2;

    static {
        C56166f fVar = new C56166f();
        f149643c = fVar;
        C62942bv.registerDefaultInstance(C56166f.class, fVar);
    }

    private C56166f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149647d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149647d = b;
                return null;
            case 2:
                return newMessageInfo(f149643c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u001a", new Object[]{"a", C53037g.class, "b"});
            case 3:
                return new C56166f();
            case 4:
                return new C56165e();
            case 5:
                return f149643c;
            case 6:
                C63010eb ebVar = f149644e;
                if (ebVar == null) {
                    synchronized (C56166f.class) {
                        ebVar = f149644e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149643c);
                            f149644e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
