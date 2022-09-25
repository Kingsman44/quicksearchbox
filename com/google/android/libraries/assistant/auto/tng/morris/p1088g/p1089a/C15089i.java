package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14733c;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14128bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14628r;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15340n;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62971cq;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.i */
/* compiled from: PG */
public final class C15089i implements C15006ao {

    /* renamed from: a */
    public static final C59071e f45272a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.a.i");

    /* renamed from: t */
    private static final int[] f45273t = {R.id.contact_one, R.id.contact_two, R.id.contact_three};

    /* renamed from: b */
    public final Context f45274b;

    /* renamed from: c */
    public final C14986h f45275c;

    /* renamed from: d */
    public final C14132bf f45276d;

    /* renamed from: e */
    public final C86124t f45277e;

    /* renamed from: f */
    public final C21370a f45278f;

    /* renamed from: g */
    public View f45279g;

    /* renamed from: h */
    public ViewGroup f45280h;

    /* renamed from: i */
    public ViewGroup f45281i;

    /* renamed from: j */
    public ViewGroup f45282j;

    /* renamed from: k */
    public TextView f45283k;

    /* renamed from: l */
    public View f45284l;

    /* renamed from: m */
    public RecyclerView f45285m;

    /* renamed from: n */
    public View f45286n;

    /* renamed from: o */
    public TextView f45287o;

    /* renamed from: p */
    public ViewGroup f45288p;

    /* renamed from: q */
    public ImageView f45289q;

    /* renamed from: r */
    public ImageView f45290r;

    /* renamed from: s */
    public C14628r f45291s;

    /* renamed from: u */
    private final C69464a f45292u;

    /* renamed from: v */
    private final C15340n f45293v;

    public C15089i(Context context, C69464a aVar, C14986h hVar, C14132bf bfVar, C15340n nVar, C86124t tVar, C21370a aVar2) {
        this.f45274b = context;
        this.f45292u = aVar;
        this.f45275c = hVar;
        this.f45276d = bfVar;
        this.f45293v = nVar;
        this.f45277e = tVar;
        this.f45278f = aVar2;
    }

    /* renamed from: a */
    public final View mo21891a() {
        View view = this.f45279g;
        view.getClass();
        return view;
    }

    /* renamed from: b */
    public final void mo21946b(C60214n nVar) {
        if (mo21948d()) {
            C59104x d = f45272a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.CallCenterRend");
            ((C59052c) ((C59052c) d).mo56372aa(45942)).mo56386p("Skipping call someone else due to active call.");
            return;
        }
        this.f45275c.mo21875g(C14733c.m31017a(nVar, Duration.ofNanos(this.f45278f.mo26872d())));
    }

