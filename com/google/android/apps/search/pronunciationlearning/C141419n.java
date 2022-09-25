package com.google.android.apps.search.pronunciationlearning;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.search.pronunciationlearning.content.C141366g;
import com.google.android.apps.search.pronunciationlearning.content.C141368i;
import com.google.android.apps.search.pronunciationlearning.content.C141370k;
import com.google.android.apps.search.pronunciationlearning.content.C141375p;
import com.google.android.apps.search.pronunciationlearning.content.C141376q;
import com.google.android.apps.search.pronunciationlearning.content.SuggestionChipsView;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.apps.search.pronunciationlearning.p10636e.p10637a.C141401a;
import com.google.android.apps.search.pronunciationlearning.p10636e.p10637a.C141406f;
import com.google.android.apps.search.pronunciationlearning.p10636e.p10637a.C141407g;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141509b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141510c;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141511d;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2882j.C37200a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.apw;
import com.google.common.p4552o.apx;
import com.google.common.p4552o.aqb;
import com.google.common.p4552o.aqe;
import com.google.common.p4552o.aqf;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.pronunciationlearning.n */
/* compiled from: PG */
public final class C141419n {

    /* renamed from: a */
    public final Context f383865a;

    /* renamed from: b */
    public final C141366g f383866b;

    /* renamed from: c */
    public final C46801dp f383867c;

    /* renamed from: d */
    public final C141415j f383868d;

    /* renamed from: e */
    public final C141512e f383869e;

    /* renamed from: f */
    public final String f383870f;

    /* renamed from: g */
    public final C141511d f383871g;

    /* renamed from: h */
    public final C141401a f383872h;

    /* renamed from: i */
    public final aqe f383873i;

    /* renamed from: j */
    public final C141420a f383874j;

    /* renamed from: k */
    public final C141330c f383875k;

    /* renamed from: l */
    public final C141421b f383876l = new C141421b();

    /* renamed from: m */
    public C141368i f383877m;

    /* renamed from: n */
    public C141510c f383878n;

    /* renamed from: o */
    public boolean f383879o = false;

    /* renamed from: p */
    private final AccountId f383880p;

