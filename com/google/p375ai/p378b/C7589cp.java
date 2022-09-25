package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57055c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.cp */
/* compiled from: PG */
public final class C7589cp extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C7589cp f26222o;

    /* renamed from: p */
    private static volatile C63010eb f26223p;

    /* renamed from: a */
    public int f26224a;

    /* renamed from: b */
    public int f26225b = 0;

    /* renamed from: c */
    public Object f26226c;

    /* renamed from: d */
    public C7580cg f26227d;

    /* renamed from: e */
    public float f26228e;

    /* renamed from: f */
    public C62971cq f26229f = emptyProtobufList();

    /* renamed from: g */
    public boolean f26230g = true;

    /* renamed from: h */
    public C62971cq f26231h = emptyProtobufList();

    /* renamed from: i */
    public C62971cq f26232i = emptyProtobufList();

    /* renamed from: j */
    public String f26233j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f26234k;

    /* renamed from: l */
    public String f26235l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f26236m;

    /* renamed from: n */
    public float f26237n;

    static {
        C7589cp cpVar = new C7589cp();
        f26222o = cpVar;
        C62942bv.registerDefaultInstance(C7589cp.class, cpVar);
    }

    private C7589cp() {
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
                return newMessageInfo(f26222o, "\u0001\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0003\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ခ\u0004\u0005\u001b\u0006\u001b\u0007ဈ\u0006\b\u001b\tဇ\u0005\nဌ\u0007\u000bဈ\b\fြ\u0000\rဇ\t\u000eဉ\u0003\u000fခ\n", new Object[]{C45240c.f118157a, "b", "a", C7588co.class, C7586cm.class, "e", C19618h.f54585a, C7818lb.class, "i", C7818lb.class, "j", C10662f.f35572a, C7818lb.class, C30325g.f82003a, C19621k.f54601a, C57055c.f152310a, "l", C7580cg.class, "m", "d", C48004n.f124238a});
            case 3:
                return new C7589cp();
            case 4:
                return new C7578ce();
            case 5:
                return f26222o;
            case 6:
                C63010eb ebVar = f26223p;
                if (ebVar == null) {
                    synchronized (C7589cp.class) {
                        ebVar = f26223p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26222o);
                            f26223p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
