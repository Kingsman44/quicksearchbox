package com.google.protos.p4985f.p5030q.p5032b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.ap */
/* compiled from: PG */
public final class C65031ap extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C65031ap f176100j;

    /* renamed from: k */
    private static volatile C63010eb f176101k;

    /* renamed from: a */
    public int f176102a;

    /* renamed from: b */
    public int f176103b = 0;

    /* renamed from: c */
    public Object f176104c;

    /* renamed from: d */
    public int f176105d;

    /* renamed from: e */
    public C65030ao f176106e;

    /* renamed from: f */
    public String f176107f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f176108g;

    /* renamed from: h */
    public boolean f176109h;

    /* renamed from: i */
    public boolean f176110i;

    static {
        C65031ap apVar = new C65031ap();
        f176100j = apVar;
        C62942bv.registerDefaultInstance(C65031ap.class, apVar);
    }

    private C65031ap() {
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
                return newMessageInfo(f176100j, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001ျ\u0000\u0003င\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C65031ap();
            case 4:
                return new C65028am();
            case 5:
                return f176100j;
            case 6:
                C63010eb ebVar = f176101k;
                if (ebVar == null) {
                    synchronized (C65031ap.class) {
                        ebVar = f176101k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176100j);
                            f176101k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
