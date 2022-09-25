package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4563i.C59868ad;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.common.o.amc */
/* compiled from: PG */
public final class amc extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final amc f159123i;

    /* renamed from: k */
    private static volatile C63010eb f159124k;

    /* renamed from: a */
    public int f159125a;

    /* renamed from: b */
    public int f159126b;

    /* renamed from: c */
    public C62971cq f159127c;

    /* renamed from: d */
    public int f159128d;

    /* renamed from: e */
    public int f159129e;

    /* renamed from: f */
    public boolean f159130f;

    /* renamed from: g */
    public String f159131g;

    /* renamed from: h */
    public C59868ad f159132h;

    /* renamed from: j */
    private byte f159133j = 2;

    static {
        amc amc = new amc();
        f159123i = amc;
        C62942bv.registerDefaultInstance(amc.class, amc);
    }

    private amc() {
        emptyIntList();
        this.f159127c = emptyProtobufList();
        this.f159131g = BuildConfig.FLAVOR;
        emptyIntList();
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159133j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159133j = b;
                return null;
            case 2:
                return newMessageInfo(f159123i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0001\u0001င\u0000\u0002Л\u0003ဌ\u0001\u0004ဇ\u0003\u0005ဌ\u0002\u0007ဈ\u0005\tဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, amg.class, "d", amb.f159122a, C10662f.f35572a, "e", C56306df.m87965b(), C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new amc();
            case 4:
                return new ama();
            case 5:
                return f159123i;
            case 6:
                C63010eb ebVar = f159124k;
                if (ebVar == null) {
                    synchronized (amc.class) {
                        ebVar = f159124k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159123i);
                            f159124k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
