package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.aq */
/* compiled from: PG */
public final class C80295aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80295aq f220357c;

    /* renamed from: e */
    private static volatile C63010eb f220358e;

    /* renamed from: a */
    public int f220359a = 0;

    /* renamed from: b */
    public Object f220360b;

    /* renamed from: d */
    private byte f220361d = 2;

    static {
        C80295aq aqVar = new C80295aq();
        f220357c = aqVar;
        C62942bv.registerDefaultInstance(C80295aq.class, aqVar);
    }

    private C80295aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220361d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220361d = b;
                return null;
            case 2:
                return newMessageInfo(f220357c, "\u0000\u0013\u0001\u0000\u0001\u0016\u0013\u0000\u0000\u0002\u0001<\u0000\u0002м\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012м\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000", new Object[]{"b", "a", C80281ac.class, C80289ak.class, C80336cd.class, C80302ax.class, C80307bb.class, C80338cf.class, C80364u.class, C80317bl.class, C80346cn.class, C80315bj.class, C80309bd.class, C80292an.class, C80287ai.class, C80298at.class, C80285ag.class, C80279aa.class, C80283ae.class, C80319bn.class, C80344cl.class});
            case 3:
                return new C80295aq();
            case 4:
                return new C80293ao();
            case 5:
                return f220357c;
            case 6:
                C63010eb ebVar = f220358e;
                if (ebVar == null) {
                    synchronized (C80295aq.class) {
                        ebVar = f220358e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220357c);
                            f220358e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
