package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.bl */
/* compiled from: PG */
public final class C28734bl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28734bl f78057b;

    /* renamed from: c */
    private static volatile C63010eb f78058c;

    /* renamed from: a */
    public C62971cq f78059a = emptyProtobufList();

    static {
        C28734bl blVar = new C28734bl();
        f78057b = blVar;
        C62942bv.registerDefaultInstance(C28734bl.class, blVar);
    }

    private C28734bl() {
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
                return newMessageInfo(f78057b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C28732bj.class});
            case 3:
                return new C28734bl();
            case 4:
                return new C28733bk();
            case 5:
                return f78057b;
            case 6:
                C63010eb ebVar = f78058c;
                if (ebVar == null) {
                    synchronized (C28734bl.class) {
                        ebVar = f78058c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78057b);
                            f78058c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
