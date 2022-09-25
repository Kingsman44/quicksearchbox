package com.google.ads.interactivemedia.p367v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.av */
/* compiled from: PG */
public final class C6807av extends C6803ar {
    public C6807av(C6792ak akVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(akVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15338a(String str) {
        C7190p a = C7190p.m21443a();
        if (a != null) {
            for (C7001i iVar : a.mo16267e()) {
                if (this.f21418a.contains(iVar.mo16004i())) {
                    iVar.mo16003h().mo14420g(str, this.f21420c);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f21419b.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
