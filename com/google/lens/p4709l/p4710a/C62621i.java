package com.google.lens.p4709l.p4710a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.l.a.i */
/* compiled from: PG */
public final class C62621i extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C62621i f169069i;

    /* renamed from: j */
    private static volatile C63010eb f169070j;

    /* renamed from: a */
    public int f169071a;

    /* renamed from: b */
    public C62971cq f169072b = emptyProtobufList();

    /* renamed from: c */
    public C62995dn f169073c = C62995dn.f170057a;

    /* renamed from: d */
    public C62971cq f169074d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f169075e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62971cq f169076f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public boolean f169077g;

    /* renamed from: h */
    public int f169078h = 1;

    static {
        C62621i iVar = new C62621i();
        f169069i = iVar;
        C62942bv.registerDefaultInstance(C62621i.class, iVar);
    }

    private C62621i() {
    }

    /* renamed from: a */
    public final void mo58514a() {
        C62971cq cqVar = this.f169074d;
        if (!cqVar.mo58948c()) {
            this.f169074d = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f169069i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0004\u0000\u0001\u001b\u00022\u0003\u001a\u0004\u001a\u0005\u001a\u0006ဇ\u0000\u0007ဌ\u0001", new Object[]{"a", "b", C62616d.class, C45240c.f118157a, C62618f.f169065a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C62622j.f169079a});
            case 3:
                return new C62621i();
            case 4:
                return new C62617e();
            case 5:
                return f169069i;
            case 6:
                C63010eb ebVar = f169070j;
                if (ebVar == null) {
                    synchronized (C62621i.class) {
                        ebVar = f169070j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169069i);
                            f169070j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
