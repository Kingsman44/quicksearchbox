package com.google.p4444cb.p4445a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cb.a.b */
/* compiled from: PG */
public final class C57930b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57930b f154943a;

    /* renamed from: e */
    private static volatile C63010eb f154944e;

    /* renamed from: b */
    private int f154945b;

    /* renamed from: c */
    private C61752n f154946c;

    /* renamed from: d */
    private byte f154947d = 2;

    static {
        C57930b bVar = new C57930b();
        f154943a = bVar;
        C62942bv.registerDefaultInstance(C57930b.class, bVar);
    }

    private C57930b() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154947d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154947d = b;
                return null;
            case 2:
                return newMessageInfo(f154943a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C57930b();
            case 4:
                return new C57929a();
            case 5:
                return f154943a;
            case 6:
                C63010eb ebVar = f154944e;
                if (ebVar == null) {
                    synchronized (C57930b.class) {
                        ebVar = f154944e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154943a);
                            f154944e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
