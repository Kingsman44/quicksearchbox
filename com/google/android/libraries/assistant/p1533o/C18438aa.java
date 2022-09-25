package com.google.android.libraries.assistant.p1533o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.aa */
/* compiled from: PG */
public final class C18438aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C18438aa f52334e;

    /* renamed from: f */
    private static volatile C63010eb f52335f;

    /* renamed from: a */
    public int f52336a;

    /* renamed from: b */
    public C18449al f52337b;

    /* renamed from: c */
    public C18487e f52338c;

    /* renamed from: d */
    public boolean f52339d;

    static {
        C18438aa aaVar = new C18438aa();
        f52334e = aaVar;
        C62942bv.registerDefaultInstance(C18438aa.class, aaVar);
    }

    private C18438aa() {
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
                return newMessageInfo(f52334e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C18438aa();
            case 4:
                return new C18508z();
            case 5:
                return f52334e;
            case 6:
                C63010eb ebVar = f52335f;
                if (ebVar == null) {
                    synchronized (C18438aa.class) {
                        ebVar = f52335f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52334e);
                            f52335f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
