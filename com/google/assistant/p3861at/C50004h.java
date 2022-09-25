package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.h */
/* compiled from: PG */
public final class C50004h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50004h f129989d;

    /* renamed from: e */
    private static volatile C63010eb f129990e;

    /* renamed from: a */
    public int f129991a;

    /* renamed from: b */
    public C50247q f129992b;

    /* renamed from: c */
    public String f129993c = BuildConfig.FLAVOR;

    static {
        C50004h hVar = new C50004h();
        f129989d = hVar;
        C62942bv.registerDefaultInstance(C50004h.class, hVar);
    }

    private C50004h() {
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
                return newMessageInfo(f129989d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50004h();
            case 4:
                return new C49977g();
            case 5:
                return f129989d;
            case 6:
                C63010eb ebVar = f129990e;
                if (ebVar == null) {
                    synchronized (C50004h.class) {
                        ebVar = f129990e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129989d);
                            f129990e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
