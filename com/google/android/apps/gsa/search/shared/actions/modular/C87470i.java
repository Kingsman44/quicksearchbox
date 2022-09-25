package com.google.android.apps.gsa.search.shared.actions.modular;

import com.google.android.apps.gsa.search.shared.actions.util.C87491m;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55240la;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.i */
/* compiled from: PG */
public final class C87470i extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C87470i f236235i;

    /* renamed from: k */
    private static volatile C63010eb f236236k;

    /* renamed from: a */
    public int f236237a;

    /* renamed from: b */
    public C87491m f236238b;

    /* renamed from: c */
    public C55240la f236239c;

    /* renamed from: d */
    public C55240la f236240d;

    /* renamed from: e */
    public C55240la f236241e;

    /* renamed from: f */
    public C55240la f236242f;

    /* renamed from: g */
    public C55240la f236243g;

    /* renamed from: h */
    public C55240la f236244h;

    /* renamed from: j */
    private byte f236245j = 2;

    static {
        C87470i iVar = new C87470i();
        f236235i = iVar;
        C62942bv.registerDefaultInstance(C87470i.class, iVar);
    }

    private C87470i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f236245j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f236245j = b;
                return null;
            case 2:
                return newMessageInfo(f236235i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C87470i();
            case 4:
                return new C87469h();
            case 5:
                return f236235i;
            case 6:
                C63010eb ebVar = f236236k;
                if (ebVar == null) {
                    synchronized (C87470i.class) {
                        ebVar = f236236k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f236235i);
                            f236236k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
