package com.google.android.libraries.p590as.p611d.p612a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.d.a.d */
/* compiled from: PG */
public final class C10971d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C10971d f36099b;

    /* renamed from: c */
    private static volatile C63010eb f36100c;

    /* renamed from: a */
    public C62971cq f36101a = emptyProtobufList();

    static {
        C10971d dVar = new C10971d();
        f36099b = dVar;
        C62942bv.registerDefaultInstance(C10971d.class, dVar);
    }

    private C10971d() {
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
                return newMessageInfo(f36099b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C10969b.class});
            case 3:
                return new C10971d();
            case 4:
                return new C10970c();
            case 5:
                return f36099b;
            case 6:
                C63010eb ebVar = f36100c;
                if (ebVar == null) {
                    synchronized (C10971d.class) {
                        ebVar = f36100c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f36099b);
                            f36100c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
