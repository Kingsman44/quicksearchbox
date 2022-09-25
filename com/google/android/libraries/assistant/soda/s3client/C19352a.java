package com.google.android.libraries.assistant.soda.s3client;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.libraries.assistant.soda.s3client.a */
/* compiled from: PG */
public final class C19352a {

    /* renamed from: a */
    private static final C59071e f54161a = C59071e.m91332i("com.google.android.libraries.assistant.soda.s3client.a");

    /* renamed from: a */
    public static C70334de m36858a(Context context, String str) {
        String str2 = context.getApplicationInfo().packageName;
        String b = m36859b(context);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(b)) {
            ((C59052c) ((C59052c) f54161a.mo56226d()).mo56372aa(47724)).mo56386p("One of the required header values is empty.");
            return null;
        }
        C70334de deVar = new C70334de();
        deVar.mo62033h(new C70290cs("X-Goog-Api-Key", C70334de.f187481c), str);
        deVar.mo62033h(new C70290cs("X-Android-Package", C70334de.f187481c), str2);
        deVar.mo62033h(new C70290cs("X-Android-Cert", C70334de.f187481c), b);
        return deVar;
    }

    /* renamed from: b */
    private static String m36859b(Context context) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 64).signatures[0].toByteArray());
            return C59326i.f157519g.mo56837l(digest, digest.length);
        } catch (PackageManager.NameNotFoundException | NullPointerException | NoSuchAlgorithmException e) {
            ((C59052c) ((C59052c) ((C59052c) f54161a.mo56225c()).mo56382g(e)).mo56372aa(47725)).mo56386p("Failed to get certificate fingerprint");
            return null;
        }
    }
}
