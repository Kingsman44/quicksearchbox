package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.ap */
/* compiled from: PG */
public final class C80101ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80101ap f219806c;

    /* renamed from: d */
    private static volatile C63010eb f219807d;

    /* renamed from: a */
    public int f219808a;

    /* renamed from: b */
    public String f219809b = BuildConfig.FLAVOR;

    static {
        C80101ap apVar = new C80101ap();
        f219806c = apVar;
        C62942bv.registerDefaultInstance(C80101ap.class, apVar);
    }

    private C80101ap() {
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
                return newMessageInfo(f219806c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80101ap();
            case 4:
                return new C80100ao();
            case 5:
                return f219806c;
            case 6:
                C63010eb ebVar = f219807d;
                if (ebVar == null) {
                    synchronized (C80101ap.class) {
                        ebVar = f219807d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219806c);
                            f219807d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
