package com.google.assistant.p3980n.p3981a.p3982a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.a.a.d */
/* compiled from: PG */
public final class C53001d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53001d f138931d;

    /* renamed from: e */
    private static volatile C63010eb f138932e;

    /* renamed from: a */
    public int f138933a;

    /* renamed from: b */
    public String f138934b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f138935c = emptyProtobufList();

    static {
        C53001d dVar = new C53001d();
        f138931d = dVar;
        C62942bv.registerDefaultInstance(C53001d.class, dVar);
    }

    private C53001d() {
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
                return newMessageInfo(f138931d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C52999b.class});
            case 3:
                return new C53001d();
            case 4:
                return new C53000c();
            case 5:
                return f138931d;
            case 6:
                C63010eb ebVar = f138932e;
                if (ebVar == null) {
                    synchronized (C53001d.class) {
                        ebVar = f138932e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138931d);
                            f138932e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
