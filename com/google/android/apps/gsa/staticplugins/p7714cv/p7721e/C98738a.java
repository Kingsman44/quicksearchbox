package com.google.android.apps.gsa.staticplugins.p7714cv.p7721e;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.e.a */
/* compiled from: PG */
public final class C98738a {

    /* renamed from: a */
    private static final C59071e f275820a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.e.a");

    /* renamed from: a */
    static C58833ax m163544a(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                C59104x c = f275820a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SharedCertificate");
                ((C59052c) ((C59052c) c).mo56372aa(31033)).mo56386p("No signatures in package info");
                return C58836b.f156633a;
            }
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            if (instance == null) {
                C59104x c2 = f275820a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "SharedCertificate");
                ((C59052c) ((C59052c) c2).mo56372aa(31037)).mo56386p("No MessageDigest for SHA1");
                return C58836b.f156633a;
            }
            byte[] digest = instance.digest(packageInfo.signatures[0].toByteArray());
            if (digest != null) {
                return C58833ax.m90834k(C59326i.f157519g.mo56827g().mo56837l(digest, digest.length));
            }
            C59104x c3 = f275820a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "SharedCertificate");
            ((C59052c) ((C59052c) c3).mo56372aa(31036)).mo56386p("Could not digest signature");
            return C58836b.f156633a;
        } catch (NoSuchAlgorithmException e) {
            C59104x c4 = f275820a.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "SharedCertificate");
            ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e)).mo56372aa(31034)).mo56386p("Could not find algorithm SHA1");
        } catch (PackageManager.NameNotFoundException e2) {
            C59104x c5 = f275820a.mo56225c();
            c5.mo56378ag(C58975e.f156826a, "SharedCertificate");
            ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(e2)).mo56372aa(31035)).mo56386p("Could not find certificate for package");
        }
    }
}
