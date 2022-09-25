package com.google.android.apps.gsa.nga.engine.geniefm;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.geniefm.p */
/* compiled from: PG */
public final class C76110p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76110p f211005b;

    /* renamed from: d */
    private static volatile C63010eb f211006d;

    /* renamed from: a */
    public String f211007a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f211008c;

    static {
        C76110p pVar = new C76110p();
        f211005b = pVar;
        C62942bv.registerDefaultInstance(C76110p.class, pVar);
    }

    private C76110p() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f211005b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C76110p();
            case 4:
                return new C76109o();
            case 5:
                return f211005b;
            case 6:
                C63010eb ebVar = f211006d;
                if (ebVar == null) {
                    synchronized (C76110p.class) {
                        ebVar = f211006d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211005b);
                            f211006d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
