package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.hk */
/* compiled from: PG */
public final class C52159hk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52159hk f136860e;

    /* renamed from: f */
    private static volatile C63010eb f136861f;

    /* renamed from: a */
    public int f136862a;

    /* renamed from: b */
    public C51098gh f136863b;

    /* renamed from: c */
    public int f136864c;

    /* renamed from: d */
    public int f136865d;

    static {
        C52159hk hkVar = new C52159hk();
        f136860e = hkVar;
        C62942bv.registerDefaultInstance(C52159hk.class, hkVar);
    }

    private C52159hk() {
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
                return newMessageInfo(f136860e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဌ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, C52156hh.f136858a, "d", C52157hi.f136859a});
            case 3:
                return new C52159hk();
            case 4:
                return new C52155hg();
            case 5:
                return f136860e;
            case 6:
                C63010eb ebVar = f136861f;
                if (ebVar == null) {
                    synchronized (C52159hk.class) {
                        ebVar = f136861f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136860e);
                            f136861f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
