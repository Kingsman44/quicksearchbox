package com.google.android.apps.search.assistant.platform.pcp.p9326c;

import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.c.g */
/* compiled from: PG */
public final class C123656g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123656g f341608b;

    /* renamed from: c */
    public static final C62940bt f341609c;

    /* renamed from: f */
    private static volatile C63010eb f341610f;

    /* renamed from: a */
    public C123651b f341611a;

    /* renamed from: d */
    private int f341612d;

    /* renamed from: e */
    private byte f341613e = 2;

    static {
        C123656g gVar = new C123656g();
        f341608b = gVar;
        C62942bv.registerDefaultInstance(C123656g.class, gVar);
        f341609c = C62942bv.newSingularGeneratedExtension(C33423r.f89502a, gVar, gVar, (C62958ce) null, 364346946, C63066gd.MESSAGE, C123656g.class);
    }

    private C123656g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341613e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341613e = b;
                return null;
            case 2:
                return newMessageInfo(f341608b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C123656g();
            case 4:
                return new C123655f();
            case 5:
                return f341608b;
            case 6:
                C63010eb ebVar = f341610f;
                if (ebVar == null) {
                    synchronized (C123656g.class) {
                        ebVar = f341610f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341608b);
                            f341610f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
