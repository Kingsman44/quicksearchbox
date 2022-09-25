package com.google.android.libraries.geller.p1818f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.libraries.geller.p1818f.p1819a.C21786a;
import com.google.android.libraries.geller.p1818f.p1819a.C21787b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60812at;
import com.google.protobuf.C62910ar;
import java.util.Arrays;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5527g.C70835p;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.geller.f.au */
/* compiled from: PG */
public final /* synthetic */ class C21811au implements C60803ak {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60172a;

    public /* synthetic */ C21811au(C21826bi biVar) {
        this.f60172a = biVar;
    }

    /* renamed from: a */
    public final Object mo23284a(C60812at atVar) {
        C58833ax axVar;
        Signature[] signatureArr;
        C21826bi biVar = this.f60172a;
        C21791aa aaVar = biVar.f60227k;
        String str = biVar.f60235s;
        String str2 = biVar.f60234r;
        C62910ar arVar = biVar.f60226j;
        C58833ax axVar2 = biVar.f60230n;
        C58833ax axVar3 = biVar.f60231o;
        C21847cc ccVar = aaVar.f60107a;
        C70334de deVar = new C70334de();
        deVar.mo62033h(new C70290cs("x-response-encoding", C70334de.f187481c), "gzip");
        Context context = ccVar.f60305a;
        if (!C58837ba.m90859h(str)) {
            deVar.mo62033h(new C70290cs("X-Goog-Api-Key", C70334de.f187481c), str);
            C58833ax b = C58833ax.m90833j(context).mo56106b(C21786a.f60104a);
            if (context == null) {
                axVar = C58836b.f156633a;
            } else {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728);
                    if (packageInfo != null) {
                        if (packageInfo.signingInfo != null) {
                            if (packageInfo.signingInfo.hasMultipleSigners()) {
                                signatureArr = packageInfo.signingInfo.getApkContentsSigners();
                            } else {
                                signatureArr = packageInfo.signingInfo.getSigningCertificateHistory();
                            }
                            if (signatureArr.length != 0) {
                                Signature signature = signatureArr[0];
                                if (signature != null) {
                                    axVar = C21787b.m40903a(signature);
                                }
                            }
                            ((C59052c) ((C59052c) C21787b.f60105a.mo56225c()).mo56372aa(48020)).mo56389s("Invalid signature for app %s", context.getPackageName());
                            axVar = C58836b.f156633a;
                        }
                    }
                    ((C59052c) ((C59052c) C21787b.f60105a.mo56225c()).mo56372aa(48019)).mo56389s("Invalid signature for app %s", context.getPackageName());
                    axVar = C58836b.f156633a;
                } catch (PackageManager.NameNotFoundException e) {
                    ((C59052c) ((C59052c) ((C59052c) C21787b.f60105a.mo56225c()).mo56382g(e)).mo56372aa(48018)).mo56386p("Could not find certificate for package");
                    axVar = C58836b.f156633a;
                }
            }
            if (b.mo56113h() && axVar.mo56113h()) {
                deVar.mo62033h(new C70290cs("X-Android-Package", C70334de.f187481c), (String) b.mo56107c());
                deVar.mo62033h(new C70290cs("X-Android-Cert", C70334de.f187481c), (String) axVar.mo56107c());
            }
        }
        String str3 = ccVar.f60307c;
        if (!C58837ba.m90859h(str2)) {
            deVar.mo62033h(new C70290cs("Cookie", C70334de.f187481c), String.format("%s=%s; path=/*; domain=*.googleapis.com", new Object[]{"NID", str2}));
            deVar.mo62033h(new C70290cs("Host", C70334de.f187481c), str3);
        }
        C70835p pVar = new C70835p(C70460dv.m102876d(ccVar.f60307c, ccVar.f60308d));
        pVar.mo62544d(new C21853ci(ccVar.f60306b, axVar2, axVar3));
        pVar.f188921c.mo62289d(C70156at.f187007b);
        pVar.f188921c.mo62292g(Arrays.asList(new C70899n[]{new C70879r(deVar)}));
        C21876z zVar = new C21876z(pVar.f188921c.mo57963c(), arVar);
        atVar.mo57268a(zVar, biVar.f60224h);
        return zVar;
    }
}
