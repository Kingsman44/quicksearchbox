package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ba */
/* compiled from: PG */
public final class C59477ba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59477ba f157803d;

    /* renamed from: e */
    private static volatile C63010eb f157804e;

    /* renamed from: a */
    public int f157805a;

    /* renamed from: b */
    public int f157806b;

    /* renamed from: c */
    public String f157807c = BuildConfig.FLAVOR;

    static {
        C59477ba baVar = new C59477ba();
        f157803d = baVar;
        C62942bv.registerDefaultInstance(C59477ba.class, baVar);
    }

    private C59477ba() {
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
                return newMessageInfo(f157803d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C59475az.f157796a, C45240c.f118157a});
            case 3:
                return new C59477ba();
            case 4:
                return new C59474ay();
            case 5:
                return f157803d;
            case 6:
                C63010eb ebVar = f157804e;
                if (ebVar == null) {
                    synchronized (C59477ba.class) {
                        ebVar = f157804e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157803d);
                            f157804e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
