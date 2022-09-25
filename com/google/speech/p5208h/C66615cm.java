package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.speech.h.cm */
/* compiled from: PG */
public final class C66615cm extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C66615cm f181220j;

    /* renamed from: k */
    public static final C62940bt f181221k;

    /* renamed from: m */
    private static volatile C63010eb f181222m;

    /* renamed from: a */
    public int f181223a;

    /* renamed from: b */
    public C62971cq f181224b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f181225c = emptyProtobufList();

    /* renamed from: d */
    public C66597bw f181226d;

    /* renamed from: e */
    public C62971cq f181227e = emptyProtobufList();

    /* renamed from: f */
    public C66597bw f181228f;

    /* renamed from: g */
    public String f181229g;

    /* renamed from: h */
    public String f181230h;

    /* renamed from: i */
    public boolean f181231i;

    /* renamed from: l */
    private byte f181232l = 2;

    static {
        C66615cm cmVar = new C66615cm();
        f181220j = cmVar;
        C62942bv.registerDefaultInstance(C66615cm.class, cmVar);
        f181221k = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, cmVar, cmVar, (C62958ce) null, 293000, C63066gd.MESSAGE, C66615cm.class);
    }

    private C66615cm() {
        emptyProtobufList();
        this.f181229g = BuildConfig.FLAVOR;
        this.f181230h = BuildConfig.FLAVOR;
        this.f181231i = true;
    }

    /* renamed from: a */
    public final void mo59691a() {
        C62971cq cqVar = this.f181224b;
        if (!cqVar.mo58948c()) {
            this.f181224b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo59692b() {
        C62971cq cqVar = this.f181227e;
        if (!cqVar.mo58948c()) {
            this.f181227e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181232l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181232l = b;
                return null;
            case 2:
                return newMessageInfo(f181220j, "\u0001\b\u0000\u0001\u0002\u0010\b\u0000\u0003\u0001\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b\u0005ဈ\u0002\bဈ\u0005\tЛ\rဇ\u0006\u0010\u001b", new Object[]{"a", "d", C10662f.f35572a, "e", C66597bw.class, C30325g.f82003a, C19618h.f54585a, "b", C66592br.class, "i", C45240c.f118157a, C66595bu.class});
            case 3:
                return new C66615cm();
            case 4:
                return new C66614cl();
            case 5:
                return f181220j;
            case 6:
                C63010eb ebVar = f181222m;
                if (ebVar == null) {
                    synchronized (C66615cm.class) {
                        ebVar = f181222m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181220j);
                            f181222m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
