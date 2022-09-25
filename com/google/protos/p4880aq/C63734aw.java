package com.google.protos.p4880aq;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.aw */
/* compiled from: PG */
public final class C63734aw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f172312e = new C63729ar();

    /* renamed from: h */
    public static final C63734aw f172313h;

    /* renamed from: j */
    private static volatile C63010eb f172314j;

    /* renamed from: a */
    public int f172315a;

    /* renamed from: b */
    public int f172316b;

    /* renamed from: c */
    public C63718ag f172317c;

    /* renamed from: d */
    public C62961ch f172318d = emptyIntList();

    /* renamed from: f */
    public C63733av f172319f;

    /* renamed from: g */
    public boolean f172320g;

    /* renamed from: i */
    private int f172321i;

    static {
        C63734aw awVar = new C63734aw();
        f172313h = awVar;
        C62942bv.registerDefaultInstance(C63734aw.class, awVar);
    }

    private C63734aw() {
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
                return newMessageInfo(f172313h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004,\u0005ဉ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", "i", C45240c.f118157a, "d", C63739ba.m96295b(), C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C63734aw();
            case 4:
                return new C63730as();
            case 5:
                return f172313h;
            case 6:
                C63010eb ebVar = f172314j;
                if (ebVar == null) {
                    synchronized (C63734aw.class) {
                        ebVar = f172314j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172313h);
                            f172314j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
