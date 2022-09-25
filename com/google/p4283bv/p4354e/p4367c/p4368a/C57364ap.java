package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ap */
/* compiled from: PG */
public final class C57364ap extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C57364ap f153246c;

    /* renamed from: e */
    private static volatile C63010eb f153247e;

    /* renamed from: a */
    public int f153248a = 0;

    /* renamed from: b */
    public Object f153249b;

    /* renamed from: d */
    private byte f153250d = 2;

    static {
        C57364ap apVar = new C57364ap();
        f153246c = apVar;
        C62942bv.registerDefaultInstance(C57364ap.class, apVar);
    }

    private C57364ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153250d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153250d = b;
                return null;
            case 2:
                return newMessageInfo(f153246c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0001\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", C57509q.class, C57366ar.class});
            case 3:
                return new C57364ap();
            case 4:
                return new C57363ao();
            case 5:
                return f153246c;
            case 6:
                C63010eb ebVar = f153247e;
                if (ebVar == null) {
                    synchronized (C57364ap.class) {
                        ebVar = f153247e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153246c);
                            f153247e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
