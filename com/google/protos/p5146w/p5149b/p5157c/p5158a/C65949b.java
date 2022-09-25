package com.google.protos.p5146w.p5149b.p5157c.p5158a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;

/* renamed from: com.google.protos.w.b.c.a.b */
/* compiled from: PG */
public final class C65949b extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C65949b f179368e;

    /* renamed from: g */
    private static volatile C63010eb f179369g;

    /* renamed from: a */
    public int f179370a;

    /* renamed from: b */
    public C65926d f179371b;

    /* renamed from: c */
    public String f179372c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f179373d = emptyProtobufList();

    /* renamed from: f */
    private byte f179374f = 2;

    static {
        C65949b bVar = new C65949b();
        f179368e = bVar;
        C62942bv.registerDefaultInstance(C65949b.class, bVar);
    }

    private C65949b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179374f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179374f = b;
                return null;
            case 2:
                return newMessageInfo(f179368e, "\u0001\u0003\u0000\u0001\u0001\u000b\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0004ဈ\u0002\u000bЛ", new Object[]{"a", "b", C45240c.f118157a, "d", C65951d.class});
            case 3:
                return new C65949b();
            case 4:
                return new C65948a();
            case 5:
                return f179368e;
            case 6:
                C63010eb ebVar = f179369g;
                if (ebVar == null) {
                    synchronized (C65949b.class) {
                        ebVar = f179369g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179368e);
                            f179369g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
