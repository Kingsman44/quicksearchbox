package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10187b;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10189d;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10192g;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10194i;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10222a;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10224c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10270o;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10271p;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10274s;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10277v;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10395m;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.assistant.shared.appactions.p5806f.C73818f;
import com.google.android.apps.gsa.assistant.shared.appactions.p5807g.C73821h;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.q */
/* compiled from: PG */
final class C10419q extends C0640fb {

    /* renamed from: a */
    public final boolean f35129a;

    /* renamed from: b */
    public final C73812a f35130b;

    /* renamed from: c */
    public final C90021c f35131c;

    /* renamed from: d */
    public boolean f35132d = false;

    /* renamed from: e */
    public C58485gu f35133e = C58485gu.m89845m();

    /* renamed from: f */
    public final int f35134f;

    /* renamed from: g */
    private final Context f35135g;

    /* renamed from: h */
    private final C28310af f35136h;

    /* renamed from: i */
    private final C91189au f35137i;

    /* renamed from: j */
    private final boolean f35138j;

    /* renamed from: k */
    private final C10224c f35139k;

    public C10419q(Context context, int i, boolean z, boolean z2, C91189au auVar, C28310af afVar, C10224c cVar, C73812a aVar, C90021c cVar2) {
        this.f35135g = context;
        this.f35134f = i;
        this.f35129a = z;
        this.f35138j = z2;
        this.f35137i = auVar;
        this.f35136h = afVar;
        this.f35139k = cVar;
        this.f35130b = aVar;
        this.f35131c = cVar2;
    }

    /* renamed from: a */
    private final boolean m25378a() {
        return this.f35132d && !this.f35129a;
    }

    public final int getItemCount() {
        if (m25378a()) {
            return 6;
        }
        return this.f35133e.size();
    }

