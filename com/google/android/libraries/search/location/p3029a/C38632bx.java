package com.google.android.libraries.search.location.p3029a;

import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56738n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.location.a.bx */
/* compiled from: PG */
public final class C38632bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38632bx f102079c;

    /* renamed from: d */
    private static volatile C63010eb f102080d;

    /* renamed from: a */
    public int f102081a;

    /* renamed from: b */
    public int f102082b;

    static {
        C38632bx bxVar = new C38632bx();
        f102079c = bxVar;
        C62942bv.registerDefaultInstance(C38632bx.class, bxVar);
    }

    private C38632bx() {
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
                return newMessageInfo(f102079c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C56738n.f151430a});
            case 3:
                return new C38632bx();
            case 4:
                return new C38631bw();
            case 5:
                return f102079c;
            case 6:
                C63010eb ebVar = f102080d;
                if (ebVar == null) {
                    synchronized (C38632bx.class) {
                        ebVar = f102080d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f102079c);
                            f102080d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
