package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.o */
/* compiled from: PG */
public final class C128114o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f352490b = new C128112m();

    /* renamed from: c */
    public static final C128114o f352491c;

    /* renamed from: d */
    private static volatile C63010eb f352492d;

    /* renamed from: a */
    public C62961ch f352493a = emptyIntList();

    static {
        C128114o oVar = new C128114o();
        f352491c = oVar;
        C62942bv.registerDefaultInstance(C128114o.class, oVar);
    }

    private C128114o() {
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
                return newMessageInfo(f352491c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a", C128078b.m209212b()});
            case 3:
                return new C128114o();
            case 4:
                return new C128113n();
            case 5:
                return f352491c;
            case 6:
                C63010eb ebVar = f352492d;
                if (ebVar == null) {
                    synchronized (C128114o.class) {
                        ebVar = f352492d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352491c);
                            f352492d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
