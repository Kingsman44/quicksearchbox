package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.fi */
/* compiled from: PG */
public final class C65202fi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65202fi f176480c;

    /* renamed from: d */
    private static volatile C63010eb f176481d;

    /* renamed from: a */
    public int f176482a = 0;

    /* renamed from: b */
    public Object f176483b;

    static {
        C65202fi fiVar = new C65202fi();
        f176480c = fiVar;
        C62942bv.registerDefaultInstance(C65202fi.class, fiVar);
    }

    private C65202fi() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f176480c, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0003<\u0000", new Object[]{"b", "a", C65201fh.class});
            case 3:
                return new C65202fi();
            case 4:
                return new C65197fd();
            case 5:
                return f176480c;
            case 6:
                C63010eb ebVar = f176481d;
                if (ebVar == null) {
                    synchronized (C65202fi.class) {
                        ebVar = f176481d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176480c);
                            f176481d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
