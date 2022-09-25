package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.by */
/* compiled from: PG */
public final class C8751by extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8751by f30102d;

    /* renamed from: e */
    private static volatile C63010eb f30103e;

    /* renamed from: a */
    public int f30104a;

    /* renamed from: b */
    public String f30105b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f30106c = BuildConfig.FLAVOR;

    static {
        C8751by byVar = new C8751by();
        f30102d = byVar;
        C62942bv.registerDefaultInstance(C8751by.class, byVar);
    }

    private C8751by() {
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
                return newMessageInfo(f30102d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8751by();
            case 4:
                return new C8749bw();
            case 5:
                return f30102d;
            case 6:
                C63010eb ebVar = f30103e;
                if (ebVar == null) {
                    synchronized (C8751by.class) {
                        ebVar = f30103e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30102d);
                            f30103e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
