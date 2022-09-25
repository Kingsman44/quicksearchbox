package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p3340w.p3341a.C43209c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4741o.p4742a.p4743a.C62866o;
import com.google.p4741o.p4742a.p4743a.C62867p;
import java.util.Arrays;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70899n;
import p5488io.grpc.C70903r;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70549hc;
import p5488io.grpc.p5527g.C70835p;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.l */
/* compiled from: PG */
public final class C90378l implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f252414a = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.a.l");

    /* renamed from: b */
    public final C22871g f252415b;

    /* renamed from: c */
    public final C22871g f252416c;

    /* renamed from: d */
    private C90383q f252417d;

    /* renamed from: e */
    private C70286co f252418e;

    /* renamed from: f */
    private final Context f252419f;

    public C90378l(C22871g gVar, C22871g gVar2, Context context) {
        this.f252416c = gVar;
        this.f252415b = gVar2;
        this.f252419f = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C90383q mo84077a() {
        String str;
        if (this.f252418e == null) {
            C70835p pVar = new C70835p(C70460dv.m102876d("vision.googleapis.com/v1/images", 443));
            StringBuilder sb = new StringBuilder("agsa-notificationlistening/");
            try {
                PackageInfo packageInfo = this.f252419f.getPackageManager().getPackageInfo(this.f252419f.getPackageName(), 0);
                str = packageInfo.versionName == null ? "0.0.0" : packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f252414a.mo56225c()).mo56382g(e)).mo56372aa(10862)).mo56386p("Couldn't find package name");
                str = "0.0.0";
            }
            sb.append(str);
            sb.append(" (Linux; U; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; ");
            sb.append(Build.MODEL);
            sb.append(")");
            String sb2 = sb.toString();
            C70549hc hcVar = pVar.f188921c;
            hcVar.f188040h = sb2;
            pVar.f188929k = 1;
            this.f252418e = hcVar.mo57963c();
        }
        C70286co coVar = this.f252418e;
        if (this.f252417d == null) {
            this.f252417d = new C90383q((C62867p) C70864c.m103731e(new C62866o(), C70903r.m103829a(coVar, Arrays.asList(new C70899n[]{new C43209c(this.f252419f)})), C70851i.f189015a));
        }
        return this.f252417d;
    }

    public final void close() {
        C70286co coVar = this.f252418e;
        if (coVar != null) {
            coVar.mo61974f();
            this.f252418e = null;
        }
        this.f252417d = null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
    }
}
