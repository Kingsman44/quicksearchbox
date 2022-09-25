package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12900d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.k */
/* compiled from: PG */
public final class C12867k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C12867k f40128d;

    /* renamed from: e */
    private static volatile C63010eb f40129e;

    /* renamed from: a */
    public int f40130a;

    /* renamed from: b */
    public C12900d f40131b;

    /* renamed from: c */
    public C52654zt f40132c;

    static {
        C12867k kVar = new C12867k();
        f40128d = kVar;
        C62942bv.registerDefaultInstance(C12867k.class, kVar);
    }

    private C12867k() {
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
                return newMessageInfo(f40128d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C12867k();
            case 4:
                return new C12866j();
            case 5:
                return f40128d;
            case 6:
                C63010eb ebVar = f40129e;
                if (ebVar == null) {
                    synchronized (C12867k.class) {
                        ebVar = f40129e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40128d);
                            f40129e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
