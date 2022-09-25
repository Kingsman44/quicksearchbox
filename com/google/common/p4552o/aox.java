package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aox */
/* compiled from: PG */
public final class aox extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aox f159532e;

    /* renamed from: f */
    private static volatile C63010eb f159533f;

    /* renamed from: a */
    public int f159534a;

    /* renamed from: b */
    public int f159535b = 0;

    /* renamed from: c */
    public Object f159536c;

    /* renamed from: d */
    public String f159537d = BuildConfig.FLAVOR;

    static {
        aox aox = new aox();
        f159532e = aox;
        C62942bv.registerDefaultInstance(aox.class, aox);
    }

    private aox() {
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
                return newMessageInfo(f159532e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "b", "a", aof.class, "d"});
            case 3:
                return new aox();
            case 4:
                return new aow();
            case 5:
                return f159532e;
            case 6:
                C63010eb ebVar = f159533f;
                if (ebVar == null) {
                    synchronized (aox.class) {
                        ebVar = f159533f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159532e);
                            f159533f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
