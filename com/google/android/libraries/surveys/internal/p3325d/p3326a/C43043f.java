package com.google.android.libraries.surveys.internal.p3325d.p3326a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.surveys.internal.p3321a.C43033a;
import com.google.android.libraries.surveys.internal.p3323c.p3324a.C43036a;
import com.google.android.libraries.surveys.internal.p3325d.C43051c;
import com.google.android.libraries.surveys.internal.p3325d.p3327b.C43050e;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4281bu.p4282a.C56577dg;
import com.google.p4281bu.p4282a.C56578dh;
import com.google.p4281bu.p4282a.C56580f;
import com.google.p4281bu.p4282a.C56581g;
import com.google.p4281bu.p4282a.C56582h;
import com.google.p4651h.p4652a.C61647d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68365an;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68397v;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.C70903r;
import p5488io.grpc.p5520a.C70136d;
import p5488io.grpc.p5523c.C70261e;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.surveys.internal.d.a.f */
/* compiled from: PG */
public final class C43043f extends C43050e {

    /* renamed from: g */
    private C70286co f112586g;

    /* renamed from: h */
    private String f112587h;

    /* renamed from: i */
    private final C43040c f112588i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public C43043f(Context context, String str, String str2, String str3, CronetEngine cronetEngine) {
        super(context, str, str2, str3);
        C43040c cVar = new C43040c(cronetEngine);
        this.f112588i = cVar;
    }

    /* renamed from: d */
    static final C70297cz m75948d() {
        return new C70290cs("Cookie", C70334de.f187481c);
    }

    /* renamed from: a */
    public final C70888j mo46063a(C61647d dVar) {
        C43036a aVar;
        try {
            int i = C43066o.f112626a;
            if (TextUtils.isEmpty(this.f112587h) && (aVar = C43033a.f112554a.f112555b) != null) {
                this.f112587h = aVar.mo46059a();
            }
            this.f112586g = C70261e.m102411b("scone-pa.googleapis.com", 443, this.f112588i.f112579a).f187275c.mo57963c();
            String str = this.f112587h;
            C70334de deVar = new C70334de();
            if (!C43054c.m75959b(C68397v.f184745a.mo6453a().mo60384b(C43054c.f112610b))) {
                deVar.mo62033h(m75948d(), str);
            } else if (dVar == null && !TextUtils.isEmpty(str)) {
                deVar.mo62033h(m75948d(), str);
            }
            if (!TextUtils.isEmpty(this.f112602d)) {
                deVar.mo62033h(new C70290cs("X-Goog-Api-Key", C70334de.f187481c), this.f112602d);
            }
            String g = C43066o.m75986g(this.f112599a);
            if (!TextUtils.isEmpty(g)) {
                deVar.mo62033h(new C70290cs("X-Android-Cert", C70334de.f187481c), g);
            }
            String packageName = this.f112599a.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                deVar.mo62033h(new C70290cs("X-Android-Package", C70334de.f187481c), packageName);
            }
            deVar.mo62033h(new C70290cs("Authority", C70334de.f187481c), "scone-pa.googleapis.com");
            C70879r rVar = new C70879r(deVar);
            return C70903r.m103829a(this.f112586g, Arrays.asList(new C70899n[]{rVar}));
        } catch (Exception e) {
            Log.e("NetworkCallerGrpc", "Could not get managed channel.", e);
            mo46065c();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo46064b(C56580f fVar, C43060i iVar) {
        String str;
        C60870cx cxVar;
        C70338di diVar;
        C70338di diVar2;
        try {
            C61647d f = mo46074f();
            C70888j a = mo46063a(f);
            if (a == null) {
                Log.e("NetworkCallerGrpc", "Could not get channel for trigger.");
                return;
            }
            if (f != null) {
                C56577dg dgVar = (C56577dg) C56578dh.m88214a(a).mo62574m(new C70136d(f, C70136d.f186958b));
                C70888j jVar = dgVar.f189039a;
                C70338di diVar3 = C56578dh.f151061a;
                if (diVar3 == null) {
                    synchronized (C56578dh.class) {
                        C70338di diVar4 = C56578dh.f151061a;
                        if (diVar4 == null) {
                            C70335df d = C70338di.m102603d();
                            d.f187487c = C70337dh.UNARY;
                            d.f187488d = C70338di.m102602c("scone.v1.SurveyService", "Trigger");
                            d.f187489e = true;
                            d.f187485a = C70850d.m103697c(C56580f.f151065c);
                            d.f187486b = C70850d.m103697c(C56582h.f151069f);
                            diVar2 = d.mo62040a();
                            C56578dh.f151061a = diVar2;
                        } else {
                            diVar2 = diVar4;
                        }
                    }
                    diVar3 = diVar2;
                }
                cxVar = C70876o.m103760a(jVar.mo39510a(diVar3, dgVar.f189040b), fVar);
            } else {
                C56577dg a2 = C56578dh.m88214a(a);
                C70888j jVar2 = a2.f189039a;
                C70338di diVar5 = C56578dh.f151062b;
                if (diVar5 == null) {
                    synchronized (C56578dh.class) {
                        C70338di diVar6 = C56578dh.f151062b;
                        if (diVar6 == null) {
                            C70335df d2 = C70338di.m102603d();
                            d2.f187487c = C70337dh.UNARY;
                            d2.f187488d = C70338di.m102602c("scone.v1.SurveyService", "TriggerAnonymous");
                            d2.f187489e = true;
                            d2.f187485a = C70850d.m103697c(C56580f.f151065c);
                            d2.f187486b = C70850d.m103697c(C56582h.f151069f);
                            diVar = d2.mo62040a();
                            C56578dh.f151062b = diVar;
                        } else {
                            diVar = diVar6;
                        }
                    }
                    diVar5 = diVar;
                }
                cxVar = C70876o.m103760a(jVar2.mo39510a(diVar5, a2.f189040b), fVar);
            }
            C60856cj.m92911t(cxVar, new C43042e(this, fVar, iVar), C43051c.m75956a());
        } catch (UnsupportedOperationException e) {
            if (C43054c.m75960c(C68365an.f184709a.mo6453a().mo60357a(C43054c.f112610b))) {
                Log.e("NetworkCallerGrpc", "The configured transport is not supported: ".concat(e.toString()));
                mo46075g(5);
                C56581g gVar = (C56581g) C56582h.f151069f.createBuilder();
                gVar.copyOnWrite();
                C56582h hVar = (C56582h) gVar.instance;
                C62971cq cqVar = hVar.f151074d;
                if (!cqVar.mo58948c()) {
                    hVar.f151074d = C62942bv.mutableCopy(cqVar);
                }
                hVar.f151074d.add("UNSUPPORTED_CRONET_ENGINE");
                C56582h hVar2 = (C56582h) gVar.build();
                Context context = this.f112599a;
                if (TextUtils.isEmpty(this.f112601c)) {
                    str = null;
                } else {
                    str = this.f112601c;
                }
                C43059h.m75971b(fVar, hVar2, iVar, context, str);
                return;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public final void mo46065c() {
        C70286co coVar = this.f112586g;
        if (coVar != null) {
            coVar.mo61974f();
        }
    }
}
