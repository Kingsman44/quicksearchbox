package com.google.android.libraries.lens.view.p2069am;

import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.aj */
/* compiled from: PG */
public final class C25302aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25302aj f68817c;

    /* renamed from: d */
    private static volatile C63010eb f68818d;

    /* renamed from: a */
    public C24195n f68819a;

    /* renamed from: b */
    public int f68820b;

    static {
        C25302aj ajVar = new C25302aj();
        f68817c = ajVar;
        C62942bv.registerDefaultInstance(C25302aj.class, ajVar);
    }

    private C25302aj() {
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
                return newMessageInfo(f68817c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C25302aj();
            case 4:
                return new C25301ai();
            case 5:
                return f68817c;
            case 6:
                C63010eb ebVar = f68818d;
                if (ebVar == null) {
                    synchronized (C25302aj.class) {
                        ebVar = f68818d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68817c);
                            f68818d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
