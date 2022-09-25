package com.google.assistant.p3897e.p3921j.p3924c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c.r */
/* compiled from: PG */
public final class C51747r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51747r f135758b;

    /* renamed from: d */
    private static volatile C63010eb f135759d;

    /* renamed from: a */
    public String f135760a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f135761c;

    static {
        C51747r rVar = new C51747r();
        f135758b = rVar;
        C62942bv.registerDefaultInstance(C51747r.class, rVar);
    }

    private C51747r() {
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
                return newMessageInfo(f135758b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51747r();
            case 4:
                return new C51746q();
            case 5:
                return f135758b;
            case 6:
                C63010eb ebVar = f135759d;
                if (ebVar == null) {
                    synchronized (C51747r.class) {
                        ebVar = f135759d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135758b);
                            f135759d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
