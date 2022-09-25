package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.o */
/* compiled from: PG */
public final class C62795o extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C62795o f169573a;

    /* renamed from: c */
    private static volatile C63010eb f169574c;

    /* renamed from: b */
    private byte f169575b = 2;

    static {
        C62795o oVar = new C62795o();
        f169573a = oVar;
        C62942bv.registerDefaultInstance(C62795o.class, oVar);
    }

    private C62795o() {
        emptyIntList();
        emptyIntList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169575b);
            case 1:
                this.f169575b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169573a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62795o();
            case 4:
                return new C62794n();
            case 5:
                return f169573a;
            case 6:
                C63010eb ebVar = f169574c;
                if (ebVar == null) {
                    synchronized (C62795o.class) {
                        ebVar = f169574c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169573a);
                            f169574c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
