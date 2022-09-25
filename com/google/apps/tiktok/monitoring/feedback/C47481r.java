package com.google.apps.tiktok.monitoring.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.feedback.C144206k;
import com.google.android.gms.feedback.C144207l;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.r */
/* compiled from: PG */
public final class C47481r implements C47476m {

    /* renamed from: a */
    public final C144206k f123287a;

    /* renamed from: b */
    private final Context f123288b;

    /* renamed from: c */
    private final C60888db f123289c;

    /* renamed from: d */
    private final C47471i f123290d;

    public C47481r(Context context, C60888db dbVar, C47471i iVar, C144206k kVar) {
        this.f123288b = context;
        this.f123289c = dbVar;
        this.f123290d = iVar;
        this.f123287a = kVar;
    }

    /* renamed from: a */
    public final void mo51335a(C58833ax axVar, C47475l lVar, C47463aa aaVar) {
        C46459k.m82829b(C60922j.m93045h(C60922j.m93044g(C60838bs.m92859i(this.f123290d.mo51330a(axVar, lVar, aaVar)), C47810es.m84963c(new C47478o(this, lVar)), this.f123289c), C47810es.m84966f(new C47479p(this)), this.f123289c), "Failed to execute feedback request in Play Services", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final FeedbackOptions mo51337b(C47475l lVar, C47473j jVar) {
        int i;
        C144207l lVar2 = new C144207l(this.f123288b);
        if (jVar.mo51302b().mo56113h()) {
            lVar2.mo119744d((Bitmap) jVar.mo51302b().mo56107c());
        }
        lVar2.f390624c = lVar.mo51314d();
        if (lVar.mo51312b().mo56113h()) {
            lVar2.f390623b = (String) lVar.mo51312b().mo56107c();
        }
        ThemeSettings themeSettings = new ThemeSettings();
        int f = lVar.mo51317f();
        int i2 = f - 1;
        if (f != 0) {
            if (i2 == 0) {
                i = 3;
            } else if (i2 != 1) {
                i = 2;
                if (i2 != 2) {
                    throw new AssertionError("Unknown theme.");
                }
            } else {
                i = 0;
            }
            themeSettings.f390592a = i;
            lVar2.f390626e = themeSettings;
            if (jVar.mo51301a().mo56113h()) {
                lVar2.f390622a = (String) jVar.mo51301a().mo56107c();
            }
            C47480q qVar = new C47480q(jVar);
            lVar2.mo119742b(false);
            lVar2.f390628g = qVar;
            return lVar2.mo119741a();
        }
        throw null;
    }
}
