package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.k */
/* compiled from: PG */
public final class C127053k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C127053k f349869e;

    /* renamed from: g */
    private static volatile C63010eb f349870g;

    /* renamed from: a */
    public int f349871a;

    /* renamed from: b */
    public int f349872b = 0;

    /* renamed from: c */
    public Object f349873c;

    /* renamed from: d */
    public C119834cb f349874d;

    /* renamed from: f */
    private byte f349875f = 2;

    static {
        C127053k kVar = new C127053k();
        f349869e = kVar;
        C62942bv.registerDefaultInstance(C127053k.class, kVar);
    }

    private C127053k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f349875f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f349875f = b;
                return null;
            case 2:
                return newMessageInfo(f349869e, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002<\u0000\u0003м\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62912at.class, C34822b.class});
            case 3:
                return new C127053k();
            case 4:
                return new C127052j();
            case 5:
                return f349869e;
            case 6:
                C63010eb ebVar = f349870g;
                if (ebVar == null) {
                    synchronized (C127053k.class) {
                        ebVar = f349870g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349869e);
                            f349870g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
