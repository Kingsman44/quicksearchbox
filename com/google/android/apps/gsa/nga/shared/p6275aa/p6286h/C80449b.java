package com.google.android.apps.gsa.nga.shared.p6275aa.p6286h;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.h.b */
/* compiled from: PG */
public final class C80449b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80449b f220808c;

    /* renamed from: e */
    private static volatile C63010eb f220809e;

    /* renamed from: a */
    public int f220810a = 0;

    /* renamed from: b */
    public Object f220811b;

    /* renamed from: d */
    private byte f220812d = 2;

    static {
        C80449b bVar = new C80449b();
        f220808c = bVar;
        C62942bv.registerDefaultInstance(C80449b.class, bVar);
    }

    private C80449b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220812d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220812d = b;
                return null;
            case 2:
                return newMessageInfo(f220808c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဳ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C80047aa.class});
            case 3:
                return new C80449b();
            case 4:
                return new C80448a();
            case 5:
                return f220808c;
            case 6:
                C63010eb ebVar = f220809e;
                if (ebVar == null) {
                    synchronized (C80449b.class) {
                        ebVar = f220809e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220808c);
                            f220809e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
