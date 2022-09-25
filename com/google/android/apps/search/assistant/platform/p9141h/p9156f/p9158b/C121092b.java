package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.b.b */
/* compiled from: PG */
public final class C121092b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C121092b f336504e;

    /* renamed from: f */
    private static volatile C63010eb f336505f;

    /* renamed from: a */
    public int f336506a;

    /* renamed from: b */
    public String f336507b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f336508c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public boolean f336509d;

    static {
        C121092b bVar = new C121092b();
        f336504e = bVar;
        C62942bv.registerDefaultInstance(C121092b.class, bVar);
    }

    private C121092b() {
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
                return newMessageInfo(f336504e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C121092b();
            case 4:
                return new C121091a();
            case 5:
                return f336504e;
            case 6:
                C63010eb ebVar = f336505f;
                if (ebVar == null) {
                    synchronized (C121092b.class) {
                        ebVar = f336505f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336504e);
                            f336505f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
