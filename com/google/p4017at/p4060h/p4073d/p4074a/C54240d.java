package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.d */
/* compiled from: PG */
public final class C54240d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54240d f142409e;

    /* renamed from: f */
    private static volatile C63010eb f142410f;

    /* renamed from: a */
    public int f142411a;

    /* renamed from: b */
    public String f142412b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f142413c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f142414d;

    static {
        C54240d dVar = new C54240d();
        f142409e = dVar;
        C62942bv.registerDefaultInstance(C54240d.class, dVar);
    }

    private C54240d() {
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
                return newMessageInfo(f142409e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54240d();
            case 4:
                return new C54239c();
            case 5:
                return f142409e;
            case 6:
                C63010eb ebVar = f142410f;
                if (ebVar == null) {
                    synchronized (C54240d.class) {
                        ebVar = f142410f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142409e);
                            f142410f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
