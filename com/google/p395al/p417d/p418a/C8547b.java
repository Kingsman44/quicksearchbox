package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b */
/* compiled from: PG */
public final class C8547b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8547b f29642c;

    /* renamed from: d */
    private static volatile C63010eb f29643d;

    /* renamed from: a */
    public int f29644a;

    /* renamed from: b */
    public String f29645b = BuildConfig.FLAVOR;

    static {
        C8547b bVar = new C8547b();
        f29642c = bVar;
        C62942bv.registerDefaultInstance(C8547b.class, bVar);
    }

    private C8547b() {
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
                return newMessageInfo(f29642c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8547b();
            case 4:
                return new C8518a();
            case 5:
                return f29642c;
            case 6:
                C63010eb ebVar = f29643d;
                if (ebVar == null) {
                    synchronized (C8547b.class) {
                        ebVar = f29643d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29642c);
                            f29643d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
