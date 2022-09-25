package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7818lb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.b */
/* compiled from: PG */
public final class C9164b extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C9164b f31642o;

    /* renamed from: p */
    private static volatile C63010eb f31643p;

    /* renamed from: a */
    public int f31644a;

    /* renamed from: b */
    public int f31645b;

    /* renamed from: c */
    public int f31646c;

    /* renamed from: d */
    public String f31647d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f31648e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f31649f;

    /* renamed from: g */
    public int f31650g;

    /* renamed from: h */
    public int f31651h;

    /* renamed from: i */
    public int f31652i;

    /* renamed from: j */
    public int f31653j;

    /* renamed from: k */
    public boolean f31654k;

    /* renamed from: l */
    public C9247eb f31655l;

    /* renamed from: m */
    public C9247eb f31656m;

    /* renamed from: n */
    public C7818lb f31657n;

    static {
        C9164b bVar = new C9164b();
        f31642o = bVar;
        C62942bv.registerDefaultInstance(C9164b.class, bVar);
    }

    private C9164b() {
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
                return newMessageInfo(f31642o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0002\u0003င\u0004\u0004င\u0007\u0005ဇ\t\u0007ဉ\u000b\bဉ\r\tင\b\nင\u0006\u000bင\u0001\fဈ\u0003\rဉ\f\u000eင\u0005", new Object[]{"a", "b", "d", C10662f.f35572a, "i", C19621k.f54601a, "l", C48004n.f124238a, "j", C19618h.f54585a, C45240c.f118157a, "e", "m", C30325g.f82003a});
            case 3:
                return new C9164b();
            case 4:
                return new C9137a();
            case 5:
                return f31642o;
            case 6:
                C63010eb ebVar = f31643p;
                if (ebVar == null) {
                    synchronized (C9164b.class) {
                        ebVar = f31643p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31642o);
                            f31643p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
