package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.sd */
/* compiled from: PG */
public final class C60499sd extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60499sd f163777j;

    /* renamed from: k */
    private static volatile C63010eb f163778k;

    /* renamed from: a */
    public int f163779a;

    /* renamed from: b */
    public int f163780b;

    /* renamed from: c */
    public int f163781c;

    /* renamed from: d */
    public int f163782d;

    /* renamed from: e */
    public int f163783e;

    /* renamed from: f */
    public int f163784f;

    /* renamed from: g */
    public int f163785g;

    /* renamed from: h */
    public int f163786h;

    /* renamed from: i */
    public C62971cq f163787i = emptyProtobufList();

    static {
        C60499sd sdVar = new C60499sd();
        f163777j = sdVar;
        C62942bv.registerDefaultInstance(C60499sd.class, sdVar);
    }

    private C60499sd() {
    }

    /* renamed from: a */
    public final void mo57101a() {
        C62971cq cqVar = this.f163787i;
        if (!cqVar.mo58948c()) {
            this.f163787i = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f163777j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဌ\u0005\u0007ဋ\u0006\b\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C60498sc.f163776a, C19618h.f54585a, "i", C60489ru.class});
            case 3:
                return new C60499sd();
            case 4:
                return new C60497sb();
            case 5:
                return f163777j;
            case 6:
                C63010eb ebVar = f163778k;
                if (ebVar == null) {
                    synchronized (C60499sd.class) {
                        ebVar = f163778k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163777j);
                            f163778k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
