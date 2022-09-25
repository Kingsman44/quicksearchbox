package com.google.assistant.p4016z;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.aq */
/* compiled from: PG */
public final class C53692aq extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C53692aq f140937k;

    /* renamed from: n */
    private static volatile C63010eb f140938n;

    /* renamed from: a */
    public int f140939a;

    /* renamed from: b */
    public int f140940b = 0;

    /* renamed from: c */
    public Object f140941c;

    /* renamed from: d */
    public C8242v f140942d;

    /* renamed from: e */
    public int f140943e;

    /* renamed from: f */
    public String f140944f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C53700ay f140945g;

    /* renamed from: h */
    public C53702b f140946h;

    /* renamed from: i */
    public C53725j f140947i;

    /* renamed from: j */
    public int f140948j;

    /* renamed from: l */
    private C8242v f140949l;

    /* renamed from: m */
    private byte f140950m = 2;

    static {
        C53692aq aqVar = new C53692aq();
        f140937k = aqVar;
        C62942bv.registerDefaultInstance(C53692aq.class, aqVar);
    }

    private C53692aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140950m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140950m = b;
                return null;
            case 2:
                return newMessageInfo(f140937k, "\u0001\u000b\u0001\u0001\u0001\r\u000b\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ြ\u0000\u0006ဉ\t\u0007ြ\u0000\tြ\u0000\nᐉ\u0005\fဉ\u000b\rင\f", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C53691ap.m86885b(), C10662f.f35572a, C30325g.f82003a, C53712bj.class, C19618h.f54585a, C53727l.class, C53688am.class, "l", "i", "j"});
            case 3:
                return new C53692aq();
            case 4:
                return new C53689an();
            case 5:
                return f140937k;
            case 6:
                C63010eb ebVar = f140938n;
                if (ebVar == null) {
                    synchronized (C53692aq.class) {
                        ebVar = f140938n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140937k);
                            f140938n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
