package com.google.android.libraries.search.p2904c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.eh */
/* compiled from: PG */
public final class C37567eh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C37567eh f99829f;

    /* renamed from: g */
    private static volatile C63010eb f99830g;

    /* renamed from: a */
    public int f99831a;

    /* renamed from: b */
    public int f99832b;

    /* renamed from: c */
    public String f99833c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f99834d;

    /* renamed from: e */
    public int f99835e;

    static {
        C37567eh ehVar = new C37567eh();
        f99829f = ehVar;
        C62942bv.registerDefaultInstance(C37567eh.class, ehVar);
    }

    private C37567eh() {
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
                return newMessageInfo(f99829f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C37589fa.m66583b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C37567eh();
            case 4:
                return new C37566eg();
            case 5:
                return f99829f;
            case 6:
                C63010eb ebVar = f99830g;
                if (ebVar == null) {
                    synchronized (C37567eh.class) {
                        ebVar = f99830g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99829f);
                            f99830g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
