package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.ab */
/* compiled from: PG */
public final class C64283ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64283ab f173811b;

    /* renamed from: d */
    private static volatile C63010eb f173812d;

    /* renamed from: a */
    public String f173813a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f173814c;

    static {
        C64283ab abVar = new C64283ab();
        f173811b = abVar;
        C62942bv.registerDefaultInstance(C64283ab.class, abVar);
    }

    private C64283ab() {
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
                return newMessageInfo(f173811b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C64283ab();
            case 4:
                return new C64282aa();
            case 5:
                return f173811b;
            case 6:
                C63010eb ebVar = f173812d;
                if (ebVar == null) {
                    synchronized (C64283ab.class) {
                        ebVar = f173812d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173811b);
                            f173812d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
