package com.google.knowledge.cerebra.sense.textclassifier.p4681e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4273bs.p4277b.p4278a.C56462b;
import com.google.p4273bs.p4277b.p4278a.C56467g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.e.f */
/* compiled from: PG */
public final class C61858f extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C61858f f167165k;

    /* renamed from: l */
    private static volatile C63010eb f167166l;

    /* renamed from: a */
    public int f167167a;

    /* renamed from: b */
    public C62971cq f167168b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f167169c = emptyProtobufList();

    /* renamed from: d */
    public String f167170d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f167171e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f167172f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public int f167173g;

    /* renamed from: h */
    public int f167174h;

    /* renamed from: i */
    public float f167175i;

    /* renamed from: j */
    public C62971cq f167176j = emptyProtobufList();

    static {
        C61858f fVar = new C61858f();
        f167165k = fVar;
        C62942bv.registerDefaultInstance(C61858f.class, fVar);
    }

    private C61858f() {
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
                return newMessageInfo(f167165k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0004\u0000\u0001\u001a\u0003ဈ\u0000\u0004ဈ\u0001\u0005\u001a\u0006င\u0002\u0007င\u0003\b\u001b\tခ\u0004\n\u001b", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C45240c.f118157a, C56467g.class, "i", "j", C56462b.class});
            case 3:
                return new C61858f();
            case 4:
                return new C61857e();
            case 5:
                return f167165k;
            case 6:
                C63010eb ebVar = f167166l;
                if (ebVar == null) {
                    synchronized (C61858f.class) {
                        ebVar = f167166l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167165k);
                            f167166l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
