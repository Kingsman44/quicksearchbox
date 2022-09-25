package com.google.android.gms.p10747b.p10748a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62955cb;
import com.google.protobuf.C62956cc;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.b.a.k */
/* compiled from: PG */
public final class C142963k extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C142963k f387893m;

    /* renamed from: n */
    private static volatile C63010eb f387894n;

    /* renamed from: a */
    public int f387895a = 0;

    /* renamed from: b */
    public Object f387896b;

    /* renamed from: c */
    public String f387897c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f387898d;

    /* renamed from: e */
    public C62971cq f387899e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62961ch f387900f = emptyIntList();

    /* renamed from: g */
    public C62961ch f387901g = emptyIntList();

    /* renamed from: h */
    public C62961ch f387902h = emptyIntList();

    /* renamed from: i */
    public C62964ck f387903i = emptyLongList();

    /* renamed from: j */
    public C62960cg f387904j = emptyFloatList();

    /* renamed from: k */
    public C62956cc f387905k = emptyDoubleList();

    /* renamed from: l */
    public C62955cb f387906l = emptyBooleanList();

    static {
        C142963k kVar = new C142963k();
        f387893m = kVar;
        C62942bv.registerDefaultInstance(C142963k.class, kVar);
    }

    private C142963k() {
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
                return newMessageInfo(f387893m, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\b\u0000\u0001Ȉ\u0002\f\u0003Ȼ\u0000\u00047\u0000\u00057\u0000\u00067\u0000\u00075\u0000\b4\u0000\t3\u0000\n:\u0000\u000bȚ\f'\r'\u000e'\u000f%\u0010$\u0011#\u0012*", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C142963k();
            case 4:
                return new C142962j();
            case 5:
                return f387893m;
            case 6:
                C63010eb ebVar = f387894n;
                if (ebVar == null) {
                    synchronized (C142963k.class) {
                        ebVar = f387894n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387893m);
                            f387894n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
