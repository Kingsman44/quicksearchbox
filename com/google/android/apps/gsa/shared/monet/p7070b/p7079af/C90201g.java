package com.google.android.apps.gsa.shared.monet.p7070b.p7079af;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.af.g */
/* compiled from: PG */
public final class C90201g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C90201g f251968f;

    /* renamed from: g */
    private static volatile C63010eb f251969g;

    /* renamed from: a */
    public int f251970a;

    /* renamed from: b */
    public int f251971b;

    /* renamed from: c */
    public int f251972c;

    /* renamed from: d */
    public int f251973d;

    /* renamed from: e */
    public int f251974e;

    static {
        C90201g gVar = new C90201g();
        f251968f = gVar;
        C62942bv.registerDefaultInstance(C90201g.class, gVar);
    }

    private C90201g() {
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
                return newMessageInfo(f251968f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C90208n.m146768b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C90201g();
            case 4:
                return new C90200f();
            case 5:
                return f251968f;
            case 6:
                C63010eb ebVar = f251969g;
                if (ebVar == null) {
                    synchronized (C90201g.class) {
                        ebVar = f251969g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f251968f);
                            f251969g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
