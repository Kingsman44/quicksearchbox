package com.google.android.libraries.assistant.p1594s.p1599c;

import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19220d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.c.d */
/* compiled from: PG */
public final class C19202d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19202d f53762d;

    /* renamed from: f */
    private static volatile C63010eb f53763f;

    /* renamed from: a */
    public C62971cq f53764a;

    /* renamed from: b */
    public C62971cq f53765b;

    /* renamed from: c */
    public C62971cq f53766c;

    /* renamed from: e */
    private byte f53767e = 2;

    static {
        C19202d dVar = new C19202d();
        f53762d = dVar;
        C62942bv.registerDefaultInstance(C19202d.class, dVar);
    }

    private C19202d() {
        emptyIntList();
        this.f53764a = emptyProtobufList();
        this.f53765b = emptyProtobufList();
        this.f53766c = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53767e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53767e = b;
                return null;
            case 2:
                return newMessageInfo(f53762d, "\u0001\u0003\u0000\u0000\u0001È\u0003\u0000\u0003\u0002\u0001ЛdЛÈ\u001b", new Object[]{"a", C19220d.class, "b", C19210l.class, C45240c.f118157a, C19206h.class});
            case 3:
                return new C19202d();
            case 4:
                return new C19201c();
            case 5:
                return f53762d;
            case 6:
                C63010eb ebVar = f53763f;
                if (ebVar == null) {
                    synchronized (C19202d.class) {
                        ebVar = f53763f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53762d);
                            f53763f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
