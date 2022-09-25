package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2511d.p2512a.C32510c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bc */
/* compiled from: PG */
public final class C119808bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119808bc f333713c;

    /* renamed from: d */
    public static final C62940bt f333714d;

    /* renamed from: f */
    private static volatile C63010eb f333715f;

    /* renamed from: a */
    public int f333716a = 0;

    /* renamed from: b */
    public Object f333717b;

    /* renamed from: e */
    private byte f333718e = 2;

    static {
        C119808bc bcVar = new C119808bc();
        f333713c = bcVar;
        C62942bv.registerDefaultInstance(C119808bc.class, bcVar);
        f333714d = C62942bv.newSingularGeneratedExtension(C32510c.f87086e, bcVar, bcVar, (C62958ce) null, 421835927, C63066gd.MESSAGE, C119808bc.class);
    }

    private C119808bc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333718e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333718e = b;
                return null;
            case 2:
                return newMessageInfo(f333713c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C119851cs.class, C119863dd.class, C119860da.class});
            case 3:
                return new C119808bc();
            case 4:
                return new C119806ba();
            case 5:
                return f333713c;
            case 6:
                C63010eb ebVar = f333715f;
                if (ebVar == null) {
                    synchronized (C119808bc.class) {
                        ebVar = f333715f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333713c);
                            f333715f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
