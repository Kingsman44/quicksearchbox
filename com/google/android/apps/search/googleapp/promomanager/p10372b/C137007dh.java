package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4880aq.C63733av;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.dh */
/* compiled from: PG */
public final class C137007dh extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C137007dh f372869h;

    /* renamed from: j */
    private static volatile C63010eb f372870j;

    /* renamed from: a */
    public int f372871a;

    /* renamed from: b */
    public int f372872b = 0;

    /* renamed from: c */
    public Object f372873c;

    /* renamed from: d */
    public int f372874d;

    /* renamed from: e */
    public C63909aw f372875e;

    /* renamed from: f */
    public boolean f372876f;

    /* renamed from: g */
    public boolean f372877g;

    /* renamed from: i */
    private byte f372878i = 2;

    static {
        C137007dh dhVar = new C137007dh();
        f372869h = dhVar;
        C62942bv.registerDefaultInstance(C137007dh.class, dhVar);
    }

    private C137007dh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f372878i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f372878i = b;
                return null;
            case 2:
                return newMessageInfo(f372869h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{C45240c.f118157a, "b", "a", C63733av.class, C63959w.class, "d", C63926bm.m96319b(), "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C137007dh();
            case 4:
                return new C137005df();
            case 5:
                return f372869h;
            case 6:
                C63010eb ebVar = f372870j;
                if (ebVar == null) {
                    synchronized (C137007dh.class) {
                        ebVar = f372870j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372869h);
                            f372870j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
