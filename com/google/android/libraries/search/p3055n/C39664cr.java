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

/* renamed from: com.google.android.libraries.search.n.cr */
/* compiled from: PG */
public final class C39664cr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39664cr f104410c;

    /* renamed from: d */
    public static final C62940bt f104411d;

    /* renamed from: e */
    private static volatile C63010eb f104412e;

    /* renamed from: a */
    public int f104413a;

    /* renamed from: b */
    public int f104414b;

    static {
        C39664cr crVar = new C39664cr();
        f104410c = crVar;
        C62942bv.registerDefaultInstance(C39664cr.class, crVar);
        f104411d = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, crVar, crVar, (C62958ce) null, 413019265, C63066gd.MESSAGE, C39664cr.class);
    }

    private C39664cr() {
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
                return newMessageInfo(f104410c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C39663cq.f104409a});
            case 3:
                return new C39664cr();
            case 4:
                return new C39662cp();
            case 5:
                return f104410c;
            case 6:
                C63010eb ebVar = f104412e;
                if (ebVar == null) {
                    synchronized (C39664cr.class) {
                        ebVar = f104412e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104410c);
                            f104412e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
