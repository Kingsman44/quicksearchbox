package com.google.android.libraries.assistant.p1363c.p1364a.p1370c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.a.c.l */
/* compiled from: PG */
public final class C16988l extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C16988l f49622i;

    /* renamed from: j */
    private static volatile C63010eb f49623j;

    /* renamed from: a */
    public int f49624a;

    /* renamed from: b */
    public C62910ar f49625b;

    /* renamed from: c */
    public C62910ar f49626c;

    /* renamed from: d */
    public C62910ar f49627d;

    /* renamed from: e */
    public C62910ar f49628e;

    /* renamed from: f */
    public float f49629f;

    /* renamed from: g */
    public int f49630g;

    /* renamed from: h */
    public C62910ar f49631h;

    static {
        C16988l lVar = new C16988l();
        f49622i = lVar;
        C62942bv.registerDefaultInstance(C16988l.class, lVar);
    }

    private C16988l() {
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
                return newMessageInfo(f49622i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t\u0004\t\u0005\t\u0006\u0001\u0007\u0004\b\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C16988l();
            case 4:
                return new C16987k();
            case 5:
                return f49622i;
            case 6:
                C63010eb ebVar = f49623j;
                if (ebVar == null) {
                    synchronized (C16988l.class) {
                        ebVar = f49623j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49622i);
                            f49623j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
