package com.google.p4129b.p4136c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.x */
/* compiled from: PG */
public final class C54776x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54776x f143709e;

    /* renamed from: f */
    private static volatile C63010eb f143710f;

    /* renamed from: a */
    public String f143711a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62995dn f143712b = C62995dn.f170057a;

    /* renamed from: c */
    public C62971cq f143713c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f143714d = C62942bv.emptyProtobufList();

    static {
        C54776x xVar = new C54776x();
        f143709e = xVar;
        C62942bv.registerDefaultInstance(C54776x.class, xVar);
    }

    private C54776x() {
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
                return newMessageInfo(f143709e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0002\u0000\u0001Ȉ\u00022\u0003Ț\u0004Ț", new Object[]{"a", "b", C54775w.f143708a, C45240c.f118157a, "d"});
            case 3:
                return new C54776x();
            case 4:
                return new C54774v();
            case 5:
                return f143709e;
            case 6:
                C63010eb ebVar = f143710f;
                if (ebVar == null) {
                    synchronized (C54776x.class) {
                        ebVar = f143710f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143709e);
                            f143710f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
