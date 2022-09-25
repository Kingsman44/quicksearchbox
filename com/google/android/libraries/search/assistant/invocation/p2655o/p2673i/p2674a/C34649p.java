package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.p */
/* compiled from: PG */
public final class C34649p extends C62942bv implements C34651r {

    /* renamed from: c */
    public static final C34649p f91995c;

    /* renamed from: d */
    public static final C62940bt f91996d;

    /* renamed from: e */
    private static volatile C63010eb f91997e;

    /* renamed from: a */
    public int f91998a;

    /* renamed from: b */
    public C39260aj f91999b;

    static {
        C34649p pVar = new C34649p();
        f91995c = pVar;
        C62942bv.registerDefaultInstance(C34649p.class, pVar);
        f91996d = C62942bv.newSingularGeneratedExtension(C34697g.f92115a, pVar, pVar, (C62958ce) null, 4, C63066gd.MESSAGE, C34649p.class);
    }

    private C34649p() {
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
                return newMessageInfo(f91995c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C34649p();
            case 4:
                return new C34648o();
            case 5:
                return f91995c;
            case 6:
                C63010eb ebVar = f91997e;
                if (ebVar == null) {
                    synchronized (C34649p.class) {
                        ebVar = f91997e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91995c);
                            f91997e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
