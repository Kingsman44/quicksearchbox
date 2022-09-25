package com.google.android.apps.gsa.nga.shared.p6312ai.p6313a;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81048f;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ai.a.b */
/* compiled from: PG */
public final class C80638b extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C80638b f221379o;

    /* renamed from: q */
    private static volatile C63010eb f221380q;

    /* renamed from: a */
    public int f221381a;

    /* renamed from: b */
    public boolean f221382b = true;

    /* renamed from: c */
    public boolean f221383c;

    /* renamed from: d */
    public C81048f f221384d;

    /* renamed from: e */
    public int f221385e;

    /* renamed from: f */
    public C37672hs f221386f;

    /* renamed from: g */
    public boolean f221387g;

    /* renamed from: h */
    public boolean f221388h;

    /* renamed from: i */
    public boolean f221389i;

    /* renamed from: j */
    public boolean f221390j;

    /* renamed from: k */
    public boolean f221391k;

    /* renamed from: l */
    public C37462ck f221392l;

    /* renamed from: m */
    public boolean f221393m;

    /* renamed from: n */
    public cf f221394n;

    /* renamed from: p */
    private byte f221395p = 2;

    static {
        C80638b bVar = new C80638b();
        f221379o = bVar;
        C62942bv.registerDefaultInstance(C80638b.class, bVar);
    }

    private C80638b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221395p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221395p = b;
                return null;
            case 2:
                return newMessageInfo(f221379o, "\u0001\r\u0000\u0001\u0002\u0010\r\u0000\u0000\u0001\u0002ဇ\u0000\u0003ဇ\u0001\u0004ᐉ\u0002\u0005ဌ\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\u000bဇ\b\fဇ\t\rဉ\n\u000fဇ\u000b\u0010ဉ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C80471b.m128171b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C80638b();
            case 4:
                return new C80633a();
            case 5:
                return f221379o;
            case 6:
                C63010eb ebVar = f221380q;
                if (ebVar == null) {
                    synchronized (C80638b.class) {
                        ebVar = f221380q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221379o);
                            f221380q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
