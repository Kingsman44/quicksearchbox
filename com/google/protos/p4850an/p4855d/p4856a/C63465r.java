package com.google.protos.p4850an.p4855d.p4856a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.a.r */
/* compiled from: PG */
public final class C63465r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63465r f171513c;

    /* renamed from: d */
    private static volatile C63010eb f171514d;

    /* renamed from: a */
    public int f171515a;

    /* renamed from: b */
    public String f171516b = BuildConfig.FLAVOR;

    static {
        C63465r rVar = new C63465r();
        f171513c = rVar;
        C62942bv.registerDefaultInstance(C63465r.class, rVar);
    }

    private C63465r() {
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
                return newMessageInfo(f171513c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63465r();
            case 4:
                return new C63464q();
            case 5:
                return f171513c;
            case 6:
                C63010eb ebVar = f171514d;
                if (ebVar == null) {
                    synchronized (C63465r.class) {
                        ebVar = f171514d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171513c);
                            f171514d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
