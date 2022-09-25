package com.google.p4242bp.p4253e.p4254a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.e.a.r */
/* compiled from: PG */
public final class C56198r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56198r f149726e;

    /* renamed from: f */
    private static volatile C63010eb f149727f;

    /* renamed from: a */
    public int f149728a;

    /* renamed from: b */
    public String f149729b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C56192l f149730c;

    /* renamed from: d */
    public C56182b f149731d;

    static {
        C56198r rVar = new C56198r();
        f149726e = rVar;
        C62942bv.registerDefaultInstance(C56198r.class, rVar);
    }

    private C56198r() {
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
                return newMessageInfo(f149726e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56198r();
            case 4:
                return new C56197q();
            case 5:
                return f149726e;
            case 6:
                C63010eb ebVar = f149727f;
                if (ebVar == null) {
                    synchronized (C56198r.class) {
                        ebVar = f149727f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149726e);
                            f149727f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
