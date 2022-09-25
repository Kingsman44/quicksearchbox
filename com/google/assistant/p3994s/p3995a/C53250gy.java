package com.google.assistant.p3994s.p3995a;

import com.google.assistant.p3820ak.C49217p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.gy */
/* compiled from: PG */
public final class C53250gy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53250gy f139586c;

    /* renamed from: e */
    private static volatile C63010eb f139587e;

    /* renamed from: a */
    public int f139588a = 0;

    /* renamed from: b */
    public Object f139589b;

    /* renamed from: d */
    private byte f139590d = 2;

    static {
        C53250gy gyVar = new C53250gy();
        f139586c = gyVar;
        C62942bv.registerDefaultInstance(C53250gy.class, gyVar);
    }

    private C53250gy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139590d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139590d = b;
                return null;
            case 2:
                return newMessageInfo(f139586c, "\u0001\u0017\u0001\u0000\u0001\u0019\u0017\u0000\u0000\u0003\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ᐼ\u0000\bြ\u0000\tᐼ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ြ\u0000\u0014ြ\u0000\u0015ြ\u0000\u0016ြ\u0000\u0018ြ\u0000\u0019ြ\u0000", new Object[]{"b", "a", C53173eb.class, C53190es.class, C53199fa.class, C53245gt.class, C53212fn.class, C53249gx.class, C49217p.class, C53192eu.class, C53220fv.class, C53165du.class, C53168dx.class, C53216fr.class, C53206fh.class, C53210fl.class, C53204ff.class, C53196ey.class, C53202fd.class, C53208fj.class, C53227gb.class, C53177ef.class, C53247gv.class, C53218ft.class, C53214fp.class});
            case 3:
                return new C53250gy();
            case 4:
                return new C53166dv();
            case 5:
                return f139586c;
            case 6:
                C63010eb ebVar = f139587e;
                if (ebVar == null) {
                    synchronized (C53250gy.class) {
                        ebVar = f139587e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139586c);
                            f139587e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
