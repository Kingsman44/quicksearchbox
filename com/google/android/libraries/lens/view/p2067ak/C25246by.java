package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.by */
/* compiled from: PG */
public final class C25246by extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25246by f68705c;

    /* renamed from: d */
    private static volatile C63010eb f68706d;

    /* renamed from: a */
    public C62971cq f68707a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f68708b = C62942bv.emptyProtobufList();

    static {
        C25246by byVar = new C25246by();
        f68705c = byVar;
        C62942bv.registerDefaultInstance(C25246by.class, byVar);
    }

    private C25246by() {
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
                return newMessageInfo(f68705c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C25246by();
            case 4:
                return new C25245bx();
            case 5:
                return f68705c;
            case 6:
                C63010eb ebVar = f68706d;
                if (ebVar == null) {
                    synchronized (C25246by.class) {
                        ebVar = f68706d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68705c);
                            f68706d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
