package com.google.lens.p4695b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.b.d */
/* compiled from: PG */
public final class C62158d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62158d f167798e;

    /* renamed from: f */
    private static volatile C63010eb f167799f;

    /* renamed from: a */
    public int f167800a;

    /* renamed from: b */
    public String f167801b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f167802c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62157c f167803d;

    static {
        C62158d dVar = new C62158d();
        f167798e = dVar;
        C62942bv.registerDefaultInstance(C62158d.class, dVar);
    }

    private C62158d() {
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
                return newMessageInfo(f167798e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62158d();
            case 4:
                return new C62155a();
            case 5:
                return f167798e;
            case 6:
                C63010eb ebVar = f167799f;
                if (ebVar == null) {
                    synchronized (C62158d.class) {
                        ebVar = f167799f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167798e);
                            f167799f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
