package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bt */
/* compiled from: PG */
public final class C49862bt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49862bt f129566e;

    /* renamed from: f */
    private static volatile C63010eb f129567f;

    /* renamed from: a */
    public int f129568a;

    /* renamed from: b */
    public String f129569b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129570c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C49819ae f129571d;

    static {
        C49862bt btVar = new C49862bt();
        f129566e = btVar;
        C62942bv.registerDefaultInstance(C49862bt.class, btVar);
    }

    private C49862bt() {
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
                return newMessageInfo(f129566e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49862bt();
            case 4:
                return new C49861bs();
            case 5:
                return f129566e;
            case 6:
                C63010eb ebVar = f129567f;
                if (ebVar == null) {
                    synchronized (C49862bt.class) {
                        ebVar = f129567f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129566e);
                            f129567f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
