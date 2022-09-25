package com.google.android.libraries.accessibility.voiceaccess.api.p10973a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.accessibility.voiceaccess.api.a.e */
/* compiled from: PG */
public final class C147339e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C147339e f397734c;

    /* renamed from: e */
    private static volatile C63010eb f397735e;

    /* renamed from: a */
    public int f397736a = 1;

    /* renamed from: b */
    public int f397737b = 1;

    /* renamed from: d */
    private int f397738d;

    static {
        C147339e eVar = new C147339e();
        f397734c = eVar;
        C62942bv.registerDefaultInstance(C147339e.class, eVar);
    }

    private C147339e() {
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
                return newMessageInfo(f397734c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", C147341g.m240257b(), "b", C147342h.f397744a});
            case 3:
                return new C147339e();
            case 4:
                return new C147338d();
            case 5:
                return f397734c;
            case 6:
                C63010eb ebVar = f397735e;
                if (ebVar == null) {
                    synchronized (C147339e.class) {
                        ebVar = f397735e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f397734c);
                            f397735e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
