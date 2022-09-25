package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.c.a.p */
/* compiled from: PG */
public final class C20170p extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C20170p f56582i;

    /* renamed from: j */
    public static final C62940bt f56583j;

    /* renamed from: l */
    private static volatile C63010eb f56584l;

    /* renamed from: a */
    public int f56585a;

    /* renamed from: b */
    public C62971cq f56586b = emptyProtobufList();

    /* renamed from: c */
    public C19916aq f56587c;

    /* renamed from: d */
    public boolean f56588d;

    /* renamed from: e */
    public C19983f f56589e;

    /* renamed from: f */
    public C19983f f56590f;

    /* renamed from: g */
    public String f56591g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f56592h = true;

    /* renamed from: k */
    private byte f56593k = 2;

    static {
        C20170p pVar = new C20170p();
        f56582i = pVar;
        C62942bv.registerDefaultInstance(C20170p.class, pVar);
        f56583j = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, pVar, pVar, (C62958ce) null, 152727371, C63066gd.MESSAGE, C20170p.class);
    }

    private C20170p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56593k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56593k = b;
                return null;
            case 2:
                return newMessageInfo(f56582i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C20170p();
            case 4:
                return new C20169o();
            case 5:
                return f56582i;
            case 6:
                C63010eb ebVar = f56584l;
                if (ebVar == null) {
                    synchronized (C20170p.class) {
                        ebVar = f56584l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56582i);
                            f56584l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
