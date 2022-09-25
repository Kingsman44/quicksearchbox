package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.ai */
/* compiled from: PG */
public final class C63895ai extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63895ai f172768f;

    /* renamed from: g */
    private static volatile C63010eb f172769g;

    /* renamed from: a */
    public int f172770a;

    /* renamed from: b */
    public C63887aa f172771b;

    /* renamed from: c */
    public C62910ar f172772c;

    /* renamed from: d */
    public C62995dn f172773d = C62995dn.f170057a;

    /* renamed from: e */
    public C62995dn f172774e = C62995dn.f170057a;

    static {
        C63895ai aiVar = new C63895ai();
        f172768f = aiVar;
        C62942bv.registerDefaultInstance(C63895ai.class, aiVar);
    }

    private C63895ai() {
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
                return newMessageInfo(f172768f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0002\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u00032\u00042", new Object[]{"a", "b", C45240c.f118157a, "d", C63894ah.f172767a, "e", C63891ae.f172761a});
            case 3:
                return new C63895ai();
            case 4:
                return new C63888ab();
            case 5:
                return f172768f;
            case 6:
                C63010eb ebVar = f172769g;
                if (ebVar == null) {
                    synchronized (C63895ai.class) {
                        ebVar = f172769g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172768f);
                            f172769g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
