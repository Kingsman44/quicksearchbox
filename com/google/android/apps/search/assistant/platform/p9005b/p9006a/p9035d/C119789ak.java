package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ak */
/* compiled from: PG */
public final class C119789ak extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C119789ak f333656k;

    /* renamed from: m */
    private static volatile C63010eb f333657m;

    /* renamed from: a */
    public int f333658a;

    /* renamed from: b */
    public C62971cq f333659b = emptyProtobufList();

    /* renamed from: c */
    public C119812bg f333660c;

    /* renamed from: d */
    public C119880du f333661d;

    /* renamed from: e */
    public C119779aa f333662e;

    /* renamed from: f */
    public C119893l f333663f;

    /* renamed from: g */
    public C119829bx f333664g;

    /* renamed from: h */
    public C119818bm f333665h;

    /* renamed from: i */
    public C119869dj f333666i;

    /* renamed from: j */
    public C119787ai f333667j;

    /* renamed from: l */
    private byte f333668l = 2;

    static {
        C119789ak akVar = new C119789ak();
        f333656k = akVar;
        C62942bv.registerDefaultInstance(C119789ak.class, akVar);
    }

    private C119789ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333668l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333668l = b;
                return null;
            case 2:
                return newMessageInfo(f333656k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0002\u0001ဉ\u0005\u0002\u001b\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဉ\u0001\u0006ဉ\u0000\u0007ဉ\u0002\bဉ\u0006\tဉ\u0007", new Object[]{"a", C19618h.f54585a, "b", C32836cd.class, C10662f.f35572a, C30325g.f82003a, "d", C45240c.f118157a, "e", "i", "j"});
            case 3:
                return new C119789ak();
            case 4:
                return new C119788aj();
            case 5:
                return f333656k;
            case 6:
                C63010eb ebVar = f333657m;
                if (ebVar == null) {
                    synchronized (C119789ak.class) {
                        ebVar = f333657m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333656k);
                            f333657m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
