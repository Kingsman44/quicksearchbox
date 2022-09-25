package com.google.assistant.p4001w.p4002a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.w.a.d */
/* compiled from: PG */
public final class C53497d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53497d f140387d;

    /* renamed from: e */
    private static volatile C63010eb f140388e;

    /* renamed from: a */
    public int f140389a;

    /* renamed from: b */
    public String f140390b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140391c = BuildConfig.FLAVOR;

    static {
        C53497d dVar = new C53497d();
        f140387d = dVar;
        C62942bv.registerDefaultInstance(C53497d.class, dVar);
    }

    private C53497d() {
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
                return newMessageInfo(f140387d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53497d();
            case 4:
                return new C53496c();
            case 5:
                return f140387d;
            case 6:
                C63010eb ebVar = f140388e;
                if (ebVar == null) {
                    synchronized (C53497d.class) {
                        ebVar = f140388e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140387d);
                            f140388e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
