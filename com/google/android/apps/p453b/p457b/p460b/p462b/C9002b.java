package com.google.android.apps.p453b.p457b.p460b.p462b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.b.b.b.b.b */
/* compiled from: PG */
public final class C9002b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C9002b f31117a;

    /* renamed from: b */
    private static volatile C63010eb f31118b;

    static {
        C9002b bVar = new C9002b();
        f31117a = bVar;
        C62942bv.registerDefaultInstance(C9002b.class, bVar);
    }

    private C9002b() {
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
                return newMessageInfo(f31117a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C9002b();
            case 4:
                return new C9001a();
            case 5:
                return f31117a;
            case 6:
                C63010eb ebVar = f31118b;
                if (ebVar == null) {
                    synchronized (C9002b.class) {
                        ebVar = f31118b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31117a);
                            f31118b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
