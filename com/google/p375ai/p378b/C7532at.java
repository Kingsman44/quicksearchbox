package com.google.p375ai.p378b;

import com.google.android.apps.gsa.assist.C9419i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.at */
/* compiled from: PG */
public final class C7532at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7532at f26078c;

    /* renamed from: e */
    private static volatile C63010eb f26079e;

    /* renamed from: a */
    public int f26080a;

    /* renamed from: b */
    public C63088z f26081b = C63088z.f170246b;

    /* renamed from: d */
    private int f26082d;

    static {
        C7532at atVar = new C7532at();
        f26078c = atVar;
        C62942bv.registerDefaultInstance(C7532at.class, atVar);
    }

    private C7532at() {
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
                return newMessageInfo(f26078c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"d", "a", C9419i.f32727a, "b"});
            case 3:
                return new C7532at();
            case 4:
                return new C7531as();
            case 5:
                return f26078c;
            case 6:
                C63010eb ebVar = f26079e;
                if (ebVar == null) {
                    synchronized (C7532at.class) {
                        ebVar = f26079e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26078c);
                            f26079e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
