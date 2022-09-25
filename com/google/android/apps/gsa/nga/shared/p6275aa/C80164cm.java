package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.cm */
/* compiled from: PG */
public final class C80164cm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80164cm f219971c;

    /* renamed from: e */
    private static volatile C63010eb f219972e;

    /* renamed from: a */
    public int f219973a;

    /* renamed from: b */
    public C80581o f219974b;

    /* renamed from: d */
    private byte f219975d = 2;

    static {
        C80164cm cmVar = new C80164cm();
        f219971c = cmVar;
        C62942bv.registerDefaultInstance(C80164cm.class, cmVar);
    }

    private C80164cm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219975d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219975d = b;
                return null;
            case 2:
                return newMessageInfo(f219971c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80164cm();
            case 4:
                return new C80163cl();
            case 5:
                return f219971c;
            case 6:
                C63010eb ebVar = f219972e;
                if (ebVar == null) {
                    synchronized (C80164cm.class) {
                        ebVar = f219972e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219971c);
                            f219972e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
