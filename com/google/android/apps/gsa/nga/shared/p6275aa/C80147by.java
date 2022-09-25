package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.by */
/* compiled from: PG */
public final class C80147by extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80147by f219936c;

    /* renamed from: d */
    private static volatile C63010eb f219937d;

    /* renamed from: a */
    public int f219938a;

    /* renamed from: b */
    public String f219939b = BuildConfig.FLAVOR;

    static {
        C80147by byVar = new C80147by();
        f219936c = byVar;
        C62942bv.registerDefaultInstance(C80147by.class, byVar);
    }

    private C80147by() {
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
                return newMessageInfo(f219936c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80147by();
            case 4:
                return new C80146bx();
            case 5:
                return f219936c;
            case 6:
                C63010eb ebVar = f219937d;
                if (ebVar == null) {
                    synchronized (C80147by.class) {
                        ebVar = f219937d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219936c);
                            f219937d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
