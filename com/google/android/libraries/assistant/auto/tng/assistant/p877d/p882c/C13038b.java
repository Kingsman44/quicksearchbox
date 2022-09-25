package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b */
/* compiled from: PG */
public final class C13038b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13038b f40471d;

    /* renamed from: e */
    private static volatile C63010eb f40472e;

    /* renamed from: a */
    public int f40473a;

    /* renamed from: b */
    public C13075u f40474b;

    /* renamed from: c */
    public C13037ay f40475c;

    static {
        C13038b bVar = new C13038b();
        f40471d = bVar;
        C62942bv.registerDefaultInstance(C13038b.class, bVar);
    }

    private C13038b() {
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
                return newMessageInfo(f40471d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13038b();
            case 4:
                return new C13010a();
            case 5:
                return f40471d;
            case 6:
                C63010eb ebVar = f40472e;
                if (ebVar == null) {
                    synchronized (C13038b.class) {
                        ebVar = f40472e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40471d);
                            f40472e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
