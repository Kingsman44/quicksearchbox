package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.f.c.b */
/* compiled from: PG */
public final class C17306b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17306b f50128a;

    /* renamed from: b */
    private static volatile C63010eb f50129b;

    static {
        C17306b bVar = new C17306b();
        f50128a = bVar;
        C62942bv.registerDefaultInstance(C17306b.class, bVar);
    }

    private C17306b() {
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
                return newMessageInfo(f50128a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C17306b();
            case 4:
                return new C17301a();
            case 5:
                return f50128a;
            case 6:
                C63010eb ebVar = f50129b;
                if (ebVar == null) {
                    synchronized (C17306b.class) {
                        ebVar = f50129b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50128a);
                            f50129b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
