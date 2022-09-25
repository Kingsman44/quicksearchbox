package com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.a.a.h */
/* compiled from: PG */
public final class C131847h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C131847h f360065h;

    /* renamed from: i */
    private static volatile C63010eb f360066i;

    /* renamed from: a */
    public int f360067a;

    /* renamed from: b */
    public boolean f360068b;

    /* renamed from: c */
    public boolean f360069c;

    /* renamed from: d */
    public boolean f360070d;

    /* renamed from: e */
    public C131843d f360071e;

    /* renamed from: f */
    public C131841b f360072f;

    /* renamed from: g */
    public C131845f f360073g;

    static {
        C131847h hVar = new C131847h();
        f360065h = hVar;
        C62942bv.registerDefaultInstance(C131847h.class, hVar);
    }

    private C131847h() {
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
                return newMessageInfo(f360065h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C131847h();
            case 4:
                return new C131846g();
            case 5:
                return f360065h;
            case 6:
                C63010eb ebVar = f360066i;
                if (ebVar == null) {
                    synchronized (C131847h.class) {
                        ebVar = f360066i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360065h);
                            f360066i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
