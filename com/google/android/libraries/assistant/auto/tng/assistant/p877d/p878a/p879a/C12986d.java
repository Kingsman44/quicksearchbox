package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d */
/* compiled from: PG */
public final class C12986d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C12986d f40365e;

    /* renamed from: g */
    private static volatile C63010eb f40366g;

    /* renamed from: a */
    public int f40367a;

    /* renamed from: b */
    public int f40368b = 0;

    /* renamed from: c */
    public Object f40369c;

    /* renamed from: d */
    public C12991i f40370d;

    /* renamed from: f */
    private byte f40371f = 2;

    static {
        C12986d dVar = new C12986d();
        f40365e = dVar;
        C62942bv.registerDefaultInstance(C12986d.class, dVar);
    }

    private C12986d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40371f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40371f = b;
                return null;
            case 2:
                return newMessageInfo(f40365e, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0002\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0006ᐉ\u0007\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C12981am.class, C12973ae.class, C12969aa.class, "d", C13005w.class, C12977ai.class, C12997o.class, C13001s.class});
            case 3:
                return new C12986d();
            case 4:
                return new C12985c();
            case 5:
                return f40365e;
            case 6:
                C63010eb ebVar = f40366g;
                if (ebVar == null) {
                    synchronized (C12986d.class) {
                        ebVar = f40366g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40365e);
                            f40366g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
