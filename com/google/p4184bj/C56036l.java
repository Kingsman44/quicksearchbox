package com.google.p4184bj;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.l */
/* compiled from: PG */
public final class C56036l extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C56036l f149228f;

    /* renamed from: h */
    private static volatile C63010eb f149229h;

    /* renamed from: a */
    public int f149230a;

    /* renamed from: b */
    public C62971cq f149231b = emptyProtobufList();

    /* renamed from: c */
    public C56034j f149232c;

    /* renamed from: d */
    public boolean f149233d;

    /* renamed from: e */
    public int f149234e;

    /* renamed from: g */
    private byte f149235g = 2;

    static {
        C56036l lVar = new C56036l();
        f149228f = lVar;
        C62942bv.registerDefaultInstance(C56036l.class, lVar);
    }

    private C56036l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149235g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149235g = b;
                return null;
            case 2:
                return newMessageInfo(f149228f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004ဇ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", C56034j.class, C45240c.f118157a, "d", "e", C56035k.f149227a});
            case 3:
                return new C56036l();
            case 4:
                return new C56032h();
            case 5:
                return f149228f;
            case 6:
                C63010eb ebVar = f149229h;
                if (ebVar == null) {
                    synchronized (C56036l.class) {
                        ebVar = f149229h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149228f);
                            f149229h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
