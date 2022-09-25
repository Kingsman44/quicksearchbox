package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.wp */
/* compiled from: PG */
public final class C60619wp extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60619wp f164458g;

    /* renamed from: h */
    private static volatile C63010eb f164459h;

    /* renamed from: a */
    public int f164460a;

    /* renamed from: b */
    public int f164461b;

    /* renamed from: c */
    public int f164462c;

    /* renamed from: d */
    public boolean f164463d;

    /* renamed from: e */
    public boolean f164464e;

    /* renamed from: f */
    public int f164465f;

    static {
        C60619wp wpVar = new C60619wp();
        f164458g = wpVar;
        C62942bv.registerDefaultInstance(C60619wp.class, wpVar);
    }

    private C60619wp() {
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
                return newMessageInfo(f164458g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"a", "b", C60620wq.f164466a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C60619wp();
            case 4:
                return new C60618wo();
            case 5:
                return f164458g;
            case 6:
                C63010eb ebVar = f164459h;
                if (ebVar == null) {
                    synchronized (C60619wp.class) {
                        ebVar = f164459h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164458g);
                            f164459h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
