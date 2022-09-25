package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bp */
/* compiled from: PG */
public final class C80321bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80321bp f220412c;

    /* renamed from: d */
    private static volatile C63010eb f220413d;

    /* renamed from: a */
    public int f220414a = 0;

    /* renamed from: b */
    public Object f220415b;

    static {
        C80321bp bpVar = new C80321bp();
        f220412c = bpVar;
        C62942bv.registerDefaultInstance(C80321bp.class, bpVar);
    }

    private C80321bp() {
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
                return newMessageInfo(f220412c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u00025\u0000", new Object[]{"b", "a"});
            case 3:
                return new C80321bp();
            case 4:
                return new C80320bo();
            case 5:
                return f220412c;
            case 6:
                C63010eb ebVar = f220413d;
                if (ebVar == null) {
                    synchronized (C80321bp.class) {
                        ebVar = f220413d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220412c);
                            f220413d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
