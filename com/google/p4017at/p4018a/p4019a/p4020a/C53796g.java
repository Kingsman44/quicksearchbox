package com.google.p4017at.p4018a.p4019a.p4020a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.g */
/* compiled from: PG */
public final class C53796g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53796g f141198d;

    /* renamed from: e */
    private static volatile C63010eb f141199e;

    /* renamed from: a */
    public int f141200a;

    /* renamed from: b */
    public int f141201b;

    /* renamed from: c */
    public String f141202c = BuildConfig.FLAVOR;

    static {
        C53796g gVar = new C53796g();
        f141198d = gVar;
        C62942bv.registerDefaultInstance(C53796g.class, gVar);
    }

    private C53796g() {
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
                return newMessageInfo(f141198d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53796g();
            case 4:
                return new C53795f();
            case 5:
                return f141198d;
            case 6:
                C63010eb ebVar = f141199e;
                if (ebVar == null) {
                    synchronized (C53796g.class) {
                        ebVar = f141199e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141198d);
                            f141199e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
