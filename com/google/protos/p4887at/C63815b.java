package com.google.protos.p4887at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.at.b */
/* compiled from: PG */
public final class C63815b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63815b f172592a;

    /* renamed from: c */
    private static volatile C63010eb f172593c;

    /* renamed from: b */
    private byte f172594b = 2;

    static {
        C63815b bVar = new C63815b();
        f172592a = bVar;
        C62942bv.registerDefaultInstance(C63815b.class, bVar);
    }

    private C63815b() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172594b);
            case 1:
                this.f172594b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f172592a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63815b();
            case 4:
                return new C63796a();
            case 5:
                return f172592a;
            case 6:
                C63010eb ebVar = f172593c;
                if (ebVar == null) {
                    synchronized (C63815b.class) {
                        ebVar = f172593c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172592a);
                            f172593c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
