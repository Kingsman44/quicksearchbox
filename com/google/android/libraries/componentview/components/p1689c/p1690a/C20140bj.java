package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
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

/* renamed from: com.google.android.libraries.componentview.components.c.a.bj */
/* compiled from: PG */
public final class C20140bj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C20140bj f56473h;

    /* renamed from: i */
    public static final C62940bt f56474i;

    /* renamed from: k */
    private static volatile C63010eb f56475k;

    /* renamed from: a */
    public int f56476a;

    /* renamed from: b */
    public C62971cq f56477b = emptyProtobufList();

    /* renamed from: c */
    public C19916aq f56478c;

    /* renamed from: d */
    public boolean f56479d;

    /* renamed from: e */
    public C19983f f56480e;

    /* renamed from: f */
    public C19983f f56481f;

    /* renamed from: g */
    public boolean f56482g = true;

    /* renamed from: j */
    private byte f56483j = 2;

    static {
        C20140bj bjVar = new C20140bj();
        f56473h = bjVar;
        C62942bv.registerDefaultInstance(C20140bj.class, bjVar);
        f56474i = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bjVar, bjVar, (C62958ce) null, 152722371, C63066gd.MESSAGE, C20140bj.class);
    }

    private C20140bj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56483j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56483j = b;
                return null;
            case 2:
                return newMessageInfo(f56473h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C20140bj();
            case 4:
                return new C20139bi();
            case 5:
                return f56473h;
            case 6:
                C63010eb ebVar = f56475k;
                if (ebVar == null) {
                    synchronized (C20140bj.class) {
                        ebVar = f56475k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56473h);
                            f56475k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
