package com.google.protos.p4753aa.p4754a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aa.a.c */
/* compiled from: PG */
public final class C63098c extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C63098c f170263l;

    /* renamed from: m */
    private static volatile C63010eb f170264m;

    /* renamed from: a */
    public int f170265a;

    /* renamed from: b */
    public int f170266b;

    /* renamed from: c */
    public int f170267c;

    /* renamed from: d */
    public int f170268d;

    /* renamed from: e */
    public int f170269e;

    /* renamed from: f */
    public int f170270f;

    /* renamed from: g */
    public int f170271g;

    /* renamed from: h */
    public boolean f170272h;

    /* renamed from: i */
    public int f170273i;

    /* renamed from: j */
    public boolean f170274j;

    /* renamed from: k */
    public C62961ch f170275k = emptyIntList();

    static {
        C63098c cVar = new C63098c();
        f170263l = cVar;
        C62942bv.registerDefaultInstance(C63098c.class, cVar);
    }

    private C63098c() {
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
                return newMessageInfo(f170263l, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0006င\u0005\u0007င\u0006\bင\u0007\nင\t\u000eဇ\u000b\u000fင\f\u0011\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a});
            case 3:
                return new C63098c();
            case 4:
                return new C63097b();
            case 5:
                return f170263l;
            case 6:
                C63010eb ebVar = f170264m;
                if (ebVar == null) {
                    synchronized (C63098c.class) {
                        ebVar = f170264m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170263l);
                            f170264m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
