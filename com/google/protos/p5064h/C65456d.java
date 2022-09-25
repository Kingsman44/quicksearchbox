package com.google.protos.p5064h;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3824am.C49247f;
import com.google.knowledge.p4661a.p4670e.C61780b;
import com.google.p4691l.p4692a.p4693a.C62014b;
import com.google.p5277z.p5282c.C68002al;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.h.d */
/* compiled from: PG */
public final class C65456d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65456d f177929a;

    /* renamed from: i */
    private static volatile C63010eb f177930i;

    /* renamed from: b */
    private int f177931b;

    /* renamed from: c */
    private C49247f f177932c;

    /* renamed from: d */
    private C62014b f177933d;

    /* renamed from: e */
    private C65467o f177934e;

    /* renamed from: f */
    private C68002al f177935f;

    /* renamed from: g */
    private C61780b f177936g;

    /* renamed from: h */
    private byte f177937h = 2;

    static {
        C65456d dVar = new C65456d();
        f177929a = dVar;
        C62942bv.registerDefaultInstance(C65456d.class, dVar);
    }

    private C65456d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177937h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177937h = b;
                return null;
            case 2:
                return newMessageInfo(f177929a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0005ᐉ\u0003\u0007ဉ\u0005\bဉ\u0006\nᐉ\b", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C65456d();
            case 4:
                return new C65455c();
            case 5:
                return f177929a;
            case 6:
                C63010eb ebVar = f177930i;
                if (ebVar == null) {
                    synchronized (C65456d.class) {
                        ebVar = f177930i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177929a);
                            f177930i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
