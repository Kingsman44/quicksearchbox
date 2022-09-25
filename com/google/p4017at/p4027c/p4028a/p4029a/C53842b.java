package com.google.p4017at.p4027c.p4028a.p4029a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.b */
/* compiled from: PG */
public final class C53842b extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C53842b f141313k;

    /* renamed from: m */
    private static volatile C63010eb f141314m;

    /* renamed from: a */
    public int f141315a = 0;

    /* renamed from: b */
    public Object f141316b;

    /* renamed from: c */
    public String f141317c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f141318d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C53861u f141319e;

    /* renamed from: f */
    public boolean f141320f;

    /* renamed from: g */
    public C57315dp f141321g;

    /* renamed from: h */
    public C53844d f141322h;

    /* renamed from: i */
    public C53839ae f141323i;

    /* renamed from: j */
    public C53839ae f141324j;

    /* renamed from: l */
    private byte f141325l = 2;

    static {
        C53842b bVar = new C53842b();
        f141313k = bVar;
        C62942bv.registerDefaultInstance(C53842b.class, bVar);
    }

    private C53842b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141325l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141325l = b;
                return null;
            case 2:
                return newMessageInfo(f141313k, "\u0000\u000b\u0001\u0000\u0001h\u000b\u0000\u0000\u0002\u0001Ȉ\u0002Ȉ\u0003\t\u0004\u0007\tЉ\u000bЉ\u0013\t\u0014\te<\u0000f<\u0000h<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C53863w.class, C53865y.class, C53841ag.class});
            case 3:
                return new C53842b();
            case 4:
                return new C53822a();
            case 5:
                return f141313k;
            case 6:
                C63010eb ebVar = f141314m;
                if (ebVar == null) {
                    synchronized (C53842b.class) {
                        ebVar = f141314m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141313k);
                            f141314m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
