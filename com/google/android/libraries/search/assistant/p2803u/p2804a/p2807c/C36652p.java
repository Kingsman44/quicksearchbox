package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.ahe;
import com.google.assistant.p3861at.ahf;
import com.google.assistant.p3861at.ahg;
import com.google.assistant.p3861at.ahh;
import com.google.assistant.p3861at.aii;
import com.google.assistant.p3861at.ain;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.p */
/* compiled from: PG */
public final /* synthetic */ class C36652p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ahg f95508a;

    /* renamed from: b */
    public final /* synthetic */ aii f95509b;

    public /* synthetic */ C36652p(ahg ahg, aii aii) {
        this.f95508a = ahg;
        this.f95509b = aii;
    }

    public final Object apply(Object obj) {
        ahg ahg = this.f95508a;
        aii aii = this.f95509b;
        String str = (String) ((Optional) obj).orElse(BuildConfig.FLAVOR);
        if (!TextUtils.isEmpty(str)) {
            ahe ahe = (ahe) ahf.f129297c.createBuilder();
            ahe.copyOnWrite();
            ahf ahf = (ahf) ahe.instance;
            str.getClass();
            ahf.f129299a |= 1;
            ahf.f129300b = str;
            ahg.copyOnWrite();
            ahh ahh = (ahh) ahg.instance;
            ahf ahf2 = (ahf) ahe.build();
            ahh ahh2 = ahh.f129301g;
            ahf2.getClass();
            ahh.f129306d = ahf2;
            ahh.f129303a |= 4;
        }
        ahh ahh3 = (ahh) ahg.build();
        aii.copyOnWrite();
        ain ain = (ain) aii.instance;
        ain ain2 = ain.f129411h;
        ahh3.getClass();
        ain.f129415c = ahh3;
        ain.f129414b = 1;
        acu acu = (acu) acv.f128920X.createBuilder();
        ain ain3 = (ain) aii.build();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        ain3.getClass();
        acv.f128929H = ain3;
        acv.f128946b |= 4096;
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        acv2.f128946b |= 8388608;
        acv2.f128934M = true;
        return (acv) acu.build();
    }
}
