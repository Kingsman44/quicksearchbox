package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.Window;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.cz */
/* compiled from: PG */
public final /* synthetic */ class C115731cz implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f320993a;

    public /* synthetic */ C115731cz(C115791fe feVar) {
        this.f320993a = feVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115791fe feVar = this.f320993a;
        C51012dc dcVar = (C51012dc) obj;
        if (!dcVar.f132819e.mo59173M()) {
            feVar.f321078J = false;
            if (feVar.f321209c.mo56113h()) {
                Window window = ((Activity) feVar.f321209c.mo56107c()).getWindow();
                window.setNavigationBarColor(0);
                window.addFlags(512);
                window.getDecorView().setSystemUiVisibility(5894);
            }
            feVar.f321207a.setVisibility(8);
            feVar.f321072D.setVisibility(8);
            feVar.f321099j.setVisibility(0);
            feVar.f321099j.setTranslationZ(1.0f);
            feVar.f321101l.setTranslationZ(2.0f);
            feVar.f321106q.setTranslationZ(3.0f);
            feVar.f321071C.setVisibility(0);
            int i = feVar.f321208b.getResources().getConfiguration().uiMode;
            View view = feVar.f321071C;
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            int[] iArr = (i & 48) == 32 ? new int[]{Color.parseColor("#003C4043"), Color.parseColor("#293C4043"), Color.parseColor("#003C4043")} : new int[]{Color.parseColor("#00000000"), Color.parseColor("#1A000000"), Color.parseColor("#00000000")};
            shapeDrawable.setShape(new RectShape());
            shapeDrawable.setShaderFactory(new C115787fa(iArr, new float[]{0.0f, 0.73f, 1.0f}));
            view.setBackground(shapeDrawable);
            feVar.f321073E.setBackgroundResource(R.drawable.photo_mode_playback_controls_background);
            feVar.f321101l.setBackgroundColor(0);
            feVar.f321115z.setBackgroundColor(0);
            byte[] N = dcVar.f132819e.mo59174N();
            feVar.f321070B.setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeByteArray(N, 0, N.length)));
            feVar.f321078J = true;
            feVar.f321096g.mo101920D();
            feVar.f321075G.set(true);
            feVar.f321103n.setEnabled(true);
        }
    }
}
