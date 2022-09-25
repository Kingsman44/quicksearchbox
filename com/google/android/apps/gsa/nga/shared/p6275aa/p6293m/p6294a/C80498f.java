package com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.m.a.f */
/* compiled from: PG */
public final class C80498f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80498f f220974e;

    /* renamed from: f */
    private static volatile C63010eb f220975f;

    /* renamed from: a */
    public boolean f220976a;

    /* renamed from: b */
    public String f220977b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f220978c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f220979d = BuildConfig.FLAVOR;

    static {
        C80498f fVar = new C80498f();
        f220974e = fVar;
        C62942bv.registerDefaultInstance(C80498f.class, fVar);
    }

    private C80498f() {
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
                return newMessageInfo(f220974e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80498f();
            case 4:
                return new C80497e();
            case 5:
                return f220974e;
            case 6:
                C63010eb ebVar = f220975f;
                if (ebVar == null) {
                    synchronized (C80498f.class) {
                        ebVar = f220975f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220974e);
                            f220975f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
