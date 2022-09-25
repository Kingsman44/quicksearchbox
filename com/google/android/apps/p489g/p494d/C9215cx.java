package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7818lb;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57055c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.cx */
/* compiled from: PG */
public final class C9215cx extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C9215cx f31837o;

    /* renamed from: p */
    private static volatile C63010eb f31838p;

    /* renamed from: a */
    public int f31839a;

    /* renamed from: b */
    public int f31840b = 0;

    /* renamed from: c */
    public Object f31841c;

    /* renamed from: d */
    public C9206co f31842d;

    /* renamed from: e */
    public float f31843e;

    /* renamed from: f */
    public C62971cq f31844f = emptyProtobufList();

    /* renamed from: g */
    public boolean f31845g = true;

    /* renamed from: h */
    public C62971cq f31846h = emptyProtobufList();

    /* renamed from: i */
    public C62971cq f31847i = emptyProtobufList();

    /* renamed from: j */
    public String f31848j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f31849k;

    /* renamed from: l */
    public String f31850l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f31851m;

    /* renamed from: n */
    public float f31852n = 1.0f;

    static {
        C9215cx cxVar = new C9215cx();
        f31837o = cxVar;
        C62942bv.registerDefaultInstance(C9215cx.class, cxVar);
    }

    private C9215cx() {
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
                return newMessageInfo(f31837o, "\u0001\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0003\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ခ\u0004\u0005\u001b\u0006\u001b\u0007ဈ\u0006\b\u001b\tဇ\u0005\nဌ\u0007\u000bဈ\b\fြ\u0000\rဇ\t\u000eဉ\u0003\u000fခ\n", new Object[]{C45240c.f118157a, "b", "a", C9214cw.class, C9212cu.class, "e", C19618h.f54585a, C7818lb.class, "i", C7818lb.class, "j", C10662f.f35572a, C7818lb.class, C30325g.f82003a, C19621k.f54601a, C57055c.f152310a, "l", C9206co.class, "m", "d", C48004n.f124238a});
            case 3:
                return new C9215cx();
            case 4:
                return new C9204cm();
            case 5:
                return f31837o;
            case 6:
                C63010eb ebVar = f31838p;
                if (ebVar == null) {
                    synchronized (C9215cx.class) {
                        ebVar = f31838p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31837o);
                            f31838p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
