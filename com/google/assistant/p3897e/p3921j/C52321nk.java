package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.nk */
/* compiled from: PG */
public final class C52321nk extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C52321nk f137326j;

    /* renamed from: k */
    private static volatile C63010eb f137327k;

    /* renamed from: a */
    public int f137328a = 0;

    /* renamed from: b */
    public Object f137329b;

    /* renamed from: c */
    public C52374pj f137330c;

    /* renamed from: d */
    public C52374pj f137331d;

    /* renamed from: e */
    public String f137332e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C51098gh f137333f;

    /* renamed from: g */
    public String f137334g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f137335h;

    /* renamed from: i */
    public int f137336i;

    static {
        C52321nk nkVar = new C52321nk();
        f137326j = nkVar;
        C62942bv.registerDefaultInstance(C52321nk.class, nkVar);
    }

    private C52321nk() {
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
                return newMessageInfo(f137326j, "\u0000\f\u0001\u0000\u0001\u0010\f\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f\t\r<\u0000\u000e\u0007\u000f\f\u0010Ȉ", new Object[]{"b", "a", "d", C10662f.f35572a, C30325g.f82003a, C52314nd.class, C52316nf.class, C52318nh.class, C52320nj.class, C45240c.f118157a, C52312nb.class, C19618h.f54585a, "i", "e"});
            case 3:
                return new C52321nk();
            case 4:
                return new C52308my();
            case 5:
                return f137326j;
            case 6:
                C63010eb ebVar = f137327k;
                if (ebVar == null) {
                    synchronized (C52321nk.class) {
                        ebVar = f137327k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137326j);
                            f137327k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
