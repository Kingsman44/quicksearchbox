package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93513e;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93514f;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93520l;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class SliderSettingsArgumentView extends C93544av {

    /* renamed from: b */
    int f261096b;

    /* renamed from: c */
    final SeekBar.OnSeekBarChangeListener f261097c;

    /* renamed from: d */
    private SeekBar f261098d;

    /* renamed from: e */
    private ImageView f261099e;

    /* renamed from: f */
    private TextView f261100f;

    public SliderSettingsArgumentView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Drawable mo87909b() {
        return this.f261099e.getDrawable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C93514f mo87910c() {
        int i = ((DeviceSettingsArgument) this.f261447m).f236161o - 1;
        if (i == 5) {
            return new C93513e(getContext());
        }
        if (i == 6) {
            return new C93520l((AudioManager) getContext().getSystemService("audio"), getContext().getContentResolver(), ((DeviceSettingsArgument) this.f261447m).mo81296a());
        }
        throw new UnsupportedOperationException("Unsupported setting type");
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
    }

    /* renamed from: f */
    public final void mo87732f() {
        if (((DeviceSettingsArgument) this.f261447m).mo81263C()) {
            C93514f g = mo87956g();
            g.mo87928f();
            this.f261098d.setProgress(g.mo87925c());
            if (this.f261449o) {
                int i = ((DeviceSettingsArgument) this.f261447m).f236161o - 1;
                if (i == 5) {
                    this.f261099e.setImageResource(R.drawable.quantum_ic_settings_brightness_black_48);
                } else if (i == 6) {
                    this.f261099e.setImageResource(R.drawable.quantum_ic_volume_up_black_48);
                }
            } else {
                this.f261099e.setImageResource(g.mo87923a());
                this.f261099e.setColorFilter(getContext().getResources().getColor(R.color.agsa_color_on_surface));
            }
            this.f261100f.setText(g.mo87924b());
            mo87957h(g);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        SeekBar seekBar = (SeekBar) findViewById(R.id.seek_bar);
        seekBar.getClass();
        this.f261098d = seekBar;
        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.getClass();
        this.f261099e = imageView;
        TextView textView = (TextView) findViewById(R.id.text);
        textView.getClass();
        this.f261100f = textView;
        this.f261098d.setOnSeekBarChangeListener(this.f261097c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo87912r(int i) {
        C89941l.m146512c(this.f261098d, i);
    }

    public SliderSettingsArgumentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SliderSettingsArgumentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261096b = -1;
        this.f261097c = new C93618do(this);
    }
}
