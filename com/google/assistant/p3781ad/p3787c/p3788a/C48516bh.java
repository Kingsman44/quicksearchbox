package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.bh */
/* compiled from: PG */
public final class C48516bh extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48516bh f125330g;

    /* renamed from: i */
    private static volatile C63010eb f125331i;

    /* renamed from: a */
    public int f125332a;

    /* renamed from: b */
    public long f125333b;

    /* renamed from: c */
    public long f125334c;

    /* renamed from: d */
    public float f125335d;

    /* renamed from: e */
    public int f125336e = 1;

    /* renamed from: f */
    public C62995dn f125337f = C62995dn.f170057a;

    /* renamed from: h */
    private C62995dn f125338h = C62995dn.f170057a;

    static {
        C48516bh bhVar = new C48516bh();
        f125330g = bhVar;
        C62942bv.registerDefaultInstance(C48516bh.class, bhVar);
    }

    private C48516bh() {
        emptyProtobufList();
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
                return newMessageInfo(f125330g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0002\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0002\u0003ဌ\u0003\u00052\u00062\u0007ဂ\u0001", new Object[]{"a", "b", "d", "e", C48517bi.f125339a, C10662f.f35572a, C48513be.f125328a, C19618h.f54585a, C48515bg.f125329a, C45240c.f118157a});
            case 3:
                return new C48516bh();
            case 4:
                return new C48514bf();
            case 5:
                return f125330g;
            case 6:
                C63010eb ebVar = f125331i;
                if (ebVar == null) {
                    synchronized (C48516bh.class) {
                        ebVar = f125331i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125330g);
                            f125331i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
