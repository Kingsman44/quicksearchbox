package com.google.android.libraries.search.assistant.performer.p2729b.p2730a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51525ky;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.performer.b.a.d */
/* compiled from: PG */
public final class C35477d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C35477d f93167e;

    /* renamed from: g */
    private static volatile C63010eb f93168g;

    /* renamed from: a */
    public int f93169a;

    /* renamed from: b */
    public C62971cq f93170b = emptyProtobufList();

    /* renamed from: c */
    public C51536li f93171c;

    /* renamed from: d */
    public C51525ky f93172d;

    /* renamed from: f */
    private byte f93173f = 2;

    static {
        C35477d dVar = new C35477d();
        f93167e = dVar;
        C62942bv.registerDefaultInstance(C35477d.class, dVar);
    }

    private C35477d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f93173f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f93173f = b;
                return null;
            case 2:
                return newMessageInfo(f93167e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u001b\u0002ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", C35476c.class, C45240c.f118157a, "d"});
            case 3:
                return new C35477d();
            case 4:
                return new C35474a();
            case 5:
                return f93167e;
            case 6:
                C63010eb ebVar = f93168g;
                if (ebVar == null) {
                    synchronized (C35477d.class) {
                        ebVar = f93168g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f93167e);
                            f93168g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
