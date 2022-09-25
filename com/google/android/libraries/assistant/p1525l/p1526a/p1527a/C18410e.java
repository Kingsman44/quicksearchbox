package com.google.android.libraries.assistant.p1525l.p1526a.p1527a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.l.a.a.e */
/* compiled from: PG */
public final class C18410e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C18410e f52247d;

    /* renamed from: f */
    private static volatile C63010eb f52248f;

    /* renamed from: a */
    public int f52249a = 0;

    /* renamed from: b */
    public Object f52250b;

    /* renamed from: c */
    public int f52251c;

    /* renamed from: e */
    private int f52252e;

    static {
        C18410e eVar = new C18410e();
        f52247d = eVar;
        C62942bv.registerDefaultInstance(C18410e.class, eVar);
    }

    private C18410e() {
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
                return newMessageInfo(f52247d, "\u0000\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006ဌ\u0000", new Object[]{"b", "a", "e", C119904w.class, C119885dz.class, C119785ag.class, C18409d.class, C45240c.f118157a});
            case 3:
                return new C18410e();
            case 4:
                return new C18406a();
            case 5:
                return f52247d;
            case 6:
                C63010eb ebVar = f52248f;
                if (ebVar == null) {
                    synchronized (C18410e.class) {
                        ebVar = f52248f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52247d);
                            f52248f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
