package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.assistant.e.j.aap */
/* compiled from: PG */
public final class aap extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final aap f134650h;

    /* renamed from: j */
    private static volatile C63010eb f134651j;

    /* renamed from: a */
    public int f134652a;

    /* renamed from: b */
    public int f134653b;

    /* renamed from: c */
    public long f134654c;

    /* renamed from: d */
    public int f134655d;

    /* renamed from: e */
    public C62961ch f134656e = emptyIntList();

    /* renamed from: f */
    public C63204j f134657f;

    /* renamed from: g */
    public int f134658g;

    /* renamed from: i */
    private byte f134659i = 2;

    static {
        aap aap = new aap();
        f134650h = aap;
        C62942bv.registerDefaultInstance(aap.class, aap);
    }

    private aap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134659i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134659i = b;
                return null;
            case 2:
                return newMessageInfo(f134650h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001င\u0000\u0002င\u0002\u0003ဂ\u0001\u0004\u0016\u0005ᐉ\u0003\u0006ဌ\u0004", new Object[]{"a", "b", "d", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, aan.f134649a});
            case 3:
                return new aap();
            case 4:
                return new aam();
            case 5:
                return f134650h;
            case 6:
                C63010eb ebVar = f134651j;
                if (ebVar == null) {
                    synchronized (aap.class) {
                        ebVar = f134651j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134650h);
                            f134651j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
