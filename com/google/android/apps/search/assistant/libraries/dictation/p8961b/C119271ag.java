package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.ag */
/* compiled from: PG */
public final class C119271ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119271ag f332613d;

    /* renamed from: e */
    private static volatile C63010eb f332614e;

    /* renamed from: a */
    public C64735n f332615a;

    /* renamed from: b */
    public int f332616b;

    /* renamed from: c */
    public int f332617c;

    static {
        C119271ag agVar = new C119271ag();
        f332613d = agVar;
        C62942bv.registerDefaultInstance(C119271ag.class, agVar);
    }

    private C119271ag() {
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
                return newMessageInfo(f332613d, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0000\u0000\u0001\t\u0006\f\u0007\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C119271ag();
            case 4:
                return new C119270af();
            case 5:
                return f332613d;
            case 6:
                C63010eb ebVar = f332614e;
                if (ebVar == null) {
                    synchronized (C119271ag.class) {
                        ebVar = f332614e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332613d);
                            f332614e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
