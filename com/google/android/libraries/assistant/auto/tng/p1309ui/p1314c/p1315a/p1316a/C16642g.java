package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.g */
/* compiled from: PG */
public final class C16642g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16642g f48735c;

    /* renamed from: d */
    private static volatile C63010eb f48736d;

    /* renamed from: a */
    public int f48737a;

    /* renamed from: b */
    public int f48738b;

    static {
        C16642g gVar = new C16642g();
        f48735c = gVar;
        C62942bv.registerDefaultInstance(C16642g.class, gVar);
    }

    private C16642g() {
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
                return newMessageInfo(f48735c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C16640e.f48734a});
            case 3:
                return new C16642g();
            case 4:
                return new C16641f();
            case 5:
                return f48735c;
            case 6:
                C63010eb ebVar = f48736d;
                if (ebVar == null) {
                    synchronized (C16642g.class) {
                        ebVar = f48736d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48735c);
                            f48736d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
