package com.google.frameworks.client.p4624a.p4629b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.a.b.n */
/* compiled from: PG */
public final class C61317n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61317n f165832d;

    /* renamed from: e */
    private static volatile C63010eb f165833e;

    /* renamed from: a */
    public int f165834a;

    /* renamed from: b */
    public int f165835b;

    /* renamed from: c */
    public String f165836c = BuildConfig.FLAVOR;

    static {
        C61317n nVar = new C61317n();
        f165832d = nVar;
        C62942bv.registerDefaultInstance(C61317n.class, nVar);
    }

    private C61317n() {
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
                return newMessageInfo(f165832d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61317n();
            case 4:
                return new C61316m();
            case 5:
                return f165832d;
            case 6:
                C63010eb ebVar = f165833e;
                if (ebVar == null) {
                    synchronized (C61317n.class) {
                        ebVar = f165833e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165832d);
                            f165833e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
