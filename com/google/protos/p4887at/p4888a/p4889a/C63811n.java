package com.google.protos.p4887at.p4888a.p4889a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.at.a.a.n */
/* compiled from: PG */
public final class C63811n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63811n f172581d;

    /* renamed from: f */
    private static volatile C63010eb f172582f;

    /* renamed from: a */
    public int f172583a = 0;

    /* renamed from: b */
    public Object f172584b;

    /* renamed from: c */
    public String f172585c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f172586e;

    static {
        C63811n nVar = new C63811n();
        f172581d = nVar;
        C62942bv.registerDefaultInstance(C63811n.class, nVar);
    }

    private C63811n() {
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
                return newMessageInfo(f172581d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဈ\u0001", new Object[]{"b", "a", "e", C63810m.class, C45240c.f118157a});
            case 3:
                return new C63811n();
            case 4:
                return new C63802e();
            case 5:
                return f172581d;
            case 6:
                C63010eb ebVar = f172582f;
                if (ebVar == null) {
                    synchronized (C63811n.class) {
                        ebVar = f172582f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172581d);
                            f172582f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
