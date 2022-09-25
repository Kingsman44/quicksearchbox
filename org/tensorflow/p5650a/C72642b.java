package org.tensorflow.p5650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.b */
/* compiled from: PG */
public final class C72642b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C72642b f193209b;

    /* renamed from: c */
    private static volatile C63010eb f193210c;

    /* renamed from: a */
    public C62971cq f193211a = emptyProtobufList();

    static {
        C72642b bVar = new C72642b();
        f193209b = bVar;
        C62942bv.registerDefaultInstance(C72642b.class, bVar);
    }

    private C72642b() {
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
                return newMessageInfo(f193209b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
            case 3:
                return new C72642b();
            case 4:
                return new C72641a();
            case 5:
                return f193209b;
            case 6:
                C63010eb ebVar = f193210c;
                if (ebVar == null) {
                    synchronized (C72642b.class) {
                        ebVar = f193210c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193209b);
                            f193210c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
