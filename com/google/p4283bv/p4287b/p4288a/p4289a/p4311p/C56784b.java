package com.google.p4283bv.p4287b.p4288a.p4289a.p4311p;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.p.b */
/* compiled from: PG */
public final class C56784b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C56784b f151520j;

    /* renamed from: k */
    private static volatile C63010eb f151521k;

    /* renamed from: a */
    public int f151522a;

    /* renamed from: b */
    public int f151523b;

    /* renamed from: c */
    public int f151524c;

    /* renamed from: d */
    public int f151525d;

    /* renamed from: e */
    public C62961ch f151526e = emptyIntList();

    /* renamed from: f */
    public boolean f151527f;

    /* renamed from: g */
    public long f151528g;

    /* renamed from: h */
    public int f151529h;

    /* renamed from: i */
    public C56786d f151530i;

    static {
        C56784b bVar = new C56784b();
        f151520j = bVar;
        C62942bv.registerDefaultInstance(C56784b.class, bVar);
    }

    private C56784b() {
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
                return newMessageInfo(f151520j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0001\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u0016\u0006ဇ\u0004\u0007ဂ\u0005\bင\u0006\tဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C56784b();
            case 4:
                return new C56783a();
            case 5:
                return f151520j;
            case 6:
                C63010eb ebVar = f151521k;
                if (ebVar == null) {
                    synchronized (C56784b.class) {
                        ebVar = f151521k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151520j);
                            f151521k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
