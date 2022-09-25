package com.google.android.apps.gsa.staticplugins.nowcards.p8100a;

import android.content.Context;
import android.text.TextUtils;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104322ax;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9256ek;
import com.google.android.apps.p489g.p494d.C9257el;
import com.google.android.apps.p489g.p494d.C9259en;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8150xj;
import com.google.p375ai.p378b.C8178yk;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.a.q */
/* compiled from: PG */
public final class C104249q extends C104348l {

    /* renamed from: y */
    private static final C59071e f289929y = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.a.q");

    /* renamed from: A */
    private View f289930A;

    /* renamed from: z */
    private int f289931z;

    public C104249q(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        return mo94019c(a, mo94115i());
    }

    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        C58976aa aaVar = C58975e.f156826a;
        C9277u uVar2 = C9277u.UNKNOWN;
        int ordinal = uVar.ordinal();
        if (ordinal == 7) {
            this.f289931z = R.layout.qp_weather_forecast;
        } else if (ordinal == 54) {
            this.f289931z = R.layout.qp_weather_forecast_tiny;
        }
        try {
            this.f290311f = this.f290308c.f256406b.inflate(this.f289931z, viewGroup, false);
        } catch (InflateException e) {
            C59104x c = f289929y.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WeatherForecastModuleP");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21931)).mo56389s("Failed to inflate CardModule type: %s", uVar);
            this.f289931z = R.layout.qp_weather_forecast;
            this.f290311f = this.f290308c.f256406b.inflate(R.layout.qp_weather_forecast, viewGroup, false);
        }
        return this.f290311f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        TextView textView;
        ViewGroup p;
        View findViewById;
        TextView textView2;
        TextView textView3;
        ImageButton imageButton;
        int a = C1878d.m5128a(this.f290307b, R.color.default_text_dark_theme_color);
        View findViewById2 = this.f290311f.findViewById(R.id.card_action_container);
        this.f289930A = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        if (this.f290318m && (imageButton = (ImageButton) this.f290311f.findViewById(R.id.cap_menu_button)) != null) {
            imageButton.setColorFilter(a);
        }
        View view = this.f290311f;
        C9278v vVar = this.f290310e;
        C9257el elVar = vVar.f32202i;
        if (elVar == null) {
            elVar = C9257el.f32007h;
        }
        C7718hj hjVar = vVar.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        if ((hjVar.f26961b & 64) != 0) {
            C89291a aVar = this.f290314i.f290331a;
            Context context = this.f290307b;
            C7718hj hjVar2 = vVar.f32174H;
            if (hjVar2 == null) {
                hjVar2 = C7718hj.f26927af;
            }
            C8150xj xjVar = hjVar2.f26943O;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
            view.setContentDescription(aVar.mo83231a(context, xjVar));
            CardRenderingContext n = mo94120n();
            if (n != null && n.mo49315j()) {
                view.setAccessibilityDelegate(new C104322ax(1));
            }
        }
        C9259en enVar = elVar.f32011c;
        if (enVar == null) {
            enVar = C9259en.f32016i;
        }
        int i = elVar.f32009a;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                C91985d.m150961h(view, R.id.card_title, elVar.f32010b);
                if (this.f290318m && (textView3 = (TextView) view.findViewById(R.id.card_title)) != null) {
                    textView3.setTextColor(a);
                }
            }
            if (!enVar.f32025h) {
                mo94117k(view, R.id.current_weather_icon, enVar.f32020c);
            } else {
                view.findViewById(R.id.weather_gutter_container).setVisibility(8);
                view.findViewById(R.id.conditions).setVisibility(8);
            }
            View findViewById3 = view.findViewById(R.id.divider);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
        }
        String str = ((elVar.f32009a & 2) == 0 || (enVar.f32018a & 8) == 0) ? null : enVar.f32022e;
        if (!TextUtils.isEmpty(str)) {
            C91985d.m150960g(view, R.id.conditions, str);
            if (this.f290318m && (textView2 = (TextView) view.findViewById(R.id.conditions)) != null) {
                textView2.setTextColor(a);
            }
        } else {
            view.findViewById(R.id.conditions).setVisibility(8);
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.forecast_grid);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (elVar.f32014f.size() != 0) {
                for (C9256ek ekVar : elVar.f32014f) {
                    View inflate = this.f290308c.f256406b.inflate(R.layout.weather_forecast_column, viewGroup, false);
                    C91985d.m150960g(inflate, R.id.label, ekVar.f32003b);
                    C91985d.m150960g(inflate, R.id.high_temp, ekVar.f32005d);
                    C91985d.m150960g(inflate, R.id.low_temp, ekVar.f32006e);
                    mo94117k(inflate, R.id.icon, ekVar.f32004c);
                    viewGroup.addView(inflate);
                }
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(8);
            }
        }
        if (!elVar.f32015g && (findViewById = view.findViewById(R.id.missing_attribution_spacing)) != null) {
            findViewById.setVisibility(0);
        }
        C9277u a2 = C9277u.m23705a(this.f290310e.f32196c);
        if (a2 == null) {
            a2 = C9277u.UNKNOWN;
        }
        if (a2 == C9277u.WEATHER_FORECAST_TINY) {
            C91671j jVar = this.f290309d;
            if (!(jVar == null || (p = jVar.mo86101p()) == null)) {
                p.setTag(R.id.cap_module_presenter, this);
            }
            TextView textView4 = (TextView) view.findViewById(R.id.percent_precip);
            if (textView4 != null) {
                if (elVar.f32013e.isEmpty()) {
                    View findViewById4 = view.findViewById(R.id.percent_precip_container);
                    if (findViewById4 != null) {
                        findViewById4.setVisibility(8);
                    }
                } else {
                    textView4.setText(elVar.f32013e);
                    if (this.f290318m) {
                        textView4.setTextColor(a);
                    }
                }
            }
            C9256ek ekVar2 = (C9256ek) elVar.f32014f.get(0);
            int i2 = ekVar2.f32002a;
            if (!((i2 & 4) == 0 || (i2 & 8) == 0 || (textView = (TextView) view.findViewById(R.id.high_and_low_temp)) == null)) {
                textView.setText(this.f290307b.getResources().getString(R.string.qp_weather_high_low, new Object[]{ekVar2.f32005d, ekVar2.f32006e}));
                if (this.f290318m) {
                    textView.setTextColor(a);
                }
            }
            if (this.f290314i.f290335e) {
                C7718hj hjVar3 = vVar.f32174H;
                if (hjVar3 == null) {
                    hjVar3 = C7718hj.f26927af;
                }
                if (hjVar3.f26932D.size() > 0) {
                    C7718hj hjVar4 = vVar.f32174H;
                    if (hjVar4 == null) {
                        hjVar4 = C7718hj.f26927af;
                    }
                    C7708h c = C91978bb.m150937c(hjVar4, C7681g.CARD_MENU_OPEN, new C7681g[0]);
                    if (!(c == null || (c.f26896a & 2048) == 0)) {
                        C8178yk ykVar = c.f26907l;
                        if (ykVar == null) {
                            ykVar = C8178yk.f28736g;
                        }
                        if (!ykVar.f28742e) {
                            Map map = this.f290312g;
                            C8178yk ykVar2 = c.f26907l;
                            if (ykVar2 == null) {
                                ykVar2 = C8178yk.f28736g;
                            }
                            map.put(ykVar2, this.f289930A);
                        }
                    }
                    C104247o oVar = new C104247o(this);
                    View view2 = this.f289930A;
                    if (view2 != null) {
                        view2.setOnClickListener(oVar);
                        this.f289930A.setVisibility(0);
                        return;
                    }
                    return;
                }
                View view3 = this.f289930A;
                if (view3 != null) {
                    view3.setOnClickListener((View.OnClickListener) null);
                    this.f289930A.setVisibility(4);
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo94026f() {
        C7718hj hjVar = this.f290310e.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        return (hjVar.f26961b & 64) != 0;
    }
}
