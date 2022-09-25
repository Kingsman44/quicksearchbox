package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.f.c.g */
/* compiled from: PG */
public final class C17311g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17311g f50134b;

    /* renamed from: c */
    private static volatile C63010eb f50135c;

    /* renamed from: a */
    public long f50136a;

    static {
        C17311g gVar = new C17311g();
        f50134b = gVar;
        C62942bv.registerDefaultInstance(C17311g.class, gVar);
    }

    private C17311g() {
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
                return newMessageInfo(f50134b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new C17311g();
            case 4:
                return new C17310f();
            case 5:
                return f50134b;
            case 6:
                C63010eb ebVar = f50135c;
                if (ebVar == null) {
                    synchronized (C17311g.class) {
                        ebVar = f50135c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50134b);
                            f50135c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
