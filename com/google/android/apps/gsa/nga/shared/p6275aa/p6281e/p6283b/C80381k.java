package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.k */
/* compiled from: PG */
public final class C80381k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80381k f220564b;

    /* renamed from: d */
    private static volatile C63010eb f220565d;

    /* renamed from: a */
    public C80375e f220566a;

    /* renamed from: c */
    private byte f220567c = 2;

    static {
        C80381k kVar = new C80381k();
        f220564b = kVar;
        C62942bv.registerDefaultInstance(C80381k.class, kVar);
    }

    private C80381k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220567c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f220567c = b;
                return null;
            case 2:
                return newMessageInfo(f220564b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C80381k();
            case 4:
                return new C80380j();
            case 5:
                return f220564b;
            case 6:
                C63010eb ebVar = f220565d;
                if (ebVar == null) {
                    synchronized (C80381k.class) {
                        ebVar = f220565d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220564b);
                            f220565d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
