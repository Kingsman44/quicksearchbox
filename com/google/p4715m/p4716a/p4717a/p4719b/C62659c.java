package com.google.p4715m.p4716a.p4717a.p4719b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.a.b.c */
/* compiled from: PG */
public final class C62659c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62659c f169178d;

    /* renamed from: e */
    private static volatile C63010eb f169179e;

    /* renamed from: a */
    public int f169180a;

    /* renamed from: b */
    public String f169181b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f169182c = BuildConfig.FLAVOR;

    static {
        C62659c cVar = new C62659c();
        f169178d = cVar;
        C62942bv.registerDefaultInstance(C62659c.class, cVar);
    }

    private C62659c() {
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
                return newMessageInfo(f169178d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62659c();
            case 4:
                return new C62658b();
            case 5:
                return f169178d;
            case 6:
                C63010eb ebVar = f169179e;
                if (ebVar == null) {
                    synchronized (C62659c.class) {
                        ebVar = f169179e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169178d);
                            f169179e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
