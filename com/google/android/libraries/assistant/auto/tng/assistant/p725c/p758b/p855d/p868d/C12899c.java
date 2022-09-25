package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.d.c */
/* compiled from: PG */
public final class C12899c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C12899c f40159d;

    /* renamed from: e */
    private static volatile C63010eb f40160e;

    /* renamed from: a */
    public int f40161a;

    /* renamed from: b */
    public int f40162b;

    /* renamed from: c */
    public C52070ec f40163c;

    static {
        C12899c cVar = new C12899c();
        f40159d = cVar;
        C62942bv.registerDefaultInstance(C12899c.class, cVar);
    }

    private C12899c() {
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
                return newMessageInfo(f40159d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C12899c();
            case 4:
                return new C12898b();
            case 5:
                return f40159d;
            case 6:
                C63010eb ebVar = f40160e;
                if (ebVar == null) {
                    synchronized (C12899c.class) {
                        ebVar = f40160e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40159d);
                            f40160e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
