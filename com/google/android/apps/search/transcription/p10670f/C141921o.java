package com.google.android.apps.search.transcription.p10670f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C66881d;

/* renamed from: com.google.android.apps.search.transcription.f.o */
/* compiled from: PG */
public final class C141921o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141921o f385102d;

    /* renamed from: e */
    private static volatile C63010eb f385103e;

    /* renamed from: a */
    public C62971cq f385104a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62960cg f385105b = emptyFloatList();

    /* renamed from: c */
    public C62971cq f385106c = emptyProtobufList();

    static {
        C141921o oVar = new C141921o();
        f385102d = oVar;
        C62942bv.registerDefaultInstance(C141921o.class, oVar);
    }

    private C141921o() {
    }

    /* renamed from: a */
    public final void mo116889a() {
        C62971cq cqVar = this.f385104a;
        if (!cqVar.mo58948c()) {
            this.f385104a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo116890b() {
        C62960cg cgVar = this.f385105b;
        if (!cgVar.mo58948c()) {
            this.f385105b = C62942bv.mutableCopy(cgVar);
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
                return newMessageInfo(f385102d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0013\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C66881d.class});
            case 3:
                return new C141921o();
            case 4:
                return new C141920n();
            case 5:
                return f385102d;
            case 6:
                C63010eb ebVar = f385103e;
                if (ebVar == null) {
                    synchronized (C141921o.class) {
                        ebVar = f385103e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385102d);
                            f385103e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
