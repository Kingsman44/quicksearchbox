package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ag */
/* compiled from: PG */
public final class C62743ag extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62743ag f169464a;

    /* renamed from: c */
    private static volatile C63010eb f169465c;

    /* renamed from: b */
    private byte f169466b = 2;

    static {
        C62743ag agVar = new C62743ag();
        f169464a = agVar;
        C62942bv.registerDefaultInstance(C62743ag.class, agVar);
    }

    private C62743ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169466b);
            case 1:
                this.f169466b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169464a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62743ag();
            case 4:
                return new C62742af();
            case 5:
                return f169464a;
            case 6:
                C63010eb ebVar = f169465c;
                if (ebVar == null) {
                    synchronized (C62743ag.class) {
                        ebVar = f169465c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169464a);
                            f169465c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
