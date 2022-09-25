package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.recently.entry.C116077a;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116163af;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.b */
/* compiled from: PG */
public abstract class C116136b extends C116145k {

    /* renamed from: a */
    protected final Context f322052a;

    /* renamed from: b */
    public final C116163af f322053b;

    public C116136b(Context context, C116163af afVar) {
        this.f322052a = context;
        this.f322053b = afVar;
    }

    /* renamed from: a */
    public final float mo102408a() {
        return 1.0f;
    }

    /* renamed from: b */
    public final float mo102409b() {
        return this.f322052a.getResources().getDimension(R.dimen.recently_entry_max_z_translation);
    }

    /* renamed from: f */
    public void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        super.mo102413f(view, bVar, rVar, fVar);
        view.findViewById(R.id.screenshot_container).setOnClickListener(new C116135a(this, rVar, fVar));
        if (view.getBackground() != null) {
            view.getBackground().setColorFilter((ColorFilter) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo102523g(View view, int i, int i2) {
        view.setBackground(new C116077a(this.f322052a.getResources().getColor(R.color.agsa_color_surface), i, i2));
        view.setClipToOutline(true);
    }
}
