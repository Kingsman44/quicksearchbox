package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.au */
/* compiled from: PG */
public final class C57369au extends C62937bq implements C62938br {

    /* renamed from: l */
    public static final C57369au f153254l;

    /* renamed from: n */
    private static volatile C63010eb f153255n;

    /* renamed from: a */
    public int f153256a;

    /* renamed from: b */
    public int f153257b = 0;

    /* renamed from: c */
    public Object f153258c;

    /* renamed from: d */
    public int f153259d = 0;

    /* renamed from: e */
    public Object f153260e;

    /* renamed from: f */
    public int f153261f = 0;

    /* renamed from: g */
    public Object f153262g;

    /* renamed from: h */
    public C57402c f153263h;

    /* renamed from: i */
    public int f153264i;

    /* renamed from: j */
    public C57474er f153265j;

    /* renamed from: k */
    public C57401bz f153266k;

    /* renamed from: m */
    private byte f153267m = 2;

    static {
        C57369au auVar = new C57369au();
        f153254l = auVar;
        C62942bv.registerDefaultInstance(C57369au.class, auVar);
    }

    private C57369au() {
        emptyProtobufList();
        this.f153264i = 1;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153267m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153267m = b;
                return null;
            case 2:
                return newMessageInfo(f153254l, "\u0001\u000f\u0003\u0001\u0001\u001a\u000f\u0000\u0000\n\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000\u000bဉ\u0007\u000eᐼ\u0001\u000fြ\u0001\u0010ဌ\f\u0011ᐉ\r\u0015ᐼ\u0000\u0017ဉ\u000e\u0018ᐼ\u0000\u0019ᐼ\u0002\u001aြ\u0002", new Object[]{C45240c.f118157a, "b", "e", "d", C30325g.f82003a, C10662f.f35572a, "a", C57364ap.class, C57397bv.class, C57388bm.class, C57383bh.class, C57371aw.class, C19618h.f54585a, C57501i.class, C57505m.class, "i", C57392bq.m88341b(), "j", C57390bo.class, C19621k.f54601a, C57373ay.class, C57418cp.class, C57517y.class});
            case 3:
                return new C57369au();
            case 4:
                return new C57367as();
            case 5:
                return f153254l;
            case 6:
                C63010eb ebVar = f153255n;
                if (ebVar == null) {
                    synchronized (C57369au.class) {
                        ebVar = f153255n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153254l);
                            f153255n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
