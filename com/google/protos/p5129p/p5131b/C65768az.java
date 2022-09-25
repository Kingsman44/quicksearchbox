package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;

/* renamed from: com.google.protos.p.b.az */
/* compiled from: PG */
public final class C65768az extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C65768az f178793f;

    /* renamed from: h */
    private static volatile C63010eb f178794h;

    /* renamed from: a */
    public int f178795a;

    /* renamed from: b */
    public C65139d f178796b;

    /* renamed from: c */
    public C65139d f178797c;

    /* renamed from: d */
    public String f178798d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63070h f178799e;

    /* renamed from: g */
    private byte f178800g = 2;

    static {
        C65768az azVar = new C65768az();
        f178793f = azVar;
        C62942bv.registerDefaultInstance(C65768az.class, azVar);
    }

    private C65768az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178800g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178800g = b;
                return null;
            case 2:
                return newMessageInfo(f178793f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0006ဉ\u0000\u0007ဉ\u0001", new Object[]{"a", "d", "e", "b", C45240c.f118157a});
            case 3:
                return new C65768az();
            case 4:
                return new C65767ay();
            case 5:
                return f178793f;
            case 6:
                C63010eb ebVar = f178794h;
                if (ebVar == null) {
                    synchronized (C65768az.class) {
                        ebVar = f178794h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178793f);
                            f178794h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
