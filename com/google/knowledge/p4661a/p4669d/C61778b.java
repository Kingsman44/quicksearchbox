package com.google.knowledge.p4661a.p4669d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.d.b */
/* compiled from: PG */
public final class C61778b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C61778b f166872a;

    /* renamed from: c */
    private static volatile C63010eb f166873c;

    /* renamed from: b */
    private byte f166874b = 2;

    static {
        C61778b bVar = new C61778b();
        f166872a = bVar;
        C62942bv.registerDefaultInstance(C61778b.class, bVar);
    }

    private C61778b() {
        emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166874b);
            case 1:
                this.f166874b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f166872a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61778b();
            case 4:
                return new C61777a();
            case 5:
                return f166872a;
            case 6:
                C63010eb ebVar = f166873c;
                if (ebVar == null) {
                    synchronized (C61778b.class) {
                        ebVar = f166873c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166872a);
                            f166873c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
