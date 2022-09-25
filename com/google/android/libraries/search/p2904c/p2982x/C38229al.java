package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.al */
/* compiled from: PG */
public final class C38229al extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C38229al f101316f;

    /* renamed from: g */
    private static volatile C63010eb f101317g;

    /* renamed from: a */
    public int f101318a;

    /* renamed from: b */
    public C37416bu f101319b;

    /* renamed from: c */
    public C37639gr f101320c;

    /* renamed from: d */
    public C37679hz f101321d;

    /* renamed from: e */
    public C37360ay f101322e;

    static {
        C38229al alVar = new C38229al();
        f101316f = alVar;
        C62942bv.registerDefaultInstance(C38229al.class, alVar);
    }

    private C38229al() {
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
                return newMessageInfo(f101316f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C38229al();
            case 4:
                return new C38228ak();
            case 5:
                return f101316f;
            case 6:
                C63010eb ebVar = f101317g;
                if (ebVar == null) {
                    synchronized (C38229al.class) {
                        ebVar = f101317g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101316f);
                            f101317g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
