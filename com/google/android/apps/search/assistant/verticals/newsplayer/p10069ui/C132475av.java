package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.av */
/* compiled from: PG */
public final /* synthetic */ class C132475av implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132477ax f361578a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f361579b;

    public /* synthetic */ C132475av(C132477ax axVar, C0392m mVar) {
        this.f361578a = axVar;
        this.f361579b = mVar;
    }

    public final void onClick(View view) {
        C132477ax axVar = this.f361578a;
        C0392m mVar = this.f361579b;
        if (axVar.f361582b != axVar.f361581a) {
            C47538ax c = axVar.f361583c.f361593h.mo51613c("update playback speed");
            try {
                axVar.f361583c.f361586a.mo110708j(C132477ax.m215379b(axVar.f361582b));
                if (c != null) {
                    c.close();
                }
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        mVar.dismiss();
        return;
        throw th;
    }
}
