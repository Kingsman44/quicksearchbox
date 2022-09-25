package com.google.assistant.p3996t.p3997a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58081m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.t.a.b */
/* compiled from: PG */
public final class C53475b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53475b f140343h;

    /* renamed from: i */
    private static volatile C63010eb f140344i;

    /* renamed from: a */
    public int f140345a = 0;

    /* renamed from: b */
    public Object f140346b;

    /* renamed from: c */
    public String f140347c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C58081m f140348d;

    /* renamed from: e */
    public int f140349e;

    /* renamed from: f */
    public C63042fg f140350f;

    /* renamed from: g */
    public String f140351g = BuildConfig.FLAVOR;

    static {
        C53475b bVar = new C53475b();
        f140343h = bVar;
        C62942bv.registerDefaultInstance(C53475b.class, bVar);
    }

    private C53475b() {
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
                return newMessageInfo(f140343h, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003<\u0000\u0004<\u0000\u0005\f\u0006\t\u0007Ȉ", new Object[]{"b", "a", C45240c.f118157a, "d", C58072d.class, C53477d.class, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C53475b();
            case 4:
                return new C53474a();
            case 5:
                return f140343h;
            case 6:
                C63010eb ebVar = f140344i;
                if (ebVar == null) {
                    synchronized (C53475b.class) {
                        ebVar = f140344i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140343h);
                            f140344i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
