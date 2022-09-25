package com.google.protos.p4985f.p5020k;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.au */
/* compiled from: PG */
public final class C64919au extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64919au f175832a;

    /* renamed from: j */
    private static volatile C63010eb f175833j;

    /* renamed from: b */
    private int f175834b;

    /* renamed from: c */
    private C64924az f175835c;

    /* renamed from: d */
    private C62995dn f175836d = C62995dn.f170057a;

    /* renamed from: e */
    private C62995dn f175837e;

    /* renamed from: f */
    private C62995dn f175838f;

    /* renamed from: g */
    private C62995dn f175839g;

    /* renamed from: h */
    private C62995dn f175840h;

    /* renamed from: i */
    private byte f175841i;

    static {
        C64919au auVar = new C64919au();
        f175832a = auVar;
        C62942bv.registerDefaultInstance(C64919au.class, auVar);
    }

    private C64919au() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f175837e = dnVar;
        this.f175838f = dnVar;
        this.f175839g = dnVar;
        this.f175840h = dnVar;
        this.f175841i = 2;
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175841i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175841i = b;
                return null;
            case 2:
                return newMessageInfo(f175832a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0005\u0000\u0003\u0002ဉ\u0000\u00032\u00052\u0007в\tв\nв", new Object[]{"b", C45240c.f118157a, "d", C64917as.f175830a, C10662f.f35572a, C64915aq.f175828a, C19618h.f54585a, C64914ap.f175827a, "e", C64918at.f175831a, C30325g.f82003a, C64916ar.f175829a});
            case 3:
                return new C64919au();
            case 4:
                return new C64913ao();
            case 5:
                return f175832a;
            case 6:
                C63010eb ebVar = f175833j;
                if (ebVar == null) {
                    synchronized (C64919au.class) {
                        ebVar = f175833j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175832a);
                            f175833j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
