package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93509a;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93510b;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93511c;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93514f;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93516h;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93521m;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ToggleSettingsArgumentView extends C93544av {

    /* renamed from: b */
    public Switch f261108b;

    /* renamed from: c */
    private final C93629dz f261109c;

    /* renamed from: d */
    private ImageView f261110d;

    /* renamed from: e */
    private TextView f261111e;

    /* renamed from: f */
    private TextView f261112f;

    public ToggleSettingsArgumentView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Drawable mo87909b() {
        return this.f261110d.getDrawable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C93514f mo87910c() {
        int i = ((DeviceSettingsArgument) this.f261447m).f236161o - 1;
        if (i == 1) {
            return new C93521m(getContext());
        }
        if (i == 2) {
            return new C93511c(getContext());
        }
        if (i == 3) {
            return new C93516h(getContext());
        }
        if (i == 7) {
            return new C93509a(getContext());
        }
        if (i == 8) {
            return new C93510b(getContext());
        }
        throw new UnsupportedOperationException("Unsupported setting type");
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
        this.f261108b.setEnabled(z);
    }

    /* renamed from: f */
    public final void mo87732f() {
        if (((DeviceSettingsArgument) this.f261447m).mo81263C()) {
            C93514f g = mo87956g();
            g.mo87928f();
            this.f261110d.setImageResource(g.mo87923a());
            this.f261110d.setColorFilter(getContext().getResources().getColor(R.color.agsa_color_on_surface));
            this.f261111e.setText(g.mo87924b());
            this.f261112f.setText(g.mo87927e(getResources()));
            boolean g2 = g.mo87929g();
            this.f261109c.f261378a = false;
            this.f261108b.setChecked(g2);
            this.f261109c.f261378a = true;
            mo87957h(g);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Switch switchR = (Switch) findViewById(R.id.toggle);
        switchR.getClass();
        this.f261108b = switchR;
        switchR.setVisibility(0);
        this.f261108b.setOnCheckedChangeListener(this.f261109c);
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        imageView.getClass();
        this.f261110d = imageView;
        TextView textView = (TextView) findViewById(R.id.text);
        textView.getClass();
        this.f261111e = textView;
        TextView textView2 = (TextView) findViewById(R.id.secondary_text);
        textView2.getClass();
        this.f261112f = textView2;
        setOnClickListener(new C93628dy(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo87912r(int i) {
        C89941l.m146512c(this.f261108b, i);
    }

    public ToggleSettingsArgumentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToggleSettingsArgumentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261109c = new C93629dz(this);
    }
}
