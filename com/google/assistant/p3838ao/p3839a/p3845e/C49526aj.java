package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5042u.C65346h;

/* renamed from: com.google.assistant.ao.a.e.aj */
/* compiled from: PG */
public final class C49526aj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C49526aj f127782h;

    /* renamed from: i */
    private static volatile C63010eb f127783i;

    /* renamed from: a */
    public int f127784a;

    /* renamed from: b */
    public String f127785b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127786c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f127787d;

    /* renamed from: e */
    public double f127788e;

    /* renamed from: f */
    public C62971cq f127789f = emptyProtobufList();

    /* renamed from: g */
    public int f127790g;

    static {
        C49526aj ajVar = new C49526aj();
        f127782h = ajVar;
        C62942bv.registerDefaultInstance(C49526aj.class, ajVar);
    }

    private C49526aj() {
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
                return newMessageInfo(f127782h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003က\u0003\u0004\u001b\u0005င\u0002\u0006ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C49524ah.class, "d", C30325g.f82003a, C65346h.m96673c()});
            case 3:
                return new C49526aj();
            case 4:
                return new C49525ai();
            case 5:
                return f127782h;
            case 6:
                C63010eb ebVar = f127783i;
                if (ebVar == null) {
                    synchronized (C49526aj.class) {
                        ebVar = f127783i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127782h);
                            f127783i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
