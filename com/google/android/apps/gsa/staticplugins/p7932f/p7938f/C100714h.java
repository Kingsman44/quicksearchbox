package com.google.android.apps.gsa.staticplugins.p7932f.p7938f;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85472a;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.f.h */
/* compiled from: PG */
public final /* synthetic */ class C100714h implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C85472a f281595a;

    public /* synthetic */ C100714h(C85472a aVar) {
        this.f281595a = aVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C85472a aVar = this.f281595a;
        if (intent.hasExtra("result")) {
            try {
                aVar.mo78994a(new JSONObject(intent.getStringExtra("result")));
                return true;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            aVar.mo78994a((JSONObject) null);
            return true;
        }
    }
}
