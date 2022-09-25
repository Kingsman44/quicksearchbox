package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.m */
/* compiled from: PG */
public final class C19185m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19185m f53723f;

    /* renamed from: g */
    private static volatile C63010eb f53724g;

    /* renamed from: a */
    public int f53725a;

    /* renamed from: b */
    public int f53726b;

    /* renamed from: c */
    public C19167ba f53727c;

    /* renamed from: d */
    public long f53728d;

    /* renamed from: e */
    public int f53729e;

    static {
        C19185m mVar = new C19185m();
        f53723f = mVar;
        C62942bv.registerDefaultInstance(C19185m.class, mVar);
    }

    private C19185m() {
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
                return newMessageInfo(f53723f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C19183k.f53722a, C45240c.f118157a, "d", "e", C48674ai.m85262b()});
            case 3:
                return new C19185m();
            case 4:
                return new C19182j();
            case 5:
                return f53723f;
            case 6:
                C63010eb ebVar = f53724g;
                if (ebVar == null) {
                    synchronized (C19185m.class) {
                        ebVar = f53724g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53723f);
                            f53724g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
