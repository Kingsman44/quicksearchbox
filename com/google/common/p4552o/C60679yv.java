package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.yv */
/* compiled from: PG */
public final class C60679yv extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60679yv f164623g;

    /* renamed from: h */
    private static volatile C63010eb f164624h;

    /* renamed from: a */
    public int f164625a;

    /* renamed from: b */
    public long f164626b;

    /* renamed from: c */
    public long f164627c;

    /* renamed from: d */
    public long f164628d;

    /* renamed from: e */
    public long f164629e;

    /* renamed from: f */
    public long f164630f;

    static {
        C60679yv yvVar = new C60679yv();
        f164623g = yvVar;
        C62942bv.registerDefaultInstance(C60679yv.class, yvVar);
    }

    private C60679yv() {
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
                return newMessageInfo(f164623g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C60679yv();
            case 4:
                return new C60678yu();
            case 5:
                return f164623g;
            case 6:
                C63010eb ebVar = f164624h;
                if (ebVar == null) {
                    synchronized (C60679yv.class) {
                        ebVar = f164624h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164623g);
                            f164624h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
