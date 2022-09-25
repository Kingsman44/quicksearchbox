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

/* renamed from: com.google.android.libraries.search.n.bp */
/* compiled from: PG */
public final class C39367bp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C39367bp f103676a;

    /* renamed from: b */
    public static final C62940bt f103677b;

    /* renamed from: c */
    private static volatile C63010eb f103678c;

    static {
        C39367bp bpVar = new C39367bp();
        f103676a = bpVar;
        C62942bv.registerDefaultInstance(C39367bp.class, bpVar);
        f103677b = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, bpVar, bpVar, (C62958ce) null, 429124914, C63066gd.MESSAGE, C39367bp.class);
    }

    private C39367bp() {
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
                return newMessageInfo(f103676a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C39367bp();
            case 4:
                return new C39366bo();
            case 5:
                return f103676a;
            case 6:
                C63010eb ebVar = f103678c;
                if (ebVar == null) {
                    synchronized (C39367bp.class) {
                        ebVar = f103678c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103676a);
                            f103678c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
