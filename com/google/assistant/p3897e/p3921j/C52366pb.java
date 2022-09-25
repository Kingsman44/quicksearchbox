package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.pb */
/* compiled from: PG */
public final class C52366pb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52366pb f137417b;

    /* renamed from: d */
    private static volatile C63010eb f137418d;

    /* renamed from: a */
    public boolean f137419a = true;

    /* renamed from: c */
    private int f137420c;

    static {
        C52366pb pbVar = new C52366pb();
        f137417b = pbVar;
        C62942bv.registerDefaultInstance(C52366pb.class, pbVar);
    }

    private C52366pb() {
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
                return newMessageInfo(f137417b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52366pb();
            case 4:
                return new C52365pa();
            case 5:
                return f137417b;
            case 6:
                C63010eb ebVar = f137418d;
                if (ebVar == null) {
                    synchronized (C52366pb.class) {
                        ebVar = f137418d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137417b);
                            f137418d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
