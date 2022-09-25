package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ii */
/* compiled from: PG */
public final class C14414ii extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14414ii f43592c;

    /* renamed from: e */
    private static volatile C63010eb f43593e;

    /* renamed from: a */
    public int f43594a = 0;

    /* renamed from: b */
    public Object f43595b;

    /* renamed from: d */
    private byte f43596d = 2;

    static {
        C14414ii iiVar = new C14414ii();
        f43592c = iiVar;
        C62942bv.registerDefaultInstance(C14414ii.class, iiVar);
    }

    private C14414ii() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43596d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43596d = b;
                return null;
            case 2:
                return newMessageInfo(f43592c, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0002\u0001<\u0000\u0002м\u0000\u0003<\u0000\u0004<\u0000\u0006м\u0000\u0007<\u0000", new Object[]{"b", "a", C14411if.class, C14413ih.class, C14409id.class, C14407ib.class, C14402hx.class, C14404hz.class});
            case 3:
                return new C14414ii();
            case 4:
                return new C14399hu();
            case 5:
                return f43592c;
            case 6:
                C63010eb ebVar = f43593e;
                if (ebVar == null) {
                    synchronized (C14414ii.class) {
                        ebVar = f43593e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43592c);
                            f43593e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
