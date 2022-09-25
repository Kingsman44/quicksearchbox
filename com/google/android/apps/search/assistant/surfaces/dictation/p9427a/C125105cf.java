package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cf */
/* compiled from: PG */
public final class C125105cf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125105cf f345115b;

    /* renamed from: c */
    private static volatile C63010eb f345116c;

    /* renamed from: a */
    public af f345117a;

    static {
        C125105cf cfVar = new C125105cf();
        f345115b = cfVar;
        C62942bv.registerDefaultInstance(C125105cf.class, cfVar);
    }

    private C125105cf() {
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
                return newMessageInfo(f345115b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C125105cf();
            case 4:
                return new C125104ce();
            case 5:
                return f345115b;
            case 6:
                C63010eb ebVar = f345116c;
                if (ebVar == null) {
                    synchronized (C125105cf.class) {
                        ebVar = f345116c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345115b);
                            f345116c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
