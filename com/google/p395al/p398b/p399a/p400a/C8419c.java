package com.google.p395al.p398b.p399a.p400a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.a.c */
/* compiled from: PG */
public final class C8419c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8419c f29284d;

    /* renamed from: e */
    private static volatile C63010eb f29285e;

    /* renamed from: a */
    public int f29286a;

    /* renamed from: b */
    public int f29287b;

    /* renamed from: c */
    public String f29288c = BuildConfig.FLAVOR;

    static {
        C8419c cVar = new C8419c();
        f29284d = cVar;
        C62942bv.registerDefaultInstance(C8419c.class, cVar);
    }

    private C8419c() {
        emptyProtobufList();
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
                return newMessageInfo(f29284d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C8418b.f29283a, C45240c.f118157a});
            case 3:
                return new C8419c();
            case 4:
                return new C8415a();
            case 5:
                return f29284d;
            case 6:
                C63010eb ebVar = f29285e;
                if (ebVar == null) {
                    synchronized (C8419c.class) {
                        ebVar = f29285e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29284d);
                            f29285e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
