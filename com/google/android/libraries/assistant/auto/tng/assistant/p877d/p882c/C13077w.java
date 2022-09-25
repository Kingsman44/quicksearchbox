package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.w */
/* compiled from: PG */
public final class C13077w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13077w f40573c;

    /* renamed from: d */
    private static volatile C63010eb f40574d;

    /* renamed from: a */
    public int f40575a;

    /* renamed from: b */
    public int f40576b;

    static {
        C13077w wVar = new C13077w();
        f40573c = wVar;
        C62942bv.registerDefaultInstance(C13077w.class, wVar);
    }

    private C13077w() {
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
                return newMessageInfo(f40573c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C16730ar.m33789b()});
            case 3:
                return new C13077w();
            case 4:
                return new C13076v();
            case 5:
                return f40573c;
            case 6:
                C63010eb ebVar = f40574d;
                if (ebVar == null) {
                    synchronized (C13077w.class) {
                        ebVar = f40574d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40573c);
                            f40574d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
