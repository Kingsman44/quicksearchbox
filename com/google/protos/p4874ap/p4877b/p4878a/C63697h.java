package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.p4184bj.p4204d.p4205a.p4206a.C56007b;
import com.google.p4184bj.p4204d.p4205a.p4207b.C56010b;
import com.google.p4184bj.p4204d.p4205a.p4208c.C56014c;
import com.google.p4184bj.p4204d.p4205a.p4210e.C56022f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.b.a.h */
/* compiled from: PG */
public final class C63697h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63697h f172217c;

    /* renamed from: d */
    private static volatile C63010eb f172218d;

    /* renamed from: a */
    public int f172219a = 0;

    /* renamed from: b */
    public Object f172220b;

    static {
        C63697h hVar = new C63697h();
        f172217c = hVar;
        C62942bv.registerDefaultInstance(C63697h.class, hVar);
    }

    private C63697h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f172217c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C56022f.class, C56010b.class, C56014c.class, C56007b.class});
            case 3:
                return new C63697h();
            case 4:
                return new C63696g();
            case 5:
                return f172217c;
            case 6:
                C63010eb ebVar = f172218d;
                if (ebVar == null) {
                    synchronized (C63697h.class) {
                        ebVar = f172218d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172217c);
                            f172218d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
