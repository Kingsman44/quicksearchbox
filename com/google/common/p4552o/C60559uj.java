package com.google.common.p4552o;

import com.google.android.libraries.search.p3025k.p3026a.C38530g;
import com.google.android.libraries.search.p3025k.p3026a.C38531h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.uj */
/* compiled from: PG */
public final class C60559uj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60559uj f164278d;

    /* renamed from: e */
    private static volatile C63010eb f164279e;

    /* renamed from: a */
    public int f164280a;

    /* renamed from: b */
    public int f164281b;

    /* renamed from: c */
    public int f164282c;

    static {
        C60559uj ujVar = new C60559uj();
        f164278d = ujVar;
        C62942bv.registerDefaultInstance(C60559uj.class, ujVar);
    }

    private C60559uj() {
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
                return newMessageInfo(f164278d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C38530g.f101902a, C45240c.f118157a, C38531h.f101903a});
            case 3:
                return new C60559uj();
            case 4:
                return new C60558ui();
            case 5:
                return f164278d;
            case 6:
                C63010eb ebVar = f164279e;
                if (ebVar == null) {
                    synchronized (C60559uj.class) {
                        ebVar = f164279e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164278d);
                            f164279e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
