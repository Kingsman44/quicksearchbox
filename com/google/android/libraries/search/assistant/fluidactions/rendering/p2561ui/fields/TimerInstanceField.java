package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.assistant.p3897e.p3902c.p3907c.C51151ig;
import com.google.assistant.p3897e.p3902c.p3907c.C51152ih;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.TimerInstanceField */
/* compiled from: PG */
public final class TimerInstanceField extends LinearLayout implements C33177b {

    /* renamed from: c */
    private static final C59071e f89207c = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.TimerInstanceField");

    /* renamed from: a */
    public C51941eu f89208a;

    /* renamed from: b */
    public C33182g f89209b;

    /* renamed from: d */
    private TextView f89210d = null;

    /* renamed from: e */
    private TextView f89211e = null;

    /* renamed from: f */
    private LinearLayout f89212f = null;

    /* renamed from: g */
    private TextView f89213g = null;

    /* renamed from: h */
    private TextView f89214h = null;

    /* renamed from: i */
    private TextView f89215i = null;

    public TimerInstanceField(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static void m61863a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C51152ih ihVar;
        LinearLayout linearLayout;
        String str;
        C51941eu euVar = this.f89208a;
        if (euVar == null || this.f89209b == null) {
            ((C59052c) ((C59052c) f89207c.mo56226d()).mo56372aa(51156)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89208a = euVar2;
            this.f89209b.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89208a;
        if (euVar3.f136277e == 29) {
            ihVar = (C51152ih) euVar3.f136278f;
        } else {
            ihVar = C51152ih.f133149f;
        }
        TextView textView = this.f89210d;
        if (textView != null) {
            textView.setVisibility(0);
        }
        int a = C51151ig.m86045a(ihVar.f133152b);
        if (a == 0) {
            a = 1;
        }
        TextView textView2 = this.f89210d;
        if (textView2 != null) {
            int i = a - 1;
            if (i != 1) {
                if (i == 2) {
                    textView2.setText(getContext().getResources().getString(R.string.fa_timer_status_paused));
                } else if (i != 3) {
                    if (i != 4) {
                        ((C59052c) ((C59052c) f89207c.mo56226d()).mo56372aa(51157)).mo56386p("The status of timer is unknown.");
                        this.f89210d.setText(getContext().getResources().getString(R.string.fa_timer_status_unknown));
                    } else {
                        textView2.setText(getContext().getResources().getString(R.string.fa_timer_status_reset));
                    }
                }
            }
            textView2.setText(getContext().getResources().getString(R.string.fa_timer_status_active));
        }
        int a2 = C51151ig.m86045a(ihVar.f133152b);
        if (a2 == 0) {
            a2 = 1;
        }
        TextView textView3 = this.f89210d;
        if (textView3 != null) {
            int i2 = a2 - 1;
            if (i2 == 1 || i2 == 3) {
                textView3.setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnPrimary));
            } else {
                textView3.setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant));
            }
        }
        int a3 = C51151ig.m86045a(ihVar.f133152b);
        if (a3 == 0) {
            a3 = 1;
        }
        TextView textView4 = this.f89210d;
        if (textView4 != null) {
            int i3 = a3 - 1;
            if (i3 == 1 || i3 == 3) {
                textView4.setBackground(getContext().getDrawable(R.drawable.fa_timer_status_active_background));
            } else {
                textView4.setBackground(getContext().getDrawable(R.drawable.fa_timer_status_inactive_background));
            }
        }
        if ((ihVar.f133151a & 2) != 0) {
            TextView textView5 = this.f89211e;
            if (textView5 != null) {
                textView5.setVisibility(0);
                TextView textView6 = this.f89211e;
                C52460so soVar = ihVar.f133153c;
                if (soVar == null) {
                    soVar = C52460so.f137714d;
                }
                textView6.setText(C33233k.m61635a(soVar, Locale.getDefault(), getContext().getResources()));
            }
        } else {
            ((C59052c) ((C59052c) f89207c.mo56226d()).mo56372aa(51155)).mo56386p("There is no total duration value specified in timerInstance.");
        }
        int i4 = ihVar.f133151a;
        if (((i4 & 4) != 0 || (i4 & 8) != 0) && (linearLayout = this.f89212f) != null && this.f89214h != null && this.f89213g != null && this.f89215i != null) {
            linearLayout.setVisibility(0);
            int i5 = ihVar.f133151a;
            if (!((i5 & 4) == 0 || (i5 & 8) == 0)) {
                this.f89214h.setVisibility(0);
            }
            if ((ihVar.f133151a & 4) != 0) {
                this.f89213g.setVisibility(0);
                TextView textView7 = this.f89213g;
                C52460so soVar2 = ihVar.f133154d;
                if (soVar2 == null) {
                    soVar2 = C52460so.f137714d;
                }
                long j = soVar2.f137717b;
                long hours = TimeUnit.SECONDS.toHours(j);
                long minutes = TimeUnit.SECONDS.toMinutes(j) % 60;
                long j2 = j % 60;
                if (hours > 0) {
                    str = getContext().getResources().getString(R.string.fa_remaining_duration_hours_minutes_seconds, new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(j2)});
                } else if (minutes > 0) {
                    str = getContext().getResources().getString(R.string.fa_remaining_duration_minutes_seconds, new Object[]{Long.valueOf(minutes), Long.valueOf(j2)});
                } else {
                    str = getContext().getResources().getString(R.string.fa_remaining_duration_seconds, new Object[]{Long.valueOf(j2)});
                }
                textView7.setText(str);
            }
            if ((ihVar.f133151a & 8) != 0) {
                this.f89215i.setVisibility(0);
                this.f89215i.setText(ihVar.f133155e);
            }
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89210d = (TextView) findViewById(R.id.fa_timer_instance_field_status);
        this.f89211e = (TextView) findViewById(R.id.fa_timer_instance_field_total_duration);
        this.f89212f = (LinearLayout) findViewById(R.id.fa_timer_instance_field_description);
        this.f89213g = (TextView) findViewById(R.id.fa_timer_instance_field_remaining_duration);
        this.f89214h = (TextView) findViewById(R.id.fa_timer_instance_field_remaining_duration_label_separator);
        this.f89215i = (TextView) findViewById(R.id.fa_timer_instance_field_label);
        m61863a(this.f89210d);
        m61863a(this.f89211e);
        m61863a(this.f89212f);
        m61863a(this.f89213g);
        m61863a(this.f89214h);
        m61863a(this.f89215i);
    }

    public TimerInstanceField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimerInstanceField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TimerInstanceField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
