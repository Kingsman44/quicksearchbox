package com.google.android.play.core.p3542h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.google.android.play.core.p3529c.C45053a;

/* renamed from: com.google.android.play.core.h.d */
/* compiled from: PG */
public final class C45195d {

    /* renamed from: a */
    private static final C45053a f117951a = new C45053a("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m80473a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (r0 = signatureArr.length) == 0) {
                    f117951a.mo48887e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                } else {
                    for (Signature byteArray : signatureArr) {
                        String a = C45194c.m80472a(byteArray.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a)) {
                            return true;
                        }
                        if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
