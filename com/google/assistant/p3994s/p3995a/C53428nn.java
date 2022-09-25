package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.nn */
/* compiled from: PG */
public final class C53428nn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53428nn f140215d;

    /* renamed from: g */
    private static volatile C63010eb f140216g;

    /* renamed from: a */
    public int f140217a = 0;

    /* renamed from: b */
    public Object f140218b;

    /* renamed from: c */
    public String f140219c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f140220e;

    /* renamed from: f */
    private byte f140221f = 2;

    static {
        C53428nn nnVar = new C53428nn();
        f140215d = nnVar;
        C62942bv.registerDefaultInstance(C53428nn.class, nnVar);
    }

    private C53428nn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140221f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140221f = b;
                return null;
            case 2:
                return newMessageInfo(f140215d, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0004\u0001ြ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ᐼ\u0000\u0007ᐼ\u0000\bြ\u0000\tြ\u0000\nဈ\b", new Object[]{"b", "a", "e", C53378lr.class, C53374ln.class, C53393mf.class, C53409mv.class, C53358ky.class, C53405mr.class, C53389mb.class, C53401mn.class, C45240c.f118157a});
            case 3:
                return new C53428nn();
            case 4:
                return new C53427nm();
            case 5:
                return f140215d;
            case 6:
                C63010eb ebVar = f140216g;
                if (ebVar == null) {
                    synchronized (C53428nn.class) {
                        ebVar = f140216g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140215d);
                            f140216g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
