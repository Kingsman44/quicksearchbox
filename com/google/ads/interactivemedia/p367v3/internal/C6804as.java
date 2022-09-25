package com.google.ads.interactivemedia.p367v3.internal;

import android.os.AsyncTask;

/* renamed from: com.google.ads.interactivemedia.v3.internal.as */
/* compiled from: PG */
public abstract class C6804as extends AsyncTask {

    /* renamed from: a */
    private C6805at f21472a;

    /* renamed from: d */
    protected final C6792ak f21473d;

    public C6804as(C6792ak akVar) {
        this.f21473d = akVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C6805at atVar = this.f21472a;
        if (atVar != null) {
            atVar.mo15386b();
        }
    }

    /* renamed from: b */
    public final void mo15339b(C6805at atVar) {
        this.f21472a = atVar;
    }
}