    public final int getItemViewType(int i) {
        return (!m25378a() || i != 5) ? 0 : 1;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        String str;
        Object obj;
        int i2 = i;
        C10418p pVar = (C10418p) ghVar;
        if (!m25378a() || i2 != 5) {
            C10273r rVar = (C10273r) this.f35133e.get(i2);
            View findViewById = pVar.itemView.findViewById(R.id.app_item);
            if (this.f35138j) {
                C49838aw awVar = rVar.f34820b;
                if (awVar == null) {
                    awVar = C49838aw.f129504g;
                }
                ImageView imageView = (ImageView) findViewById.findViewById(R.id.app_icon);
                imageView.setVisibility(0);
                this.f35137i.mo85421i(awVar.f129509d, imageView);
            }
            C49826ak akVar = rVar.f34821c;
            if (akVar == null) {
                akVar = C49826ak.f129462q;
            }
            C62971cq cqVar = akVar.f129465b;
            boolean z = !cqVar.isEmpty();
            if ((akVar.f129464a & 16) != 0) {
                str = akVar.f129470g;
            } else {
                Context context = this.f35135g;
                Object[] objArr = new Object[1];
                if (z) {
                    obj = cqVar.get(0);
                } else {
                    obj = akVar.f129471h;
                }
                objArr[0] = obj;
                str = context.getString(R.string.app_entry_shortcut_quote, objArr);
            }
            TextView textView = (TextView) findViewById.findViewById(R.id.title_text);
            textView.setVisibility(0);
            textView.setText(str);
            TextView textView2 = (TextView) findViewById.findViewById(R.id.subtitle_text);
            textView2.setVisibility(0);
            String str2 = this.f35138j ? akVar.f129467d : akVar.f129469f;
            textView2.setText(str2);
            findViewById.setContentDescription(str2);
            C28313c a = this.f35136h.f76997b.mo33800a(C28427h.m53115a(105138));
            a.mo33858f(new C28353e(C73818f.f195125a, C73821h.m108391b(akVar)));
            a.mo33811d(findViewById);
            this.f35139k.mo18355b(findViewById, new C10192g(rVar, true), "AppShortcutAdapter");
            ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.control_icon);
            imageView2.setVisibility(0);
            this.f35136h.f76997b.mo33800a(C28427h.m53115a(105137)).mo33811d(imageView2);
            findViewById.findViewById(R.id.loading_ui).setVisibility(8);
            if (!z) {
                imageView2.setImageResource(R.drawable.quantum_ic_add_circle_outline_googblue_24);
                imageView2.setContentDescription(this.f35135g.getString(R.string.add_button_content_description));
                imageView2.setColorFilter(C1878d.m5128a(this.f35135g, R.color.google_blue500), PorterDuff.Mode.SRC_IN);
                C10395m.m25368c(imageView2, this.f35135g, 12, 12, 12, 12, 24, 24);
                if (this.f35131c.mo79746e(C90019by.f248088v)) {
                    imageView2.setOnClickListener(new C10222a(this.f35139k, new C10417o(this, findViewById, rVar)));
                } else {
                    this.f35139k.mo18355b(imageView2, new C10192g(rVar, false), "AppShortcutAdapter");
                }
            } else {
                imageView2.setColorFilter(C1878d.m5128a(this.f35135g, R.color.google_grey500), PorterDuff.Mode.SRC_IN);
                C10395m.m25368c(imageView2, this.f35135g, 14, 14, 14, 14, 20, 20);
                if (!this.f35131c.mo79746e(C90019by.f248087u) || !akVar.f129478o) {
                    imageView2.setImageResource(R.drawable.quantum_gm_ic_edit_grey600_24);
                    imageView2.setContentDescription(this.f35135g.getString(R.string.edit_button_content_description));
                    C10224c cVar = this.f35139k;
                    C10274s sVar = (C10274s) C10277v.f34824h.createBuilder();
                    C49838aw awVar2 = rVar.f34820b;
                    if (awVar2 == null) {
                        awVar2 = C49838aw.f129504g;
                    }
                    sVar.copyOnWrite();
                    C10277v vVar = (C10277v) sVar.instance;
                    awVar2.getClass();
                    vVar.f34829d = awVar2;
                    vVar.f34826a = 1 | vVar.f34826a;
                    C49826ak akVar2 = rVar.f34821c;
                    if (akVar2 == null) {
                        akVar2 = C49826ak.f129462q;
                    }
                    sVar.copyOnWrite();
                    C10277v vVar2 = (C10277v) sVar.instance;
                    akVar2.getClass();
                    vVar2.f34830e = akVar2;
                    vVar2.f34826a |= 2;
                    sVar.copyOnWrite();
                    C10277v vVar3 = (C10277v) sVar.instance;
                    vVar3.f34831f = 3;
                    vVar3.f34826a |= 16;
                    long j = rVar.f34822d;
                    sVar.copyOnWrite();
                    C10277v vVar4 = (C10277v) sVar.instance;
                    vVar4.f34826a |= 32;
                    vVar4.f34832g = j;
                    cVar.mo18355b(imageView2, new C10189d((C10277v) sVar.build()), "AppShortcutAdapter");
                    return;
                }
                imageView2.setImageResource(R.drawable.quantum_gm_ic_delete_gm_grey_24);
                imageView2.setContentDescription(this.f35135g.getString(R.string.detailed_page_delete_button_text));
                this.f35139k.mo18355b(imageView2, new C10187b(rVar, findViewById), "AppShortcutAdapter");
            }
        } else {
            Button button = (Button) pVar.itemView.findViewById(R.id.view_all_button);
            button.setVisibility(0);
            this.f35136h.f76997b.mo33800a(C28427h.m53115a(105141)).mo33811d(button);
            C10270o oVar = (C10270o) C10271p.f34813c.createBuilder();
            int i3 = this.f35134f;
            oVar.copyOnWrite();
            C10271p pVar2 = (C10271p) oVar.instance;
            pVar2.f34816b = Integer.valueOf(i3 - 1);
            pVar2.f34815a = 1;
            this.f35139k.mo18355b(button, new C10194i((C10271p) oVar.build()), "AppShortcutAdapter");
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new C10418p(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_all_button, viewGroup, false));
        }
        return new C10418p(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_actions_item, viewGroup, false));
    }
}
