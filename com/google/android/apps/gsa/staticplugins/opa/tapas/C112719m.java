package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m */
/* compiled from: PG */
public final class C112719m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C112719m f312463b;

    /* renamed from: c */
    private static volatile C63010eb f312464c;

    /* renamed from: a */
    public C112988o f312465a;

    static {
        C112719m mVar = new C112719m();
        f312463b = mVar;
        C62942bv.registerDefaultInstance(C112719m.class, mVar);
    }

    private C112719m() {
        emptyProtobufList();
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
                return newMessageInfo(f312463b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C112719m();
            case 4:
                return new C112132l();
            case 5:
                return f312463b;
            case 6:
                C63010eb ebVar = f312464c;
                if (ebVar == null) {
                    synchronized (C112719m.class) {
                        ebVar = f312464c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f312463b);
                            f312464c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
