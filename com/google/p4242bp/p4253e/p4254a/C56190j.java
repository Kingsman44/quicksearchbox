package com.google.p4242bp.p4253e.p4254a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.e.a.j */
/* compiled from: PG */
public final class C56190j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56190j f149710d;

    /* renamed from: f */
    private static volatile C63010eb f149711f;

    /* renamed from: a */
    public String f149712a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f149713b;

    /* renamed from: c */
    public int f149714c;

    /* renamed from: e */
    private int f149715e;

    static {
        C56190j jVar = new C56190j();
        f149710d = jVar;
        C62942bv.registerDefaultInstance(C56190j.class, jVar);
    }

    private C56190j() {
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
                return newMessageInfo(f149710d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C56190j();
            case 4:
                return new C56189i();
            case 5:
                return f149710d;
            case 6:
                C63010eb ebVar = f149711f;
                if (ebVar == null) {
                    synchronized (C56190j.class) {
                        ebVar = f149711f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149710d);
                            f149711f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
