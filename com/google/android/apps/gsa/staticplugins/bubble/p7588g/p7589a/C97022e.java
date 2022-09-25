package com.google.android.apps.gsa.staticplugins.bubble.p7588g.p7589a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.g.a.e */
/* compiled from: PG */
public final class C97022e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C97022e f271141c;

    /* renamed from: d */
    private static volatile C63010eb f271142d;

    /* renamed from: a */
    public int f271143a;

    /* renamed from: b */
    public int f271144b;

    static {
        C97022e eVar = new C97022e();
        f271141c = eVar;
        C62942bv.registerDefaultInstance(C97022e.class, eVar);
    }

    private C97022e() {
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
                return newMessageInfo(f271141c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0002", new Object[]{"a", "b", C97021d.f271140a});
            case 3:
                return new C97022e();
            case 4:
                return new C97020c();
            case 5:
                return f271141c;
            case 6:
                C63010eb ebVar = f271142d;
                if (ebVar == null) {
                    synchronized (C97022e.class) {
                        ebVar = f271142d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271141c);
                            f271142d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
