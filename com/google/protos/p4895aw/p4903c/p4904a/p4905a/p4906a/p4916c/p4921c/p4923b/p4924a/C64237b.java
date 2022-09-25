package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4923b.p4924a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66226em;
import com.google.protos.youtube.elements.C66244fd;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.b.a.b */
/* compiled from: PG */
public final class C64237b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64237b f173678i;

    /* renamed from: j */
    public static final C62940bt f173679j;

    /* renamed from: l */
    private static volatile C63010eb f173680l;

    /* renamed from: a */
    public String f173681a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public float f173682b;

    /* renamed from: c */
    public float f173683c;

    /* renamed from: d */
    public boolean f173684d;

    /* renamed from: e */
    public float f173685e;

    /* renamed from: f */
    public C66226em f173686f;

    /* renamed from: g */
    public int f173687g;

    /* renamed from: h */
    public boolean f173688h;

    /* renamed from: k */
    private int f173689k;

    static {
        C64237b bVar = new C64237b();
        f173678i = bVar;
        C62942bv.registerDefaultInstance(C64237b.class, bVar);
        f173679j = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, bVar, bVar, (C62958ce) null, 309230488, C63066gd.MESSAGE, C64237b.class);
    }

    private C64237b() {
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
                return newMessageInfo(f173678i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007ဌ\u0006\bဇ\u0007", new Object[]{C19621k.f54601a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C64238c.f173690a, C19618h.f54585a});
            case 3:
                return new C64237b();
            case 4:
                return new C64236a();
            case 5:
                return f173678i;
            case 6:
                C63010eb ebVar = f173680l;
                if (ebVar == null) {
                    synchronized (C64237b.class) {
                        ebVar = f173680l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173678i);
                            f173680l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
