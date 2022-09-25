package com.google.protos.p4985f.p4988b.p4990b.p4991a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.f.b.b.a.n */
/* compiled from: PG */
public final class C64735n extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C64735n f175467n;

    /* renamed from: p */
    private static volatile C63010eb f175468p;

    /* renamed from: a */
    public int f175469a;

    /* renamed from: b */
    public String f175470b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f175471c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f175472d;

    /* renamed from: e */
    public int f175473e;

    /* renamed from: f */
    public String f175474f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f175475g;

    /* renamed from: h */
    public boolean f175476h;

    /* renamed from: i */
    public boolean f175477i;

    /* renamed from: j */
    public C64733l f175478j;

    /* renamed from: k */
    public int f175479k;

    /* renamed from: l */
    public int f175480l;

    /* renamed from: m */
    public int f175481m;

    /* renamed from: o */
    private int f175482o;

    static {
        C64735n nVar = new C64735n();
        f175467n = nVar;
        C62942bv.registerDefaultInstance(C64735n.class, nVar);
    }

    private C64735n() {
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
                return newMessageInfo(f175467n, "\u0000\r\u0000\u0001\u0001\u000f\r\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\f\u0007Ȉ\b\u0002\nဇ\u0000\u000bဇ\u0001\f\t\r\f\u000e\f\u000f\f", new Object[]{C66412o.f180592a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C64735n();
            case 4:
                return new C64726e();
            case 5:
                return f175467n;
            case 6:
                C63010eb ebVar = f175468p;
                if (ebVar == null) {
                    synchronized (C64735n.class) {
                        ebVar = f175468p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175467n);
                            f175468p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
