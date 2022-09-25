package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hn */
/* compiled from: PG */
public final class C82979hn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82979hn f226378c;

    /* renamed from: d */
    private static volatile C63010eb f226379d;

    /* renamed from: a */
    public int f226380a;

    /* renamed from: b */
    public long f226381b;

    static {
        C82979hn hnVar = new C82979hn();
        f226378c = hnVar;
        C62942bv.registerDefaultInstance(C82979hn.class, hnVar);
    }

    private C82979hn() {
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
                return newMessageInfo(f226378c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C82979hn();
            case 4:
                return new C82978hm();
            case 5:
                return f226378c;
            case 6:
                C63010eb ebVar = f226379d;
                if (ebVar == null) {
                    synchronized (C82979hn.class) {
                        ebVar = f226379d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226378c);
                            f226379d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
