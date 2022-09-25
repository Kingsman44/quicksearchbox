package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.at */
/* compiled from: PG */
public final class C38237at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38237at f101333c;

    /* renamed from: d */
    private static volatile C63010eb f101334d;

    /* renamed from: a */
    public int f101335a = 0;

    /* renamed from: b */
    public Object f101336b;

    static {
        C38237at atVar = new C38237at();
        f101333c = atVar;
        C62942bv.registerDefaultInstance(C38237at.class, atVar);
    }

    private C38237at() {
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
                return newMessageInfo(f101333c, "\u0001\u0004\u0001\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C38229al.class, C37397bb.class, C37418bw.class, C37819l.class});
            case 3:
                return new C38237at();
            case 4:
                return new C38236as();
            case 5:
                return f101333c;
            case 6:
                C63010eb ebVar = f101334d;
                if (ebVar == null) {
                    synchronized (C38237at.class) {
                        ebVar = f101334d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101333c);
                            f101334d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
