package com.google.p4242bp.p4243a.p4246c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.c.b */
/* compiled from: PG */
public final class C56157b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56157b f149621g;

    /* renamed from: h */
    private static volatile C63010eb f149622h;

    /* renamed from: a */
    public int f149623a;

    /* renamed from: b */
    public String f149624b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f149625c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f149626d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f149627e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f149628f = BuildConfig.FLAVOR;

    static {
        C56157b bVar = new C56157b();
        f149621g = bVar;
        C62942bv.registerDefaultInstance(C56157b.class, bVar);
    }

    private C56157b() {
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
                return newMessageInfo(f149621g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C56157b();
            case 4:
                return new C56156a();
            case 5:
                return f149621g;
            case 6:
                C63010eb ebVar = f149622h;
                if (ebVar == null) {
                    synchronized (C56157b.class) {
                        ebVar = f149622h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149621g);
                            f149622h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
