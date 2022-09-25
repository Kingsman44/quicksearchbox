package com.google.android.libraries.onegoogle.p2380c.p2382b;

import com.google.common.p4552o.aif;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.onegoogle.c.b.q */
/* compiled from: PG */
public final class C30888q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C30888q f83287c;

    /* renamed from: d */
    private static volatile C63010eb f83288d;

    /* renamed from: a */
    public int f83289a;

    /* renamed from: b */
    public aif f83290b;

    static {
        C30888q qVar = new C30888q();
        f83287c = qVar;
        C62942bv.registerDefaultInstance(C30888q.class, qVar);
    }

    private C30888q() {
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
                return newMessageInfo(f83287c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C30888q();
            case 4:
                return new C30887p();
            case 5:
                return f83287c;
            case 6:
                C63010eb ebVar = f83288d;
                if (ebVar == null) {
                    synchronized (C30888q.class) {
                        ebVar = f83288d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f83287c);
                            f83288d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
