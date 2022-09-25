package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93513e;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93514f;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93520l;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ValyrianSliderSettingsArgumentView extends C93544av {

    /* renamed from: b */
    int f261113b;

    /* renamed from: c */
    final SeekBar.OnSeekBarChangeListener f261114c;

    /* renamed from: d */
    private SeekBar f261115d;

    /* renamed from: e */
    private TextView f261116e;

    public ValyrianSliderSettingsArgumentView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Drawable mo87909b() {
        return null;
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
            this.f261115d.setProgress(g.mo87925c());
            this.f261116e.setText(mo88127l().getText(g.mo87924b()));
            mo87957h(g);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        SeekBar seekBar = (SeekBar) findViewById(R.id.seek_bar);
        seekBar.getClass();
        this.f261115d = seekBar;
        TextView textView = (TextView) findViewById(R.id.text);
        textView.getClass();
        this.f261116e = textView;
        this.f261115d.setOnSeekBarChangeListener(this.f261114c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo87912r(int i) {
        C89941l.m146512c(this.f261115d, i);
    }

    public ValyrianSliderSettingsArgumentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ValyrianSliderSettingsArgumentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261113b = -1;
        this.f261114c = new C93644en(this);
    }
}
