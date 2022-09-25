package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ef */
/* compiled from: PG */
public final class C80758ef extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80758ef f221662e;

    /* renamed from: f */
    private static volatile C63010eb f221663f;

    /* renamed from: a */
    public int f221664a;

    /* renamed from: b */
    public String f221665b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f221666c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f221667d = BuildConfig.FLAVOR;

    static {
        C80758ef efVar = new C80758ef();
        f221662e = efVar;
        C62942bv.registerDefaultInstance(C80758ef.class, efVar);
    }

    private C80758ef() {
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
                return newMessageInfo(f221662e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80758ef();
            case 4:
                return new C80757ee();
            case 5:
                return f221662e;
            case 6:
                C63010eb ebVar = f221663f;
                if (ebVar == null) {
                    synchronized (C80758ef.class) {
                        ebVar = f221663f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221662e);
                            f221663f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
