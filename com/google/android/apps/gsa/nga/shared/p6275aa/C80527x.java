package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6284f.C80406b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.x */
/* compiled from: PG */
public final class C80527x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80527x f221059c;

    /* renamed from: e */
    private static volatile C63010eb f221060e;

    /* renamed from: a */
    public int f221061a;

    /* renamed from: b */
    public C80406b f221062b;

    /* renamed from: d */
    private byte f221063d = 2;

    static {
        C80527x xVar = new C80527x();
        f221059c = xVar;
        C62942bv.registerDefaultInstance(C80527x.class, xVar);
    }

    private C80527x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221063d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221063d = b;
                return null;
            case 2:
                return newMessageInfo(f221059c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80527x();
            case 4:
                return new C80526w();
            case 5:
                return f221059c;
            case 6:
                C63010eb ebVar = f221060e;
                if (ebVar == null) {
                    synchronized (C80527x.class) {
                        ebVar = f221060e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221059c);
                            f221060e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
