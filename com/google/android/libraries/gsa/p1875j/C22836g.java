package com.google.android.libraries.gsa.p1875j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.j.g */
/* compiled from: PG */
public final class C22836g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C22836g f62864d;

    /* renamed from: e */
    private static volatile C63010eb f62865e;

    /* renamed from: a */
    public int f62866a;

    /* renamed from: b */
    public String f62867b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f62868c = BuildConfig.FLAVOR;

    static {
        C22836g gVar = new C22836g();
        f62864d = gVar;
        C62942bv.registerDefaultInstance(C22836g.class, gVar);
    }

    private C22836g() {
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
                return newMessageInfo(f62864d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C22836g();
            case 4:
                return new C22835f();
            case 5:
                return f62864d;
            case 6:
                C63010eb ebVar = f62865e;
                if (ebVar == null) {
                    synchronized (C22836g.class) {
                        ebVar = f62865e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62864d);
                            f62865e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
