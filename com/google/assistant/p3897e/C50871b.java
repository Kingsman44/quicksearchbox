package com.google.assistant.p3897e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.b */
/* compiled from: PG */
public final class C50871b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50871b f132454d;

    /* renamed from: e */
    private static volatile C63010eb f132455e;

    /* renamed from: a */
    public int f132456a;

    /* renamed from: b */
    public String f132457b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f132458c = C62942bv.emptyProtobufList();

    static {
        C50871b bVar = new C50871b();
        f132454d = bVar;
        C62942bv.registerDefaultInstance(C50871b.class, bVar);
    }

    private C50871b() {
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
                return newMessageInfo(f132454d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50871b();
            case 4:
                return new C50864a();
            case 5:
                return f132454d;
            case 6:
                C63010eb ebVar = f132455e;
                if (ebVar == null) {
                    synchronized (C50871b.class) {
                        ebVar = f132455e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132454d);
                            f132455e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
