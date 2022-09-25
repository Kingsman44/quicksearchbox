package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.p7148ui.header.LogoHeaderView;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.l */
/* compiled from: PG */
public final /* synthetic */ class C93988l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94001y f262509a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f262510b;

    /* renamed from: c */
    public final /* synthetic */ DoodleData f262511c;

    public /* synthetic */ C93988l(C94001y yVar, Drawable drawable, DoodleData doodleData) {
        this.f262509a = yVar;
        this.f262510b = drawable;
        this.f262511c = doodleData;
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        C94001y yVar = this.f262509a;
        Drawable drawable = this.f262510b;
        DoodleData doodleData = this.f262511c;
        if (!yVar.f262532h) {
            LogoHeaderView logoHeaderView = yVar.f262531g;
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            boolean z = yVar.f262530f;
            if (z) {
                i = doodleData.f252929J;
            } else {
                i = doodleData.f252945k;
            }
            int i4 = i;
            if (z) {
                i2 = doodleData.f252930K;
            } else {
                i2 = doodleData.f252946l;
            }
            int i5 = i2;
            int i6 = doodleData.f252936b;
            if (z) {
                i3 = doodleData.f252928I;
            } else {
                i3 = doodleData.f252949o;
            }
            logoHeaderView.mo84999e(bitmapDrawable, i4, i5, i6, i3);
            yVar.f262531g.mo85001g(0, false);
            yVar.mo88272j();
        }
    }
}
