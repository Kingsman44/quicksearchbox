package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.m */
/* compiled from: PG */
public final class C45575m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C45575m f119110b;

    /* renamed from: c */
    private static volatile C63010eb f119111c;

    /* renamed from: a */
    public String f119112a = BuildConfig.FLAVOR;

    static {
        C45575m mVar = new C45575m();
        f119110b = mVar;
        C62942bv.registerDefaultInstance(C45575m.class, mVar);
    }

    private C45575m() {
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
                return newMessageInfo(f119110b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C45575m();
            case 4:
                return new C45574l();
            case 5:
                return f119110b;
            case 6:
                C63010eb ebVar = f119111c;
                if (ebVar == null) {
                    synchronized (C45575m.class) {
                        ebVar = f119111c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119110b);
                            f119111c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
