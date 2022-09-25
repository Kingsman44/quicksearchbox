package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.C55683w;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.bf.b.a.a.d */
/* compiled from: PG */
public final class C55568d extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C55568d f146611j;

    /* renamed from: k */
    private static volatile C63010eb f146612k;

    /* renamed from: a */
    public int f146613a;

    /* renamed from: b */
    public int f146614b = 0;

    /* renamed from: c */
    public Object f146615c;

    /* renamed from: d */
    public int f146616d = 0;

    /* renamed from: e */
    public Object f146617e;

    /* renamed from: f */
    public String f146618f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f146619g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C55564bq f146620h;

    /* renamed from: i */
    public C63070h f146621i;

    static {
        C55568d dVar = new C55568d();
        f146611j = dVar;
        C62942bv.registerDefaultInstance(C55568d.class, dVar);
    }

    private C55568d() {
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
                return newMessageInfo(f146611j, "\u0001\t\u0002\u0001\u0002\n\t\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ျ\u0000\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဿ\u0000\bျ\u0001\tြ\u0001\nြ\u0001", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C55547b.f146570a, C55683w.class, C62910ar.class});
            case 3:
                return new C55568d();
            case 4:
                return new C55520a();
            case 5:
                return f146611j;
            case 6:
                C63010eb ebVar = f146612k;
                if (ebVar == null) {
                    synchronized (C55568d.class) {
                        ebVar = f146612k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146611j);
                            f146612k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
