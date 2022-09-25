package com.google.assistant.p3886c.p3887a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3860as.C49794h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.l */
/* compiled from: PG */
public final class C50676l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50676l f131826h;

    /* renamed from: i */
    private static volatile C63010eb f131827i;

    /* renamed from: a */
    public int f131828a;

    /* renamed from: b */
    public String f131829b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f131830c;

    /* renamed from: d */
    public int f131831d;

    /* renamed from: e */
    public float f131832e;

    /* renamed from: f */
    public long f131833f;

    /* renamed from: g */
    public long f131834g;

    static {
        C50676l lVar = new C50676l();
        f131826h = lVar;
        C62942bv.registerDefaultInstance(C50676l.class, lVar);
    }

    private C50676l() {
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
                return newMessageInfo(f131826h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C49794h.m85714b(), "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C50676l();
            case 4:
                return new C50675k();
            case 5:
                return f131826h;
            case 6:
                C63010eb ebVar = f131827i;
                if (ebVar == null) {
                    synchronized (C50676l.class) {
                        ebVar = f131827i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131826h);
                            f131827i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
