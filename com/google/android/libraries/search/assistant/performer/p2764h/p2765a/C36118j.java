package com.google.android.libraries.search.assistant.performer.p2764h.p2765a;

import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17319o;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.performer.h.a.j */
/* compiled from: PG */
public final class C36118j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36118j f94451d;

    /* renamed from: f */
    private static volatile C63010eb f94452f;

    /* renamed from: a */
    public int f94453a;

    /* renamed from: b */
    public C62971cq f94454b = emptyProtobufList();

    /* renamed from: c */
    public C34822b f94455c;

    /* renamed from: e */
    private byte f94456e = 2;

    static {
        C36118j jVar = new C36118j();
        f94451d = jVar;
        C62942bv.registerDefaultInstance(C36118j.class, jVar);
    }

    private C36118j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f94456e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f94456e = b;
                return null;
            case 2:
                return newMessageInfo(f94451d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"a", "b", C17319o.class, C45240c.f118157a});
            case 3:
                return new C36118j();
            case 4:
                return new C36117i();
            case 5:
                return f94451d;
            case 6:
                C63010eb ebVar = f94452f;
                if (ebVar == null) {
                    synchronized (C36118j.class) {
                        ebVar = f94452f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f94451d);
                            f94452f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
