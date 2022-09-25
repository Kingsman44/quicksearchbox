package com.google.android.libraries.onegoogle.accountmanagement;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.C30229c;
import com.google.android.libraries.onegoogle.account.particle.C30230d;
import com.google.android.libraries.onegoogle.account.particle.C30231e;
import com.google.android.libraries.onegoogle.account.particle.C30233g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public final class SelectedAccountView extends ConstraintLayout implements C30231e {

    /* renamed from: l */
    private static final Property f81788l = Property.of(ImageView.class, Float.class, "rotation");

    /* renamed from: a */
    public final AccountParticleDisc f81789a;

    /* renamed from: b */
    public final ImageView f81790b;

    /* renamed from: c */
    public final ImageView f81791c;

    /* renamed from: d */
    public final FrameLayout f81792d;

    /* renamed from: e */
    public final ObjectAnimator f81793e;

    /* renamed from: f */
    public C30230d f81794f;

    /* renamed from: g */
    public boolean f81795g;

    /* renamed from: h */
    public C58833ax f81796h;

    /* renamed from: i */
    public String f81797i;

    /* renamed from: j */
    public String f81798j;

    /* renamed from: k */
    public C30229c f81799k;

    /* renamed from: m */
    private final TextView f81800m;

    /* renamed from: n */
    private final TextView f81801n;

    /* renamed from: o */
    private final TextView f81802o;

    public SelectedAccountView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final TextView mo35698a() {
        return this.f81802o;
    }

    /* renamed from: b */
    public final void mo33195b() {
        boolean z = true;
        if (this.f81796h.mo56113h() && ((C30233g) this.f81796h.mo56107c()).mo35709d().mo56113h() && !(this.f81790b.getVisibility() == 8 && this.f81791c.getVisibility() == 8)) {
            z = false;
        }
        C58838bb.m90884s(z, "Cannot show right drawable (info/chevron) and counter at the same time");
    }

    /* renamed from: c */
    public final TextView mo35699c() {
        return this.f81800m;
    }

    /* renamed from: d */
    public final void mo35764d(boolean z) {
        String str;
        C2043bi.m5551ae(this.f81790b, 1);
        ImageView imageView = this.f81790b;
        if (z) {
            str = this.f81797i;
        } else {
            str = this.f81798j;
        }
        imageView.setContentDescription(str);
    }

    /* renamed from: e */
    public final TextView mo35700e() {
        return this.f81801n;
    }

    /* renamed from: f */
    public final AccountParticleDisc mo35701f() {
        return this.f81789a;
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81796h = C58836b.f156633a;
        LayoutInflater.from(context).inflate(R.layout.selected_account_view, this);
        mo4829H(getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_layout_min_height));
        this.f81800m = (TextView) findViewById(R.id.og_primary_account_information);
        this.f81801n = (TextView) findViewById(R.id.og_secondary_account_information);
        this.f81802o = (TextView) findViewById(R.id.counter);
        this.f81789a = (AccountParticleDisc) findViewById(R.id.account_avatar);
        ImageView imageView = (ImageView) findViewById(R.id.og_collapsed_chevron);
        this.f81790b = imageView;
        this.f81793e = ObjectAnimator.ofFloat(imageView, f81788l, new float[]{360.0f, 180.0f});
        this.f81791c = (ImageView) findViewById(R.id.og_custom_icon);
        this.f81792d = (FrameLayout) findViewById(R.id.og_trailing_drawable_container);
    }
}
