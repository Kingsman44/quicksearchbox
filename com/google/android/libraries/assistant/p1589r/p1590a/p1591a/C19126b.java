package com.google.android.libraries.assistant.p1589r.p1590a.p1591a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.r.a.a.b */
/* compiled from: PG */
public final class C19126b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C19126b f53592a;

    /* renamed from: b */
    private static volatile C63010eb f53593b;

    static {
        C19126b bVar = new C19126b();
        f53592a = bVar;
        C62942bv.registerDefaultInstance(C19126b.class, bVar);
    }

    private C19126b() {
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
                return newMessageInfo(f53592a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C19126b();
            case 4:
                return new C19124a();
            case 5:
                return f53592a;
            case 6:
                C63010eb ebVar = f53593b;
                if (ebVar == null) {
                    synchronized (C19126b.class) {
                        ebVar = f53593b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53592a);
                            f53593b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
