package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.av */
/* compiled from: PG */
public final class C45551av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45551av f119046c;

    /* renamed from: d */
    private static volatile C63010eb f119047d;

    /* renamed from: a */
    public int f119048a;

    /* renamed from: b */
    public String f119049b = BuildConfig.FLAVOR;

    static {
        C45551av avVar = new C45551av();
        f119046c = avVar;
        C62942bv.registerDefaultInstance(C45551av.class, avVar);
    }

    private C45551av() {
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
                return newMessageInfo(f119046c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C45551av();
            case 4:
                return new C45550au();
            case 5:
                return f119046c;
            case 6:
                C63010eb ebVar = f119047d;
                if (ebVar == null) {
                    synchronized (C45551av.class) {
                        ebVar = f119047d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119046c);
                            f119047d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
