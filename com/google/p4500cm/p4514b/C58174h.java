package com.google.p4500cm.p4514b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.b.h */
/* compiled from: PG */
public final class C58174h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C58174h f155525d;

    /* renamed from: e */
    private static volatile C63010eb f155526e;

    /* renamed from: a */
    public int f155527a;

    /* renamed from: b */
    public String f155528b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f155529c = BuildConfig.FLAVOR;

    static {
        C58174h hVar = new C58174h();
        f155525d = hVar;
        C62942bv.registerDefaultInstance(C58174h.class, hVar);
    }

    private C58174h() {
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
                return newMessageInfo(f155525d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C58174h();
            case 4:
                return new C58173g();
            case 5:
                return f155525d;
            case 6:
                C63010eb ebVar = f155526e;
                if (ebVar == null) {
                    synchronized (C58174h.class) {
                        ebVar = f155526e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155525d);
                            f155526e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
