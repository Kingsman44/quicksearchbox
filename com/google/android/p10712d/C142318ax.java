package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ax */
/* compiled from: PG */
public final class C142318ax extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C142318ax f386092f;

    /* renamed from: g */
    private static volatile C63010eb f386093g;

    /* renamed from: a */
    public int f386094a;

    /* renamed from: b */
    public C142355cg f386095b;

    /* renamed from: c */
    public C142355cg f386096c;

    /* renamed from: d */
    public C142355cg f386097d;

    /* renamed from: e */
    public C142328bg f386098e;

    static {
        C142318ax axVar = new C142318ax();
        f386092f = axVar;
        C62942bv.registerDefaultInstance(C142318ax.class, axVar);
    }

    private C142318ax() {
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
                return newMessageInfo(f386092f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C142318ax();
            case 4:
                return new C142317aw();
            case 5:
                return f386092f;
            case 6:
                C63010eb ebVar = f386093g;
                if (ebVar == null) {
                    synchronized (C142318ax.class) {
                        ebVar = f386093g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386092f);
                            f386093g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
