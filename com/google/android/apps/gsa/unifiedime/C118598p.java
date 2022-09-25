package com.google.android.apps.gsa.unifiedime;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.unifiedime.p */
/* compiled from: PG */
public final class C118598p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C118598p f330876d;

    /* renamed from: e */
    private static volatile C63010eb f330877e;

    /* renamed from: a */
    public int f330878a;

    /* renamed from: b */
    public String f330879b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f330880c = C62942bv.emptyProtobufList();

    static {
        C118598p pVar = new C118598p();
        f330876d = pVar;
        C62942bv.registerDefaultInstance(C118598p.class, pVar);
    }

    private C118598p() {
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
                return newMessageInfo(f330876d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C118598p();
            case 4:
                return new C118597o();
            case 5:
                return f330876d;
            case 6:
                C63010eb ebVar = f330877e;
                if (ebVar == null) {
                    synchronized (C118598p.class) {
                        ebVar = f330877e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330876d);
                            f330877e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
