package com.google.knowledge.p4671b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4243a.C56141b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.ac */
/* compiled from: PG */
public final class C61784ac extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C61784ac f166887a;

    /* renamed from: e */
    private static volatile C63010eb f166888e;

    /* renamed from: b */
    private int f166889b;

    /* renamed from: c */
    private C56141b f166890c;

    /* renamed from: d */
    private byte f166891d = 2;

    static {
        C61784ac acVar = new C61784ac();
        f166887a = acVar;
        C62942bv.registerDefaultInstance(C61784ac.class, acVar);
    }

    private C61784ac() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166891d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166891d = b;
                return null;
            case 2:
                return newMessageInfo(f166887a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C61784ac();
            case 4:
                return new C61783ab();
            case 5:
                return f166887a;
            case 6:
                C63010eb ebVar = f166888e;
                if (ebVar == null) {
                    synchronized (C61784ac.class) {
                        ebVar = f166888e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166887a);
                            f166888e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
