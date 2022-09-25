package com.google.android.libraries.p11016ak;

import com.evernote.android.state.BuildConfig;
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
import p5285d.p5290b.p5291a.p5292a.C68164b;
import p5285d.p5290b.p5291a.p5292a.C68165ba;
import p5285d.p5290b.p5291a.p5292a.C68202o;

/* renamed from: com.google.android.libraries.ak.aa */
/* compiled from: PG */
public final class C147620aa extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C147620aa f398434l;

    /* renamed from: m */
    private static volatile C63010eb f398435m;

    /* renamed from: a */
    public C147630ak f398436a;

    /* renamed from: b */
    public int f398437b;

    /* renamed from: c */
    public int f398438c;

    /* renamed from: d */
    public int f398439d;

    /* renamed from: e */
    public C68164b f398440e;

    /* renamed from: f */
    public C62971cq f398441f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f398442g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C68165ba f398443h;

    /* renamed from: i */
    public C68202o f398444i;

    /* renamed from: j */
    public int f398445j;

    /* renamed from: k */
    public int f398446k;

    static {
        C147620aa aaVar = new C147620aa();
        f398434l = aaVar;
        C62942bv.registerDefaultInstance(C147620aa.class, aaVar);
    }

    private C147620aa() {
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
                return newMessageInfo(f398434l, "\u0000\u000b\u0000\u0000\u0001\f\u000b\u0000\u0001\u0000\u0001\t\u0002\u0004\u0003\u0004\u0004\f\u0005\t\u0006Ț\u0007Ȉ\b\t\t\t\n\f\f\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C147620aa();
            case 4:
                return new C147744z();
            case 5:
                return f398434l;
            case 6:
                C63010eb ebVar = f398435m;
                if (ebVar == null) {
                    synchronized (C147620aa.class) {
                        ebVar = f398435m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398434l);
                            f398435m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
