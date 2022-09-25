package com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.y.h.a.b */
/* compiled from: PG */
public final class C36954b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36954b f96227d;

    /* renamed from: e */
    private static volatile C63010eb f96228e;

    /* renamed from: a */
    public int f96229a;

    /* renamed from: b */
    public String f96230b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f96231c;

    static {
        C36954b bVar = new C36954b();
        f96227d = bVar;
        C62942bv.registerDefaultInstance(C36954b.class, bVar);
    }

    private C36954b() {
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
                return newMessageInfo(f96227d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36954b();
            case 4:
                return new C36953a();
            case 5:
                return f96227d;
            case 6:
                C63010eb ebVar = f96228e;
                if (ebVar == null) {
                    synchronized (C36954b.class) {
                        ebVar = f96228e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f96227d);
                            f96228e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
