package com.google.android.libraries.lens.view.p2067ak;

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

@Deprecated
/* renamed from: com.google.android.libraries.lens.view.ak.bh */
/* compiled from: PG */
public final class C25229bh extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C25229bh f68663l;

    /* renamed from: m */
    private static volatile C63010eb f68664m;

    /* renamed from: a */
    public C25262cn f68665a;

    /* renamed from: b */
    public C25258cj f68666b;

    /* renamed from: c */
    public C25274m f68667c;

    /* renamed from: d */
    public C25231bj f68668d;

    /* renamed from: e */
    public C25264cp f68669e;

    /* renamed from: f */
    public C25244bw f68670f;

    /* renamed from: g */
    public C25246by f68671g;

    /* renamed from: h */
    public C25267f f68672h;

    /* renamed from: i */
    public C25249ca f68673i;

    /* renamed from: j */
    public C25277p f68674j;

    /* renamed from: k */
    public C25271j f68675k;

    static {
        C25229bh bhVar = new C25229bh();
        f68663l = bhVar;
        C62942bv.registerDefaultInstance(C25229bh.class, bhVar);
    }

    private C25229bh() {
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
                return newMessageInfo(f68663l, "\u0000\u000b\u0000\u0000\u0001\u0010\u000b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0006\t\u0007\t\n\t\u000b\t\r\t\u000e\t\u0010\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C25229bh();
            case 4:
                return new C25228bg();
            case 5:
                return f68663l;
            case 6:
                C63010eb ebVar = f68664m;
                if (ebVar == null) {
                    synchronized (C25229bh.class) {
                        ebVar = f68664m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68663l);
                            f68664m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
