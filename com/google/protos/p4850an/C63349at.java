package com.google.protos.p4850an;

import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.at */
/* compiled from: PG */
public final class C63349at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63349at f171190c;

    /* renamed from: f */
    private static volatile C63010eb f171191f;

    /* renamed from: a */
    public int f171192a;

    /* renamed from: b */
    public C61748j f171193b;

    /* renamed from: d */
    private C61762x f171194d;

    /* renamed from: e */
    private byte f171195e = 2;

    static {
        C63349at atVar = new C63349at();
        f171190c = atVar;
        C62942bv.registerDefaultInstance(C63349at.class, atVar);
    }

    private C63349at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171195e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171195e = b;
                return null;
            case 2:
                return newMessageInfo(f171190c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "d"});
            case 3:
                return new C63349at();
            case 4:
                return new C63348as();
            case 5:
                return f171190c;
            case 6:
                C63010eb ebVar = f171191f;
                if (ebVar == null) {
                    synchronized (C63349at.class) {
                        ebVar = f171191f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171190c);
                            f171191f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
