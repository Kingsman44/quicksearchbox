package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.android.p256b.C5033s;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33232j;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50982c;
import com.google.assistant.p3897e.p3902c.p3907c.C51009d;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.time.LocalDateTime;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.format.FormatStyle;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.AlarmInstanceField */
/* compiled from: PG */
public final class AlarmInstanceField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f88985a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.AlarmInstanceField");

    /* renamed from: b */
    public Switch f88986b = null;

    /* renamed from: c */
    public TextView f88987c = null;

    /* renamed from: d */
    public C51941eu f88988d;

    /* renamed from: e */
    public C33182g f88989e;

    /* renamed from: f */
    public Fragment f88990f;

    /* renamed from: g */
    private LinearLayout f88991g = null;

    /* renamed from: h */
    private ImageComponent f88992h = null;

    /* renamed from: i */
    private TextView f88993i = null;

    /* renamed from: j */
    private LinearLayout f88994j = null;

    /* renamed from: k */
    private TextView f88995k = null;

    /* renamed from: l */
    private LinearLayout f88996l = null;

    /* renamed from: m */
    private TextView f88997m = null;

    /* renamed from: n */
    private TextView f88998n = null;

    /* renamed from: o */
    private TextView f88999o = null;

    public AlarmInstanceField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static String m61697a(C52403ql qlVar) {
        return LocalDateTime.m71183of(0, 1, 1, qlVar.f137515b, qlVar.f137516c).format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
    }

    /* renamed from: h */
    private static void m61698h(View view) {
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
        C51009d dVar;
        C51941eu euVar = this.f88988d;
        if (euVar == null || this.f88989e == null) {
            ((C59052c) ((C59052c) f88985a.mo56226d()).mo56372aa(50986)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f88988d = euVar2;
            this.f88989e.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f88988d;
        if (euVar3.f136277e == 28) {
            dVar = (C51009d) euVar3.f136278f;
        } else {
            dVar = C51009d.f132801i;
        }
        if (this.f88991g == null || this.f88993i == null || this.f88992h == null) {
            ((C59052c) ((C59052c) f88985a.mo56226d()).mo56372aa(50990)).mo56386p("Unable to update FormField UI due to invalid args");
        } else if ((dVar.f132803a & 64) != 0) {
            C51098gh ghVar = dVar.f132810h;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 1) {
                C51058ev evVar = (C51058ev) ghVar.f133013c;
                if ((evVar.f132943a & 1) != 0) {
                    this.f88991g.setVisibility(0);
                    String str = evVar.f132944b;
                    try {
                        PackageManager packageManager = getContext().getPackageManager();
                        this.f88993i.setText(packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)));
                        this.f88993i.setVisibility(0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    ImageComponent imageComponent = this.f88992h;
                    imageComponent.f88960e = true;
                    C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
                    dbVar.copyOnWrite();
                    C51012dc dcVar = (C51012dc) dbVar.instance;
                    str.getClass();
                    dcVar.f132815a |= 32;
                    dcVar.f132821g = str;
                    imageComponent.mo38649b((C51012dc) dbVar.build(), (Drawable) null);
                    this.f88992h.setVisibility(0);
                } else {
                    ((C59052c) ((C59052c) f88985a.mo56226d()).mo56372aa(50992)).mo56386p("There is no package name specified in AndroidAppInfo.");
                }
            } else {
                ((C59052c) ((C59052c) f88985a.mo56226d()).mo56372aa(50993)).mo56386p("There is no AndroidAppInfo specified in OnDeviceClockProvider.");
            }
        }
        LinearLayout linearLayout = this.f88994j;
        if (linearLayout == null || this.f88995k == null) {
            ((C59052c) ((C59052c) f88985a.mo56226d()).mo56372aa(50987)).mo56386p("Unable to update FormField UI due to invalid args");
        } else if ((dVar.f132803a & 1) != 0) {
            linearLayout.setVisibility(0);
            C52403ql qlVar = dVar.f132804b;
            if (qlVar == null) {
                qlVar = C52403ql.f137512f;
            }
            this.f88995k.setText(C33233k.m61636b(qlVar, Locale.getDefault()));
            this.f88995k.setVisibility(0);
            int i = dVar.f132803a;
            if (!((i & 4) == 0 || (i & 8) == 0)) {
                Switch switchR = this.f88986b;
                if (switchR == null || this.f88987c == null) {
                    ((C59052c) ((C59052c) f88985a.mo56226d()).mo56372aa(50995)).mo56386p("Unable to update FormField UI due to invalid args");
                } else {
                    switchR.setVisibility(0);
                    C50982c a = C50982c.m86000a(dVar.f132805c);
                    if (a == null) {
                        a = C50982c.UNDEFINED;
                    }
                    if (a != C50982c.UNDEFINED) {
                        C50982c a2 = C50982c.m86000a(dVar.f132805c);
                        if (a2 == null) {
                            a2 = C50982c.UNDEFINED;
                        }
                        if (a2 != C50982c.ON) {
                            this.f88986b.setChecked(false);
                            TextView textView = this.f88987c;
                            Context context = getContext();
                            Object[] objArr = new Object[1];
                            C52403ql qlVar2 = dVar.f132804b;
                            if (qlVar2 == null) {
                                qlVar2 = C52403ql.f137512f;
                            }
                            objArr[0] = m61697a(qlVar2);
                            textView.setContentDescription(context.getString(R.string.fa_alarm_instance_switch_off_label, objArr));
                            this.f88986b.setOnCheckedChangeListener(new C33267a(this, dVar));
                        }
                    }
                    this.f88986b.setChecked(true);
                    TextView textView2 = this.f88987c;
                    Context context2 = getContext();
                    Object[] objArr2 = new Object[1];
                    C52403ql qlVar3 = dVar.f132804b;
                    if (qlVar3 == null) {
                        qlVar3 = C52403ql.f137512f;
                    }
                    objArr2[0] = m61697a(qlVar3);
                    textView2.setContentDescription(context2.getString(R.string.fa_alarm_instance_switch_on_label, objArr2));
                    this.f88986b.setOnCheckedChangeListener(new C33267a(this, dVar));
                }
            }
        } else {
            ((C59052c) ((C59052c) f88985a.mo56226d()).mo56372aa(50989)).mo56386p("There is no time value specified in alarmInstance.");
        }
        LinearLayout linearLayout2 = this.f88996l;
        if (linearLayout2 == null || this.f88997m == null || this.f88998n == null || this.f88999o == null) {
            ((C59052c) ((C59052c) f88985a.mo56226d()).mo56372aa(50984)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        int i2 = dVar.f132803a;
        if ((i2 & 16) != 0 || (i2 & 32) != 0) {
            linearLayout2.setVisibility(0);
            int i3 = dVar.f132803a;
            if (!((i3 & 16) == 0 || (i3 & 32) == 0)) {
                this.f88998n.setVisibility(0);
            }
            if ((dVar.f132803a & 16) != 0) {
                this.f88997m.setVisibility(0);
                C52397qf qfVar = dVar.f132808f;
                if (qfVar == null) {
                    qfVar = C52397qf.f137491j;
                }
                Optional d = C33232j.m61630d(Optional.m71637of(qfVar));
                this.f88997m.setText(d.isPresent() ? C33232j.m61633g(((C5033s) d.get()).toString(), getContext().getResources()) : BuildConfig.FLAVOR);
            }
            if ((dVar.f132803a & 32) != 0) {
                this.f88999o.setVisibility(0);
                this.f88999o.setText(dVar.f132809g);
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
        this.f88991g = (LinearLayout) findViewById(R.id.fa_alarm_instance_field_provider_info);
        this.f88992h = (ImageComponent) findViewById(R.id.fa_alarm_instance_field_provider_image);
        this.f88993i = (TextView) findViewById(R.id.fa_alarm_instance_field_provider_name);
        m61698h(this.f88991g);
        m61698h(this.f88992h);
        m61698h(this.f88993i);
        this.f88994j = (LinearLayout) findViewById(R.id.fa_alarm_instance_field_main_panel);
        this.f88995k = (TextView) findViewById(R.id.fa_alarm_instance_field_time);
        this.f88986b = (Switch) findViewById(R.id.fa_alarm_instance_field_switch_control);
        this.f88987c = (TextView) findViewById(R.id.fa_alarm_instance_field_switch_label);
        m61698h(this.f88994j);
        m61698h(this.f88995k);
        m61698h(this.f88986b);
        this.f88996l = (LinearLayout) findViewById(R.id.fa_alarm_instance_field_description);
        this.f88997m = (TextView) findViewById(R.id.fa_alarm_instance_field_recurrence);
        this.f88998n = (TextView) findViewById(R.id.fa_alarm_instance_field_recurrence_label_separator);
        this.f88999o = (TextView) findViewById(R.id.fa_alarm_instance_field_alarm_label);
        m61698h(this.f88996l);
        m61698h(this.f88997m);
        m61698h(this.f88998n);
        m61698h(this.f88999o);
    }

    public AlarmInstanceField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlarmInstanceField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AlarmInstanceField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
