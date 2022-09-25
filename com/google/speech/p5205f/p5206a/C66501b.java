package com.google.speech.p5205f.p5206a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5230n.p5232b.C67400ap;
import com.google.speech.p5230n.p5232b.C67402ar;

/* renamed from: com.google.speech.f.a.b */
/* compiled from: PG */
public final class C66501b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66501b f180865c;

    /* renamed from: e */
    private static volatile C63010eb f180866e;

    /* renamed from: a */
    public int f180867a = 0;

    /* renamed from: b */
    public Object f180868b;

    /* renamed from: d */
    private byte f180869d = 2;

    static {
        C66501b bVar = new C66501b();
        f180865c = bVar;
        C62942bv.registerDefaultInstance(C66501b.class, bVar);
    }

    private C66501b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180869d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180869d = b;
                return null;
            case 2:
                return newMessageInfo(f180865c, "\u0001\u0002\u0001\u0000\u0002\u0004\u0002\u0000\u0000\u0002\u0002ᐼ\u0000\u0004ᐼ\u0000", new Object[]{"b", "a", C67400ap.class, C67402ar.class});
            case 3:
                return new C66501b();
            case 4:
                return new C66500a();
            case 5:
                return f180865c;
            case 6:
                C63010eb ebVar = f180866e;
                if (ebVar == null) {
                    synchronized (C66501b.class) {
                        ebVar = f180866e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180865c);
                            f180866e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
