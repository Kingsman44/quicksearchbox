package com.google.android.libraries.assistant.p1533o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.aw */
/* compiled from: PG */
public final class C18460aw extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C18460aw f52380h;

    /* renamed from: i */
    private static volatile C63010eb f52381i;

    /* renamed from: a */
    public int f52382a;

    /* renamed from: b */
    public boolean f52383b;

    /* renamed from: c */
    public boolean f52384c;

    /* renamed from: d */
    public boolean f52385d;

    /* renamed from: e */
    public String f52386e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C18459av f52387f;

    /* renamed from: g */
    public boolean f52388g;

    static {
        C18460aw awVar = new C18460aw();
        f52380h = awVar;
        C62942bv.registerDefaultInstance(C18460aw.class, awVar);
    }

    private C18460aw() {
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
                return newMessageInfo(f52380h, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004ለ\u0000\u0005ဉ\u0001\u0006\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C18460aw();
            case 4:
                return new C18457at();
            case 5:
                return f52380h;
            case 6:
                C63010eb ebVar = f52381i;
                if (ebVar == null) {
                    synchronized (C18460aw.class) {
                        ebVar = f52381i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52380h);
                            f52381i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
