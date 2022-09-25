package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.apb */
/* compiled from: PG */
public final class apb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final apb f159548e;

    /* renamed from: f */
    private static volatile C63010eb f159549f;

    /* renamed from: a */
    public int f159550a;

    /* renamed from: b */
    public int f159551b;

    /* renamed from: c */
    public C62961ch f159552c = emptyIntList();

    /* renamed from: d */
    public long f159553d;

    static {
        apb apb = new apb();
        f159548e = apb;
        C62942bv.registerDefaultInstance(apb.class, apb);
    }

    private apb() {
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
                return newMessageInfo(f159548e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001d\u0003ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new apb();
            case 4:
                return new C59590apa();
            case 5:
                return f159548e;
            case 6:
                C63010eb ebVar = f159549f;
                if (ebVar == null) {
                    synchronized (apb.class) {
                        ebVar = f159549f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159548e);
                            f159549f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
