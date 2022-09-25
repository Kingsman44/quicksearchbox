package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48305dd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.j */
/* compiled from: PG */
public final class C128178j extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C128178j f352610j;

    /* renamed from: l */
    private static volatile C63010eb f352611l;

    /* renamed from: a */
    public int f352612a;

    /* renamed from: b */
    public int f352613b = 0;

    /* renamed from: c */
    public Object f352614c;

    /* renamed from: d */
    public String f352615d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f352616e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63204j f352617f;

    /* renamed from: g */
    public boolean f352618g;

    /* renamed from: h */
    public boolean f352619h;

    /* renamed from: i */
    public boolean f352620i;

    /* renamed from: k */
    private byte f352621k = 2;

    static {
        C128178j jVar = new C128178j();
        f352610j = jVar;
        C62942bv.registerDefaultInstance(C128178j.class, jVar);
    }

    private C128178j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352621k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352621k = b;
                return null;
            case 2:
                return newMessageInfo(f352610j, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0005ြ\u0000\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C48305dd.class, C19618h.f54585a, "i"});
            case 3:
                return new C128178j();
            case 4:
                return new C128177i();
            case 5:
                return f352610j;
            case 6:
                C63010eb ebVar = f352611l;
                if (ebVar == null) {
                    synchronized (C128178j.class) {
                        ebVar = f352611l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352610j);
                            f352611l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
