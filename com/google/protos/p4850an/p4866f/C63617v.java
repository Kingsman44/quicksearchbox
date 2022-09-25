package com.google.protos.p4850an.p4866f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.v */
/* compiled from: PG */
public final class C63617v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63617v f172059d;

    /* renamed from: e */
    private static volatile C63010eb f172060e;

    /* renamed from: a */
    public int f172061a;

    /* renamed from: b */
    public C63614s f172062b;

    /* renamed from: c */
    public C63616u f172063c;

    static {
        C63617v vVar = new C63617v();
        f172059d = vVar;
        C62942bv.registerDefaultInstance(C63617v.class, vVar);
    }

    private C63617v() {
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
                return newMessageInfo(f172059d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63617v();
            case 4:
                return new C63612q();
            case 5:
                return f172059d;
            case 6:
                C63010eb ebVar = f172060e;
                if (ebVar == null) {
                    synchronized (C63617v.class) {
                        ebVar = f172060e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172059d);
                            f172060e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
