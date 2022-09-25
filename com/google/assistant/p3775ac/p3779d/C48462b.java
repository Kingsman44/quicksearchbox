package com.google.assistant.p3775ac.p3779d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60414pi;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ac.d.b */
/* compiled from: PG */
public final class C48462b extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C48462b f125188k;

    /* renamed from: l */
    public static final C62940bt f125189l;

    /* renamed from: m */
    private static volatile C63010eb f125190m;

    /* renamed from: a */
    public int f125191a;

    /* renamed from: b */
    public String f125192b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f125193c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f125194d;

    /* renamed from: e */
    public int f125195e;

    /* renamed from: f */
    public String f125196f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62961ch f125197g = emptyIntList();

    /* renamed from: h */
    public C62961ch f125198h = emptyIntList();

    /* renamed from: i */
    public int f125199i;

    /* renamed from: j */
    public C60414pi f125200j;

    static {
        C48462b bVar = new C48462b();
        f125188k = bVar;
        C62942bv.registerDefaultInstance(C48462b.class, bVar);
        f125189l = C62942bv.newSingularGeneratedExtension(aqs.f159780k, bVar, bVar, (C62958ce) null, 532, C63066gd.MESSAGE, C48462b.class);
    }

    private C48462b() {
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
                return newMessageInfo(f125188k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0004ဈ\u0001\u0005ဈ\u0005\u0006\u0016\u0007\u0016\bဌ\u0006\tင\u0003\nဉ\u0007", new Object[]{"a", "b", "d", C48469i.f125215a, C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C48468h.m85228b(), "e", "j"});
            case 3:
                return new C48462b();
            case 4:
                return new C48461a();
            case 5:
                return f125188k;
            case 6:
                C63010eb ebVar = f125190m;
                if (ebVar == null) {
                    synchronized (C48462b.class) {
                        ebVar = f125190m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125188k);
                            f125190m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
