package com.google.android.libraries.search.assistant.p2820v.p2821a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.v.a.d */
/* compiled from: PG */
public final class C36774d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C36774d f95831g;

    /* renamed from: h */
    private static volatile C63010eb f95832h;

    /* renamed from: a */
    public int f95833a;

    /* renamed from: b */
    public String f95834b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f95835c;

    /* renamed from: d */
    public String f95836d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62964ck f95837e = emptyLongList();

    /* renamed from: f */
    public boolean f95838f;

    static {
        C36774d dVar = new C36774d();
        f95831g = dVar;
        C62942bv.registerDefaultInstance(C36774d.class, dVar);
    }

    private C36774d() {
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
                return newMessageInfo(f95831g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ဈ\u0002\u0005%\u0006ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, C36775e.f95839a, "d", "e", C10662f.f35572a});
            case 3:
                return new C36774d();
            case 4:
                return new C36773c();
            case 5:
                return f95831g;
            case 6:
                C63010eb ebVar = f95832h;
                if (ebVar == null) {
                    synchronized (C36774d.class) {
                        ebVar = f95832h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95831g);
                            f95832h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
