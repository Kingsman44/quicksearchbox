package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49276av;
import com.google.assistant.p3825an.p3830c.p3831a.C49278ax;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ba */
/* compiled from: PG */
public final class C49843ba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49843ba f129533d;

    /* renamed from: e */
    private static volatile C63010eb f129534e;

    /* renamed from: a */
    public int f129535a;

    /* renamed from: b */
    public int f129536b;

    /* renamed from: c */
    public int f129537c;

    static {
        C49843ba baVar = new C49843ba();
        f129533d = baVar;
        C62942bv.registerDefaultInstance(C49843ba.class, baVar);
    }

    private C49843ba() {
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
                return newMessageInfo(f129533d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C49278ax.f127376a, C45240c.f118157a, C49276av.f127375a});
            case 3:
                return new C49843ba();
            case 4:
                return new C49841az();
            case 5:
                return f129533d;
            case 6:
                C63010eb ebVar = f129534e;
                if (ebVar == null) {
                    synchronized (C49843ba.class) {
                        ebVar = f129534e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129533d);
                            f129534e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
