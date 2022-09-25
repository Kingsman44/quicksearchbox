package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.v */
/* compiled from: PG */
public final class C66117v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66117v f179799e;

    /* renamed from: f */
    private static volatile C63010eb f179800f;

    /* renamed from: a */
    public int f179801a;

    /* renamed from: b */
    public String f179802b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f179803c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f179804d;

    static {
        C66117v vVar = new C66117v();
        f179799e = vVar;
        C62942bv.registerDefaultInstance(C66117v.class, vVar);
    }

    private C66117v() {
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
                return newMessageInfo(f179799e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66117v();
            case 4:
                return new C66116u();
            case 5:
                return f179799e;
            case 6:
                C63010eb ebVar = f179800f;
                if (ebVar == null) {
                    synchronized (C66117v.class) {
                        ebVar = f179800f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179799e);
                            f179800f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
