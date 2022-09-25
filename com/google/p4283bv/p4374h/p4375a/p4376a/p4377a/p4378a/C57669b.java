package com.google.p4283bv.p4374h.p4375a.p4376a.p4377a.p4378a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.h.a.a.a.a.b */
/* compiled from: PG */
public final class C57669b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57669b f154046c;

    /* renamed from: d */
    private static volatile C63010eb f154047d;

    /* renamed from: a */
    public int f154048a;

    /* renamed from: b */
    public String f154049b = BuildConfig.FLAVOR;

    static {
        C57669b bVar = new C57669b();
        f154046c = bVar;
        C62942bv.registerDefaultInstance(C57669b.class, bVar);
    }

    private C57669b() {
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
                return newMessageInfo(f154046c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57669b();
            case 4:
                return new C57668a();
            case 5:
                return f154046c;
            case 6:
                C63010eb ebVar = f154047d;
                if (ebVar == null) {
                    synchronized (C57669b.class) {
                        ebVar = f154047d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154046c);
                            f154047d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
