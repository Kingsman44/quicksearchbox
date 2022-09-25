package com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8526a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.search.googleapp.search.suggest.C138131m;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54914e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.e.a.b */
/* compiled from: PG */
public final class C111765b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C111765b f310654f;

    /* renamed from: h */
    private static volatile C63010eb f310655h;

    /* renamed from: a */
    public int f310656a;

    /* renamed from: b */
    public int f310657b = 0;

    /* renamed from: c */
    public Object f310658c;

    /* renamed from: d */
    public C62961ch f310659d = emptyIntList();

    /* renamed from: e */
    public C54914e f310660e;

    /* renamed from: g */
    private byte f310661g = 2;

    static {
        C111765b bVar = new C111765b();
        f310654f = bVar;
        C62942bv.registerDefaultInstance(C111765b.class, bVar);
    }

    private C111765b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f310661g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f310661g = b;
                return null;
            case 2:
                return newMessageInfo(f310654f, "\u0001\u0004\u0001\u0001\u0002\u0007\u0004\u0000\u0001\u0003\u0002ᐼ\u0000\u0005,\u0006ᐼ\u0000\u0007ᐉ\u0002", new Object[]{C45240c.f118157a, "b", "a", C80012i.class, "d", C48672ag.m85260c(), C138131m.class, "e"});
            case 3:
                return new C111765b();
            case 4:
                return new C111764a();
            case 5:
                return f310654f;
            case 6:
                C63010eb ebVar = f310655h;
                if (ebVar == null) {
                    synchronized (C111765b.class) {
                        ebVar = f310655h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f310654f);
                            f310655h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
