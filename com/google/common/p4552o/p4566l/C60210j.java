package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.j */
/* compiled from: PG */
public final class C60210j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60210j f162905c;

    /* renamed from: d */
    private static volatile C63010eb f162906d;

    /* renamed from: a */
    public int f162907a;

    /* renamed from: b */
    public String f162908b = BuildConfig.FLAVOR;

    static {
        C60210j jVar = new C60210j();
        f162905c = jVar;
        C62942bv.registerDefaultInstance(C60210j.class, jVar);
    }

    private C60210j() {
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
                return newMessageInfo(f162905c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60210j();
            case 4:
                return new C60209i();
            case 5:
                return f162905c;
            case 6:
                C63010eb ebVar = f162906d;
                if (ebVar == null) {
                    synchronized (C60210j.class) {
                        ebVar = f162906d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162905c);
                            f162906d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
