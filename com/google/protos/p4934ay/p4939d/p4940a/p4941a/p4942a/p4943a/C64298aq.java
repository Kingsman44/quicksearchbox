package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.aq */
/* compiled from: PG */
public final class C64298aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64298aq f173843d;

    /* renamed from: g */
    private static volatile C63010eb f173844g;

    /* renamed from: a */
    public int f173845a;

    /* renamed from: b */
    public int f173846b;

    /* renamed from: c */
    public String f173847c = "en-US";

    /* renamed from: e */
    private C64342r f173848e;

    /* renamed from: f */
    private byte f173849f = 2;

    static {
        C64298aq aqVar = new C64298aq();
        f173843d = aqVar;
        C62942bv.registerDefaultInstance(C64298aq.class, aqVar);
    }

    private C64298aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173849f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173849f = b;
                return null;
            case 2:
                return newMessageInfo(f173843d, "\u0001\u0003\u0000\u0001\u0003\t\u0003\u0000\u0000\u0001\u0003ဌ\u0002\u0005ဈ\u0003\tᐉ\u0004", new Object[]{"a", "b", C64297ap.f173842a, C45240c.f118157a, "e"});
            case 3:
                return new C64298aq();
            case 4:
                return new C64296ao();
            case 5:
                return f173843d;
            case 6:
                C63010eb ebVar = f173844g;
                if (ebVar == null) {
                    synchronized (C64298aq.class) {
                        ebVar = f173844g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173843d);
                            f173844g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
