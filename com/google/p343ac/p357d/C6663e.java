package com.google.p343ac.p357d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ac.d.e */
/* compiled from: PG */
public final class C6663e extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C6663e f19901o;

    /* renamed from: p */
    private static volatile C63010eb f19902p;

    /* renamed from: a */
    public int f19903a;

    /* renamed from: b */
    public int f19904b = 0;

    /* renamed from: c */
    public Object f19905c;

    /* renamed from: d */
    public int f19906d = 0;

    /* renamed from: e */
    public Object f19907e;

    /* renamed from: f */
    public String f19908f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f19909g;

    /* renamed from: h */
    public C62971cq f19910h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public C63088z f19911i;

    /* renamed from: j */
    public int f19912j;

    /* renamed from: k */
    public int f19913k;

    /* renamed from: l */
    public boolean f19914l;

    /* renamed from: m */
    public long f19915m;

    /* renamed from: n */
    public C63088z f19916n;

    static {
        C6663e eVar = new C6663e();
        f19901o = eVar;
        C62942bv.registerDefaultInstance(C6663e.class, eVar);
    }

    private C6663e() {
        emptyIntList();
        this.f19911i = C63088z.f170246b;
        this.f19916n = C63088z.f170246b;
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
                return newMessageInfo(f19901o, "\u0001\r\u0002\u0001\u0001\u000f\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002့\u0000\u0003\u001a\u0005ည\u0004\u0007ျ\u0001\bဌ\b\tဌ\t\nျ\u0001\u000bဇ\u0003\fဇ\n\rဎ\u000b\u000eည\f\u000fဵ\u0000", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C19618h.f54585a, "i", "j", C6661c.f19900a, C19621k.f54601a, C6660b.f19899a, C30325g.f82003a, "l", "m", C48004n.f124238a});
            case 3:
                return new C6663e();
            case 4:
                return new C6659a();
            case 5:
                return f19901o;
            case 6:
                C63010eb ebVar = f19902p;
                if (ebVar == null) {
                    synchronized (C6663e.class) {
                        ebVar = f19902p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19901o);
                            f19902p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
