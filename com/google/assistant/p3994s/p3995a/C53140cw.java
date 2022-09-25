package com.google.assistant.p3994s.p3995a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.cw */
/* compiled from: PG */
public final class C53140cw extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53140cw f139278h;

    /* renamed from: j */
    private static volatile C63010eb f139279j;

    /* renamed from: a */
    public int f139280a;

    /* renamed from: b */
    public C53253ha f139281b;

    /* renamed from: c */
    public C53124cg f139282c;

    /* renamed from: d */
    public C62971cq f139283d = emptyProtobufList();

    /* renamed from: e */
    public int f139284e;

    /* renamed from: f */
    public int f139285f;

    /* renamed from: g */
    public C62971cq f139286g = emptyProtobufList();

    /* renamed from: i */
    private byte f139287i = 2;

    static {
        C53140cw cwVar = new C53140cw();
        f139278h = cwVar;
        C62942bv.registerDefaultInstance(C53140cw.class, cwVar);
    }

    private C53140cw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139287i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139287i = b;
                return null;
            case 2:
                return newMessageInfo(f139278h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0002\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဌ\u0002\u0005ဌ\u0003\t\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C53151dg.class, "e", C53306j.m86810b(), C10662f.f35572a, C53138cu.f139277a, C30325g.f82003a, C53136cs.class});
            case 3:
                return new C53140cw();
            case 4:
                return new C53137ct();
            case 5:
                return f139278h;
            case 6:
                C63010eb ebVar = f139279j;
                if (ebVar == null) {
                    synchronized (C53140cw.class) {
                        ebVar = f139279j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139278h);
                            f139279j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
