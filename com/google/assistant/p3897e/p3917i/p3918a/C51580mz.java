package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.mz */
/* compiled from: PG */
public final class C51580mz extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51580mz f134430h;

    /* renamed from: i */
    private static volatile C63010eb f134431i;

    /* renamed from: a */
    public int f134432a = 0;

    /* renamed from: b */
    public Object f134433b;

    /* renamed from: c */
    public int f134434c;

    /* renamed from: d */
    public boolean f134435d;

    /* renamed from: e */
    public C62971cq f134436e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62971cq f134437f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f134438g = emptyProtobufList();

    static {
        C51580mz mzVar = new C51580mz();
        f134430h = mzVar;
        C62942bv.registerDefaultInstance(C51580mz.class, mzVar);
    }

    private C51580mz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f134430h, "\u0000\b\u0001\u0000\u0001\n\b\u0000\u0003\u0000\u0001<\u0000\u0002Ț\u0003\u0007\u0005Ȼ\u0000\u0006\f\u0007<\u0000\b\u001b\n\u001b", new Object[]{"b", "a", C51579my.class, "e", "d", C45240c.f118157a, C51058ev.class, C10662f.f35572a, C51576mv.class, C30325g.f82003a, C51587nf.class});
            case 3:
                return new C51580mz();
            case 4:
                return new C51577mw();
            case 5:
                return f134430h;
            case 6:
                C63010eb ebVar = f134431i;
                if (ebVar == null) {
                    synchronized (C51580mz.class) {
                        ebVar = f134431i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134430h);
                            f134431i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
