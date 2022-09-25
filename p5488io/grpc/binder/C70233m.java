package p5488io.grpc.binder;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.p4522b.C58485gu;
import p5488io.grpc.Status;

/* renamed from: io.grpc.binder.m */
/* compiled from: PG */
final class C70233m extends C70235o {

    /* renamed from: a */
    final /* synthetic */ PackageManager f187216a;

    /* renamed from: b */
    final /* synthetic */ C58485gu f187217b;

    public C70233m(PackageManager packageManager, C58485gu guVar) {
        this.f187216a = packageManager;
        this.f187217b = guVar;
    }

    /* renamed from: a */
    public final Status mo57957a(int i) {
        Signature[] signatureArr;
        PackageManager packageManager = this.f187216a;
        C58485gu guVar = this.f187217b;
        int i2 = C70234n.f187218a;
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null) {
            return Status.f186910h.withDescription("Rejected by (SHA-256 hash signature check) security policy");
        }
        boolean z = false;
        for (String str : packagesForUid) {
            if ("com.google.android.apps.assistant.scriptengine".equals(str)) {
                C70231k kVar = new C70231k(guVar);
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                    if (packageInfo.signingInfo != null) {
                        if (packageInfo.signingInfo.hasMultipleSigners()) {
                            signatureArr = packageInfo.signingInfo.getApkContentsSigners();
                        } else {
                            signatureArr = packageInfo.signingInfo.getSigningCertificateHistory();
                        }
                        for (Signature a : signatureArr) {
                            if (kVar.mo5941a(a)) {
                                return Status.f186902OK;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                z = true;
            }
        }
        return Status.f186909g.withDescription("Rejected by (SHA-256 hash signature check) security policy. Package name matched: " + z);
    }
}
