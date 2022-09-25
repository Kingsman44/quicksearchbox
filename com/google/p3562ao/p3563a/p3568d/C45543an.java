package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.an */
/* compiled from: PG */
public final class C45543an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C45543an f119027b;

    /* renamed from: c */
    private static volatile C63010eb f119028c;

    /* renamed from: a */
    public String f119029a = BuildConfig.FLAVOR;

    static {
        C45543an anVar = new C45543an();
        f119027b = anVar;
        C62942bv.registerDefaultInstance(C45543an.class, anVar);
    }

    private C45543an() {
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
                return newMessageInfo(f119027b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C45543an();
            case 4:
                return new C45542am();
            case 5:
                return f119027b;
            case 6:
                C63010eb ebVar = f119028c;
                if (ebVar == null) {
                    synchronized (C45543an.class) {
                        ebVar = f119028c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119027b);
                            f119028c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
