package com.google.knowledge.p4686e.p4687a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.e.a.b */
/* compiled from: PG */
public final class C62006b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62006b f167554c;

    /* renamed from: e */
    private static volatile C63010eb f167555e;

    /* renamed from: a */
    public String f167556a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f167557b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f167558d;

    static {
        C62006b bVar = new C62006b();
        f167554c = bVar;
        C62942bv.registerDefaultInstance(C62006b.class, bVar);
    }

    private C62006b() {
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
                return newMessageInfo(f167554c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C62006b();
            case 4:
                return new C61999a();
            case 5:
                return f167554c;
            case 6:
                C63010eb ebVar = f167555e;
                if (ebVar == null) {
                    synchronized (C62006b.class) {
                        ebVar = f167555e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167554c);
                            f167555e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
