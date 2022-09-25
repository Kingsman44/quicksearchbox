package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ns */
/* compiled from: PG */
public final class C52329ns extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52329ns f137347c;

    /* renamed from: e */
    private static volatile C63010eb f137348e;

    /* renamed from: a */
    public String f137349a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f137350b;

    /* renamed from: d */
    private int f137351d;

    static {
        C52329ns nsVar = new C52329ns();
        f137347c = nsVar;
        C62942bv.registerDefaultInstance(C52329ns.class, nsVar);
    }

    private C52329ns() {
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
                return newMessageInfo(f137347c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C52326np.f137346a});
            case 3:
                return new C52329ns();
            case 4:
                return new C52328nr();
            case 5:
                return f137347c;
            case 6:
                C63010eb ebVar = f137348e;
                if (ebVar == null) {
                    synchronized (C52329ns.class) {
                        ebVar = f137348e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137347c);
                            f137348e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
