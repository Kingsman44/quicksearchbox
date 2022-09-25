package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6133b;

import com.google.android.apps.gsa.nga.engine.recognition.p6131m.C77859b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.b.b */
/* compiled from: PG */
public final class C77861b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C77861b f214467e;

    /* renamed from: f */
    private static volatile C63010eb f214468f;

    /* renamed from: a */
    public int f214469a;

    /* renamed from: b */
    public int f214470b;

    /* renamed from: c */
    public int f214471c;

    /* renamed from: d */
    public int f214472d;

    static {
        C77861b bVar = new C77861b();
        f214467e = bVar;
        C62942bv.registerDefaultInstance(C77861b.class, bVar);
    }

    private C77861b() {
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
                return newMessageInfo(f214467e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C80471b.m128171b(), C45240c.f118157a, C77863d.m124923b(), "d", C77859b.m124921b()});
            case 3:
                return new C77861b();
            case 4:
                return new C77860a();
            case 5:
                return f214467e;
            case 6:
                C63010eb ebVar = f214468f;
                if (ebVar == null) {
                    synchronized (C77861b.class) {
                        ebVar = f214468f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f214467e);
                            f214468f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
