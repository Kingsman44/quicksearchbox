package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.w */
/* compiled from: PG */
public final class C45585w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C45585w f119130b;

    /* renamed from: c */
    private static volatile C63010eb f119131c;

    /* renamed from: a */
    public String f119132a = BuildConfig.FLAVOR;

    static {
        C45585w wVar = new C45585w();
        f119130b = wVar;
        C62942bv.registerDefaultInstance(C45585w.class, wVar);
    }

    private C45585w() {
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
                return newMessageInfo(f119130b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"a"});
            case 3:
                return new C45585w();
            case 4:
                return new C45584v();
            case 5:
                return f119130b;
            case 6:
                C63010eb ebVar = f119131c;
                if (ebVar == null) {
                    synchronized (C45585w.class) {
                        ebVar = f119131c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119130b);
                            f119131c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
