package com.google.android.apps.gsa.speech.settingsui.hotword.p7315a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.a.b */
/* compiled from: PG */
public final class C92571b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C92571b f258328c;

    /* renamed from: d */
    private static volatile C63010eb f258329d;

    /* renamed from: a */
    public int f258330a;

    /* renamed from: b */
    public boolean f258331b;

    static {
        C92571b bVar = new C92571b();
        f258328c = bVar;
        C62942bv.registerDefaultInstance(C92571b.class, bVar);
    }

    private C92571b() {
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
                return newMessageInfo(f258328c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C92571b();
            case 4:
                return new C92570a();
            case 5:
                return f258328c;
            case 6:
                C63010eb ebVar = f258329d;
                if (ebVar == null) {
                    synchronized (C92571b.class) {
                        ebVar = f258329d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f258328c);
                            f258329d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
