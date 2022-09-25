package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3820ak.C49217p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lf */
/* compiled from: PG */
public final class C53366lf extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53366lf f140034h;

    /* renamed from: j */
    private static volatile C63010eb f140035j;

    /* renamed from: a */
    public int f140036a;

    /* renamed from: b */
    public int f140037b = 0;

    /* renamed from: c */
    public Object f140038c;

    /* renamed from: d */
    public String f140039d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f140040e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C48952az f140041f;

    /* renamed from: g */
    public int f140042g;

    /* renamed from: i */
    private byte f140043i = 2;

    static {
        C53366lf lfVar = new C53366lf();
        f140034h = lfVar;
        C62942bv.registerDefaultInstance(C53366lf.class, lfVar);
    }

    private C53366lf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140043i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140043i = b;
                return null;
            case 2:
                return newMessageInfo(f140034h, "\u0001\u0010\u0001\u0001\u0001\u0011\u0010\u0000\u0000\b\u0001ြ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ဈ\u0000\u0007ြ\u0000\bြ\u0000\nဉ\u0003\u000bြ\u0000\fᐼ\u0000\rᐼ\u0000\u000eᐼ\u0000\u000fင\u0010\u0010ᐼ\u0000\u0011ဈ\u0001", new Object[]{C45240c.f118157a, "b", "a", C53372ll.class, C53418nd.class, C53376lp.class, C53420nf.class, C53391md.class, "d", C53386lz.class, C53363lc.class, C10662f.f35572a, C53416nb.class, C53397mj.class, C53442oa.class, C49217p.class, C30325g.f82003a, C53155dk.class, "e"});
            case 3:
                return new C53366lf();
            case 4:
                return new C53364ld();
            case 5:
                return f140034h;
            case 6:
                C63010eb ebVar = f140035j;
                if (ebVar == null) {
                    synchronized (C53366lf.class) {
                        ebVar = f140035j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140034h);
                            f140035j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
