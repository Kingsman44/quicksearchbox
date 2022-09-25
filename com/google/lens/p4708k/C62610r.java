package com.google.lens.p4708k;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.r */
/* compiled from: PG */
public final class C62610r extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62610r f169038h;

    /* renamed from: j */
    private static volatile C63010eb f169039j;

    /* renamed from: a */
    public int f169040a;

    /* renamed from: b */
    public int f169041b = 0;

    /* renamed from: c */
    public Object f169042c;

    /* renamed from: d */
    public int f169043d;

    /* renamed from: e */
    public C62609q f169044e;

    /* renamed from: f */
    public String f169045f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f169046g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f169047i = 2;

    static {
        C62610r rVar = new C62610r();
        f169038h = rVar;
        C62942bv.registerDefaultInstance(C62610r.class, rVar);
    }

    private C62610r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169047i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169047i = b;
                return null;
            case 2:
                return newMessageInfo(f169038h, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001င\u0000\u0002ဉ\u0001\u0004ြ\u0000\u0005ᐼ\u0000\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C62604l.class, C62612t.class, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C62610r();
            case 4:
                return new C62605m();
            case 5:
                return f169038h;
            case 6:
                C63010eb ebVar = f169039j;
                if (ebVar == null) {
                    synchronized (C62610r.class) {
                        ebVar = f169039j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169038h);
                            f169039j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
