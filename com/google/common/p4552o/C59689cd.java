package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.cd */
/* compiled from: PG */
public final class C59689cd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59689cd f160146e;

    /* renamed from: f */
    private static volatile C63010eb f160147f;

    /* renamed from: a */
    public int f160148a;

    /* renamed from: b */
    public String f160149b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f160150c;

    /* renamed from: d */
    public int f160151d;

    static {
        C59689cd cdVar = new C59689cd();
        f160146e = cdVar;
        C62942bv.registerDefaultInstance(C59689cd.class, cdVar);
    }

    private C59689cd() {
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
                return newMessageInfo(f160146e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59689cd();
            case 4:
                return new C59688cc();
            case 5:
                return f160146e;
            case 6:
                C63010eb ebVar = f160147f;
                if (ebVar == null) {
                    synchronized (C59689cd.class) {
                        ebVar = f160147f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160146e);
                            f160147f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
