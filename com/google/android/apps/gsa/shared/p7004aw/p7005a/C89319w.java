package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.w */
/* compiled from: PG */
public final class C89319w extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C89319w f242150i;

    /* renamed from: j */
    private static volatile C63010eb f242151j;

    /* renamed from: a */
    public int f242152a;

    /* renamed from: b */
    public boolean f242153b;

    /* renamed from: c */
    public boolean f242154c;

    /* renamed from: d */
    public String f242155d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f242156e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f242157f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f242158g;

    /* renamed from: h */
    public boolean f242159h;

    static {
        C89319w wVar = new C89319w();
        f242150i = wVar;
        C62942bv.registerDefaultInstance(C89319w.class, wVar);
    }

    private C89319w() {
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
                return newMessageInfo(f242150i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0007\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\b\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C89319w();
            case 4:
                return new C89318v();
            case 5:
                return f242150i;
            case 6:
                C63010eb ebVar = f242151j;
                if (ebVar == null) {
                    synchronized (C89319w.class) {
                        ebVar = f242151j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242150i);
                            f242151j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
