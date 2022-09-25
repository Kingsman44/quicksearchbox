package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.kj */
/* compiled from: PG */
public final class C7799kj extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C62962ci f27262d = new C7795kf();

    /* renamed from: h */
    public static final C7799kj f27263h;

    /* renamed from: j */
    private static volatile C63010eb f27264j;

    /* renamed from: a */
    public int f27265a;

    /* renamed from: b */
    public int f27266b = 1;

    /* renamed from: c */
    public C62961ch f27267c;

    /* renamed from: e */
    public C62971cq f27268e;

    /* renamed from: f */
    public boolean f27269f;

    /* renamed from: g */
    public boolean f27270g;

    /* renamed from: i */
    private byte f27271i = 2;

    static {
        C7799kj kjVar = new C7799kj();
        f27263h = kjVar;
        C62942bv.registerDefaultInstance(C7799kj.class, kjVar);
    }

    private C7799kj() {
        emptyProtobufList();
        this.f27267c = emptyIntList();
        this.f27268e = emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27271i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27271i = b;
                return null;
            case 2:
                return newMessageInfo(f27263h, "\u0001\u0005\u0000\u0001\u0001\u0015\u0005\u0000\u0002\u0001\u0001ဌ\u0000\u0006\u001e\fဇ\u0001\u000fЛ\u0015ဇ\b", new Object[]{"a", "b", C7797kh.f27261a, C45240c.f118157a, C7746ik.m22835b(), C10662f.f35572a, "e", C7520ah.class, C30325g.f82003a});
            case 3:
                return new C7799kj();
            case 4:
                return new C7796kg();
            case 5:
                return f27263h;
            case 6:
                C63010eb ebVar = f27264j;
                if (ebVar == null) {
                    synchronized (C7799kj.class) {
                        ebVar = f27264j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27263h);
                            f27264j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
