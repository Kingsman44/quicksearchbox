package com.google.android.libraries.assistant.auto.tng.p1322v.p1326c.p1329b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.c.b.b */
/* compiled from: PG */
public final class C16849b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16849b f49313c;

    /* renamed from: d */
    private static volatile C63010eb f49314d;

    /* renamed from: a */
    public int f49315a;

    /* renamed from: b */
    public boolean f49316b = true;

    static {
        C16849b bVar = new C16849b();
        f49313c = bVar;
        C62942bv.registerDefaultInstance(C16849b.class, bVar);
    }

    private C16849b() {
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
                return newMessageInfo(f49313c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C16849b();
            case 4:
                return new C16848a();
            case 5:
                return f49313c;
            case 6:
                C63010eb ebVar = f49314d;
                if (ebVar == null) {
                    synchronized (C16849b.class) {
                        ebVar = f49314d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49313c);
                            f49314d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
