package com.google.android.apps.search.googleapp.search.suggest;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ag */
/* compiled from: PG */
public final class C138015ag extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C138015ag f375479h;

    /* renamed from: j */
    private static volatile C63010eb f375480j;

    /* renamed from: a */
    public int f375481a;

    /* renamed from: b */
    public int f375482b;

    /* renamed from: c */
    public C62971cq f375483c = emptyProtobufList();

    /* renamed from: d */
    public C138010ab f375484d;

    /* renamed from: e */
    public int f375485e;

    /* renamed from: f */
    public boolean f375486f;

    /* renamed from: g */
    public boolean f375487g;

    /* renamed from: i */
    private byte f375488i = 2;

    static {
        C138015ag agVar = new C138015ag();
        f375479h = agVar;
        C62942bv.registerDefaultInstance(C138015ag.class, agVar);
    }

    private C138015ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f375488i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f375488i = b;
                return null;
            case 2:
                return newMessageInfo(f375479h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л\u0003ဉ\u0001\u0004ဌ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", C138014af.m224327b(), C45240c.f118157a, C138030av.class, "d", "e", C138682z.f377206a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C138015ag();
            case 4:
                return new C138681y();
            case 5:
                return f375479h;
            case 6:
                C63010eb ebVar = f375480j;
                if (ebVar == null) {
                    synchronized (C138015ag.class) {
                        ebVar = f375480j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375479h);
                            f375480j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
