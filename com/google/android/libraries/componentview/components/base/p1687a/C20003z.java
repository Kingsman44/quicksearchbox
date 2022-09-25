package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.z */
/* compiled from: PG */
public final class C20003z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20003z f56045c;

    /* renamed from: e */
    private static volatile C63010eb f56046e;

    /* renamed from: a */
    public float f56047a;

    /* renamed from: b */
    public int f56048b;

    /* renamed from: d */
    private int f56049d;

    static {
        C20003z zVar = new C20003z();
        f56045c = zVar;
        C62942bv.registerDefaultInstance(C20003z.class, zVar);
    }

    private C20003z() {
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
                return newMessageInfo(f56045c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C20001x.f56044a});
            case 3:
                return new C20003z();
            case 4:
                return new C20000w();
            case 5:
                return f56045c;
            case 6:
                C63010eb ebVar = f56046e;
                if (ebVar == null) {
                    synchronized (C20003z.class) {
                        ebVar = f56046e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56045c);
                            f56046e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
