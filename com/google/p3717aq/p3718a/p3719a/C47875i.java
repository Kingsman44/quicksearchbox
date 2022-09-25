package com.google.p3717aq.p3718a.p3719a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.C48884b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.a.a.i */
/* compiled from: PG */
public final class C47875i extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C47875i f123945g;

    /* renamed from: i */
    private static volatile C63010eb f123946i;

    /* renamed from: a */
    public int f123947a = 0;

    /* renamed from: b */
    public Object f123948b;

    /* renamed from: c */
    public int f123949c;

    /* renamed from: d */
    public C47868b f123950d;

    /* renamed from: e */
    public int f123951e;

    /* renamed from: f */
    public int f123952f;

    /* renamed from: h */
    private byte f123953h = 2;

    static {
        C47875i iVar = new C47875i();
        f123945g = iVar;
        C62942bv.registerDefaultInstance(C47875i.class, iVar);
    }

    private C47875i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f123953h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f123953h = b;
                return null;
            case 2:
                return newMessageInfo(f123945g, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ȼ\u0000\u0002\t\u0003м\u0000\u0004\f\u0005\u0004\u0006\u0004", new Object[]{"b", "a", "d", C48884b.class, "e", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C47875i();
            case 4:
                return new C47873g();
            case 5:
                return f123945g;
            case 6:
                C63010eb ebVar = f123946i;
                if (ebVar == null) {
                    synchronized (C47875i.class) {
                        ebVar = f123946i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123945g);
                            f123946i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
