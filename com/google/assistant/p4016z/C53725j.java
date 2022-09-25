package com.google.assistant.p4016z;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.j */
/* compiled from: PG */
public final class C53725j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53725j f141040e;

    /* renamed from: g */
    private static volatile C63010eb f141041g;

    /* renamed from: a */
    public boolean f141042a;

    /* renamed from: b */
    public boolean f141043b;

    /* renamed from: c */
    public boolean f141044c;

    /* renamed from: d */
    public boolean f141045d;

    /* renamed from: f */
    private int f141046f;

    static {
        C53725j jVar = new C53725j();
        f141040e = jVar;
        C62942bv.registerDefaultInstance(C53725j.class, jVar);
    }

    private C53725j() {
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
                return newMessageInfo(f141040e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53725j();
            case 4:
                return new C53724i();
            case 5:
                return f141040e;
            case 6:
                C63010eb ebVar = f141041g;
                if (ebVar == null) {
                    synchronized (C53725j.class) {
                        ebVar = f141041g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141040e);
                            f141041g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
