package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.ax */
/* compiled from: PG */
public final class C63353ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63353ax f171199b;

    /* renamed from: d */
    private static volatile C63010eb f171200d;

    /* renamed from: a */
    public C62971cq f171201a = emptyProtobufList();

    /* renamed from: c */
    private byte f171202c = 2;

    static {
        C63353ax axVar = new C63353ax();
        f171199b = axVar;
        C62942bv.registerDefaultInstance(C63353ax.class, axVar);
    }

    private C63353ax() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171202c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171202c = b;
                return null;
            case 2:
                return newMessageInfo(f171199b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C63352aw.class});
            case 3:
                return new C63353ax();
            case 4:
                return new C63350au();
            case 5:
                return f171199b;
            case 6:
                C63010eb ebVar = f171200d;
                if (ebVar == null) {
                    synchronized (C63353ax.class) {
                        ebVar = f171200d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171199b);
                            f171200d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
