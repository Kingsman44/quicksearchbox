package com.google.common.p4552o;

import com.google.android.p10712d.C142359ck;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.lj */
/* compiled from: PG */
public final class C60236lj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60236lj f162969c;

    /* renamed from: d */
    private static volatile C63010eb f162970d;

    /* renamed from: a */
    public C62961ch f162971a = emptyIntList();

    /* renamed from: b */
    public C62961ch f162972b = emptyIntList();

    static {
        C60236lj ljVar = new C60236lj();
        f162969c = ljVar;
        C62942bv.registerDefaultInstance(C60236lj.class, ljVar);
    }

    private C60236lj() {
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
                return newMessageInfo(f162969c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001e", new Object[]{"a", C142359ck.m231066b(), "b", C142359ck.m231066b()});
            case 3:
                return new C60236lj();
            case 4:
                return new C60235li();
            case 5:
                return f162969c;
            case 6:
                C63010eb ebVar = f162970d;
                if (ebVar == null) {
                    synchronized (C60236lj.class) {
                        ebVar = f162970d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162969c);
                            f162970d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
