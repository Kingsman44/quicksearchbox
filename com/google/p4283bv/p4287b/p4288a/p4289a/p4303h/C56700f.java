package com.google.p4283bv.p4287b.p4288a.p4289a.p4303h;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57848f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.h.f */
/* compiled from: PG */
public final class C56700f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56700f f151340e;

    /* renamed from: h */
    private static volatile C63010eb f151341h;

    /* renamed from: a */
    public C57569am f151342a;

    /* renamed from: b */
    public int f151343b;

    /* renamed from: c */
    public C57648i f151344c;

    /* renamed from: d */
    public C57848f f151345d;

    /* renamed from: f */
    private int f151346f;

    /* renamed from: g */
    private byte f151347g = 2;

    static {
        C56700f fVar = new C56700f();
        f151340e = fVar;
        C62942bv.registerDefaultInstance(C56700f.class, fVar);
    }

    private C56700f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151347g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151347g = b;
                return null;
            case 2:
                return newMessageInfo(f151340e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{C10662f.f35572a, "a", "b", C57665z.m88513b(), C45240c.f118157a, "d"});
            case 3:
                return new C56700f();
            case 4:
                return new C56699e();
            case 5:
                return f151340e;
            case 6:
                C63010eb ebVar = f151341h;
                if (ebVar == null) {
                    synchronized (C56700f.class) {
                        ebVar = f151341h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151340e);
                            f151341h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
