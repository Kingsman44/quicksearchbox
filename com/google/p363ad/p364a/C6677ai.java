package com.google.p363ad.p364a;

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

/* renamed from: com.google.ad.a.ai */
/* compiled from: PG */
public final class C6677ai extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C6677ai f19940j;

    /* renamed from: l */
    private static volatile C63010eb f19941l;

    /* renamed from: a */
    public int f19942a;

    /* renamed from: b */
    public int f19943b = 0;

    /* renamed from: c */
    public Object f19944c;

    /* renamed from: d */
    public int f19945d = 0;

    /* renamed from: e */
    public Object f19946e;

    /* renamed from: f */
    public String f19947f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f19948g;

    /* renamed from: h */
    public String f19949h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f19950i;

    /* renamed from: k */
    private byte f19951k = 2;

    static {
        C6677ai aiVar = new C6677ai();
        f19940j = aiVar;
        C62942bv.registerDefaultInstance(C6677ai.class, aiVar);
    }

    private C6677ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f19951k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f19951k = b;
                return null;
            case 2:
                return newMessageInfo(f19940j, "\u0001\b\u0002\u0001\u0001\u000b\b\u0000\u0000\u0001\u0001ျ\u0000\u0002ဈ\u0003\u0003ဌ\u0005\u0005ြ\u0001\u0006ြ\u0000\bဋ\b\nဈ\u0007\u000bᐼ\u0000", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C30325g.f82003a, C6674af.f19934a, C6676ah.class, C6671ac.class, "i", C19618h.f54585a, C6673ae.class});
            case 3:
                return new C6677ai();
            case 4:
                return new C6669aa();
            case 5:
                return f19940j;
            case 6:
                C63010eb ebVar = f19941l;
                if (ebVar == null) {
                    synchronized (C6677ai.class) {
                        ebVar = f19941l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19940j);
                            f19941l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
