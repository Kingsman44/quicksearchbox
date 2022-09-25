package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.fm */
/* compiled from: PG */
public final class C49963fm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49963fm f129890e;

    /* renamed from: f */
    private static volatile C63010eb f129891f;

    /* renamed from: a */
    public int f129892a;

    /* renamed from: b */
    public boolean f129893b;

    /* renamed from: c */
    public boolean f129894c;

    /* renamed from: d */
    public int f129895d;

    static {
        C49963fm fmVar = new C49963fm();
        f129890e = fmVar;
        C62942bv.registerDefaultInstance(C49963fm.class, fmVar);
    }

    private C49963fm() {
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
                return newMessageInfo(f129890e, "\u0001\u0003\u0000\u0001\u0001\u0017\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0017ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C49983gf.f129936a});
            case 3:
                return new C49963fm();
            case 4:
                return new C49962fl();
            case 5:
                return f129890e;
            case 6:
                C63010eb ebVar = f129891f;
                if (ebVar == null) {
                    synchronized (C49963fm.class) {
                        ebVar = f129891f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129890e);
                            f129891f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
