package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.r */
/* compiled from: PG */
public final class C17073r extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C17073r f49700h;

    /* renamed from: i */
    private static volatile C63010eb f49701i;

    /* renamed from: a */
    public int f49702a;

    /* renamed from: b */
    public C17070o f49703b;

    /* renamed from: c */
    public int f49704c;

    /* renamed from: d */
    public String f49705d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f49706e;

    /* renamed from: f */
    public long f49707f;

    /* renamed from: g */
    public boolean f49708g;

    static {
        C17073r rVar = new C17073r();
        f49700h = rVar;
        C62942bv.registerDefaultInstance(C17073r.class, rVar);
    }

    private C17073r() {
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
                return newMessageInfo(f49700h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, C17072q.m34238b(), "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C17073r();
            case 4:
                return new C17068m();
            case 5:
                return f49700h;
            case 6:
                C63010eb ebVar = f49701i;
                if (ebVar == null) {
                    synchronized (C17073r.class) {
                        ebVar = f49701i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49700h);
                            f49701i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
