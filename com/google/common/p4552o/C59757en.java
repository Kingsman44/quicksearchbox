package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.en */
/* compiled from: PG */
public final class C59757en extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59757en f161460f;

    /* renamed from: g */
    private static volatile C63010eb f161461g;

    /* renamed from: a */
    public int f161462a;

    /* renamed from: b */
    public String f161463b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f161464c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f161465d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f161466e;

    static {
        C59757en enVar = new C59757en();
        f161460f = enVar;
        C62942bv.registerDefaultInstance(C59757en.class, enVar);
    }

    private C59757en() {
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
                return newMessageInfo(f161460f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C59757en();
            case 4:
                return new C59756em();
            case 5:
                return f161460f;
            case 6:
                C63010eb ebVar = f161461g;
                if (ebVar == null) {
                    synchronized (C59757en.class) {
                        ebVar = f161461g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161460f);
                            f161461g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
