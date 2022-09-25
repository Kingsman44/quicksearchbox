package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pi */
/* compiled from: PG */
public final class C14603pi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14603pi f44158c;

    /* renamed from: e */
    private static volatile C63010eb f44159e;

    /* renamed from: a */
    public int f44160a = 0;

    /* renamed from: b */
    public Object f44161b;

    /* renamed from: d */
    private byte f44162d = 2;

    static {
        C14603pi piVar = new C14603pi();
        f44158c = piVar;
        C62942bv.registerDefaultInstance(C14603pi.class, piVar);
    }

    private C14603pi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44162d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f44162d = b;
                return null;
            case 2:
                return newMessageInfo(f44158c, "\u0000\u0016\u0001\u0000\u0001\u0017\u0016\u0000\u0000\u0003\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006м\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000bм\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017м\u0000", new Object[]{"b", "a", C14565ny.class, C14599pe.class, C14597pc.class, C14568oa.class, C14572oe.class, C14578ok.class, C14586os.class, C14582oo.class, C14576oi.class, C14558nr.class, C14584oq.class, C14553nm.class, C14588ou.class, C14574og.class, C14584oq.class, C14551nk.class, C14548nh.class, C14601pg.class, C14595pa.class, C14592oy.class, C14555no.class, C14590ow.class});
            case 3:
                return new C14603pi();
            case 4:
                return new C14549ni();
            case 5:
                return f44158c;
            case 6:
                C63010eb ebVar = f44159e;
                if (ebVar == null) {
                    synchronized (C14603pi.class) {
                        ebVar = f44159e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44158c);
                            f44159e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
