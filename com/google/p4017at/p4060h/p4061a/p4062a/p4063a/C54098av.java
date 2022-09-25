package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.av */
/* compiled from: PG */
public final class C54098av extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C54098av f141935j;

    /* renamed from: l */
    private static volatile C63010eb f141936l;

    /* renamed from: a */
    public int f141937a;

    /* renamed from: b */
    public C62971cq f141938b = emptyProtobufList();

    /* renamed from: c */
    public long f141939c;

    /* renamed from: d */
    public C54103b f141940d;

    /* renamed from: e */
    public C54124w f141941e;

    /* renamed from: f */
    public C54122u f141942f;

    /* renamed from: g */
    public C57784p f141943g;

    /* renamed from: h */
    public boolean f141944h;

    /* renamed from: i */
    public C54109h f141945i;

    /* renamed from: k */
    private byte f141946k = 2;

    static {
        C54098av avVar = new C54098av();
        f141935j = avVar;
        C62942bv.registerDefaultInstance(C54098av.class, avVar);
    }

    private C54098av() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141946k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141946k = b;
                return null;
            case 2:
                return newMessageInfo(f141935j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0001\u0004\u0001Л\u0002ဃ\u0000\u0003ဉ\u0001\u0004ဉ\u0003\u0007ᐉ\u0004\tᐉ\u0005\nဇ\u0006\fᐉ\b", new Object[]{"a", "b", C54084ah.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C54098av();
            case 4:
                return new C54097au();
            case 5:
                return f141935j;
            case 6:
                C63010eb ebVar = f141936l;
                if (ebVar == null) {
                    synchronized (C54098av.class) {
                        ebVar = f141936l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141935j);
                            f141936l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
