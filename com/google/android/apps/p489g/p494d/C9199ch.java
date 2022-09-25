package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.ch */
/* compiled from: PG */
public final class C9199ch extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9199ch f31764g;

    /* renamed from: i */
    private static volatile C63010eb f31765i;

    /* renamed from: a */
    public int f31766a;

    /* renamed from: b */
    public String f31767b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f31768c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f31769d;

    /* renamed from: e */
    public String f31770e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C9141ad f31771f;

    /* renamed from: h */
    private byte f31772h = 2;

    static {
        C9199ch chVar = new C9199ch();
        f31764g = chVar;
        C62942bv.registerDefaultInstance(C9199ch.class, chVar);
    }

    private C9199ch() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31772h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31772h = b;
                return null;
            case 2:
                return newMessageInfo(f31764g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0004ဌ\u0001\u0005ဈ\u0002\u0006ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C9198cg.m23687b(), "e", C10662f.f35572a});
            case 3:
                return new C9199ch();
            case 4:
                return new C9196ce();
            case 5:
                return f31764g;
            case 6:
                C63010eb ebVar = f31765i;
                if (ebVar == null) {
                    synchronized (C9199ch.class) {
                        ebVar = f31765i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31764g);
                            f31765i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
