package com.google.assistant.p3803ag.p3809c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.eu */
/* compiled from: PG */
public final class C49055eu extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C49055eu f126887h;

    /* renamed from: i */
    private static volatile C63010eb f126888i;

    /* renamed from: a */
    public int f126889a;

    /* renamed from: b */
    public long f126890b;

    /* renamed from: c */
    public int f126891c;

    /* renamed from: d */
    public int f126892d;

    /* renamed from: e */
    public int f126893e;

    /* renamed from: f */
    public int f126894f;

    /* renamed from: g */
    public boolean f126895g;

    static {
        C49055eu euVar = new C49055eu();
        f126887h = euVar;
        C62942bv.registerDefaultInstance(C49055eu.class, euVar);
    }

    private C49055eu() {
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
                return newMessageInfo(f126887h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, C49053es.f126886a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C49055eu();
            case 4:
                return new C49052er();
            case 5:
                return f126887h;
            case 6:
                C63010eb ebVar = f126888i;
                if (ebVar == null) {
                    synchronized (C49055eu.class) {
                        ebVar = f126888i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126887h);
                            f126888i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
