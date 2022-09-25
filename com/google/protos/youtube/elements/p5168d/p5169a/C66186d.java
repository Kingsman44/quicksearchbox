package com.google.protos.youtube.elements.p5168d.p5169a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.protos.youtube.elements.d.a.d */
/* compiled from: PG */
public final class C66186d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66186d f179970f;

    /* renamed from: g */
    private static volatile C63010eb f179971g;

    /* renamed from: a */
    public int f179972a;

    /* renamed from: b */
    public String f179973b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63070h f179974c;

    /* renamed from: d */
    public C62971cq f179975d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public long f179976e;

    static {
        C66186d dVar = new C66186d();
        f179970f = dVar;
        C62942bv.registerDefaultInstance(C66186d.class, dVar);
    }

    private C66186d() {
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
                return newMessageInfo(f179970f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001a\u0004ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66186d();
            case 4:
                return new C66185c();
            case 5:
                return f179970f;
            case 6:
                C63010eb ebVar = f179971g;
                if (ebVar == null) {
                    synchronized (C66186d.class) {
                        ebVar = f179971g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179970f);
                            f179971g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
