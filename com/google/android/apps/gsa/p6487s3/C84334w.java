package com.google.android.apps.gsa.p6487s3;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.speech.p7139a.C90519k;
import com.google.android.apps.gsa.shared.speech.p7139a.C90522n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p408c.p414c.p416b.C8466ai;

/* renamed from: com.google.android.apps.gsa.s3.w */
/* compiled from: PG */
public final class C84334w {

    /* renamed from: a */
    private static final C59071e f229523a = C59071e.m91332i("com.google.android.apps.gsa.s3.w");

    /* renamed from: a */
    public static C89019aq m134551a(C8466ai aiVar, String str) {
        C89019aq d = C89020ar.m144759d();
        d.mo82994f(String.valueOf(aiVar.f29398b).concat(String.valueOf(str)));
        d.f241244j = false;
        d.f241245k = 14;
        for (int i = 0; i < aiVar.f29400d.size(); i++) {
            d.mo82990b((String) aiVar.f29400d.get(i), (String) aiVar.f29401e.get(i));
        }
        return d;
    }

    /* renamed from: b */
    public static void m134552b(C89022at atVar, String str) {
        if (atVar.f241279a != 200) {
            String a = atVar.mo83000a("X-Speech-S3-Res-Code", BuildConfig.FLAVOR);
            Integer num = null;
            if (!TextUtils.isEmpty(a)) {
                try {
                    num = Integer.valueOf(Integer.parseInt(a));
                } catch (NumberFormatException unused) {
                    ((C59052c) ((C59052c) f229523a.mo56226d()).mo56372aa(7213)).mo56389s("Failed to parse error header: %s", a);
                }
            }
            if (num != null) {
                ((C59052c) ((C59052c) f229523a.mo56226d()).mo56372aa(7215)).mo56359L("[%s] response code: %d, internal error header: %s", str, Integer.valueOf(atVar.f241279a), a);
                throw new C90522n(num.intValue());
            } else {
                ((C59052c) ((C59052c) f229523a.mo56226d()).mo56372aa(7214)).mo56352E("[%s] response code: %d", str, atVar.f241279a);
                throw new C90519k(atVar.f241279a);
            }
        }
    }
}
