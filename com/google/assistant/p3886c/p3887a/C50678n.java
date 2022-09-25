package com.google.assistant.p3886c.p3887a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.n */
/* compiled from: PG */
public final class C50678n extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C50678n f131835l;

    /* renamed from: m */
    private static volatile C63010eb f131836m;

    /* renamed from: a */
    public int f131837a;

    /* renamed from: b */
    public C62971cq f131838b = emptyProtobufList();

    /* renamed from: c */
    public long f131839c;

    /* renamed from: d */
    public C62971cq f131840d = emptyProtobufList();

    /* renamed from: e */
    public long f131841e;

    /* renamed from: f */
    public long f131842f;

    /* renamed from: g */
    public long f131843g;

    /* renamed from: h */
    public long f131844h;

    /* renamed from: i */
    public int f131845i;

    /* renamed from: j */
    public boolean f131846j;

    /* renamed from: k */
    public C62971cq f131847k = emptyProtobufList();

    static {
        C50678n nVar = new C50678n();
        f131835l = nVar;
        C62942bv.registerDefaultInstance(C50678n.class, nVar);
    }

    private C50678n() {
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
                return newMessageInfo(f131835l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0004\bင\u0005\tဇ\u0006\n\u001b", new Object[]{"a", "b", C50676l.class, C45240c.f118157a, "d", C50666b.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C50674j.class});
            case 3:
                return new C50678n();
            case 4:
                return new C50677m();
            case 5:
                return f131835l;
            case 6:
                C63010eb ebVar = f131836m;
                if (ebVar == null) {
                    synchronized (C50678n.class) {
                        ebVar = f131836m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131835l);
                            f131836m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
