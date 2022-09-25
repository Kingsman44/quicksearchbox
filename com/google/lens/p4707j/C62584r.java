package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.lens.j.r */
/* compiled from: PG */
public final class C62584r extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f168965f = new C62581o();

    /* renamed from: g */
    public static final C62584r f168966g;

    /* renamed from: h */
    private static volatile C63010eb f168967h;

    /* renamed from: a */
    public String f168968a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f168969b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f168970c;

    /* renamed from: d */
    public C63042fg f168971d;

    /* renamed from: e */
    public C62961ch f168972e = emptyIntList();

    static {
        C62584r rVar = new C62584r();
        f168966g = rVar;
        C62942bv.registerDefaultInstance(C62584r.class, rVar);
    }

    private C62584r() {
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
                return newMessageInfo(f168966g, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0005\t\u0007,", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C62584r();
            case 4:
                return new C62582p();
            case 5:
                return f168966g;
            case 6:
                C63010eb ebVar = f168967h;
                if (ebVar == null) {
                    synchronized (C62584r.class) {
                        ebVar = f168967h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168966g);
                            f168967h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
