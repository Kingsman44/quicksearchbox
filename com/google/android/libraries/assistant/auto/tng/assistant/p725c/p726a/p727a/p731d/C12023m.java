package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d;

import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.d.m */
/* compiled from: PG */
public final class C12023m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12023m f38551c;

    /* renamed from: d */
    private static volatile C63010eb f38552d;

    /* renamed from: a */
    public int f38553a = 0;

    /* renamed from: b */
    public Object f38554b;

    static {
        C12023m mVar = new C12023m();
        f38551c = mVar;
        C62942bv.registerDefaultInstance(C12023m.class, mVar);
    }

    private C12023m() {
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
                return newMessageInfo(f38551c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C37416bu.class, C37819l.class});
            case 3:
                return new C12023m();
            case 4:
                return new C12022l();
            case 5:
                return f38551c;
            case 6:
                C63010eb ebVar = f38552d;
                if (ebVar == null) {
                    synchronized (C12023m.class) {
                        ebVar = f38552d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38551c);
                            f38552d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
