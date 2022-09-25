package com.google.android.apps.search.assistant.platform.p9080f.p9109g;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.r */
/* compiled from: PG */
public final class C120703r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C120703r f335705e;

    /* renamed from: g */
    private static volatile C63010eb f335706g;

    /* renamed from: a */
    public int f335707a;

    /* renamed from: b */
    public int f335708b = 0;

    /* renamed from: c */
    public Object f335709c;

    /* renamed from: d */
    public C119893l f335710d;

    /* renamed from: f */
    private byte f335711f = 2;

    static {
        C120703r rVar = new C120703r();
        f335705e = rVar;
        C62942bv.registerDefaultInstance(C120703r.class, rVar);
    }

    private C120703r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f335711f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f335711f = b;
                return null;
            case 2:
                return newMessageInfo(f335705e, "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001<\u0000\u0002ᐉ\u0000", new Object[]{C45240c.f118157a, "b", "a", C18343b.class, "d"});
            case 3:
                return new C120703r();
            case 4:
                return new C120702q();
            case 5:
                return f335705e;
            case 6:
                C63010eb ebVar = f335706g;
                if (ebVar == null) {
                    synchronized (C120703r.class) {
                        ebVar = f335706g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f335705e);
                            f335706g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
