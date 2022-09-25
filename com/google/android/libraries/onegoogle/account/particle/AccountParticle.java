package com.google.android.libraries.onegoogle.account.particle;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;

/* compiled from: PG */
public class AccountParticle extends ConstraintLayout implements C30231e, C30872ae {

    /* renamed from: a */
    public C30230d f81715a;

    /* renamed from: b */
    public final AccountParticleDisc f81716b;

    /* renamed from: c */
    public final TextView f81717c;

    /* renamed from: d */
    public final TextView f81718d;

    /* renamed from: e */
    public boolean f81719e;

    /* renamed from: f */
    private final TextView f81720f;

    public AccountParticle(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final TextView mo35698a() {
        return this.f81720f;
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        if (this.f81719e) {
            zVar.mo35823c(this, 90144);
            this.f81716b.mo35589g(zVar);
        }
    }

    /* renamed from: c */
    public final TextView mo35699c() {
        return this.f81717c;
    }

    /* renamed from: e */
    public final TextView mo35700e() {
        return this.f81718d;
    }

    /* renamed from: f */
    public final AccountParticleDisc mo35701f() {
        return this.f81716b;
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        if (this.f81719e) {
            AccountParticleDisc accountParticleDisc = this.f81716b;
            if (accountParticleDisc.f81555i) {
                accountParticleDisc.f81548b.mo35632lk(zVar);
            }
            if (accountParticleDisc.f81556j) {
                accountParticleDisc.f81549c.mo35632lk(zVar);
            }
            zVar.mo35825e(this);
        }
    }

    public AccountParticle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleStyle);
    }

    public AccountParticle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C30239m.f81742a, i, 0);
        try {
            LayoutInflater.from(context).inflate(true != obtainStyledAttributes.getBoolean(0, false) ? R.layout.account_particle_small_disc_size : R.layout.account_particle, this, true);
            AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
            accountParticleDisc.getClass();
            this.f81716b = accountParticleDisc;
            TextView textView = (TextView) findViewById(R.id.og_primary_account_information);
            textView.getClass();
            this.f81717c = textView;
            TextView textView2 = (TextView) findViewById(R.id.og_secondary_account_information);
            textView2.getClass();
            this.f81718d = textView2;
            this.f81720f = (TextView) findViewById(R.id.counter);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
