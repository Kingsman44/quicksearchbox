package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bk */
/* compiled from: PG */
public final class C119816bk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119816bk f333729d;

    /* renamed from: e */
    private static volatile C63010eb f333730e;

    /* renamed from: a */
    public C119834cb f333731a;

    /* renamed from: b */
    public C52091ex f333732b;

    /* renamed from: c */
    public C63088z f333733c = C63088z.f170246b;

    static {
        C119816bk bkVar = new C119816bk();
        f333729d = bkVar;
        C62942bv.registerDefaultInstance(C119816bk.class, bkVar);
    }

    private C119816bk() {
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
                return newMessageInfo(f333729d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C119816bk();
            case 4:
                return new C119815bj();
            case 5:
                return f333729d;
            case 6:
                C63010eb ebVar = f333730e;
                if (ebVar == null) {
                    synchronized (C119816bk.class) {
                        ebVar = f333730e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333729d);
                            f333730e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
