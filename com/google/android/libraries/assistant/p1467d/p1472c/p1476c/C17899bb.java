package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.android.libraries.assistant.p1467d.p1471b.C17829o;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.bb */
/* compiled from: PG */
public final class C17899bb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17899bb f51285b;

    /* renamed from: d */
    private static volatile C63010eb f51286d;

    /* renamed from: a */
    public int f51287a;

    /* renamed from: c */
    private int f51288c;

    static {
        C17899bb bbVar = new C17899bb();
        f51285b = bbVar;
        C62942bv.registerDefaultInstance(C17899bb.class, bbVar);
    }

    private C17899bb() {
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
                return newMessageInfo(f51285b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C17829o.m35074b()});
            case 3:
                return new C17899bb();
            case 4:
                return new C17898ba();
            case 5:
                return f51285b;
            case 6:
                C63010eb ebVar = f51286d;
                if (ebVar == null) {
                    synchronized (C17899bb.class) {
                        ebVar = f51286d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51285b);
                            f51286d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
