package com.google.p427am.p432b.p433a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.al */
/* compiled from: PG */
public final class C8633al extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C8633al f29901j;

    /* renamed from: k */
    private static volatile C63010eb f29902k;

    /* renamed from: a */
    public C8693w f29903a;

    /* renamed from: b */
    public C8642au f29904b;

    /* renamed from: c */
    public C8683m f29905c;

    /* renamed from: d */
    public C8631aj f29906d;

    /* renamed from: e */
    public C8636ao f29907e;

    /* renamed from: f */
    public C8696z f29908f;

    /* renamed from: g */
    public C8624ac f29909g;

    /* renamed from: h */
    public C8645ax f29910h;

    /* renamed from: i */
    public C8687q f29911i;

    static {
        C8633al alVar = new C8633al();
        f29901j = alVar;
        C62942bv.registerDefaultInstance(C8633al.class, alVar);
    }

    private C8633al() {
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
                return newMessageInfo(f29901j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C8633al();
            case 4:
                return new C8632ak();
            case 5:
                return f29901j;
            case 6:
                C63010eb ebVar = f29902k;
                if (ebVar == null) {
                    synchronized (C8633al.class) {
                        ebVar = f29902k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29901j);
                            f29902k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
