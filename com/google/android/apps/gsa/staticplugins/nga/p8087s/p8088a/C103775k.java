package com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.C1773f;
import com.google.android.apps.gsa.nga.api.C74709bj;
import com.google.android.apps.gsa.nga.api.C74710bk;
import com.google.android.apps.gsa.nga.api.C74711bl;
import com.google.android.googlequicksearchbox.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.a.k */
/* compiled from: PG */
public final class C103775k extends FrameLayout implements C74709bj {

    /* renamed from: a */
    public final TextView f288953a;

    /* renamed from: b */
    public final View f288954b;

    /* renamed from: c */
    public final View f288955c;

    /* renamed from: d */
    public final View f288956d;

    /* renamed from: e */
    public final View f288957e;

    /* renamed from: f */
    public Intent f288958f;

    /* renamed from: g */
    public final List f288959g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public final List f288960h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final C103774j f288961i;

    /* renamed from: j */
    private final View f288962j;

    /* renamed from: k */
    private final View f288963k;

    /* renamed from: l */
    private final View f288964l;

    public C103775k(Context context, C103774j jVar) {
        super(context);
        this.f288961i = jVar;
        View inflate = LayoutInflater.from(context).inflate(true != ((C103774j) Objects.requireNonNull(jVar)).equals(C103774j.OS_SETTINGS) ? R.layout.nga_non_eligibility_card_layout_agsa : R.layout.nga_non_eligibility_card_layout_os, this, false);
        this.f288953a = (TextView) inflate.findViewById(R.id.nga_non_eligibility_card_subtitle);
        this.f288954b = inflate.findViewById(R.id.nga_non_eligibility_card_coordinator_layout);
        View findViewById = inflate.findViewById(R.id.nga_non_eligibility_card_coordinated_layout);
        this.f288955c = findViewById;
        this.f288956d = inflate.findViewById(R.id.nga_non_eligibility_card_dismiss_icon);
        this.f288957e = inflate.findViewById(R.id.nga_non_eligibility_card_dismiss_question_container);
        View findViewById2 = inflate.findViewById(R.id.nga_non_eligibility_card_keep);
        this.f288963k = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.nga_non_eligibility_card_remove);
        this.f288962j = findViewById3;
        View findViewById4 = inflate.findViewById(R.id.nga_non_eligibility_card_start);
        this.f288964l = findViewById4;
        C103779o oVar = new C103779o();
        oVar.f288973b = 0;
        oVar.f288974c = new C103773i(this);
        if (findViewById != null) {
            ((C1773f) findViewById.getLayoutParams()).mo4974a(oVar);
            findViewById.setOnClickListener(new C103769e(this));
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C103770f(this));
        }
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new C103771g(this));
        }
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new C103772h(this));
        }
        addView(inflate);
    }

    /* renamed from: a */
    public final void mo71069a(C74710bk bkVar) {
        this.f288960h.add(bkVar);
    }

    /* renamed from: b */
    public final void mo71070b(C74711bl blVar) {
        this.f288959g.add(blVar);
    }
}
