package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.br */
/* compiled from: PG */
public final class C39369br extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C39369br f103679a;

    /* renamed from: b */
    public static final C62940bt f103680b;

    /* renamed from: c */
    private static volatile C63010eb f103681c;

    static {
        C39369br brVar = new C39369br();
        f103679a = brVar;
        C62942bv.registerDefaultInstance(C39369br.class, brVar);
        f103680b = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, brVar, brVar, (C62958ce) null, 429124913, C63066gd.MESSAGE, C39369br.class);
    }

    private C39369br() {
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
                return newMessageInfo(f103679a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C39369br();
            case 4:
                return new C39368bq();
            case 5:
                return f103679a;
            case 6:
                C63010eb ebVar = f103681c;
                if (ebVar == null) {
                    synchronized (C39369br.class) {
                        ebVar = f103681c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103679a);
                            f103681c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
