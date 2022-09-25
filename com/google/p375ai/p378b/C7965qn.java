package com.google.p375ai.p378b;

import com.google.p4152bb.p4153a.C55349pb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.qn */
/* compiled from: PG */
public final class C7965qn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7965qn f27982c;

    /* renamed from: e */
    private static volatile C63010eb f27983e;

    /* renamed from: a */
    public int f27984a = 0;

    /* renamed from: b */
    public Object f27985b;

    /* renamed from: d */
    private byte f27986d = 2;

    static {
        C7965qn qnVar = new C7965qn();
        f27982c = qnVar;
        C62942bv.registerDefaultInstance(C7965qn.class, qnVar);
    }

    private C7965qn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27986d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27986d = b;
                return null;
            case 2:
                return newMessageInfo(f27982c, "\u0001\u0001\u0001\u0000\u000b\u000b\u0001\u0000\u0000\u0001\u000bᐼ\u0000", new Object[]{"b", "a", C55349pb.class});
            case 3:
                return new C7965qn();
            case 4:
                return new C7964qm();
            case 5:
                return f27982c;
            case 6:
                C63010eb ebVar = f27983e;
                if (ebVar == null) {
                    synchronized (C7965qn.class) {
                        ebVar = f27983e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27982c);
                            f27983e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
