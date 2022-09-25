package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bb.a.gj */
/* compiled from: PG */
public final class C55114gj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55114gj f145034g;

    /* renamed from: h */
    private static volatile C63010eb f145035h;

    /* renamed from: a */
    public int f145036a;

    /* renamed from: b */
    public C62971cq f145037b = emptyProtobufList();

    /* renamed from: c */
    public String f145038c;

    /* renamed from: d */
    public C63088z f145039d;

    /* renamed from: e */
    public String f145040e;

    /* renamed from: f */
    public int f145041f;

    static {
        C55114gj gjVar = new C55114gj();
        f145034g = gjVar;
        C62942bv.registerDefaultInstance(C55114gj.class, gjVar);
    }

    private C55114gj() {
        emptyProtobufList();
        this.f145038c = BuildConfig.FLAVOR;
        this.f145039d = C63088z.f170246b;
        this.f145040e = BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final void mo54195a() {
        C62971cq cqVar = this.f145037b;
        if (!cqVar.mo58948c()) {
            this.f145037b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f145034g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003င\u0003\u0006ဈ\u0002\u0007ည\u0001", new Object[]{"a", "b", C55112gh.class, C45240c.f118157a, C10662f.f35572a, "e", "d"});
            case 3:
                return new C55114gj();
            case 4:
                return new C55113gi();
            case 5:
                return f145034g;
            case 6:
                C63010eb ebVar = f145035h;
                if (ebVar == null) {
                    synchronized (C55114gj.class) {
                        ebVar = f145035h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145034g);
                            f145035h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
