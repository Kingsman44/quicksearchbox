package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mi */
/* compiled from: PG */
public final class C53396mi extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53396mi f140107g;

    /* renamed from: j */
    private static volatile C63010eb f140108j;

    /* renamed from: a */
    public String f140109a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f140110b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51012dc f140111c;

    /* renamed from: d */
    public String f140112d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C51012dc f140113e;

    /* renamed from: f */
    public int f140114f;

    /* renamed from: h */
    private int f140115h;

    /* renamed from: i */
    private byte f140116i = 2;

    static {
        C53396mi miVar = new C53396mi();
        f140107g = miVar;
        C62942bv.registerDefaultInstance(C53396mi.class, miVar);
    }

    private C53396mi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140116i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140116i = b;
                return null;
            case 2:
                return newMessageInfo(f140107g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0002\u0004င\u0006\u0005ဈ\u0004\u0006ဈ\u0001\u0007ᐉ\u0005", new Object[]{C19618h.f54585a, "a", C45240c.f118157a, C10662f.f35572a, "d", "b", "e"});
            case 3:
                return new C53396mi();
            case 4:
                return new C53395mh();
            case 5:
                return f140107g;
            case 6:
                C63010eb ebVar = f140108j;
                if (ebVar == null) {
                    synchronized (C53396mi.class) {
                        ebVar = f140108j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140107g);
                            f140108j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
