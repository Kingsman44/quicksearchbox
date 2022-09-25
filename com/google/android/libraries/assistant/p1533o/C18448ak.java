package com.google.android.libraries.assistant.p1533o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.ak */
/* compiled from: PG */
public final class C18448ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C18448ak f52353e;

    /* renamed from: f */
    private static volatile C63010eb f52354f;

    /* renamed from: a */
    public int f52355a;

    /* renamed from: b */
    public long f52356b;

    /* renamed from: c */
    public int f52357c;

    /* renamed from: d */
    public long f52358d;

    static {
        C18448ak akVar = new C18448ak();
        f52353e = akVar;
        C62942bv.registerDefaultInstance(C18448ak.class, akVar);
    }

    private C18448ak() {
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
                return newMessageInfo(f52353e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003ဂ\u0000", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C18448ak();
            case 4:
                return new C18446ai();
            case 5:
                return f52353e;
            case 6:
                C63010eb ebVar = f52354f;
                if (ebVar == null) {
                    synchronized (C18448ak.class) {
                        ebVar = f52354f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52353e);
                            f52354f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
