package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.p */
/* compiled from: PG */
public final class C91809p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C91809p f256048e;

    /* renamed from: f */
    private static volatile C63010eb f256049f;

    /* renamed from: a */
    public int f256050a;

    /* renamed from: b */
    public boolean f256051b;

    /* renamed from: c */
    public boolean f256052c;

    /* renamed from: d */
    public boolean f256053d;

    static {
        C91809p pVar = new C91809p();
        f256048e = pVar;
        C62942bv.registerDefaultInstance(C91809p.class, pVar);
    }

    private C91809p() {
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
                return newMessageInfo(f256048e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C91809p();
            case 4:
                return new C91808o();
            case 5:
                return f256048e;
            case 6:
                C63010eb ebVar = f256049f;
                if (ebVar == null) {
                    synchronized (C91809p.class) {
                        ebVar = f256049f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256048e);
                            f256049f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
