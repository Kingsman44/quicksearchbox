package com.google.knowledge.p4661a.p4662a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.a.p */
/* compiled from: PG */
public final class C61754p extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C61754p f166816a;

    /* renamed from: c */
    private static volatile C63010eb f166817c;

    /* renamed from: b */
    private byte f166818b = 2;

    static {
        C61754p pVar = new C61754p();
        f166816a = pVar;
        C62942bv.registerDefaultInstance(C61754p.class, pVar);
    }

    private C61754p() {
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166818b);
            case 1:
                this.f166818b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f166816a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61754p();
            case 4:
                return new C61753o();
            case 5:
                return f166816a;
            case 6:
                C63010eb ebVar = f166817c;
                if (ebVar == null) {
                    synchronized (C61754p.class) {
                        ebVar = f166817c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166816a);
                            f166817c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
