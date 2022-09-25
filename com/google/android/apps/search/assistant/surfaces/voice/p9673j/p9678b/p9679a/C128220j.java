package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.j */
/* compiled from: PG */
public final class C128220j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C128220j f352699e;

    /* renamed from: g */
    private static volatile C63010eb f352700g;

    /* renamed from: a */
    public int f352701a;

    /* renamed from: b */
    public int f352702b;

    /* renamed from: c */
    public C62995dn f352703c = C62995dn.f170057a;

    /* renamed from: d */
    public C62995dn f352704d;

    /* renamed from: f */
    private C62995dn f352705f;

    static {
        C128220j jVar = new C128220j();
        f352699e = jVar;
        C62942bv.registerDefaultInstance(C128220j.class, jVar);
    }

    private C128220j() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f352704d = dnVar;
        this.f352705f = dnVar;
    }

    /* renamed from: a */
    public final C62995dn mo108371a() {
        C62995dn dnVar = this.f352704d;
        if (!dnVar.f170058b) {
            this.f352704d = dnVar.mo58980a();
        }
        return this.f352704d;
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
                return newMessageInfo(f352699e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0003\u0000\u0000\u0001င\u0000\u00022\u00032\u00042", new Object[]{"a", "b", C45240c.f118157a, C128219i.f352698a, C10662f.f35572a, C128215f.f352694a, "d", C128217g.f352697a});
            case 3:
                return new C128220j();
            case 4:
                return new C128218h();
            case 5:
                return f352699e;
            case 6:
                C63010eb ebVar = f352700g;
                if (ebVar == null) {
                    synchronized (C128220j.class) {
                        ebVar = f352700g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352699e);
                            f352700g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
