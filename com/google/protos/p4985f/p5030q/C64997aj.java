package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4986a.C64708r;

/* renamed from: com.google.protos.f.q.aj */
/* compiled from: PG */
public final class C64997aj extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64997aj f176026i;

    /* renamed from: k */
    private static volatile C63010eb f176027k;

    /* renamed from: a */
    public int f176028a;

    /* renamed from: b */
    public int f176029b;

    /* renamed from: c */
    public String f176030c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f176031d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f176032e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f176033f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C64708r f176034g;

    /* renamed from: h */
    public C64989ab f176035h;

    /* renamed from: j */
    private byte f176036j = 2;

    static {
        C64997aj ajVar = new C64997aj();
        f176026i = ajVar;
        C62942bv.registerDefaultInstance(C64997aj.class, ajVar);
    }

    private C64997aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176036j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176036j = b;
                return null;
            case 2:
                return newMessageInfo(f176026i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ᐉ\u0004\u0007ဉ\u0005", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C64997aj();
            case 4:
                return new C64996ai();
            case 5:
                return f176026i;
            case 6:
                C63010eb ebVar = f176027k;
                if (ebVar == null) {
                    synchronized (C64997aj.class) {
                        ebVar = f176027k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176026i);
                            f176027k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
