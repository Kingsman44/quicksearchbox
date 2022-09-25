package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bp */
/* compiled from: PG */
public final class C80138bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80138bp f219920c;

    /* renamed from: d */
    private static volatile C63010eb f219921d;

    /* renamed from: a */
    public int f219922a;

    /* renamed from: b */
    public C63088z f219923b = C63088z.f170246b;

    static {
        C80138bp bpVar = new C80138bp();
        f219920c = bpVar;
        C62942bv.registerDefaultInstance(C80138bp.class, bpVar);
    }

    private C80138bp() {
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
                return newMessageInfo(f219920c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80138bp();
            case 4:
                return new C80137bo();
            case 5:
                return f219920c;
            case 6:
                C63010eb ebVar = f219921d;
                if (ebVar == null) {
                    synchronized (C80138bp.class) {
                        ebVar = f219921d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219920c);
                            f219921d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
