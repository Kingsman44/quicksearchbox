package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127413b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.d */
/* compiled from: PG */
public final class C127046d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C127046d f349837e;

    /* renamed from: g */
    private static volatile C63010eb f349838g;

    /* renamed from: a */
    public int f349839a;

    /* renamed from: b */
    public C119851cs f349840b;

    /* renamed from: c */
    public C127413b f349841c;

    /* renamed from: d */
    public C127045c f349842d;

    /* renamed from: f */
    private byte f349843f = 2;

    static {
        C127046d dVar = new C127046d();
        f349837e = dVar;
        C62942bv.registerDefaultInstance(C127046d.class, dVar);
    }

    private C127046d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f349843f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f349843f = b;
                return null;
            case 2:
                return newMessageInfo(f349837e, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C127046d();
            case 4:
                return new C127043a();
            case 5:
                return f349837e;
            case 6:
                C63010eb ebVar = f349838g;
                if (ebVar == null) {
                    synchronized (C127046d.class) {
                        ebVar = f349838g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349837e);
                            f349838g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
