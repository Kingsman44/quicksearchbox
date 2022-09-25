package com.google.android.libraries.search.assistant.performer.p2729b.p2730a;

import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.performer.b.a.l */
/* compiled from: PG */
public final class C35485l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C35485l f93191b;

    /* renamed from: c */
    private static volatile C63010eb f93192c;

    /* renamed from: a */
    public C62971cq f93193a = emptyProtobufList();

    static {
        C35485l lVar = new C35485l();
        f93191b = lVar;
        C62942bv.registerDefaultInstance(C35485l.class, lVar);
    }

    private C35485l() {
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
                return newMessageInfo(f93191b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52083ep.class});
            case 3:
                return new C35485l();
            case 4:
                return new C35484k();
            case 5:
                return f93191b;
            case 6:
                C63010eb ebVar = f93192c;
                if (ebVar == null) {
                    synchronized (C35485l.class) {
                        ebVar = f93192c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f93191b);
                            f93192c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
