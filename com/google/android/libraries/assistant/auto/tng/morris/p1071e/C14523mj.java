package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.mj */
/* compiled from: PG */
public final class C14523mj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14523mj f43900c;

    /* renamed from: d */
    private static volatile C63010eb f43901d;

    /* renamed from: a */
    public int f43902a = 0;

    /* renamed from: b */
    public Object f43903b;

    static {
        C14523mj mjVar = new C14523mj();
        f43900c = mjVar;
        C62942bv.registerDefaultInstance(C14523mj.class, mjVar);
    }

    private C14523mj() {
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
                return newMessageInfo(f43900c, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"b", "a", C14504lr.class, C14509lw.class, C14511ly.class, C14520mg.class, C14522mi.class, C14518me.class, C14516mc.class, C14514ma.class, C14507lu.class});
            case 3:
                return new C14523mj();
            case 4:
                return new C14505ls();
            case 5:
                return f43900c;
            case 6:
                C63010eb ebVar = f43901d;
                if (ebVar == null) {
                    synchronized (C14523mj.class) {
                        ebVar = f43901d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43900c);
                            f43901d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
