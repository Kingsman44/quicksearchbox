package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.lu */
/* compiled from: PG */
public final class C60247lu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f163013d = new C60245ls();

    /* renamed from: e */
    public static final C60247lu f163014e;

    /* renamed from: f */
    private static volatile C63010eb f163015f;

    /* renamed from: a */
    public int f163016a;

    /* renamed from: b */
    public int f163017b;

    /* renamed from: c */
    public C62961ch f163018c = emptyIntList();

    static {
        C60247lu luVar = new C60247lu();
        f163014e = luVar;
        C62942bv.registerDefaultInstance(C60247lu.class, luVar);
    }

    private C60247lu() {
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
                return newMessageInfo(f163014e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"a", "b", C60248lv.f163019a, C45240c.f118157a, C60244lr.m92554b()});
            case 3:
                return new C60247lu();
            case 4:
                return new C60246lt();
            case 5:
                return f163014e;
            case 6:
                C63010eb ebVar = f163015f;
                if (ebVar == null) {
                    synchronized (C60247lu.class) {
                        ebVar = f163015f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163014e);
                            f163015f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
