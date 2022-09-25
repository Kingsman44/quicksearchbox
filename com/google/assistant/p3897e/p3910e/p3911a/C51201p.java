package com.google.assistant.p3897e.p3910e.p3911a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4892au.C63830h;

/* renamed from: com.google.assistant.e.e.a.p */
/* compiled from: PG */
public final class C51201p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51201p f133290e;

    /* renamed from: g */
    private static volatile C63010eb f133291g;

    /* renamed from: a */
    public int f133292a;

    /* renamed from: b */
    public int f133293b;

    /* renamed from: c */
    public String f133294c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63830h f133295d;

    /* renamed from: f */
    private byte f133296f = 2;

    static {
        C51201p pVar = new C51201p();
        f133290e = pVar;
        C62942bv.registerDefaultInstance(C51201p.class, pVar);
    }

    private C51201p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133296f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133296f = b;
                return null;
            case 2:
                return newMessageInfo(f133290e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", C51199n.f133289a, C45240c.f118157a, "d"});
            case 3:
                return new C51201p();
            case 4:
                return new C51198m();
            case 5:
                return f133290e;
            case 6:
                C63010eb ebVar = f133291g;
                if (ebVar == null) {
                    synchronized (C51201p.class) {
                        ebVar = f133291g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133290e);
                            f133291g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
