package com.google.protos.p4850an.p4855d.p4856a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.a.p */
/* compiled from: PG */
public final class C63463p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63463p f171507e;

    /* renamed from: f */
    private static volatile C63010eb f171508f;

    /* renamed from: a */
    public int f171509a;

    /* renamed from: b */
    public String f171510b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f171511c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f171512d = BuildConfig.FLAVOR;

    static {
        C63463p pVar = new C63463p();
        f171507e = pVar;
        C62942bv.registerDefaultInstance(C63463p.class, pVar);
    }

    private C63463p() {
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
                return newMessageInfo(f171507e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a\u0004ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63463p();
            case 4:
                return new C63462o();
            case 5:
                return f171507e;
            case 6:
                C63010eb ebVar = f171508f;
                if (ebVar == null) {
                    synchronized (C63463p.class) {
                        ebVar = f171508f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171507e);
                            f171508f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
