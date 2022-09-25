package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30913am;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.q */
/* compiled from: PG */
public final class C30541q extends FrameLayout implements C30872ae {

    /* renamed from: a */
    public final TextView f82489a = ((TextView) findViewById(R.id.og_critical_alert_title));

    /* renamed from: b */
    public final TextView f82490b = ((TextView) findViewById(R.id.og_critical_alert_subtitle));

    /* renamed from: c */
    public final C30913am f82491c;

    /* renamed from: d */
    public final View f82492d;

    /* renamed from: e */
    private final Button f82493e;

    /* renamed from: f */
    private final boolean f82494f;

    /* renamed from: g */
    private boolean f82495g;

    public C30541q(Context context, boolean z) {
        super(context);
        inflate(context, R.layout.critical_alert_view, this);
        Button button = (Button) findViewById(R.id.og_critical_alert_action_button);
        this.f82493e = button;
        this.f82492d = findViewById(R.id.og_critical_alert_card_view);
        this.f82491c = new C30913am(button);
        setFocusable(false);
        C2043bi.m5551ae(this, 4);
        this.f82494f = z;
    }

    /* renamed from: a */
    public static int m57025a(boolean z) {
        return z ? 109340 : 109736;
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        zVar.mo35823c(this.f82492d, m57025a(this.f82494f));
        zVar.mo35823c(this.f82493e, 109339);
        this.f82495g = true;
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        if (this.f82495g) {
            zVar.mo35825e(this.f82493e);
            zVar.mo35825e(this.f82492d);
            this.f82495g = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.f82491c.mo36594b(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f82493e.setOnClickListener(onClickListener);
        this.f82492d.setOnClickListener(onClickListener);
        super.setOnClickListener(new C30540p(this));
    }
}
