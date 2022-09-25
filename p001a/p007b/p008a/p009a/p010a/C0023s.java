package p001a.p007b.p008a.p009a.p010a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.a.a.a.s */
/* compiled from: PG */
public final class C0023s extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C0023s f58h;

    /* renamed from: i */
    private static volatile C63010eb f59i;

    /* renamed from: a */
    public int f60a;

    /* renamed from: b */
    public int f61b;

    /* renamed from: c */
    public boolean f62c;

    /* renamed from: d */
    public int f63d;

    /* renamed from: e */
    public boolean f64e;

    /* renamed from: f */
    public C62971cq f65f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f66g;

    static {
        C0023s sVar = new C0023s();
        f58h = sVar;
        C62942bv.registerDefaultInstance(C0023s.class, sVar);
    }

    private C0023s() {
        emptyProtobufList();
        this.f66g = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo6a() {
        C62971cq cqVar = this.f65f;
        if (!cqVar.mo58948c()) {
            this.f65f = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo7b() {
        C62971cq cqVar = this.f66g;
        if (!cqVar.mo58948c()) {
            this.f66g = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f58h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဇ\u0001\u0005င\u0004\u0006ဇ\u0005\u0007\u001b\t\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C0022r.class, C30325g.f82003a, C0018n.class});
            case 3:
                return new C0023s();
            case 4:
                return new C0016l();
            case 5:
                return f58h;
            case 6:
                C63010eb ebVar = f59i;
                if (ebVar == null) {
                    synchronized (C0023s.class) {
                        ebVar = f59i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f58h);
                            f59i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
