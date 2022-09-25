package com.google.protos.p5137s;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.s.b */
/* compiled from: PG */
public final class C65885b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65885b f179198c;

    /* renamed from: d */
    private static volatile C63010eb f179199d;

    /* renamed from: a */
    public String f179200a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f179201b = BuildConfig.FLAVOR;

    static {
        C65885b bVar = new C65885b();
        f179198c = bVar;
        C62942bv.registerDefaultInstance(C65885b.class, bVar);
    }

    private C65885b() {
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
                return newMessageInfo(f179198c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C65885b();
            case 4:
                return new C65884a();
            case 5:
                return f179198c;
            case 6:
                C63010eb ebVar = f179199d;
                if (ebVar == null) {
                    synchronized (C65885b.class) {
                        ebVar = f179199d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179198c);
                            f179199d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
