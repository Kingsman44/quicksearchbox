package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bm */
/* compiled from: PG */
public final class C49777bm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49777bm f128534e;

    /* renamed from: g */
    private static volatile C63010eb f128535g;

    /* renamed from: a */
    public int f128536a;

    /* renamed from: b */
    public int f128537b = 0;

    /* renamed from: c */
    public Object f128538c;

    /* renamed from: d */
    public C49773bi f128539d;

    /* renamed from: f */
    private byte f128540f = 2;

    static {
        C49777bm bmVar = new C49777bm();
        f128534e = bmVar;
        C62942bv.registerDefaultInstance(C49777bm.class, bmVar);
    }

    private C49777bm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128540f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128540f = b;
                return null;
            case 2:
                return newMessageInfo(f128534e, "\u0001\u0007\u0001\u0001\u0001\t\u0007\u0000\u0000\u0003\u0001ᐼ\u0000\u0003ြ\u0000\u0004ᐼ\u0000\u0005ဉ\u0007\u0006ြ\u0000\u0007ြ\u0000\tᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", C49758au.class, C49762ay.class, C49760aw.class, "d", C49756as.class, C49765ba.class, C49780bp.class});
            case 3:
                return new C49777bm();
            case 4:
                return new C49776bl();
            case 5:
                return f128534e;
            case 6:
                C63010eb ebVar = f128535g;
                if (ebVar == null) {
                    synchronized (C49777bm.class) {
                        ebVar = f128535g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128534e);
                            f128535g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
