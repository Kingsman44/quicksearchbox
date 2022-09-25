package com.google.p4242bp.p4243a.p4244a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.a.g */
/* compiled from: PG */
public final class C56133g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56133g f149545f;

    /* renamed from: g */
    private static volatile C63010eb f149546g;

    /* renamed from: a */
    public int f149547a;

    /* renamed from: b */
    public int f149548b;

    /* renamed from: c */
    public int f149549c;

    /* renamed from: d */
    public String f149550d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f149551e;

    static {
        C56133g gVar = new C56133g();
        f149545f = gVar;
        C62942bv.registerDefaultInstance(C56133g.class, gVar);
    }

    private C56133g() {
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
                return newMessageInfo(f149545f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0007ဇ\u0006", new Object[]{"a", "b", C56134h.f149552a, C45240c.f118157a, C56130d.f149543a, "d", "e"});
            case 3:
                return new C56133g();
            case 4:
                return new C56132f();
            case 5:
                return f149545f;
            case 6:
                C63010eb ebVar = f149546g;
                if (ebVar == null) {
                    synchronized (C56133g.class) {
                        ebVar = f149546g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149545f);
                            f149546g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
