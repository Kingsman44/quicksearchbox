package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.aj */
/* compiled from: PG */
public final class C80095aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80095aj f219794c;

    /* renamed from: d */
    private static volatile C63010eb f219795d;

    /* renamed from: a */
    public int f219796a;

    /* renamed from: b */
    public boolean f219797b;

    static {
        C80095aj ajVar = new C80095aj();
        f219794c = ajVar;
        C62942bv.registerDefaultInstance(C80095aj.class, ajVar);
    }

    private C80095aj() {
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
                return newMessageInfo(f219794c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80095aj();
            case 4:
                return new C80094ai();
            case 5:
                return f219794c;
            case 6:
                C63010eb ebVar = f219795d;
                if (ebVar == null) {
                    synchronized (C80095aj.class) {
                        ebVar = f219795d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219794c);
                            f219795d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
