package com.google.protos.p4985f.p4986a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.bp */
/* compiled from: PG */
public final class C64689bp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64689bp f175345f;

    /* renamed from: g */
    private static volatile C63010eb f175346g;

    /* renamed from: a */
    public int f175347a;

    /* renamed from: b */
    public String f175348b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f175349c;

    /* renamed from: d */
    public C62971cq f175350d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f175351e = emptyProtobufList();

    static {
        C64689bp bpVar = new C64689bp();
        f175345f = bpVar;
        C62942bv.registerDefaultInstance(C64689bp.class, bpVar);
    }

    private C64689bp() {
    }

    /* renamed from: a */
    public final void mo59293a() {
        C62971cq cqVar = this.f175350d;
        if (!cqVar.mo58948c()) {
            this.f175350d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo59294b() {
        C62971cq cqVar = this.f175351e;
        if (!cqVar.mo58948c()) {
            this.f175351e = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f175345f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0006\u001b\u0007\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C64653ag.class, "e", C64673b.class});
            case 3:
                return new C64689bp();
            case 4:
                return new C64688bo();
            case 5:
                return f175345f;
            case 6:
                C63010eb ebVar = f175346g;
                if (ebVar == null) {
                    synchronized (C64689bp.class) {
                        ebVar = f175346g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175345f);
                            f175346g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
