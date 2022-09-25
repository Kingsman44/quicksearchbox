package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88281vw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88282vx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.o */
/* compiled from: PG */
public final class C114527o {

    /* renamed from: a */
    private final C86054o f317608a;

    public C114527o(C86054o oVar) {
        this.f317608a = oVar;
    }

    /* renamed from: a */
    public final List mo101387a(C88282vx vxVar) {
        ArrayList arrayList = new ArrayList();
        String F = this.f317608a.mo79659F();
        if (TextUtils.isEmpty(F)) {
            return arrayList;
        }
        arrayList.add(new C114526n("released sherlog logs", new Uri.Builder().scheme("http").authority("go").appendPath("assistant-sherlog-link").appendQueryParameter("account", F).build().toString()));
        arrayList.add(new C114526n("client sync: zerostate", new Uri.Builder().scheme("http").authority("go").appendPath("release-others-sherlog-link").appendQueryParameter("dataid_query", "client sync request: zerostate").appendQueryParameter("account", F).build().toString()));
        boolean z = false;
        boolean z2 = false;
        for (C88281vw vwVar : vxVar.f238772a) {
            if (!vwVar.f238769c) {
                z = true;
            } else {
                String str = vwVar.f238768b;
                if (TextUtils.isEmpty(str)) {
                    z2 = true;
                } else {
                    arrayList.add(new C114526n("query: ".concat(str), new Uri.Builder().scheme("http").authority("go").appendPath("release-others-sherlog-link").appendQueryParameter("dataid_query", "voice: ".concat(String.valueOf(str))).appendQueryParameter("account", F).build().toString()));
                }
            }
        }
        if (z) {
            arrayList.add(new C114526n("assistant voiceless query", new Uri.Builder().scheme("http").authority("go").appendPath("release-others-sherlog-link").appendQueryParameter("dataid_query", "assistant voiceless request").appendQueryParameter("account", F).build().toString()));
        }
        if (z2) {
            arrayList.add(new C114526n("empty query", new Uri.Builder().scheme("http").authority("go").appendPath("release-others-sherlog-link").appendQueryParameter("dataid_query", "voice: <empty>").appendQueryParameter("account", F).build().toString()));
        }
        return arrayList;
    }
}
