package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.nx */
/* compiled from: PG */
public final class C52334nx extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52334nx f137353h;

    /* renamed from: j */
    private static volatile C63010eb f137354j;

    /* renamed from: a */
    public int f137355a = 0;

    /* renamed from: b */
    public Object f137356b;

    /* renamed from: c */
    public int f137357c = 0;

    /* renamed from: d */
    public Object f137358d;

    /* renamed from: e */
    public int f137359e;

    /* renamed from: f */
    public String f137360f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f137361g;

    /* renamed from: i */
    private int f137362i;

    static {
        C52334nx nxVar = new C52334nx();
        f137353h = nxVar;
        C62942bv.registerDefaultInstance(C52334nx.class, nxVar);
    }

    private C52334nx() {
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
                return newMessageInfo(f137353h, "\u0001\u0007\u0002\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ဈ\u0003\u0005ြ\u0001\u0006ြ\u0001\u0007င\u0006", new Object[]{"b", "a", "d", C45240c.f118157a, "i", "e", C52335ny.f137363a, C10662f.f35572a, C52329ns.class, C52325no.class, C30325g.f82003a});
            case 3:
                return new C52334nx();
            case 4:
                return new C52333nw();
            case 5:
                return f137353h;
            case 6:
                C63010eb ebVar = f137354j;
                if (ebVar == null) {
                    synchronized (C52334nx.class) {
                        ebVar = f137354j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137353h);
                            f137354j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
