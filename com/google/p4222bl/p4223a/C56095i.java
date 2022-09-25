package com.google.p4222bl.p4223a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.i */
/* compiled from: PG */
public final class C56095i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56095i f149440c;

    /* renamed from: d */
    private static volatile C63010eb f149441d;

    /* renamed from: a */
    public C62971cq f149442a = emptyProtobufList();

    /* renamed from: b */
    public C56104r f149443b;

    static {
        C56095i iVar = new C56095i();
        f149440c = iVar;
        C62942bv.registerDefaultInstance(C56095i.class, iVar);
    }

    private C56095i() {
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
                return newMessageInfo(f149440c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"a", C56107u.class, "b"});
            case 3:
                return new C56095i();
            case 4:
                return new C56094h();
            case 5:
                return f149440c;
            case 6:
                C63010eb ebVar = f149441d;
                if (ebVar == null) {
                    synchronized (C56095i.class) {
                        ebVar = f149441d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149440c);
                            f149441d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
