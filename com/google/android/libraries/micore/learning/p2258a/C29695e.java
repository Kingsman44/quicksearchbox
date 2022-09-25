package com.google.android.libraries.micore.learning.p2258a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.micore.learning.a.e */
/* compiled from: PG */
public final class C29695e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C29695e f80425d;

    /* renamed from: e */
    private static volatile C63010eb f80426e;

    /* renamed from: a */
    public String f80427a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f80428b;

    /* renamed from: c */
    public C29703m f80429c;

    static {
        C29695e eVar = new C29695e();
        f80425d = eVar;
        C62942bv.registerDefaultInstance(C29695e.class, eVar);
    }

    private C29695e() {
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
                return newMessageInfo(f80425d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C29695e();
            case 4:
                return new C29694d();
            case 5:
                return f80425d;
            case 6:
                C63010eb ebVar = f80426e;
                if (ebVar == null) {
                    synchronized (C29695e.class) {
                        ebVar = f80426e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80425d);
                            f80426e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
