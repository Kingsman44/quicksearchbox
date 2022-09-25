package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.provider.Settings;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89108b;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89109c;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89110d;
import com.google.android.apps.gsa.shared.util.p7159c.C90879am;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gj */
/* compiled from: PG */
public abstract class C108375gj extends LinearLayout implements C73867g {

    /* renamed from: d */
    public C89110d f301427d;

    /* renamed from: e */
    public C68214a f301428e;

    /* renamed from: f */
    protected final ContentObserver f301429f = new C108374gi(this, new Handler());

    /* renamed from: g */
    public boolean f301430g;

    /* renamed from: h */
    ContentResolver f301431h;

    /* renamed from: i */
    C89109c f301432i;

    /* renamed from: j */
    final Context f301433j;

    /* renamed from: k */
    public TextView f301434k;

    /* renamed from: l */
    public ImageView f301435l;

    /* renamed from: m */
    public boolean f301436m = true;

    public C108375gj(Context context) {
        super(context);
        this.f301433j = context;
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        return caVar.mo85138c(new C90879am("OpaDeviceActionCard#ActionCardHistoryProtoTask", 1, 8, new C108372gg(this)));
    }

    /* renamed from: b */
    public void mo96538b(C52131gj gjVar) {
        this.f301434k.setText(gjVar.f136793c);
        this.f301436m = gjVar.f136794d;
        if (this.f301432i == null) {
            this.f301432i = this.f301427d.mo83088a(gjVar.f136792b, gjVar.f136797g);
        }
        if (this.f301431h == null) {
            this.f301431h = this.f301433j.getContentResolver();
        }
        if (this.f301430g) {
            Drawable e = this.f301432i.mo83084e();
            if (e == null) {
                Integer num = (Integer) C89108b.f241543c.get(gjVar.f136796f);
                if (num == null && gjVar.f136797g.equals("FLASHLIGHT")) {
                    num = Integer.valueOf(R.drawable.quantum_gm_ic_flashlight_on_gm_grey_36);
                }
                if (num == null) {
                    num = Integer.valueOf(R.drawable.quantum_ic_settings_grey600_48);
                }
                e = this.f301433j.getDrawable(num.intValue());
            }
            this.f301435l.setImageDrawable(e);
        } else {
            Drawable e2 = this.f301432i.mo83084e();
            if (e2 == null) {
                e2 = this.f301433j.getDrawable(R.drawable.quantum_ic_settings_grey600_48);
            }
            this.f301435l.setImageDrawable(e2);
        }
        setBackgroundResource(R.drawable.immersive_actions_small_card_background_v2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo96539c();

    /* renamed from: d */
    public abstract void mo96540d();

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo96540d();
        this.f301431h.registerContentObserver(Settings.System.getUriFor("screen_brightness_mode"), true, this.f301429f);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f301431h.unregisterContentObserver(this.f301429f);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f301434k = (TextView) findViewById(R.id.text);
        this.f301435l = (ImageView) findViewById(R.id.icon);
        mo96539c();
    }

    public C108375gj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f301433j = context;
    }

    public C108375gj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f301433j = context;
    }
}
