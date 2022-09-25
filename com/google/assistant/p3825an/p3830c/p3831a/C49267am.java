package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.am */
/* compiled from: PG */
public final class C49267am extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49267am f127346f;

    /* renamed from: g */
    private static volatile C63010eb f127347g;

    /* renamed from: a */
    public int f127348a;

    /* renamed from: b */
    public String f127349b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127350c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f127351d;

    /* renamed from: e */
    public int f127352e;

    static {
        C49267am amVar = new C49267am();
        f127346f = amVar;
        C62942bv.registerDefaultInstance(C49267am.class, amVar);
    }

    private C49267am() {
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
                return newMessageInfo(f127346f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C49267am();
            case 4:
                return new C49266al();
            case 5:
                return f127346f;
            case 6:
                C63010eb ebVar = f127347g;
                if (ebVar == null) {
                    synchronized (C49267am.class) {
                        ebVar = f127347g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127346f);
                            f127347g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
