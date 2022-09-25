package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10186a;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10224c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10260e;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10261f;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10395m;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.m */
/* compiled from: PG */
final class C10415m extends C0640fb {

    /* renamed from: a */
    public final Context f35119a;

    /* renamed from: b */
    public final C90021c f35120b;

    /* renamed from: c */
    public C58485gu f35121c = C58485gu.m89845m();

    /* renamed from: d */
    public final int f35122d;

    /* renamed from: e */
    private final C28310af f35123e;

    /* renamed from: f */
    private final C91189au f35124f;

    /* renamed from: g */
    private final C10224c f35125g;

    public C10415m(Context context, int i, C91189au auVar, C28310af afVar, C10224c cVar, C90021c cVar2) {
        this.f35119a = context;
        this.f35122d = i;
        this.f35124f = auVar;
        this.f35123e = afVar;
        this.f35125g = cVar;
        this.f35120b = cVar2;
    }

    public final int getItemCount() {
        return this.f35121c.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C10261f fVar = (C10261f) this.f35121c.get(i);
        View findViewById = ((C10414l) ghVar).itemView.findViewById(R.id.app_item);
        C49838aw awVar = fVar.f34787b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        findViewById.setContentDescription(awVar.f129508c);
        TextView textView = (TextView) findViewById.findViewById(R.id.title_text);
        textView.setVisibility(0);
        C49838aw awVar2 = fVar.f34787b;
        if (awVar2 == null) {
            awVar2 = C49838aw.f129504g;
        }
        textView.setText(awVar2.f129508c);
        if ((fVar.f34786a & 2) != 0) {
            TextView textView2 = (TextView) findViewById.findViewById(R.id.subtitle_text);
            textView2.setVisibility(0);
            C10260e eVar = fVar.f34788c;
            if (eVar == null) {
                eVar = C10260e.f34780c;
            }
            textView2.setText(eVar.f34783b);
        }
        this.f35123e.f76997b.mo33800a(C28427h.m53115a(105133)).mo33811d(findViewById);
        C10224c cVar = this.f35125g;
        C49838aw awVar3 = fVar.f34787b;
        if (awVar3 == null) {
            awVar3 = C49838aw.f129504g;
        }
        cVar.mo18355b(findViewById, new C10186a(awVar3), "AppEntryAdapter");
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.app_icon);
        imageView.setVisibility(0);
        C91189au auVar = this.f35124f;
        C49838aw awVar4 = fVar.f34787b;
        if (awVar4 == null) {
            awVar4 = C49838aw.f129504g;
        }
        auVar.mo85421i(awVar4.f129509d, imageView);
        ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.control_icon);
        imageView2.setVisibility(0);
        imageView2.setContentDescription(this.f35119a.getString(R.string.view_button_content_description));
        imageView2.setImageResource(R.drawable.quantum_ic_chevron_right_grey600_24);
        this.f35123e.f76997b.mo33800a(C28427h.m53115a(105132)).mo33811d(imageView2);
        C10224c cVar2 = this.f35125g;
        C49838aw awVar5 = fVar.f34787b;
        if (awVar5 == null) {
            awVar5 = C49838aw.f129504g;
        }
        cVar2.mo18355b(imageView2, new C10186a(awVar5), "AppEntryAdapter");
        C10395m.m25368c(imageView2, this.f35119a, 12, 12, 12, 12, 24, 24);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C10414l(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_actions_item, viewGroup, false));
    }
}
