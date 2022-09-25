package com.google.android.apps.gsa.assist;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.f */
/* compiled from: PG */
public final class C9410f extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C9410f f32690f;

    /* renamed from: h */
    private static volatile C63010eb f32691h;

    /* renamed from: a */
    public int f32692a;

    /* renamed from: b */
    public String f32693b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f32694c;

    /* renamed from: d */
    public int f32695d;

    /* renamed from: e */
    public C62971cq f32696e = emptyProtobufList();

    /* renamed from: g */
    private byte f32697g = 2;

    static {
        C9410f fVar = new C9410f();
        f32690f = fVar;
        C62942bv.registerDefaultInstance(C9410f.class, fVar);
    }

    private C9410f() {
    }

    /* renamed from: a */
    public final void mo17663a() {
        C62971cq cqVar = this.f32696e;
        if (!cqVar.mo58948c()) {
            this.f32696e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32697g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32697g = b;
                return null;
            case 2:
                return newMessageInfo(f32690f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဆ\u0001\u0003င\u0002\u0004Л", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C9405d.class});
            case 3:
                return new C9410f();
            case 4:
                return new C9407e();
            case 5:
                return f32690f;
            case 6:
                C63010eb ebVar = f32691h;
                if (ebVar == null) {
                    synchronized (C9410f.class) {
                        ebVar = f32691h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32690f);
                            f32691h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
