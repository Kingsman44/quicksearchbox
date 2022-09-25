package com.google.protos.p4985f.p4986a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55084fg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.ba */
/* compiled from: PG */
public final class C64674ba extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C64674ba f175306k;

    /* renamed from: l */
    private static volatile C63010eb f175307l;

    /* renamed from: a */
    public int f175308a;

    /* renamed from: b */
    public boolean f175309b;

    /* renamed from: c */
    public boolean f175310c;

    /* renamed from: d */
    public int f175311d;

    /* renamed from: e */
    public boolean f175312e;

    /* renamed from: f */
    public boolean f175313f;

    /* renamed from: g */
    public boolean f175314g;

    /* renamed from: h */
    public boolean f175315h;

    /* renamed from: i */
    public boolean f175316i;

    /* renamed from: j */
    public double f175317j;

    static {
        C64674ba baVar = new C64674ba();
        f175306k = baVar;
        C62942bv.registerDefaultInstance(C64674ba.class, baVar);
    }

    private C64674ba() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f175306k, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0001\u0004ဌ\u0002\u0006ဇ\u0004\bဇ\u0005\tဇ\u0006\nဇ\u0007\u0010ဇ\u000b\u0011က\f", new Object[]{"a", "b", C45240c.f118157a, "d", C55084fg.m87581b(), "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C64674ba();
            case 4:
                return new C64672az();
            case 5:
                return f175306k;
            case 6:
                C63010eb ebVar = f175307l;
                if (ebVar == null) {
                    synchronized (C64674ba.class) {
                        ebVar = f175307l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175306k);
                            f175307l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
