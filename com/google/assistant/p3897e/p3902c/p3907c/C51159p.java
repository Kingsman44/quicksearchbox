package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.p */
/* compiled from: PG */
public final class C51159p extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51159p f133168f;

    /* renamed from: g */
    private static volatile C63010eb f133169g;

    /* renamed from: a */
    public int f133170a;

    /* renamed from: b */
    public String f133171b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f133172c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f133173d;

    /* renamed from: e */
    public boolean f133174e;

    static {
        C51159p pVar = new C51159p();
        f133168f = pVar;
        C62942bv.registerDefaultInstance(C51159p.class, pVar);
    }

    private C51159p() {
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
                return newMessageInfo(f133168f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဌ\u0002\u0003ဈ\u0000\u0004ဇ\u0003", new Object[]{"a", C45240c.f118157a, "d", C51157n.f133167a, "b", "e"});
            case 3:
                return new C51159p();
            case 4:
                return new C51156m();
            case 5:
                return f133168f;
            case 6:
                C63010eb ebVar = f133169g;
                if (ebVar == null) {
                    synchronized (C51159p.class) {
                        ebVar = f133169g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133168f);
                            f133169g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
