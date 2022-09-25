package com.google.android.apps.gsa.tasks;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.tasks.ar */
/* compiled from: PG */
public final class C118483ar extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C118483ar f328855e;

    /* renamed from: f */
    private static volatile C63010eb f328856f;

    /* renamed from: a */
    public int f328857a;

    /* renamed from: b */
    public C62995dn f328858b = C62995dn.f170057a;

    /* renamed from: c */
    public int f328859c;

    /* renamed from: d */
    public int f328860d;

    static {
        C118483ar arVar = new C118483ar();
        f328855e = arVar;
        C62942bv.registerDefaultInstance(C118483ar.class, arVar);
    }

    private C118483ar() {
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
                return newMessageInfo(f328855e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002င\u0000\u0003င\u0001", new Object[]{"a", "b", C118482aq.f328854a, C45240c.f118157a, "d"});
            case 3:
                return new C118483ar();
            case 4:
                return new C118481ap();
            case 5:
                return f328855e;
            case 6:
                C63010eb ebVar = f328856f;
                if (ebVar == null) {
                    synchronized (C118483ar.class) {
                        ebVar = f328856f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328855e);
                            f328856f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
