package com.google.android.apps.auto.p450a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.i */
/* compiled from: PG */
public final class C8963i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8963i f31052c;

    /* renamed from: d */
    private static volatile C63010eb f31053d;

    /* renamed from: a */
    public C62971cq f31054a = emptyProtobufList();

    /* renamed from: b */
    public C62995dn f31055b = C62995dn.f170057a;

    static {
        C8963i iVar = new C8963i();
        f31052c = iVar;
        C62942bv.registerDefaultInstance(C8963i.class, iVar);
    }

    private C8963i() {
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
                return newMessageInfo(f31052c, "\u0001\u0002\u0000\u0000\u0001\u0004\u0002\u0001\u0001\u0000\u0001\u001b\u00042", new Object[]{"a", C8958d.class, "b", C8962h.f31051a});
            case 3:
                return new C8963i();
            case 4:
                return new C8961g();
            case 5:
                return f31052c;
            case 6:
                C63010eb ebVar = f31053d;
                if (ebVar == null) {
                    synchronized (C8963i.class) {
                        ebVar = f31053d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31052c);
                            f31053d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
