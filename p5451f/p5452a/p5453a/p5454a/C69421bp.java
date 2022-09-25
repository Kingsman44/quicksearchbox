package p5451f.p5452a.p5453a.p5454a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: f.a.a.a.bp */
/* compiled from: PG */
public final class C69421bp extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C69421bp f185742q;

    /* renamed from: s */
    private static volatile C63010eb f185743s;

    /* renamed from: a */
    public int f185744a;

    /* renamed from: b */
    public int f185745b;

    /* renamed from: c */
    public int f185746c;

    /* renamed from: d */
    public int f185747d;

    /* renamed from: e */
    public boolean f185748e;

    /* renamed from: f */
    public boolean f185749f;

    /* renamed from: g */
    public C69415bj f185750g;

    /* renamed from: h */
    public boolean f185751h;

    /* renamed from: i */
    public C62961ch f185752i;

    /* renamed from: j */
    public int f185753j;

    /* renamed from: k */
    public long f185754k;

    /* renamed from: l */
    public int f185755l;

    /* renamed from: m */
    public long f185756m;

    /* renamed from: n */
    public boolean f185757n;

    /* renamed from: o */
    public boolean f185758o;

    /* renamed from: p */
    public boolean f185759p;

    /* renamed from: r */
    private byte f185760r = 2;

    static {
        C69421bp bpVar = new C69421bp();
        f185742q = bpVar;
        C62942bv.registerDefaultInstance(C69421bp.class, bpVar);
    }

    private C69421bp() {
        emptyIntList();
        this.f185752i = emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f185760r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f185760r = b;
                return null;
            case 2:
                return newMessageInfo(f185742q, "\u0001\u000f\u0000\u0001\u0001\u0012\u000f\u0000\u0001\u0001\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\bဇ\u0005\tᐉ\u0007\nဇ\b\u000b\u0016\fင\t\rဂ\n\u000eင\u000b\u000fဂ\f\u0010ဇ\r\u0011ဇ\u000e\u0012ဇ\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new C69421bp();
            case 4:
                return new C69406ba();
            case 5:
                return f185742q;
            case 6:
                C63010eb ebVar = f185743s;
                if (ebVar == null) {
                    synchronized (C69421bp.class) {
                        ebVar = f185743s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185742q);
                            f185743s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
