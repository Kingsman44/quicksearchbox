package com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a;

import com.google.android.apps.gsa.shared.speech.p7141c.C90534b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.m.a.d */
/* compiled from: PG */
public final class C80496d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80496d f220968e;

    /* renamed from: f */
    private static volatile C63010eb f220969f;

    /* renamed from: a */
    public boolean f220970a;

    /* renamed from: b */
    public boolean f220971b;

    /* renamed from: c */
    public C80494b f220972c;

    /* renamed from: d */
    public C90534b f220973d;

    static {
        C80496d dVar = new C80496d();
        f220968e = dVar;
        C62942bv.registerDefaultInstance(C80496d.class, dVar);
    }

    private C80496d() {
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
                return newMessageInfo(f220968e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0007\u0002\t\u0003\u0007\u0005\t", new Object[]{"a", C45240c.f118157a, "b", "d"});
            case 3:
                return new C80496d();
            case 4:
                return new C80495c();
            case 5:
                return f220968e;
            case 6:
                C63010eb ebVar = f220969f;
                if (ebVar == null) {
                    synchronized (C80496d.class) {
                        ebVar = f220969f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220968e);
                            f220969f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
