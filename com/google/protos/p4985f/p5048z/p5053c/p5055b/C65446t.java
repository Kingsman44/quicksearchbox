package com.google.protos.p4985f.p5048z.p5053c.p5055b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.saft.C62849c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.protos.f.z.c.b.t */
/* compiled from: PG */
public final class C65446t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65446t f177896a;

    /* renamed from: k */
    private static volatile C63010eb f177897k;

    /* renamed from: b */
    private int f177898b;

    /* renamed from: c */
    private C62849c f177899c;

    /* renamed from: d */
    private C62849c f177900d;

    /* renamed from: e */
    private C63037fb f177901e;

    /* renamed from: f */
    private C62995dn f177902f = C62995dn.f170057a;

    /* renamed from: g */
    private C62995dn f177903g;

    /* renamed from: h */
    private C62995dn f177904h;

    /* renamed from: i */
    private C62995dn f177905i;

    /* renamed from: j */
    private byte f177906j;

    static {
        C65446t tVar = new C65446t();
        f177896a = tVar;
        C62942bv.registerDefaultInstance(C65446t.class, tVar);
    }

    private C65446t() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f177903g = dnVar;
        this.f177904h = dnVar;
        this.f177905i = dnVar;
        this.f177906j = 2;
        C62942bv.emptyProtobufList();
        emptyIntList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177906j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177906j = b;
                return null;
            case 2:
                return newMessageInfo(f177896a, "\u0001\u0007\u0000\u0001\u0007%\u0007\u0004\u0000\u0002\u0007ဉ\u0006\u0010ᐉ\u0001\u00112\u0014ᐉ\u0002\u00182\u001b2%2", new Object[]{"b", "e", C45240c.f118157a, C10662f.f35572a, C65443q.f177893a, "d", C30325g.f82003a, C65442p.f177892a, C19618h.f54585a, C65445s.f177895a, "i", C65444r.f177894a});
            case 3:
                return new C65446t();
            case 4:
                return new C65439m();
            case 5:
                return f177896a;
            case 6:
                C63010eb ebVar = f177897k;
                if (ebVar == null) {
                    synchronized (C65446t.class) {
                        ebVar = f177897k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177896a);
                            f177897k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
