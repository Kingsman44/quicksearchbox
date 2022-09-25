package com.google.android.libraries.search.assistant.p2570h.p2578b.p2583e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.h.b.e.b */
/* compiled from: PG */
public final class C33472b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33472b f89580c;

    /* renamed from: d */
    private static volatile C63010eb f89581d;

    /* renamed from: a */
    public String f89582a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f89583b = emptyProtobufList();

    static {
        C33472b bVar = new C33472b();
        f89580c = bVar;
        C62942bv.registerDefaultInstance(C33472b.class, bVar);
    }

    private C33472b() {
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
                return newMessageInfo(f89580c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", C33472b.class});
            case 3:
                return new C33472b();
            case 4:
                return new C33471a();
            case 5:
                return f89580c;
            case 6:
                C63010eb ebVar = f89581d;
                if (ebVar == null) {
                    synchronized (C33472b.class) {
                        ebVar = f89581d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89580c);
                            f89581d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
