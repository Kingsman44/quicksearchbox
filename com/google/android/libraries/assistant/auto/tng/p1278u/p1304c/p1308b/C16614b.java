package com.google.android.libraries.assistant.auto.tng.p1278u.p1304c.p1308b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.c.b.b */
/* compiled from: PG */
public final class C16614b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16614b f48694b;

    /* renamed from: e */
    private static volatile C63010eb f48695e;

    /* renamed from: a */
    public C12991i f48696a;

    /* renamed from: c */
    private int f48697c;

    /* renamed from: d */
    private byte f48698d = 2;

    static {
        C16614b bVar = new C16614b();
        f48694b = bVar;
        C62942bv.registerDefaultInstance(C16614b.class, bVar);
    }

    private C16614b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48698d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48698d = b;
                return null;
            case 2:
                return newMessageInfo(f48694b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C16614b();
            case 4:
                return new C16613a();
            case 5:
                return f48694b;
            case 6:
                C63010eb ebVar = f48695e;
                if (ebVar == null) {
                    synchronized (C16614b.class) {
                        ebVar = f48695e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48694b);
                            f48695e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
