package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13068n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.w */
/* compiled from: PG */
public final class C13005w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13005w f40409c;

    /* renamed from: d */
    private static volatile C63010eb f40410d;

    /* renamed from: a */
    public int f40411a;

    /* renamed from: b */
    public C13068n f40412b;

    static {
        C13005w wVar = new C13005w();
        f40409c = wVar;
        C62942bv.registerDefaultInstance(C13005w.class, wVar);
    }

    private C13005w() {
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
                return newMessageInfo(f40409c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13005w();
            case 4:
                return new C13004v();
            case 5:
                return f40409c;
            case 6:
                C63010eb ebVar = f40410d;
                if (ebVar == null) {
                    synchronized (C13005w.class) {
                        ebVar = f40410d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40409c);
                            f40410d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
