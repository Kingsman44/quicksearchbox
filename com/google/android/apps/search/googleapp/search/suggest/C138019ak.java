package com.google.android.apps.search.googleapp.search.suggest;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ak */
/* compiled from: PG */
public final class C138019ak extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C138019ak f375490i;

    /* renamed from: k */
    private static volatile C63010eb f375491k;

    /* renamed from: a */
    public int f375492a;

    /* renamed from: b */
    public C138030av f375493b;

    /* renamed from: c */
    public int f375494c;

    /* renamed from: d */
    public String f375495d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f375496e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f375497f;

    /* renamed from: g */
    public int f375498g;

    /* renamed from: h */
    public String f375499h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private byte f375500j = 2;

    static {
        C138019ak akVar = new C138019ak();
        f375490i = akVar;
        C62942bv.registerDefaultInstance(C138019ak.class, akVar);
    }

    private C138019ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f375500j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f375500j = b;
                return null;
            case 2:
                return newMessageInfo(f375490i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, C138017ai.f375489a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C138019ak();
            case 4:
                return new C138016ah();
            case 5:
                return f375490i;
            case 6:
                C63010eb ebVar = f375491k;
                if (ebVar == null) {
                    synchronized (C138019ak.class) {
                        ebVar = f375491k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375490i);
                            f375491k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
