package com.google.p4222bl.p4223a.p4224a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.d */
/* compiled from: PG */
public final class C56065d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56065d f149383e;

    /* renamed from: f */
    private static volatile C63010eb f149384f;

    /* renamed from: a */
    public String f149385a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f149386b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f149387c = emptyProtobufList();

    /* renamed from: d */
    public C56077p f149388d;

    static {
        C56065d dVar = new C56065d();
        f149383e = dVar;
        C62942bv.registerDefaultInstance(C56065d.class, dVar);
    }

    private C56065d() {
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
                return newMessageInfo(f149383e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\t", new Object[]{"a", "b", C45240c.f118157a, C56069h.class, "d"});
            case 3:
                return new C56065d();
            case 4:
                return new C56064c();
            case 5:
                return f149383e;
            case 6:
                C63010eb ebVar = f149384f;
                if (ebVar == null) {
                    synchronized (C56065d.class) {
                        ebVar = f149384f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149383e);
                            f149384f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