    /* renamed from: com.google.android.apps.search.pronunciationlearning.n$a */
    /* compiled from: PG */
    final class C141420a implements C46792di {
        public C141420a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C141368i iVar = (C141368i) obj;
            C141419n nVar = C141419n.this;
            nVar.f383877m = iVar;
            View view = nVar.f383868d.getView();
            view.getClass();
            C141376q a = ((SuggestionChipsView) view.findViewById(R.id.pronunciationlearning_suggestion_chips)).mo17754z();
            C58480gp e = C58485gu.m89837e();
            for (C141370k kVar : iVar.f383772a) {
                TextView textView = (TextView) a.f383788b.inflate(R.layout.pronunciationlearning_suggestion_chip, a.f383787a, false);
                textView.setText(kVar.f383777c);
                textView.setOnClickListener(new C47591co(a.f383789c, "PronTng Suggestion Clicked", new C141375p(kVar)));
                a.f383787a.addView(textView);
                e.mo55395g(kVar.f383776b);
            }
            a.f383787a.setTag(R.id.pronunciationlearning_suggestion_chips, e.mo55394f());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* renamed from: com.google.android.apps.search.pronunciationlearning.n$b */
    /* compiled from: PG */
    final class C141421b implements C46792di {
        public C141421b() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            Integer num = (Integer) obj;
            View view = C141419n.this.f383868d.getView();
            if (num != null && num.intValue() < 3 && view != null) {
                C141419n nVar = C141419n.this;
                C141511d dVar = nVar.f383871g;
                String string = nVar.f383868d.getResources().getString(R.string.pronunciationlearning_practice_button_oobe);
                View findViewById = view.findViewById(R.id.pronunciationlearning_start_practice_button);
                string.getClass();
                findViewById.getClass();
                C47770dh dhVar = (C47770dh) dVar.f384122a.mo17428b();
                dhVar.getClass();
                nVar.f383878n = new C141510c(string, findViewById, dhVar);
                C141510c cVar = C141419n.this.f383878n;
                if (cVar.f384121f == null) {
                    View inflate = ((LayoutInflater) cVar.f384117b.getContext().getSystemService("layout_inflater")).inflate(R.layout.pronunciationlearning_tooltip, cVar.f384119d, false);
                    ((TextView) inflate.findViewById(R.id.pronunciationlearning_tooltip_text)).setText(cVar.f384116a);
                    inflate.setOnClickListener(new C47591co(cVar.f384118c, "DismissTooltip", new C141509b(cVar)));
                    cVar.f384121f = inflate;
                    cVar.f384120e.setContentView(cVar.f384121f);
                }
                cVar.f384121f.measure(0, 0);
                cVar.f384117b.measure(0, 0);
                View findViewById2 = cVar.f384121f.findViewById(R.id.pronunciationlearning_tooltip_triangle);
                findViewById2.measure(0, 0);
                int min = Math.min(0, cVar.f384117b.getMeasuredWidth() - cVar.f384121f.getMeasuredWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
                layoutParams.gravity = 8388613;
                layoutParams.setMarginEnd(Math.max(0, (cVar.f384117b.getMeasuredWidth() / 2) - (findViewById2.getMeasuredWidth() / 2)));
                cVar.f384120e.showAsDropDown(cVar.f384117b, min, 0);
                C141407g gVar = (C141407g) C141419n.this.f383872h;
                gVar.f383838a.mo46039a(C141406f.f383837a, gVar.f383839b);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C141419n(Context context, AccountId accountId, C141366g gVar, C46801dp dpVar, C141415j jVar, C141330c cVar, C141512e eVar, String str, C141511d dVar, C141401a aVar, aqe aqe) {
        this.f383865a = context;
        this.f383866b = gVar;
        this.f383867c = dpVar;
        this.f383868d = jVar;
        this.f383880p = accountId;
        this.f383869e = eVar;
        this.f383870f = str;
        this.f383871g = dVar;
        this.f383872h = aVar;
        this.f383873i = aqe;
        this.f383874j = new C141420a();
        this.f383877m = C141368i.f383770b;
        this.f383875k = cVar;
        cVar.mo116362b(C37200a.f98693c.mo40812e(aqf.f159732l, cVar.mo116361a((apx) null, (aqb) null)));
    }

    /* renamed from: a */
    public final void mo116420a(View view) {
        String str = (String) this.f383869e.f384126d.get("InputTextHintWithSuggestionChip");
        str.getClass();
        ((EditText) view.findViewById(R.id.pronunciationlearning_content_input_box)).setHint(str);
        view.findViewById(R.id.pronunciationlearning_content_typing_info).setVisibility(8);
        view.findViewById(R.id.pronunciationlearning_suggestion_chips).setVisibility(0);
    }

    /* renamed from: b */
    public final void mo116421b(View view) {
        String str = (String) this.f383869e.f384126d.get("InputTextHintWithoutSuggestionChip");
        str.getClass();
        ((EditText) view.findViewById(R.id.pronunciationlearning_content_input_box)).setHint(str);
        view.findViewById(R.id.pronunciationlearning_content_typing_info).setVisibility(0);
        view.findViewById(R.id.pronunciationlearning_suggestion_chips).setVisibility(8);
    }

    /* renamed from: c */
    public final void mo116422c() {
        View view = this.f383868d.getView();
        view.getClass();
        TextView textView = (TextView) view.findViewById(R.id.pronunciationlearning_content_input_box);
        int length = textView.getText().length();
        boolean z = false;
        String format = String.format(Locale.ROOT, "%d / %d", new Object[]{Integer.valueOf(length), Integer.valueOf(this.f383865a.getResources().getInteger(R.integer.pronunciationlearning_content_input_box_max_length))});
        View view2 = this.f383868d.getView();
        view2.getClass();
        ((TextView) view2.findViewById(R.id.pronunciationlearning_content_input_count)).setText(format);
        View view3 = this.f383868d.getView();
        view3.getClass();
        View findViewById = view3.findViewById(R.id.pronunciationlearning_start_practice_button);
        if (textView.getText().length() > 0) {
            z = true;
        }
        findViewById.setEnabled(z);
    }

    /* renamed from: d */
    public final void mo116423d(String str, boolean z) {
        View view = this.f383868d.getView();
        view.getClass();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            C141330c cVar = this.f383875k;
            C62722b bVar = C62722b.OK;
            int length = str.length();
            apw apw = (apw) apx.f159707d.createBuilder();
            apw.copyOnWrite();
            apx apx = (apx) apw.instance;
            apx.f159709a |= 1;
            apx.f159710b = length;
            apw.mo57035a((C58485gu) Collection.EL.stream(this.f383877m.f383772a).map(C141416k.f383862a).collect(C58370cn.f155946a));
            C37252a c = C37200a.f98694d.mo40805c(bVar);
            ((C37253b) c).mo40792p(aqf.f159732l, cVar.mo116361a((apx) apw.build(), (aqb) null));
            cVar.mo116362b(c);
            AccountId accountId = this.f383880p;
            C141412g gVar = (C141412g) C141413h.f383852e.createBuilder();
            gVar.copyOnWrite();
            C141413h hVar = (C141413h) gVar.instance;
            str.getClass();
            int i = 2;
            hVar.f383854a |= 2;
            hVar.f383855b = str;
            if (true == z) {
                i = 3;
            }
            gVar.copyOnWrite();
            C141413h hVar2 = (C141413h) gVar.instance;
            hVar2.f383856c = i - 1;
            hVar2.f383854a |= 4;
            C141524z a = C141524z.m229712a(accountId, (C141413h) gVar.build());
            C0154a aVar = new C0154a(this.f383868d.getParentFragmentManager());
            aVar.mo689v(viewGroup.getId(), a, "PronunciationPracticingFragment");
            aVar.mo509f();
            a.mo17754z().mo116340e();
        }
    }
}
