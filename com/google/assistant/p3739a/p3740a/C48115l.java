package com.google.assistant.p3739a.p3740a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.a.a.l */
/* compiled from: PG */
public final class C48115l extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C48115l f124522j;

    /* renamed from: k */
    private static volatile C63010eb f124523k;

    /* renamed from: a */
    public int f124524a;

    /* renamed from: b */
    public C63088z f124525b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f124526c;

    /* renamed from: d */
    public C63088z f124527d;

    /* renamed from: e */
    public C63088z f124528e;

    /* renamed from: f */
    public int f124529f;

    /* renamed from: g */
    public int f124530g;

    /* renamed from: h */
    public int f124531h;

    /* renamed from: i */
    public int f124532i;

    static {
        C48115l lVar = new C48115l();
        f124522j = lVar;
        C62942bv.registerDefaultInstance(C48115l.class, lVar);
    }

    private C48115l() {
        C63088z zVar = C63088z.f170246b;
        this.f124526c = zVar;
        this.f124527d = zVar;
        this.f124528e = zVar;
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
                return newMessageInfo(f124522j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002\n\u0003\n\u0004\n\u0005\n\u0006\f\u0007\u0004\b\f\t\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C48115l();
            case 4:
                return new C48113j();
            case 5:
                return f124522j;
            case 6:
                C63010eb ebVar = f124523k;
                if (ebVar == null) {
                    synchronized (C48115l.class) {
                        ebVar = f124523k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124522j);
                            f124523k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
