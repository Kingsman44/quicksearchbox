package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.anj */
/* compiled from: PG */
public final class anj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final anj f159368g;

    /* renamed from: h */
    private static volatile C63010eb f159369h;

    /* renamed from: a */
    public int f159370a;

    /* renamed from: b */
    public double f159371b;

    /* renamed from: c */
    public int f159372c;

    /* renamed from: d */
    public int f159373d;

    /* renamed from: e */
    public int f159374e;

    /* renamed from: f */
    public int f159375f;

    static {
        anj anj = new anj();
        f159368g = anj;
        C62942bv.registerDefaultInstance(anj.class, anj);
    }

    private anj() {
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
                return newMessageInfo(f159368g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new anj();
            case 4:
                return new ani();
            case 5:
                return f159368g;
            case 6:
                C63010eb ebVar = f159369h;
                if (ebVar == null) {
                    synchronized (anj.class) {
                        ebVar = f159369h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159368g);
                            f159369h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
