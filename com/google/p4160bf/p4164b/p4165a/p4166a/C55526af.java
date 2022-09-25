package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4160bf.p4167c.p4168a.p4169a.p4170a.p4171a.C55688b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.bf.b.a.a.af */
/* compiled from: PG */
public final class C55526af extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C55526af f146517o;

    /* renamed from: q */
    private static volatile C63010eb f146518q;

    /* renamed from: a */
    public int f146519a = 0;

    /* renamed from: b */
    public Object f146520b;

    /* renamed from: c */
    public String f146521c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f146522d;

    /* renamed from: e */
    public C55562bo f146523e;

    /* renamed from: f */
    public C62971cq f146524f = emptyProtobufList();

    /* renamed from: g */
    public long f146525g;

    /* renamed from: h */
    public long f146526h;

    /* renamed from: i */
    public String f146527i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C63070h f146528j;

    /* renamed from: k */
    public String f146529k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public long f146530l;

    /* renamed from: m */
    public int f146531m;

    /* renamed from: n */
    public C55688b f146532n;

    /* renamed from: p */
    private int f146533p;

    static {
        C55526af afVar = new C55526af();
        f146517o = afVar;
        C62942bv.registerDefaultInstance(C55526af.class, afVar);
    }

    private C55526af() {
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
                return newMessageInfo(f146517o, "\u0001\u0011\u0001\u0001\u0005\u0019\u0011\u0000\u0001\u0000\u0005\u001b\bဂ\b\tဂ\t\nဈ\u0001\fြ\u0000\rြ\u0000\u000eဉ\u0010\u000fဉ\u0005\u0010ဈ\u0011\u0011ြ\u0000\u0012ြ\u0000\u0014ဂ\u0012\u0015ဌ\u0013\u0016ဈ\u000f\u0017ဂ\u0004\u0018ဉ\u0014\u0019ြ\u0000", new Object[]{"b", "a", "p", C10662f.f35572a, C55525ae.class, C30325g.f82003a, C19618h.f54585a, C45240c.f118157a, C55586v.class, C55536ap.class, "j", "e", C19621k.f54601a, C55566bs.class, C55532al.class, "l", "m", C55544ax.f146569a, "i", "d", C48004n.f124238a, C55528ah.class});
            case 3:
                return new C55526af();
            case 4:
                return new C55523ac();
            case 5:
                return f146517o;
            case 6:
                C63010eb ebVar = f146518q;
                if (ebVar == null) {
                    synchronized (C55526af.class) {
                        ebVar = f146518q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146517o);
                            f146518q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
