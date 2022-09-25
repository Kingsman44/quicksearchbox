package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.fi */
/* compiled from: PG */
public final class C142438fi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142438fi f386510d;

    /* renamed from: e */
    private static volatile C63010eb f386511e;

    /* renamed from: a */
    public int f386512a;

    /* renamed from: b */
    public boolean f386513b;

    /* renamed from: c */
    public boolean f386514c;

    static {
        C142438fi fiVar = new C142438fi();
        f386510d = fiVar;
        C62942bv.registerDefaultInstance(C142438fi.class, fiVar);
    }

    private C142438fi() {
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
                return newMessageInfo(f386510d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142438fi();
            case 4:
                return new C142437fh();
            case 5:
                return f386510d;
            case 6:
                C63010eb ebVar = f386511e;
                if (ebVar == null) {
                    synchronized (C142438fi.class) {
                        ebVar = f386511e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386510d);
                            f386511e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
