package com.google.p4242bp.p4243a.p4245b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.b.m */
/* compiled from: PG */
public final class C56154m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56154m f149619a;

    /* renamed from: b */
    private static volatile C63010eb f149620b;

    static {
        C56154m mVar = new C56154m();
        f149619a = mVar;
        C62942bv.registerDefaultInstance(C56154m.class, mVar);
    }

    private C56154m() {
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
                return newMessageInfo(f149619a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56154m();
            case 4:
                return new C56153l();
            case 5:
                return f149619a;
            case 6:
                C63010eb ebVar = f149620b;
                if (ebVar == null) {
                    synchronized (C56154m.class) {
                        ebVar = f149620b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149619a);
                            f149620b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
