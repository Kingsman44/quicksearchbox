package com.google.speech.p5202d.p5203a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.d.a.b */
/* compiled from: PG */
public final class C66489b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C66489b f180789h;

    /* renamed from: j */
    private static volatile C63010eb f180790j;

    /* renamed from: a */
    public int f180791a;

    /* renamed from: b */
    public int f180792b = 800;

    /* renamed from: c */
    public int f180793c = SimpleSnackbar.LENGTH_SHORT;

    /* renamed from: d */
    public boolean f180794d = true;

    /* renamed from: e */
    public boolean f180795e = true;

    /* renamed from: f */
    public int f180796f = 100;

    /* renamed from: g */
    public int f180797g = 800;

    /* renamed from: i */
    private byte f180798i = 2;

    static {
        C66489b bVar = new C66489b();
        f180789h = bVar;
        C62942bv.registerDefaultInstance(C66489b.class, bVar);
    }

    private C66489b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180798i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180798i = b;
                return null;
            case 2:
                return newMessageInfo(f180789h, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0000\u0000\u0002င\u0002\u0005င\u0003\bဇ\u000b\tဇ\f\nင\u0010\u000bင\u0011", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C66489b();
            case 4:
                return new C66488a();
            case 5:
                return f180789h;
            case 6:
                C63010eb ebVar = f180790j;
                if (ebVar == null) {
                    synchronized (C66489b.class) {
                        ebVar = f180790j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180789h);
                            f180790j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
