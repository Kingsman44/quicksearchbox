package com.google.android.apps.search.podcasts.browser.p10558a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.core.content.p090a.C1846a;
import com.google.android.gms.common.C143701ac;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.m */
/* compiled from: PG */
public final class C140176m {

    /* renamed from: a */
    public static final C58528ij f380855a = C58528ij.m90013M("com.android.bluetooth", "com.google.android.bluetooth", "com.google.android.bluetooth.services", "com.android.systemui");

    /* renamed from: c */
    private static final C59071e f380856c = C59071e.m91332i("com.google.android.apps.search.podcasts.browser.a.m");

    /* renamed from: b */
    public final C143701ac f380857b;

    /* renamed from: d */
    private final Context f380858d;

    public C140176m(Context context, C143701ac acVar) {
        this.f380858d = context;
        this.f380857b = acVar;
    }

    /* renamed from: a */
    public final List mo115487a(String str) {
        Signature[] signatureArr;
        try {
            SigningInfo signingInfo = this.f380858d.getPackageManager().getPackageInfo(str, 134217728).signingInfo;
            if (C1846a.m5061b(signingInfo)) {
                signatureArr = C1846a.m5063d(signingInfo);
            } else {
                signatureArr = C1846a.m5064e(signingInfo);
            }
            if (signatureArr == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(signatureArr);
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f380856c.mo56226d()).mo56382g(e)).mo56372aa(41505)).mo56389s("Package manager can't find package: %s", str);
            return new ArrayList();
        }
    }
}
