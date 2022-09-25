package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62965cl;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.o */
/* compiled from: PG */
public final class C125166o extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C125166o f345294h;

    /* renamed from: i */
    public static final C62965cl f345295i = new C62965cl(C125160i.f345255J, C125160i.UNRECOGNIZED);

    /* renamed from: j */
    private static volatile C63010eb f345296j;

    /* renamed from: a */
    public int f345297a;

    /* renamed from: b */
    public int f345298b;

    /* renamed from: c */
    public C62995dn f345299c = C62995dn.f170057a;

    /* renamed from: d */
    public boolean f345300d;

    /* renamed from: e */
    public boolean f345301e;

    /* renamed from: f */
    public String f345302f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C125126d f345303g;

    static {
        C125166o oVar = new C125166o();
        f345294h = oVar;
        C62942bv.registerDefaultInstance(C125166o.class, oVar);
    }

    private C125166o() {
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
                return newMessageInfo(f345294h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\f\u0002\f\u00032\u0004\u0007\u0005\u0007\u0006Ȉ\u0007\t", new Object[]{"a", "b", C45240c.f118157a, C125165n.f345293a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C125166o();
            case 4:
                return new C125164m();
            case 5:
                return f345294h;
            case 6:
                C63010eb ebVar = f345296j;
                if (ebVar == null) {
                    synchronized (C125166o.class) {
                        ebVar = f345296j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345294h);
                            f345296j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
