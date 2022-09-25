package com.google.p4222bl.p4223a.p4224a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.x */
/* compiled from: PG */
public final class C56085x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56085x f149425d;

    /* renamed from: e */
    private static volatile C63010eb f149426e;

    /* renamed from: a */
    public int f149427a;

    /* renamed from: b */
    public C62971cq f149428b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f149429c = BuildConfig.FLAVOR;

    static {
        C56085x xVar = new C56085x();
        f149425d = xVar;
        C62942bv.registerDefaultInstance(C56085x.class, xVar);
    }

    private C56085x() {
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
                return newMessageInfo(f149425d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ț\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56085x();
            case 4:
                return new C56084w();
            case 5:
                return f149425d;
            case 6:
                C63010eb ebVar = f149426e;
                if (ebVar == null) {
                    synchronized (C56085x.class) {
                        ebVar = f149426e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149425d);
                            f149426e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
