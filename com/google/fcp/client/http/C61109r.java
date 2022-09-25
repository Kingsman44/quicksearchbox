package com.google.fcp.client.http;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.fcp.client.http.r */
/* compiled from: PG */
public final class C61109r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C61109r f165422e;

    /* renamed from: f */
    private static volatile C63010eb f165423f;

    /* renamed from: a */
    public String f165424a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f165425b;

    /* renamed from: c */
    public C62971cq f165426c = emptyProtobufList();

    /* renamed from: d */
    public boolean f165427d;

    static {
        C61109r rVar = new C61109r();
        f165422e = rVar;
        C62942bv.registerDefaultInstance(C61109r.class, rVar);
    }

    private C61109r() {
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
                return newMessageInfo(f165422e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, C61106o.class, "d"});
            case 3:
                return new C61109r();
            case 4:
                return new C61108q();
            case 5:
                return f165422e;
            case 6:
                C63010eb ebVar = f165423f;
                if (ebVar == null) {
                    synchronized (C61109r.class) {
                        ebVar = f165423f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165422e);
                            f165423f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
