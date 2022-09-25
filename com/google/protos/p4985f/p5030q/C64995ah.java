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

/* renamed from: com.google.protos.f.q.ah */
/* compiled from: PG */
public final class C64995ah extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C64995ah f176013k;

    /* renamed from: m */
    private static volatile C63010eb f176014m;

    /* renamed from: a */
    public int f176015a;

    /* renamed from: b */
    public int f176016b;

    /* renamed from: c */
    public String f176017c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f176018d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f176019e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f176020f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f176021g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public String f176022h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C64708r f176023i;

    /* renamed from: j */
    public C64989ab f176024j;

    /* renamed from: l */
    private byte f176025l = 2;

    static {
        C64995ah ahVar = new C64995ah();
        f176013k = ahVar;
        C62942bv.registerDefaultInstance(C64995ah.class, ahVar);
    }

    private C64995ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176025l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176025l = b;
                return null;
            case 2:
                return newMessageInfo(f176013k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001a\u0007ဈ\u0005\bᐉ\u0006\tဉ\u0007", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C64995ah();
            case 4:
                return new C64994ag();
            case 5:
                return f176013k;
            case 6:
                C63010eb ebVar = f176014m;
                if (ebVar == null) {
                    synchronized (C64995ah.class) {
                        ebVar = f176014m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176013k);
                            f176014m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
