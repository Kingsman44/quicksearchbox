package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60321oe;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.im */
/* compiled from: PG */
public final class C87920im extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C87920im f237814g;

    /* renamed from: i */
    private static volatile C63010eb f237815i;

    /* renamed from: a */
    public int f237816a;

    /* renamed from: b */
    public C60321oe f237817b;

    /* renamed from: c */
    public C62995dn f237818c = C62995dn.f170057a;

    /* renamed from: d */
    public C62995dn f237819d;

    /* renamed from: e */
    public C62995dn f237820e;

    /* renamed from: f */
    public String f237821f;

    /* renamed from: h */
    private byte f237822h;

    static {
        C87920im imVar = new C87920im();
        f237814g = imVar;
        C62942bv.registerDefaultInstance(C87920im.class, imVar);
    }

    private C87920im() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f237819d = dnVar;
        this.f237820e = dnVar;
        this.f237822h = 2;
        this.f237821f = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237822h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237822h = b;
                return null;
            case 2:
                return newMessageInfo(f237814g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0003\u0000\u0001\u0001ᐉ\u0000\u00022\u00032\u00042\u0005ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, C87918ik.f237812a, "d", C87919il.f237813a, "e", C87917ij.f237811a, C10662f.f35572a});
            case 3:
                return new C87920im();
            case 4:
                return new C87914ig();
            case 5:
                return f237814g;
            case 6:
                C63010eb ebVar = f237815i;
                if (ebVar == null) {
                    synchronized (C87920im.class) {
                        ebVar = f237815i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237814g);
                            f237815i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
