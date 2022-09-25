package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xj */
/* compiled from: PG */
public final class C60640xj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60640xj f164512h;

    /* renamed from: i */
    private static volatile C63010eb f164513i;

    /* renamed from: a */
    public int f164514a;

    /* renamed from: b */
    public boolean f164515b;

    /* renamed from: c */
    public boolean f164516c;

    /* renamed from: d */
    public boolean f164517d;

    /* renamed from: e */
    public boolean f164518e;

    /* renamed from: f */
    public boolean f164519f;

    /* renamed from: g */
    public boolean f164520g;

    static {
        C60640xj xjVar = new C60640xj();
        f164512h = xjVar;
        C62942bv.registerDefaultInstance(C60640xj.class, xjVar);
    }

    private C60640xj() {
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
                return newMessageInfo(f164512h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C60640xj();
            case 4:
                return new C60639xi();
            case 5:
                return f164512h;
            case 6:
                C63010eb ebVar = f164513i;
                if (ebVar == null) {
                    synchronized (C60640xj.class) {
                        ebVar = f164513i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164512h);
                            f164513i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
