package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.net.Uri;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142351cc;
import com.google.android.p10712d.C142355cg;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import org.json.JSONArray;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.dd */
/* compiled from: PG */
public final class C124907dd {

    /* renamed from: a */
    public final WelcomeFragment f344627a;

    /* renamed from: b */
    public final AccountId f344628b;

    /* renamed from: c */
    public final C124921r f344629c;

    /* renamed from: d */
    public final C47770dh f344630d;

    /* renamed from: e */
    public final C124848bs f344631e;

    /* renamed from: f */
    public final boolean f344632f;

    /* renamed from: g */
    private final C46485f f344633g;

    public C124907dd(WelcomeFragment welcomeFragment, C124848bs bsVar, AccountId accountId, C46485f fVar, C124921r rVar, C47770dh dhVar) {
        this.f344631e = bsVar;
        this.f344627a = welcomeFragment;
        this.f344628b = accountId;
        this.f344633g = fVar;
        this.f344629c = rVar;
        this.f344630d = dhVar;
        C124844bo boVar = bsVar.f344439b;
        this.f344632f = (boVar == null ? C124844bo.f344417m : boVar).f344425g;
    }

    /* renamed from: a */
    static String m204758a(String str, C142351cc ccVar) {
        C142355cg cgVar = ccVar.f386243d;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        String e = C124525f.m203989e(cgVar);
        C142355cg cgVar2 = ccVar.f386244e;
        if (cgVar2 == null) {
            cgVar2 = C142355cg.f386263b;
        }
        String e2 = C124525f.m203989e(cgVar2);
        C142355cg cgVar3 = ccVar.f386245f;
        if (cgVar3 == null) {
            cgVar3 = C142355cg.f386263b;
        }
        String e3 = C124525f.m203989e(cgVar3);
        C58485gu m = C58485gu.m89845m();
        if (!(e == null || e2 == null || e3 == null)) {
            m = C58485gu.m89848p(e, e2, e3);
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).appendQueryParameter("hq", new JSONArray(m).toString());
        C142355cg cgVar4 = ccVar.f386241b;
        if (cgVar4 == null) {
            cgVar4 = C142355cg.f386263b;
        }
        C124525f.m203985a(cgVar4).mo106448a(new C124906dc(appendQueryParameter));
        return appendQueryParameter.build().toString();
    }

    /* renamed from: b */
    public final void mo106713b() {
        this.f344633g.mo50482c(this.f344627a).mo50509e(R.id.assistant_bisto_oobe_next, this.f344631e);
    }
}
