package com.google.assistant.p3745ab.p3771w;

import com.google.android.apps.gsa.assistant.shared.l.c;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.w.i */
/* compiled from: PG */
public final class C48422i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48422i f125135e;

    /* renamed from: f */
    private static volatile C63010eb f125136f;

    /* renamed from: a */
    public int f125137a;

    /* renamed from: b */
    public int f125138b;

    /* renamed from: c */
    public int f125139c;

    /* renamed from: d */
    public C48420g f125140d;

    static {
        C48422i iVar = new C48422i();
        f125135e = iVar;
        C62942bv.registerDefaultInstance(C48422i.class, iVar);
    }

    private C48422i() {
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
                return newMessageInfo(f125135e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", e.b(), C45240c.f118157a, c.a, "d"});
            case 3:
                return new C48422i();
            case 4:
                return new C48421h();
            case 5:
                return f125135e;
            case 6:
                C63010eb ebVar = f125136f;
                if (ebVar == null) {
                    synchronized (C48422i.class) {
                        ebVar = f125136f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125135e);
                            f125136f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
