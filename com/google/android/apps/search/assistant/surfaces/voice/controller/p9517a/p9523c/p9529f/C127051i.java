package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.i */
/* compiled from: PG */
public final class C127051i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C127051i f349864d;

    /* renamed from: e */
    private static volatile C63010eb f349865e;

    /* renamed from: a */
    public int f349866a;

    /* renamed from: b */
    public C119834cb f349867b;

    /* renamed from: c */
    public int f349868c;

    static {
        C127051i iVar = new C127051i();
        f349864d = iVar;
        C62942bv.registerDefaultInstance(C127051i.class, iVar);
    }

    private C127051i() {
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
                return newMessageInfo(f349864d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C127051i();
            case 4:
                return new C127049g();
            case 5:
                return f349864d;
            case 6:
                C63010eb ebVar = f349865e;
                if (ebVar == null) {
                    synchronized (C127051i.class) {
                        ebVar = f349865e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349864d);
                            f349865e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
