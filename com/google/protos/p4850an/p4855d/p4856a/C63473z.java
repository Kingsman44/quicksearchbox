package com.google.protos.p4850an.p4855d.p4856a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4850an.C63352aw;
import com.google.protos.p4985f.p5001d.C64829k;

/* renamed from: com.google.protos.an.d.a.z */
/* compiled from: PG */
public final class C63473z extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C63473z f171527h;

    /* renamed from: i */
    public static final C62940bt f171528i;

    /* renamed from: m */
    private static volatile C63010eb f171529m;

    /* renamed from: a */
    public int f171530a;

    /* renamed from: b */
    public C62971cq f171531b = emptyProtobufList();

    /* renamed from: c */
    public C63465r f171532c;

    /* renamed from: d */
    public int f171533d = 2;

    /* renamed from: e */
    public C63442ab f171534e;

    /* renamed from: f */
    public C62971cq f171535f = emptyProtobufList();

    /* renamed from: g */
    public C63463p f171536g;

    /* renamed from: j */
    private C61748j f171537j;

    /* renamed from: k */
    private C64829k f171538k;

    /* renamed from: l */
    private byte f171539l = 2;

    static {
        C63473z zVar = new C63473z();
        f171527h = zVar;
        C62942bv.registerDefaultInstance(C63473z.class, zVar);
        f171528i = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, zVar, zVar, (C62958ce) null, 54126013, C63066gd.MESSAGE, C63473z.class);
    }

    private C63473z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171539l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171539l = b;
                return null;
            case 2:
                return newMessageInfo(f171527h, "\u0001\b\u0000\u0001\u0001\u0014\b\u0000\u0002\u0003\u0001Л\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006\u001b\bဉ\f\u0013ᐉ\u0012\u0014ᐉ\u0000", new Object[]{"a", "b", C63446af.class, C45240c.f118157a, "d", C63471x.f171526a, "e", C10662f.f35572a, C63457j.class, C30325g.f82003a, C19621k.f54601a, "j"});
            case 3:
                return new C63473z();
            case 4:
                return new C63470w();
            case 5:
                return f171527h;
            case 6:
                C63010eb ebVar = f171529m;
                if (ebVar == null) {
                    synchronized (C63473z.class) {
                        ebVar = f171529m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171527h);
                            f171529m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
