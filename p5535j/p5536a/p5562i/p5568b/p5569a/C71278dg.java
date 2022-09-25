package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60120al;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4831g.p4832a.p4833a.C63271b;

/* renamed from: j.a.i.b.a.dg */
/* compiled from: PG */
public final class C71278dg extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C71278dg f190307j;

    /* renamed from: l */
    private static volatile C63010eb f190308l;

    /* renamed from: a */
    public int f190309a;

    /* renamed from: b */
    public boolean f190310b;

    /* renamed from: c */
    public C71266cv f190311c;

    /* renamed from: d */
    public String f190312d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f190313e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f190314f;

    /* renamed from: g */
    public String f190315g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C60120al f190316h;

    /* renamed from: i */
    public C63271b f190317i;

    /* renamed from: k */
    private byte f190318k = 2;

    static {
        C71278dg dgVar = new C71278dg();
        f190307j = dgVar;
        C62942bv.registerDefaultInstance(C71278dg.class, dgVar);
    }

    private C71278dg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190318k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190318k = b;
                return null;
            case 2:
                return newMessageInfo(f190307j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C71277df.f190306a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C71278dg();
            case 4:
                return new C71276de();
            case 5:
                return f190307j;
            case 6:
                C63010eb ebVar = f190308l;
                if (ebVar == null) {
                    synchronized (C71278dg.class) {
                        ebVar = f190308l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190307j);
                            f190308l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
