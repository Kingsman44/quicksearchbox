package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.i */
/* compiled from: PG */
public final class C80012i extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C80012i f219558i;

    /* renamed from: j */
    public static final C62940bt f219559j;

    /* renamed from: l */
    private static volatile C63010eb f219560l;

    /* renamed from: a */
    public int f219561a;

    /* renamed from: b */
    public String f219562b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f219563c;

    /* renamed from: d */
    public C80007da f219564d;

    /* renamed from: e */
    public long f219565e;

    /* renamed from: f */
    public int f219566f;

    /* renamed from: g */
    public C80011h f219567g;

    /* renamed from: h */
    public boolean f219568h;

    /* renamed from: k */
    private byte f219569k = 2;

    static {
        C80012i iVar = new C80012i();
        f219558i = iVar;
        C62942bv.registerDefaultInstance(C80012i.class, iVar);
        f219559j = C62942bv.newSingularGeneratedExtension(C79885g.f218957h, iVar, iVar, (C62958ce) null, 298882222, C63066gd.MESSAGE, C80012i.class);
    }

    private C80012i() {
        C62942bv.emptyProtobufList();
        this.f219563c = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo74276a() {
        C62971cq cqVar = this.f219563c;
        if (!cqVar.mo58948c()) {
            this.f219563c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219569k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219569k = b;
                return null;
            case 2:
                return newMessageInfo(f219558i, "\u0001\u0007\u0000\u0001\u0001\u0011\u0007\u0000\u0001\u0001\u0001ဈ\u0001\u0002\u001b\u0003ဉ\u0002\u0005ဃ\u0004\u0006ᐉ\u0006\rဇ\n\u0011ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, C79938am.class, "d", "e", C30325g.f82003a, C19618h.f54585a, C10662f.f35572a, C79952b.m128041b()});
            case 3:
                return new C80012i();
            case 4:
                return new C80008e();
            case 5:
                return f219558i;
            case 6:
                C63010eb ebVar = f219560l;
                if (ebVar == null) {
                    synchronized (C80012i.class) {
                        ebVar = f219560l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219558i);
                            f219560l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
