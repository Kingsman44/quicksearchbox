package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1116b;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.b.a */
/* compiled from: PG */
public final class C15529a {

    /* renamed from: a */
    private static final C59071e f46506a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.p.a.a.b.a");

    /* renamed from: a */
    public static C58833ax m32270a(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                ((C59052c) ((C59052c) f46506a.mo56225c()).mo56372aa(46142)).mo56386p("No signatures in package info");
                return C58836b.f156633a;
            }
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            if (instance == null) {
                ((C59052c) ((C59052c) f46506a.mo56225c()).mo56372aa(46146)).mo56386p("No MessageDigest for SHA1");
                return C58836b.f156633a;
            }
            byte[] digest = instance.digest(packageInfo.signatures[0].toByteArray());
            if (digest != null) {
                return C58833ax.m90834k(C59326i.f157519g.mo56827g().mo56837l(digest, digest.length));
            }
            ((C59052c) ((C59052c) f46506a.mo56225c()).mo56372aa(46145)).mo56386p("Could not digest signature");
            return C58836b.f156633a;
        } catch (NoSuchAlgorithmException e) {
            ((C59052c) ((C59052c) ((C59052c) f46506a.mo56225c()).mo56382g(e)).mo56372aa(46143)).mo56386p("Could not find algorithm SHA1");
        } catch (PackageManager.NameNotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) f46506a.mo56225c()).mo56382g(e2)).mo56372aa(46144)).mo56386p("Could not find certificate for package");
        }
    }

    /* renamed from: b */
    public static String m32271b(String str) {
        if (str.equals("com.google.android.googlequicksearchbox")) {
            return "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU";
        }
        if (str.equals("com.google.android.carassistant")) {
            return "AIzaSyDIhpFHhMpC-hUyiqpO1KzH2CRMXhuQd9A";
        }
        ((C59052c) ((C59052c) f46506a.mo56225c()).mo56372aa(46147)).mo56389s("No API key configured for package: %s", str);
        return BuildConfig.FLAVOR;
    }
}
