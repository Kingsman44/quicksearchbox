package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.amh */
/* compiled from: PG */
public final class amh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final amh f135371d;

    /* renamed from: e */
    private static volatile C63010eb f135372e;

    /* renamed from: a */
    public int f135373a;

    /* renamed from: b */
    public int f135374b;

    /* renamed from: c */
    public int f135375c;

    static {
        amh amh = new amh();
        f135371d = amh;
        C62942bv.registerDefaultInstance(amh.class, amh);
    }

    private amh() {
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
                return newMessageInfo(f135371d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new amh();
            case 4:
                return new amg();
            case 5:
                return f135371d;
            case 6:
                C63010eb ebVar = f135372e;
                if (ebVar == null) {
                    synchronized (amh.class) {
                        ebVar = f135372e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135371d);
                            f135372e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
