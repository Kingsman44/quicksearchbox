package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.ar */
/* compiled from: PG */
public final class C80197ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80197ar f220024c;

    /* renamed from: d */
    private static volatile C63010eb f220025d;

    /* renamed from: a */
    public int f220026a;

    /* renamed from: b */
    public boolean f220027b;

    static {
        C80197ar arVar = new C80197ar();
        f220024c = arVar;
        C62942bv.registerDefaultInstance(C80197ar.class, arVar);
    }

    private C80197ar() {
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
                return newMessageInfo(f220024c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80197ar();
            case 4:
                return new C80196aq();
            case 5:
                return f220024c;
            case 6:
                C63010eb ebVar = f220025d;
                if (ebVar == null) {
                    synchronized (C80197ar.class) {
                        ebVar = f220025d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220024c);
                            f220025d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
