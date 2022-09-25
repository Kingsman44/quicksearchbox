package com.google.apps.tiktok.tracing.contrib.p3708i.p3712c;

import androidx.swiperefreshlayout.widget.C4186o;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.c.a */
/* compiled from: PG */
public final /* synthetic */ class C47701a implements C4186o {

    /* renamed from: a */
    public final /* synthetic */ C47707g f123659a;

    /* renamed from: b */
    public final /* synthetic */ String f123660b;

    /* renamed from: c */
    public final /* synthetic */ C4186o f123661c;

    public /* synthetic */ C47701a(C47707g gVar, String str, C4186o oVar) {
        this.f123659a = gVar;
        this.f123660b = str;
        this.f123661c = oVar;
    }

    /* renamed from: a */
    public final void mo8858a() {
        C47707g gVar = this.f123659a;
        String str = this.f123660b;
        C4186o oVar = this.f123661c;
        C47538ax c = gVar.f123669a.mo51613c(str);
        try {
            oVar.mo8858a();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
