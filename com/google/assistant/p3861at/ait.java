package com.google.assistant.p3861at;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ait */
/* compiled from: PG */
public final class ait extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ait f129427b;

    /* renamed from: d */
    private static volatile C63010eb f129428d;

    /* renamed from: a */
    public C62971cq f129429a = emptyProtobufList();

    /* renamed from: c */
    private byte f129430c = 2;

    static {
        ait ait = new ait();
        f129427b = ait;
        C62942bv.registerDefaultInstance(ait.class, ait);
    }

    private ait() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129430c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129430c = b;
                return null;
            case 2:
                return newMessageInfo(f129427b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C45632al.class});
            case 3:
                return new ait();
            case 4:
                return new ais();
            case 5:
                return f129427b;
            case 6:
                C63010eb ebVar = f129428d;
                if (ebVar == null) {
                    synchronized (ait.class) {
                        ebVar = f129428d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129427b);
                            f129428d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
