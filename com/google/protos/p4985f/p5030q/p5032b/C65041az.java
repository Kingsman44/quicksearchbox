package com.google.protos.p4985f.p5030q.p5032b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.az */
/* compiled from: PG */
public final class C65041az extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65041az f176130f;

    /* renamed from: g */
    private static volatile C63010eb f176131g;

    /* renamed from: a */
    public int f176132a;

    /* renamed from: b */
    public String f176133b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f176134c = emptyProtobufList();

    /* renamed from: d */
    public String f176135d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f176136e = BuildConfig.FLAVOR;

    static {
        C65041az azVar = new C65041az();
        f176130f = azVar;
        C62942bv.registerDefaultInstance(C65041az.class, azVar);
    }

    private C65041az() {
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
                return newMessageInfo(f176130f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C65055bm.class, "d", "e"});
            case 3:
                return new C65041az();
            case 4:
                return new C65040ay();
            case 5:
                return f176130f;
            case 6:
                C63010eb ebVar = f176131g;
                if (ebVar == null) {
                    synchronized (C65041az.class) {
                        ebVar = f176131g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176130f);
                            f176131g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
