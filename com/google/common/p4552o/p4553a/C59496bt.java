package com.google.common.p4552o.p4553a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.bt */
/* compiled from: PG */
public final class C59496bt extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59496bt f157860g;

    /* renamed from: i */
    private static volatile C63010eb f157861i;

    /* renamed from: a */
    public int f157862a;

    /* renamed from: b */
    public int f157863b;

    /* renamed from: c */
    public int f157864c;

    /* renamed from: d */
    public C62971cq f157865d = emptyProtobufList();

    /* renamed from: e */
    public int f157866e;

    /* renamed from: f */
    public long f157867f;

    /* renamed from: h */
    private byte f157868h = 2;

    static {
        C59496bt btVar = new C59496bt();
        f157860g = btVar;
        C62942bv.registerDefaultInstance(C59496bt.class, btVar);
    }

    private C59496bt() {
    }

    /* renamed from: a */
    public final void mo56969a() {
        C62971cq cqVar = this.f157865d;
        if (!cqVar.mo58948c()) {
            this.f157865d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f157868h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f157868h = b;
                return null;
            case 2:
                return newMessageInfo(f157860g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001င\u0000\u0002င\u0001\u0003Л\u0004ဌ\u0002\u0005ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C59527cx.class, "e", C59495bs.f157859a, C10662f.f35572a});
            case 3:
                return new C59496bt();
            case 4:
                return new C59494br();
            case 5:
                return f157860g;
            case 6:
                C63010eb ebVar = f157861i;
                if (ebVar == null) {
                    synchronized (C59496bt.class) {
                        ebVar = f157861i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157860g);
                            f157861i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
