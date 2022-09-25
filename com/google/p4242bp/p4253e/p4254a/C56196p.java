package com.google.p4242bp.p4253e.p4254a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.e.a.p */
/* compiled from: PG */
public final class C56196p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56196p f149722b;

    /* renamed from: d */
    private static volatile C63010eb f149723d;

    /* renamed from: a */
    public String f149724a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f149725c;

    static {
        C56196p pVar = new C56196p();
        f149722b = pVar;
        C62942bv.registerDefaultInstance(C56196p.class, pVar);
    }

    private C56196p() {
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
                return newMessageInfo(f149722b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56196p();
            case 4:
                return new C56195o();
            case 5:
                return f149722b;
            case 6:
                C63010eb ebVar = f149723d;
                if (ebVar == null) {
                    synchronized (C56196p.class) {
                        ebVar = f149723d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149722b);
                            f149723d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
