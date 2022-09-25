package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.res.ColorStateList;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.fw */
/* compiled from: PG */
final class C112878fw extends C0640fb {

    /* renamed from: a */
    public final C113415ez f312848a;

    /* renamed from: b */
    final /* synthetic */ C112880fy f312849b;

    /* renamed from: c */
    private final List f312850c;

    public C112878fw(C112880fy fyVar, C113415ez ezVar) {
        this.f312849b = fyVar;
        ArrayList arrayList = new ArrayList();
        this.f312850c = arrayList;
        arrayList.add(C112879fx.REPORT);
        if (fyVar.f312861f.mo79746e(C90063do.f249277aW)) {
            arrayList.add(C112879fx.EDIT);
        }
        if (fyVar.f312861f.mo79746e(C90063do.f249446dg)) {
            arrayList.add(C112879fx.GOOD_SUGGESTION);
            arrayList.add(C112879fx.BAD_SUGGESTION);
        }
        this.f312848a = ezVar;
    }

    /* renamed from: a */
    public final void mo99772a() {
        C112880fy fyVar = this.f312849b;
        fyVar.f312860e.mo99376jD(fyVar.f312857b.getResources().getString(R.string.tapas_suggestion_feedback_toast), 0);
    }

    public final int getItemCount() {
        return this.f312850c.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C112877fv fvVar = (C112877fv) ghVar;
        C112879fx fxVar = C112879fx.REPORT;
        int ordinal = ((C112879fx) this.f312850c.get(i)).ordinal();
        if (ordinal == 0) {
            int a = C1878d.m5128a(this.f312849b.f312857b, R.color.tapas_report_this);
            fvVar.f312846a.setImageResource(R.drawable.quantum_ic_report_black_24);
            fvVar.f312846a.setImageTintList(ColorStateList.valueOf(a));
            fvVar.f312847b.setText(R.string.tapas_report_this);
            fvVar.f312847b.setTextColor(a);
            fvVar.itemView.setOnClickListener(new C112873fr(this));
            fvVar.itemView.setTag("report");
        } else if (ordinal == 1) {
            fvVar.f312846a.setImageResource(R.drawable.quantum_gm_ic_north_west_grey600_24);
            fvVar.f312847b.setText(R.string.tapas_edit_suggestion);
            fvVar.itemView.setOnClickListener(new C112874fs(this));
            fvVar.itemView.setTag("edit");
        } else if (ordinal == 2) {
            fvVar.f312846a.setImageResource(R.drawable.quantum_gm_ic_thumb_up_filled_grey600_24);
            fvVar.f312847b.setText(R.string.tapas_good_suggestion);
            fvVar.itemView.setOnClickListener(new C112875ft(this));
            fvVar.itemView.setTag("good suggestion");
        } else if (ordinal == 3) {
            fvVar.f312846a.setImageResource(R.drawable.quantum_gm_ic_thumb_down_filled_grey600_24);
            fvVar.f312847b.setText(R.string.tapas_bad_suggestion);
            fvVar.itemView.setOnClickListener(new C112876fu(this));
            fvVar.itemView.setTag("bad suggestion");
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C112877fv(LayoutInflater.from(this.f312849b.f312857b).inflate(R.layout.extra_option, viewGroup, false));
    }
}
