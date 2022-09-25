package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127487q;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.c */
/* compiled from: PG */
public final class C127045c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C127045c f349832d;

    /* renamed from: e */
    private static volatile C63010eb f349833e;

    /* renamed from: a */
    public int f349834a;

    /* renamed from: b */
    public C62971cq f349835b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C127487q f349836c;

    static {
        C127045c cVar = new C127045c();
        f349832d = cVar;
        C62942bv.registerDefaultInstance(C127045c.class, cVar);
    }

    private C127045c() {
    }

    /* renamed from: a */
    public final void mo107906a() {
        C62971cq cqVar = this.f349835b;
        if (!cqVar.mo58948c()) {
            this.f349835b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f349832d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C127045c();
            case 4:
                return new C127044b();
            case 5:
                return f349832d;
            case 6:
                C63010eb ebVar = f349833e;
                if (ebVar == null) {
                    synchronized (C127045c.class) {
                        ebVar = f349833e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349832d);
                            f349833e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
