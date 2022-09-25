package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.qa */
/* compiled from: PG */
public final class C14622qa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14622qa f44192c;

    /* renamed from: e */
    private static volatile C63010eb f44193e;

    /* renamed from: a */
    public int f44194a = 0;

    /* renamed from: b */
    public Object f44195b;

    /* renamed from: d */
    private byte f44196d = 2;

    static {
        C14622qa qaVar = new C14622qa();
        f44192c = qaVar;
        C62942bv.registerDefaultInstance(C14622qa.class, qaVar);
    }

    private C14622qa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44196d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f44196d = b;
                return null;
            case 2:
                return newMessageInfo(f44192c, "\u0000\u0006\u0001\u0000\u0002\u000b\u0006\u0000\u0000\u0002\u0002<\u0000\u0003<\u0000\u0004м\u0000\bм\u0000\t<\u0000\u000b<\u0000", new Object[]{"b", "a", C14608pn.class, C14615pu.class, C14617pw.class, C14613ps.class, C14619py.class, C14610pp.class});
            case 3:
                return new C14622qa();
            case 4:
                return new C14604pj();
            case 5:
                return f44192c;
            case 6:
                C63010eb ebVar = f44193e;
                if (ebVar == null) {
                    synchronized (C14622qa.class) {
                        ebVar = f44193e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44192c);
                            f44193e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
