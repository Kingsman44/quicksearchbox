package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.d.l */
/* compiled from: PG */
public final class C127292l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127292l f350572c;

    /* renamed from: d */
    private static volatile C63010eb f350573d;

    /* renamed from: a */
    public int f350574a;

    /* renamed from: b */
    public C127287g f350575b;

    static {
        C127292l lVar = new C127292l();
        f350572c = lVar;
        C62942bv.registerDefaultInstance(C127292l.class, lVar);
    }

    private C127292l() {
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
                return newMessageInfo(f350572c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127292l();
            case 4:
                return new C127291k();
            case 5:
                return f350572c;
            case 6:
                C63010eb ebVar = f350573d;
                if (ebVar == null) {
                    synchronized (C127292l.class) {
                        ebVar = f350573d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350572c);
                            f350573d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
