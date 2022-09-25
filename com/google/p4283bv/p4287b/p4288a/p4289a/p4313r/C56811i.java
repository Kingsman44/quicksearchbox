package com.google.p4283bv.p4287b.p4288a.p4289a.p4313r;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4345d.p4346a.p4348b.p4349a.C56963b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.r.i */
/* compiled from: PG */
public final class C56811i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56811i f151593a;

    /* renamed from: e */
    private static volatile C63010eb f151594e;

    /* renamed from: b */
    private int f151595b;

    /* renamed from: c */
    private C56963b f151596c;

    /* renamed from: d */
    private byte f151597d = 2;

    static {
        C56811i iVar = new C56811i();
        f151593a = iVar;
        C62942bv.registerDefaultInstance(C56811i.class, iVar);
    }

    private C56811i() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151597d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151597d = b;
                return null;
            case 2:
                return newMessageInfo(f151593a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56811i();
            case 4:
                return new C56810h();
            case 5:
                return f151593a;
            case 6:
                C63010eb ebVar = f151594e;
                if (ebVar == null) {
                    synchronized (C56811i.class) {
                        ebVar = f151594e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151593a);
                            f151594e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
