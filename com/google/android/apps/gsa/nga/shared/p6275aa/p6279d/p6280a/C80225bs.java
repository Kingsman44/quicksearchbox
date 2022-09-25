package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bs */
/* compiled from: PG */
public final class C80225bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80225bs f220102c;

    /* renamed from: d */
    private static volatile C63010eb f220103d;

    /* renamed from: a */
    public int f220104a;

    /* renamed from: b */
    public String f220105b = BuildConfig.FLAVOR;

    static {
        C80225bs bsVar = new C80225bs();
        f220102c = bsVar;
        C62942bv.registerDefaultInstance(C80225bs.class, bsVar);
    }

    private C80225bs() {
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
                return newMessageInfo(f220102c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80225bs();
            case 4:
                return new C80224br();
            case 5:
                return f220102c;
            case 6:
                C63010eb ebVar = f220103d;
                if (ebVar == null) {
                    synchronized (C80225bs.class) {
                        ebVar = f220103d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220102c);
                            f220103d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
