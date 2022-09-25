package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130332g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.br */
/* compiled from: PG */
public final class C80140br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80140br f219924c;

    /* renamed from: d */
    private static volatile C63010eb f219925d;

    /* renamed from: a */
    public int f219926a;

    /* renamed from: b */
    public C130332g f219927b;

    static {
        C80140br brVar = new C80140br();
        f219924c = brVar;
        C62942bv.registerDefaultInstance(C80140br.class, brVar);
    }

    private C80140br() {
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
                return newMessageInfo(f219924c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80140br();
            case 4:
                return new C80139bq();
            case 5:
                return f219924c;
            case 6:
                C63010eb ebVar = f219925d;
                if (ebVar == null) {
                    synchronized (C80140br.class) {
                        ebVar = f219925d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219924c);
                            f219925d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
