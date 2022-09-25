package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.j */
/* compiled from: PG */
public final class C125161j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C125161j f345284g;

    /* renamed from: h */
    private static volatile C63010eb f345285h;

    /* renamed from: a */
    public int f345286a;

    /* renamed from: b */
    public int f345287b;

    /* renamed from: c */
    public int f345288c;

    /* renamed from: d */
    public boolean f345289d;

    /* renamed from: e */
    public String f345290e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C125126d f345291f;

    static {
        C125161j jVar = new C125161j();
        f345284g = jVar;
        C62942bv.registerDefaultInstance(C125161j.class, jVar);
    }

    private C125161j() {
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
                return newMessageInfo(f345284g, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဌ\u0000\u0003\u0007\u0004Ȉ\u0005\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C125161j();
            case 4:
                return new C125158g();
            case 5:
                return f345284g;
            case 6:
                C63010eb ebVar = f345285h;
                if (ebVar == null) {
                    synchronized (C125161j.class) {
                        ebVar = f345285h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345284g);
                            f345285h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
