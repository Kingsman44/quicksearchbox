package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.b.b */
/* compiled from: PG */
public final class C57143b extends C62937bq implements C62938br {

    /* renamed from: m */
    public static final C57143b f152527m;

    /* renamed from: n */
    public static final C62940bt f152528n;

    /* renamed from: p */
    private static volatile C63010eb f152529p;

    /* renamed from: a */
    public int f152530a;

    /* renamed from: b */
    public boolean f152531b;

    /* renamed from: c */
    public boolean f152532c;

    /* renamed from: d */
    public boolean f152533d;

    /* renamed from: e */
    public String f152534e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f152535f = emptyProtobufList();

    /* renamed from: g */
    public long f152536g;

    /* renamed from: h */
    public boolean f152537h;

    /* renamed from: i */
    public boolean f152538i;

    /* renamed from: j */
    public long f152539j;

    /* renamed from: k */
    public C57149f f152540k;

    /* renamed from: l */
    public boolean f152541l = true;

    /* renamed from: o */
    private byte f152542o = 2;

    static {
        C57143b bVar = new C57143b();
        f152527m = bVar;
        C62942bv.registerDefaultInstance(C57143b.class, bVar);
        f152528n = C62942bv.newSingularGeneratedExtension(C57144ba.f152543a, bVar, bVar, (C62958ce) null, 393053250, C63066gd.MESSAGE, C57143b.class);
    }

    private C57143b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152542o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152542o = b;
                return null;
            case 2:
                return newMessageInfo(f152527m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005\u001b\u0006ဂ\u0004\u0007ဂ\u0007\bဉ\b\nဇ\t\u000bဇ\u0005\fဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C57147d.class, C30325g.f82003a, "j", C19621k.f54601a, "l", C19618h.f54585a, "i"});
            case 3:
                return new C57143b();
            case 4:
                return new C57112a();
            case 5:
                return f152527m;
            case 6:
                C63010eb ebVar = f152529p;
                if (ebVar == null) {
                    synchronized (C57143b.class) {
                        ebVar = f152529p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152527m);
                            f152529p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
