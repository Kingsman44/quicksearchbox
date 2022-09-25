package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.ag */
/* compiled from: PG */
public final class C53682ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53682ag f140907c;

    /* renamed from: d */
    private static volatile C63010eb f140908d;

    /* renamed from: a */
    public int f140909a;

    /* renamed from: b */
    public C53738w f140910b;

    static {
        C53682ag agVar = new C53682ag();
        f140907c = agVar;
        C62942bv.registerDefaultInstance(C53682ag.class, agVar);
    }

    private C53682ag() {
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
                return newMessageInfo(f140907c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53682ag();
            case 4:
                return new C53681af();
            case 5:
                return f140907c;
            case 6:
                C63010eb ebVar = f140908d;
                if (ebVar == null) {
                    synchronized (C53682ag.class) {
                        ebVar = f140908d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140907c);
                            f140908d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
