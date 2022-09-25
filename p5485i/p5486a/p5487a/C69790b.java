package p5485i.p5486a.p5487a;

import com.google.android.libraries.lens.p2014e.p2015a.C24193l;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4056g.p4057a.p4058a.C54002bj;
import com.google.p4017at.p4056g.p4057a.p4058a.C54008bp;
import com.google.p4017at.p4056g.p4057a.p4058a.C54066r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: i.a.a.b */
/* compiled from: PG */
public final class C69790b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C69790b f186171f;

    /* renamed from: h */
    private static volatile C63010eb f186172h;

    /* renamed from: a */
    public C54066r f186173a;

    /* renamed from: b */
    public C24193l f186174b;

    /* renamed from: c */
    public C56280cg f186175c;

    /* renamed from: d */
    public C62971cq f186176d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f186177e = emptyProtobufList();

    /* renamed from: g */
    private byte f186178g = 2;

    static {
        C69790b bVar = new C69790b();
        f186171f = bVar;
        C62942bv.registerDefaultInstance(C69790b.class, bVar);
    }

    private C69790b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f186178g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f186178g = b;
                return null;
            case 2:
                return newMessageInfo(f186171f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0002\u0001\t\u0002\t\u0003\t\u0004Л\u0005Л", new Object[]{"a", "b", C45240c.f118157a, "d", C54002bj.class, "e", C54008bp.class});
            case 3:
                return new C69790b();
            case 4:
                return new C69789a();
            case 5:
                return f186171f;
            case 6:
                C63010eb ebVar = f186172h;
                if (ebVar == null) {
                    synchronized (C69790b.class) {
                        ebVar = f186172h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f186171f);
                            f186172h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
