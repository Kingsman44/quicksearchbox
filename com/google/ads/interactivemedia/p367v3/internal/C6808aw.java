package com.google.ads.interactivemedia.p367v3.internal;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aw */
/* compiled from: PG */
public final class C6808aw extends C6803ar {
    public C6808aw(C6792ak akVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(akVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15338a(String str) {
        C7190p a;
        if (!TextUtils.isEmpty(str) && (a = C7190p.m21443a()) != null) {
            for (C7001i iVar : a.mo16267e()) {
                if (this.f21418a.contains(iVar.mo16004i())) {
                    iVar.mo16003h().mo14419f(str, this.f21420c);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C6789ah.m18708j(this.f21419b, this.f21473d.mo14878d())) {
            return null;
        }
        this.f21473d.mo14879e(this.f21419b);
        return this.f21419b.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
