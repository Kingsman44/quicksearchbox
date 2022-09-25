package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.cf */
/* compiled from: PG */
public final class C28791cf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28791cf f78244b;

    /* renamed from: c */
    private static volatile C63010eb f78245c;

    /* renamed from: a */
    public C62971cq f78246a = emptyProtobufList();

    static {
        C28791cf cfVar = new C28791cf();
        f78244b = cfVar;
        C62942bv.registerDefaultInstance(C28791cf.class, cfVar);
    }

    private C28791cf() {
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
                return newMessageInfo(f78244b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C28789cd.class});
            case 3:
                return new C28791cf();
            case 4:
                return new C28790ce();
            case 5:
                return f78244b;
            case 6:
                C63010eb ebVar = f78245c;
                if (ebVar == null) {
                    synchronized (C28791cf.class) {
                        ebVar = f78245c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78244b);
                            f78245c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
