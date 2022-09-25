package com.google.android.libraries.p1638aw.p1639a.p1641b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.aw.a.b.b */
/* compiled from: PG */
public final class C19593b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19593b f54528f;

    /* renamed from: g */
    private static volatile C63010eb f54529g;

    /* renamed from: a */
    public int f54530a;

    /* renamed from: b */
    public String f54531b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f54532c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f54533d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f54534e = BuildConfig.FLAVOR;

    static {
        C19593b bVar = new C19593b();
        f54528f = bVar;
        C62942bv.registerDefaultInstance(C19593b.class, bVar);
    }

    private C19593b() {
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
                return newMessageInfo(f54528f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C19593b();
            case 4:
                return new C19592a();
            case 5:
                return f54528f;
            case 6:
                C63010eb ebVar = f54529g;
                if (ebVar == null) {
                    synchronized (C19593b.class) {
                        ebVar = f54529g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54528f);
                            f54529g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
