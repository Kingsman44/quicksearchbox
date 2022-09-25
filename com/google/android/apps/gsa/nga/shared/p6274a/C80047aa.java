package com.google.android.apps.gsa.nga.shared.p6274a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49328e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.aa */
/* compiled from: PG */
public final class C80047aa extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C80047aa f219655i;

    /* renamed from: k */
    private static volatile C63010eb f219656k;

    /* renamed from: a */
    public int f219657a = 0;

    /* renamed from: b */
    public Object f219658b;

    /* renamed from: c */
    public int f219659c;

    /* renamed from: d */
    public int f219660d;

    /* renamed from: e */
    public int f219661e;

    /* renamed from: f */
    public String f219662f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public double f219663g;

    /* renamed from: h */
    public long f219664h;

    /* renamed from: j */
    private byte f219665j = 2;

    static {
        C80047aa aaVar = new C80047aa();
        f219655i = aaVar;
        C62942bv.registerDefaultInstance(C80047aa.class, aaVar);
    }

    private C80047aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219665j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219665j = b;
                return null;
            case 2:
                return newMessageInfo(f219655i, "\u0000\u0014\u0001\u0000\u0001\u0015\u0014\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004Ȉ\u0005\u0000\u0006\u0002\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0014<\u0000\u0015<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C80058d.class, C80066l.class, C80060f.class, C80053ag.class, C80075u.class, C80056b.class, C80051ae.class, C80073s.class, C80062h.class, C80064j.class, C80077w.class, C80070p.class, C49328e.class, C80049ac.class});
            case 3:
                return new C80047aa();
            case 4:
                return new C80078x();
            case 5:
                return f219655i;
            case 6:
                C63010eb ebVar = f219656k;
                if (ebVar == null) {
                    synchronized (C80047aa.class) {
                        ebVar = f219656k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219655i);
                            f219656k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
