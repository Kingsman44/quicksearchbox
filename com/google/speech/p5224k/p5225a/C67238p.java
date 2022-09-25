package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p5144u.C65889b;
import com.google.protos.p5144u.C65894g;
import com.google.protos.p5144u.C65896i;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67456d;
import com.google.speech.recognizer.p5233a.C67458f;
import com.google.speech.recognizer.p5233a.C67460h;
import com.google.speech.recognizer.p5233a.C67464l;
import com.google.speech.recognizer.p5233a.C67472t;
import com.google.speech.recognizer.p5233a.C67478z;

/* renamed from: com.google.speech.k.a.p */
/* compiled from: PG */
public final class C67238p extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C67238p f182736e;

    /* renamed from: f */
    public static final C62940bt f182737f;

    /* renamed from: h */
    private static volatile C63010eb f182738h;

    /* renamed from: a */
    public int f182739a;

    /* renamed from: b */
    public int f182740b = 0;

    /* renamed from: c */
    public Object f182741c;

    /* renamed from: d */
    public String f182742d = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f182743g = 2;

    static {
        C67238p pVar = new C67238p();
        f182736e = pVar;
        C62942bv.registerDefaultInstance(C67238p.class, pVar);
        f182737f = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, pVar, pVar, (C62958ce) null, 1253625, C63066gd.MESSAGE, C67238p.class);
    }

    private C67238p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182743g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182743g = b;
                return null;
            case 2:
                return newMessageInfo(f182736e, "\u0001\u000e\u0001\u0001\u0001\u0010\u000e\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ြ\u0000\u0003ဈ\r\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bᐼ\u0000\fြ\u0000\rြ\u0000\u000fြ\u0000\u0010ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", C67438ag.class, C67464l.class, "d", C67456d.class, C67460h.class, C67478z.class, C67235m.class, C67458f.class, C67233k.class, C65896i.class, C65889b.class, C67246x.class, C67472t.class, C65894g.class});
            case 3:
                return new C67238p();
            case 4:
                return new C67236n();
            case 5:
                return f182736e;
            case 6:
                C63010eb ebVar = f182738h;
                if (ebVar == null) {
                    synchronized (C67238p.class) {
                        ebVar = f182738h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182736e);
                            f182738h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
