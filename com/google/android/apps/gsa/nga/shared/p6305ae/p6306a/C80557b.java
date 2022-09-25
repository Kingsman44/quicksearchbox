package com.google.android.apps.gsa.nga.shared.p6305ae.p6306a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ae.a.b */
/* compiled from: PG */
public final class C80557b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80557b f221114f;

    /* renamed from: g */
    private static volatile C63010eb f221115g;

    /* renamed from: a */
    public int f221116a;

    /* renamed from: b */
    public C80561f f221117b;

    /* renamed from: c */
    public String f221118c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f221119d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f221120e;

    static {
        C80557b bVar = new C80557b();
        f221114f = bVar;
        C62942bv.registerDefaultInstance(C80557b.class, bVar);
    }

    private C80557b() {
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
                return newMessageInfo(f221114f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C80557b();
            case 4:
                return new C80556a();
            case 5:
                return f221114f;
            case 6:
                C63010eb ebVar = f221115g;
                if (ebVar == null) {
                    synchronized (C80557b.class) {
                        ebVar = f221115g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221114f);
                            f221115g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
