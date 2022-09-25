package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4671b.C61788ag;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p001a.p007b.p011b.p012a.C0031g;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.pk */
/* compiled from: PG */
public final class C88107pk extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C88107pk f238199h;

    /* renamed from: j */
    private static volatile C63010eb f238200j;

    /* renamed from: a */
    public int f238201a;

    /* renamed from: b */
    public boolean f238202b;

    /* renamed from: c */
    public boolean f238203c;

    /* renamed from: d */
    public boolean f238204d;

    /* renamed from: e */
    public boolean f238205e;

    /* renamed from: f */
    public C61788ag f238206f;

    /* renamed from: g */
    public C0031g f238207g;

    /* renamed from: i */
    private byte f238208i = 2;

    static {
        C88107pk pkVar = new C88107pk();
        f238199h = pkVar;
        C62942bv.registerDefaultInstance(C88107pk.class, pkVar);
    }

    private C88107pk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238208i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238208i = b;
                return null;
            case 2:
                return newMessageInfo(f238199h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C88107pk();
            case 4:
                return new C88106pj();
            case 5:
                return f238199h;
            case 6:
                C63010eb ebVar = f238200j;
                if (ebVar == null) {
                    synchronized (C88107pk.class) {
                        ebVar = f238200j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238199h);
                            f238200j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
