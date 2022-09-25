package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.m */
/* compiled from: PG */
public final class C56769m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56769m f151494c;

    /* renamed from: d */
    private static volatile C63010eb f151495d;

    /* renamed from: a */
    public int f151496a;

    /* renamed from: b */
    public boolean f151497b;

    static {
        C56769m mVar = new C56769m();
        f151494c = mVar;
        C62942bv.registerDefaultInstance(C56769m.class, mVar);
    }

    private C56769m() {
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
                return newMessageInfo(f151494c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56769m();
            case 4:
                return new C56768l();
            case 5:
                return f151494c;
            case 6:
                C63010eb ebVar = f151495d;
                if (ebVar == null) {
                    synchronized (C56769m.class) {
                        ebVar = f151495d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151494c);
                            f151495d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
