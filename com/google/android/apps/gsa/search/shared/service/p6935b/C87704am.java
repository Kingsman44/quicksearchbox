package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.am */
/* compiled from: PG */
public final class C87704am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87704am f237161d;

    /* renamed from: f */
    private static volatile C63010eb f237162f;

    /* renamed from: a */
    public int f237163a;

    /* renamed from: b */
    public int f237164b;

    /* renamed from: c */
    public C118476ak f237165c;

    /* renamed from: e */
    private byte f237166e = 2;

    static {
        C87704am amVar = new C87704am();
        f237161d = amVar;
        C62942bv.registerDefaultInstance(C87704am.class, amVar);
    }

    private C87704am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237166e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237166e = b;
                return null;
            case 2:
                return newMessageInfo(f237161d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C118522by.m196759c(), C45240c.f118157a});
            case 3:
                return new C87704am();
            case 4:
                return new C87703al();
            case 5:
                return f237161d;
            case 6:
                C63010eb ebVar = f237162f;
                if (ebVar == null) {
                    synchronized (C87704am.class) {
                        ebVar = f237162f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237161d);
                            f237162f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
