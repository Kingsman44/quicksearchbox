package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.mb */
/* compiled from: PG */
public final class C60261mb extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60261mb f163036g;

    /* renamed from: h */
    private static volatile C63010eb f163037h;

    /* renamed from: a */
    public int f163038a;

    /* renamed from: b */
    public int f163039b;

    /* renamed from: c */
    public C62971cq f163040c = emptyProtobufList();

    /* renamed from: d */
    public int f163041d;

    /* renamed from: e */
    public int f163042e;

    /* renamed from: f */
    public int f163043f;

    static {
        C60261mb mbVar = new C60261mb();
        f163036g = mbVar;
        C62942bv.registerDefaultInstance(C60261mb.class, mbVar);
    }

    private C60261mb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f163036g, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001b\u0004ဋ\u0002\nဋ\b\u000bဌ\t", new Object[]{"a", "b", C60260ma.f163035a, C45240c.f118157a, C60241lo.class, "d", "e", C10662f.f35572a, C60252lz.f163023a});
            case 3:
                return new C60261mb();
            case 4:
                return new C60251ly();
            case 5:
                return f163036g;
            case 6:
                C63010eb ebVar = f163037h;
                if (ebVar == null) {
                    synchronized (C60261mb.class) {
                        ebVar = f163037h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163036g);
                            f163037h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
