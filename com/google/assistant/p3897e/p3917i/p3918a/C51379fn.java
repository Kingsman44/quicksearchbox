package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48247bd;
import com.google.assistant.p3795af.p3798b.C48777b;
import com.google.assistant.p3897e.p3912f.C51211f;
import com.google.knowledge.p4671b.C61790ai;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.i.a.fn */
/* compiled from: PG */
public final class C51379fn extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51379fn f133814i;

    /* renamed from: k */
    private static volatile C63010eb f133815k;

    /* renamed from: a */
    public int f133816a;

    /* renamed from: b */
    public C61790ai f133817b;

    /* renamed from: c */
    public C51548lu f133818c;

    /* renamed from: d */
    public int f133819d;

    /* renamed from: e */
    public C48247bd f133820e;

    /* renamed from: f */
    public int f133821f;

    /* renamed from: g */
    public C48777b f133822g;

    /* renamed from: h */
    public C63088z f133823h = C63088z.f170246b;

    /* renamed from: j */
    private byte f133824j = 2;

    static {
        C51379fn fnVar = new C51379fn();
        f133814i = fnVar;
        C62942bv.registerDefaultInstance(C51379fn.class, fnVar);
    }

    private C51379fn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133824j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133824j = b;
                return null;
            case 2:
                return newMessageInfo(f133814i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဉ\u0003\u0007ဌ\u0006\tဉ\u0007\nဌ\b\u000bဉ\t\fည\n", new Object[]{"a", "b", C45240c.f118157a, "d", C51211f.m86089b(), "e", C10662f.f35572a, C51378fm.m86171b(), C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C51379fn();
            case 4:
                return new C51376fk();
            case 5:
                return f133814i;
            case 6:
                C63010eb ebVar = f133815k;
                if (ebVar == null) {
                    synchronized (C51379fn.class) {
                        ebVar = f133815k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133814i);
                            f133815k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
