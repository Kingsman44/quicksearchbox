package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.at */
/* compiled from: PG */
public final class C64571at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64571at f175074c;

    /* renamed from: d */
    private static volatile C63010eb f175075d;

    /* renamed from: a */
    public int f175076a = 0;

    /* renamed from: b */
    public Object f175077b;

    static {
        C64571at atVar = new C64571at();
        f175074c = atVar;
        C62942bv.registerDefaultInstance(C64571at.class, atVar);
    }

    private C64571at() {
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
                return newMessageInfo(f175074c, "\u0001\u0012\u0001\u0000\u0001\u0012\u0012\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000", new Object[]{"b", "a", C64562ak.class, C64564am.class, C64560ai.class, C64554ac.class, C64566ao.class, C64612q.class, C64568aq.class, C64610o.class, C64608m.class, C64558ag.class, C64556ae.class, C64620y.class, C64605j.class, C64618w.class, C64616u.class, C64570as.class, C64552aa.class, C64614s.class});
            case 3:
                return new C64571at();
            case 4:
                return new C64606k();
            case 5:
                return f175074c;
            case 6:
                C63010eb ebVar = f175075d;
                if (ebVar == null) {
                    synchronized (C64571at.class) {
                        ebVar = f175075d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175074c);
                            f175075d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
