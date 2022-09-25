package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.ba */
/* compiled from: PG */
public final class C8485ba extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8485ba f29445b;

    /* renamed from: c */
    private static volatile C63010eb f29446c;

    /* renamed from: a */
    public C62971cq f29447a = C62942bv.emptyProtobufList();

    static {
        C8485ba baVar = new C8485ba();
        f29445b = baVar;
        C62942bv.registerDefaultInstance(C8485ba.class, baVar);
    }

    private C8485ba() {
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
                return newMessageInfo(f29445b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C8485ba();
            case 4:
                return new C8483az();
            case 5:
                return f29445b;
            case 6:
                C63010eb ebVar = f29446c;
                if (ebVar == null) {
                    synchronized (C8485ba.class) {
                        ebVar = f29446c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29445b);
                            f29446c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
