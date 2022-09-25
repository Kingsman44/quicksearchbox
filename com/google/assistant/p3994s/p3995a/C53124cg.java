package com.google.assistant.p3994s.p3995a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.knowledge.p4671b.C61820m;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.cg */
/* compiled from: PG */
public final class C53124cg extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53124cg f139219h;

    /* renamed from: j */
    private static volatile C63010eb f139220j;

    /* renamed from: a */
    public int f139221a;

    /* renamed from: b */
    public C54188e f139222b;

    /* renamed from: c */
    public C51334dw f139223c;

    /* renamed from: d */
    public C51715bm f139224d;

    /* renamed from: e */
    public C61820m f139225e;

    /* renamed from: f */
    public boolean f139226f;

    /* renamed from: g */
    public C53274hv f139227g;

    /* renamed from: i */
    private byte f139228i = 2;

    static {
        C53124cg cgVar = new C53124cg();
        f139219h = cgVar;
        C62942bv.registerDefaultInstance(C53124cg.class, cgVar);
    }

    private C53124cg() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139228i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139228i = b;
                return null;
            case 2:
                return newMessageInfo(f139219h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0006ဇ\u0004\u0007ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C53124cg();
            case 4:
                return new C53123cf();
            case 5:
                return f139219h;
            case 6:
                C63010eb ebVar = f139220j;
                if (ebVar == null) {
                    synchronized (C53124cg.class) {
                        ebVar = f139220j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139219h);
                            f139220j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
