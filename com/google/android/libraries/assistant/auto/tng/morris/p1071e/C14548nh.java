package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nh */
/* compiled from: PG */
public final class C14548nh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14548nh f44000c;

    /* renamed from: d */
    private static volatile C63010eb f44001d;

    /* renamed from: a */
    public int f44002a;

    /* renamed from: b */
    public C62971cq f44003b = emptyProtobufList();

    static {
        C14548nh nhVar = new C14548nh();
        f44000c = nhVar;
        C62942bv.registerDefaultInstance(C14548nh.class, nhVar);
    }

    private C14548nh() {
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
                return newMessageInfo(f44000c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"a", "b", C14270d.class});
            case 3:
                return new C14548nh();
            case 4:
                return new C14547ng();
            case 5:
                return f44000c;
            case 6:
                C63010eb ebVar = f44001d;
                if (ebVar == null) {
                    synchronized (C14548nh.class) {
                        ebVar = f44001d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44000c);
                            f44001d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
