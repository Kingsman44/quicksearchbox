package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.apps.gsa.nga.api.a.at;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.dc */
/* compiled from: PG */
public final class C125129dc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125129dc f345195c;

    /* renamed from: d */
    private static volatile C63010eb f345196d;

    /* renamed from: a */
    public bj f345197a;

    /* renamed from: b */
    public at f345198b;

    static {
        C125129dc dcVar = new C125129dc();
        f345195c = dcVar;
        C62942bv.registerDefaultInstance(C125129dc.class, dcVar);
    }

    private C125129dc() {
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
                return newMessageInfo(f345195c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C125129dc();
            case 4:
                return new C125128db();
            case 5:
                return f345195c;
            case 6:
                C63010eb ebVar = f345196d;
                if (ebVar == null) {
                    synchronized (C125129dc.class) {
                        ebVar = f345196d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345195c);
                            f345196d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
