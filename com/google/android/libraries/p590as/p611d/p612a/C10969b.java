package com.google.android.libraries.p590as.p611d.p612a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.d.a.b */
/* compiled from: PG */
public final class C10969b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C10969b f36094c;

    /* renamed from: e */
    private static volatile C63010eb f36095e;

    /* renamed from: a */
    public String f36096a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f36097b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f36098d;

    static {
        C10969b bVar = new C10969b();
        f36094c = bVar;
        C62942bv.registerDefaultInstance(C10969b.class, bVar);
    }

    private C10969b() {
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
                return newMessageInfo(f36094c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C10969b();
            case 4:
                return new C10968a();
            case 5:
                return f36094c;
            case 6:
                C63010eb ebVar = f36095e;
                if (ebVar == null) {
                    synchronized (C10969b.class) {
                        ebVar = f36095e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f36094c);
                            f36095e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
