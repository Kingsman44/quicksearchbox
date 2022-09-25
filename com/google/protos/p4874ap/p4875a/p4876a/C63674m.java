package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65806cj;

/* renamed from: com.google.protos.ap.a.a.m */
/* compiled from: PG */
public final class C63674m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f172167d = new C63672k();

    /* renamed from: e */
    public static final C63674m f172168e;

    /* renamed from: f */
    private static volatile C63010eb f172169f;

    /* renamed from: a */
    public int f172170a;

    /* renamed from: b */
    public boolean f172171b;

    /* renamed from: c */
    public C62961ch f172172c = emptyIntList();

    static {
        C63674m mVar = new C63674m();
        f172168e = mVar;
        C62942bv.registerDefaultInstance(C63674m.class, mVar);
    }

    private C63674m() {
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
                return newMessageInfo(f172168e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001e", new Object[]{"a", "b", C45240c.f118157a, C65806cj.m96810b()});
            case 3:
                return new C63674m();
            case 4:
                return new C63673l();
            case 5:
                return f172168e;
            case 6:
                C63010eb ebVar = f172169f;
                if (ebVar == null) {
                    synchronized (C63674m.class) {
                        ebVar = f172169f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172168e);
                            f172169f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