    /* renamed from: c */
    public final void mo21947c(C14628r rVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper, boolean z) {
        if (this.f45279g == null) {
            if (viewGroup.findViewById(R.id.call_center) != null) {
                viewGroup.removeView(viewGroup.findViewById(R.id.call_center));
            }
            LayoutInflater.from(contextThemeWrapper).inflate(R.layout.call_center_fullscreen, viewGroup, true);
            View findViewById = viewGroup.findViewById(R.id.call_center);
            this.f45279g = findViewById;
            this.f45276d.mo21444a(findViewById, 108359);
            View view = this.f45279g;
            view.getClass();
            view.setPadding(0, ((Integer) this.f45292u.mo17428b()).intValue(), 0, 0);
            View view2 = this.f45279g;
            view2.getClass();
            this.f45281i = (ViewGroup) view2.findViewById(R.id.top_contacts_section);
            View view3 = this.f45279g;
            view3.getClass();
            this.f45283k = (TextView) view3.findViewById(R.id.make_a_call_button);
            View view4 = this.f45279g;
            view4.getClass();
            this.f45282j = (ViewGroup) view4.findViewById(R.id.recent_calls_section);
            View view5 = this.f45279g;
            view5.getClass();
            this.f45280h = (ViewGroup) view5.findViewById(R.id.top_contacts_container);
            View view6 = this.f45279g;
            view6.getClass();
            this.f45287o = (TextView) view6.findViewById(R.id.no_new_calls_text);
            View view7 = this.f45279g;
            view7.getClass();
            this.f45288p = (ViewGroup) view7.findViewById(R.id.call_center_empty_state);
            View view8 = this.f45279g;
            view8.getClass();
            this.f45290r = (ImageView) view8.findViewById(R.id.opa_logo);
            View view9 = this.f45279g;
            view9.getClass();
            RecyclerView recyclerView = (RecyclerView) view9.findViewById(R.id.recent_calls_recycler_view);
            this.f45285m = recyclerView;
            recyclerView.getClass();
            recyclerView.addItemDecoration$ar$ds(new C15088h(this.f45274b.getResources().getDimensionPixelSize(R.dimen.call_center_recent_call_vertical_spacing)));
            RecyclerView recyclerView2 = this.f45285m;
            recyclerView2.getClass();
            recyclerView2.setLayoutManager(new LinearLayoutManager(contextThemeWrapper));
            C14144n nVar = new C14144n(contextThemeWrapper, this.f45276d, new C15085e(this));
            View view10 = this.f45279g;
            view10.getClass();
            view10.setOnTouchListener(nVar);
            if (this.f45277e.mo79746e(C90051dc.f248792a)) {
                RecyclerView recyclerView3 = this.f45285m;
                recyclerView3.getClass();
                recyclerView3.setOnTouchListener(nVar);
            }
            View view11 = this.f45279g;
            view11.getClass();
            View findViewById2 = view11.findViewById(R.id.call_someone_else_button);
            this.f45284l = findViewById2;
            this.f45276d.mo21444a(findViewById2, 109057);
            View view12 = this.f45284l;
            view12.getClass();
            view12.setOnClickListener(new C14128bb(this.f45276d, new C14991a(this)));
            C14132bf bfVar = this.f45276d;
            TextView textView = this.f45283k;
            textView.getClass();
            bfVar.mo21444a(textView, 109766);
            TextView textView2 = this.f45283k;
            textView2.getClass();
            textView2.setOnClickListener(new C14128bb(this.f45276d, new C15018b(this)));
            View view13 = this.f45279g;
            view13.getClass();
            View findViewById3 = view13.findViewById(R.id.empty_state_make_a_call_text);
            this.f45276d.mo21444a(findViewById3, 109766);
            findViewById3.getClass();
            findViewById3.setOnClickListener(new C14128bb(this.f45276d, new C15045c(this)));
            View view14 = this.f45279g;
            view14.getClass();
            this.f45289q = (ImageView) view14.findViewById(R.id.call_center_icon);
            if (z) {
                View view15 = this.f45279g;
                view15.getClass();
                view15.startAnimation(C15352z.m31954f(contextThemeWrapper, viewGroup));
            }
        }
        if (!rVar.equals(this.f45291s)) {
            this.f45291s = rVar;
            C62971cq cqVar = rVar.f44211a;
            C62971cq cqVar2 = rVar.f44212b;
            if (!cqVar.isEmpty() || !cqVar2.isEmpty()) {
                ViewGroup viewGroup2 = this.f45288p;
                viewGroup2.getClass();
                viewGroup2.setVisibility(8);
                ImageView imageView = this.f45290r;
                imageView.getClass();
                imageView.setVisibility(0);
                if (cqVar.isEmpty()) {
                    ViewGroup viewGroup3 = this.f45281i;
                    viewGroup3.getClass();
                    viewGroup3.setVisibility(8);
                    TextView textView3 = this.f45283k;
                    textView3.getClass();
                    textView3.setVisibility(0);
                } else {
                    View view16 = this.f45284l;
                    view16.getClass();
                    view16.setVisibility(0);
                    TextView textView4 = this.f45283k;
                    textView4.getClass();
                    textView4.setVisibility(8);
                    ViewGroup viewGroup4 = this.f45281i;
                    viewGroup4.getClass();
                    viewGroup4.setVisibility(0);
                    if (this.f45286n == null) {
                        this.f45286n = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.comms_top_contact_view, this.f45280h);
                    }
                    int min = Math.min(cqVar.size(), 3);
                    for (int i = 0; i < min; i++) {
                        View view17 = this.f45286n;
                        view17.getClass();
                        View findViewById4 = view17.findViewById(f45273t[i]);
                        C14636z zVar = (C14636z) cqVar.get(i);
                        findViewById4.setVisibility(0);
                        ((TextView) findViewById4.findViewById(R.id.comms_top_contact_item_text)).setText(zVar.f44232a);
                        this.f45293v.mo22210a(zVar.f44234c, (ImageView) findViewById4.findViewById(R.id.comms_top_contact_icon));
                        this.f45276d.mo21444a(findViewById4, 108236);
                        findViewById4.setOnClickListener(new C14128bb(this.f45276d, new C15072d(this, zVar)));
                    }
                }
                ViewGroup viewGroup5 = this.f45282j;
                viewGroup5.getClass();
                viewGroup5.setVisibility(0);
                if (cqVar2.isEmpty()) {
                    RecyclerView recyclerView4 = this.f45285m;
                    recyclerView4.getClass();
                    recyclerView4.setVisibility(8);
                    TextView textView5 = this.f45287o;
                    textView5.getClass();
                    textView5.setVisibility(0);
                    ImageView imageView2 = this.f45289q;
                    imageView2.getClass();
                    imageView2.setVisibility(0);
                    return;
                }
                TextView textView6 = this.f45287o;
                textView6.getClass();
                textView6.setVisibility(8);
                ImageView imageView3 = this.f45289q;
                imageView3.getClass();
                imageView3.setVisibility(8);
                RecyclerView recyclerView5 = this.f45285m;
                recyclerView5.getClass();
                recyclerView5.setVisibility(0);
                RecyclerView recyclerView6 = this.f45285m;
                recyclerView6.getClass();
                recyclerView6.setAdapter(new C15086f(this, contextThemeWrapper, cqVar2));
                return;
            }
            ViewGroup viewGroup6 = this.f45281i;
            viewGroup6.getClass();
            viewGroup6.setVisibility(8);
            TextView textView7 = this.f45283k;
            textView7.getClass();
            textView7.setVisibility(8);
            ViewGroup viewGroup7 = this.f45282j;
            viewGroup7.getClass();
            viewGroup7.setVisibility(8);
            ImageView imageView4 = this.f45290r;
            imageView4.getClass();
            imageView4.setVisibility(8);
            ViewGroup viewGroup8 = this.f45288p;
            viewGroup8.getClass();
            viewGroup8.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final boolean mo21948d() {
        C14628r rVar = this.f45291s;
        if (rVar == null) {
            return false;
        }
        return rVar.f44213c;
    }
}
