package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.f */
/* compiled from: PG */
public final class C127048f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127048f f349844c;

    /* renamed from: e */
    private static volatile C63010eb f349845e;

    /* renamed from: a */
    public int f349846a = 0;

    /* renamed from: b */
    public Object f349847b;

    /* renamed from: d */
    private byte f349848d = 2;

    static {
        C127048f fVar = new C127048f();
        f349844c = fVar;
        C62942bv.registerDefaultInstance(C127048f.class, fVar);
    }

    private C127048f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f349848d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f349848d = b;
                return null;
            case 2:
                return newMessageInfo(f349844c, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0001\u0002<\u0000\u0003м\u0000", new Object[]{"b", "a", C119834cb.class, C34822b.class});
            case 3:
                return new C127048f();
            case 4:
                return new C127047e();
            case 5:
                return f349844c;
            case 6:
                C63010eb ebVar = f349845e;
                if (ebVar == null) {
                    synchronized (C127048f.class) {
                        ebVar = f349845e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349844c);
                            f349845e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
