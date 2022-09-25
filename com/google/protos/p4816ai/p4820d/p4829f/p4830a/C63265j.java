package com.google.protos.p4816ai.p4820d.p4829f.p4830a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.f.a.j */
/* compiled from: PG */
public final class C63265j extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C63265j f170990j;

    /* renamed from: k */
    private static volatile C63010eb f170991k;

    /* renamed from: a */
    public int f170992a;

    /* renamed from: b */
    public C63261f f170993b;

    /* renamed from: c */
    public boolean f170994c;

    /* renamed from: d */
    public boolean f170995d;

    /* renamed from: e */
    public long f170996e;

    /* renamed from: f */
    public int f170997f;

    /* renamed from: g */
    public C62971cq f170998g = emptyProtobufList();

    /* renamed from: h */
    public boolean f170999h;

    /* renamed from: i */
    public boolean f171000i;

    static {
        C63265j jVar = new C63265j();
        f170990j = jVar;
        C62942bv.registerDefaultInstance(C63265j.class, jVar);
    }

    private C63265j() {
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
                return newMessageInfo(f170990j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0006ဂ\u0005\u0007င\u0006\b\u001b\tဇ\u0007\nဇ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C63264i.class, C19618h.f54585a, "i"});
            case 3:
                return new C63265j();
            case 4:
                return new C63262g();
            case 5:
                return f170990j;
            case 6:
                C63010eb ebVar = f170991k;
                if (ebVar == null) {
                    synchronized (C63265j.class) {
                        ebVar = f170991k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170990j);
                            f170991k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
