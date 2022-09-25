package com.google.android.ssb;

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

/* renamed from: com.google.android.ssb.b */
/* compiled from: PG */
public final class C45345b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C45345b f118523i;

    /* renamed from: j */
    private static volatile C63010eb f118524j;

    /* renamed from: a */
    public int f118525a;

    /* renamed from: b */
    public boolean f118526b;

    /* renamed from: c */
    public boolean f118527c;

    /* renamed from: d */
    public String f118528d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f118529e;

    /* renamed from: f */
    public boolean f118530f;

    /* renamed from: g */
    public boolean f118531g;

    /* renamed from: h */
    public boolean f118532h;

    static {
        C45345b bVar = new C45345b();
        f118523i = bVar;
        C62942bv.registerDefaultInstance(C45345b.class, bVar);
    }

    private C45345b() {
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
                return newMessageInfo(f118523i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C45345b();
            case 4:
                return new C45344a();
            case 5:
                return f118523i;
            case 6:
                C63010eb ebVar = f118524j;
                if (ebVar == null) {
                    synchronized (C45345b.class) {
                        ebVar = f118524j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f118523i);
                            f118524j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
