package com.google.android.apps.gsa.nowoverlayservice.p6423b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.b.n */
/* compiled from: PG */
public final class C83466n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83466n f227528d;

    /* renamed from: e */
    private static volatile C63010eb f227529e;

    /* renamed from: a */
    public int f227530a;

    /* renamed from: b */
    public String f227531b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f227532c;

    static {
        C83466n nVar = new C83466n();
        f227528d = nVar;
        C62942bv.registerDefaultInstance(C83466n.class, nVar);
    }

    private C83466n() {
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
                return newMessageInfo(f227528d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C83466n();
            case 4:
                return new C83465m();
            case 5:
                return f227528d;
            case 6:
                C63010eb ebVar = f227529e;
                if (ebVar == null) {
                    synchronized (C83466n.class) {
                        ebVar = f227529e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227528d);
                            f227529e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
