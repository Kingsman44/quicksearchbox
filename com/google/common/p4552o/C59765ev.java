package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.common.o.ev */
/* compiled from: PG */
public final class C59765ev extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C59765ev f161477i;

    /* renamed from: j */
    private static volatile C63010eb f161478j;

    /* renamed from: a */
    public int f161479a;

    /* renamed from: b */
    public String f161480b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f161481c;

    /* renamed from: d */
    public boolean f161482d;

    /* renamed from: e */
    public boolean f161483e;

    /* renamed from: f */
    public C62971cq f161484f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f161485g = emptyProtobufList();

    /* renamed from: h */
    public C59774fb f161486h;

    static {
        C59765ev evVar = new C59765ev();
        f161477i = evVar;
        C62942bv.registerDefaultInstance(C59765ev.class, evVar);
    }

    private C59765ev() {
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
                return newMessageInfo(f161477i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u001b\u0006\u001b\u0007ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C59763et.f161476a, "d", "e", C10662f.f35572a, C59782fj.class, C30325g.f82003a, C59786fn.class, C19618h.f54585a});
            case 3:
                return new C59765ev();
            case 4:
                return new C59762es();
            case 5:
                return f161477i;
            case 6:
                C63010eb ebVar = f161478j;
                if (ebVar == null) {
                    synchronized (C59765ev.class) {
                        ebVar = f161478j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161477i);
                            f161478j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
