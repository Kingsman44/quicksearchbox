package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10190e;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10224c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10395m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.assistant.p3861at.C49849bg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bl */
/* compiled from: PG */
final class C10236bl extends C0640fb {

    /* renamed from: a */
    public C58485gu f34724a = C58485gu.m89845m();

    /* renamed from: b */
    public Optional f34725b = Optional.empty();

    /* renamed from: c */
    private final Context f34726c;

    /* renamed from: d */
    private final C28310af f34727d;

    /* renamed from: e */
    private final C10224c f34728e;

    public C10236bl(Context context, C28310af afVar, C10224c cVar) {
        this.f34726c = context;
        this.f34727d = afVar;
        this.f34728e = cVar;
    }

    public final int getItemCount() {
        return this.f34724a.size();
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C49849bg bgVar = (C49849bg) this.f34724a.get(i);
        C58976aa aaVar = C58975e.f156826a;
        View findViewById = ((C10235bk) ghVar).itemView.findViewById(R.id.app_item);
        TextView textView = (TextView) findViewById.findViewById(R.id.title_text);
        textView.setVisibility(0);
        textView.setText(bgVar.f129548a);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.subtitle_text);
        textView2.setVisibility(0);
        textView2.setText(bgVar.f129549b);
        this.f34727d.f76997b.mo33800a(C28427h.m53115a(110866)).mo33811d(findViewById);
        this.f34728e.mo18355b(findViewById, new C10190e(bgVar, this.f34725b), "EducationAdapter");
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.control_icon);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.quantum_gm_ic_play_circle_outline_grey600_24);
        imageView.setContentDescription(this.f34726c.getString(R.string.try_button_content_description));
        C10395m.m25368c(imageView, this.f34726c, 12, 12, 12, 12, 24, 24);
        this.f34727d.f76997b.mo33800a(C28427h.m53115a(110867)).mo33811d(imageView);
        this.f34728e.mo18355b(imageView, new C10190e(bgVar, this.f34725b), "EducationAdapter");
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C10235bk(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_actions_item, viewGroup, false));
    }
}
