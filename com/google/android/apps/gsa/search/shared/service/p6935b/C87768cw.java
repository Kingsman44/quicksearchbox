package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60003j;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.cw */
/* compiled from: PG */
public final class C87768cw extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C87768cw f237526k;

    /* renamed from: m */
    private static volatile C63010eb f237527m;

    /* renamed from: a */
    public int f237528a;

    /* renamed from: b */
    public C63088z f237529b = C63088z.f170246b;

    /* renamed from: c */
    public String f237530c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f237531d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f237532e;

    /* renamed from: f */
    public int f237533f;

    /* renamed from: g */
    public int f237534g;

    /* renamed from: h */
    public C60218r f237535h;

    /* renamed from: i */
    public C62971cq f237536i = emptyProtobufList();

    /* renamed from: j */
    public int f237537j;

    /* renamed from: l */
    private byte f237538l = 2;

    static {
        C87768cw cwVar = new C87768cw();
        f237526k = cwVar;
        C62942bv.registerDefaultInstance(C87768cw.class, cwVar);
    }

    private C87768cw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237538l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237538l = b;
                return null;
            case 2:
                return newMessageInfo(f237526k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0001\u0001ည\u0000\u0002ဈ\u0002\u0003ဌ\u0003\u0004ဌ\u0004\u0005ဈ\u0001\u0006ဌ\u0005\u0007ᐉ\u0006\b\u001b\tဌ\u0007", new Object[]{"a", "b", "d", "e", C87764cs.f237524a, C10662f.f35572a, C87766cu.f237525a, C45240c.f118157a, C30325g.f82003a, C87762cq.f237523a, C19618h.f54585a, "i", C60003j.class, "j", C88219to.f238455a});
            case 3:
                return new C87768cw();
            case 4:
                return new C87761cp();
            case 5:
                return f237526k;
            case 6:
                C63010eb ebVar = f237527m;
                if (ebVar == null) {
                    synchronized (C87768cw.class) {
                        ebVar = f237527m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237526k);
                            f237527m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
