package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30906af;
import com.google.android.libraries.onegoogle.common.C30913am;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.material.chip.Chip;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* compiled from: PG */
public final class MyAccountChip extends Chip implements C30872ae {

    /* renamed from: a */
    public final C30913am f82886a = new C30913am(this);

    /* renamed from: b */
    public int f82887b = 1;

    /* renamed from: j */
    private C30305n f82888j;

    public MyAccountChip(Context context) {
        super(context, (AttributeSet) null);
        m57364L((AttributeSet) null);
    }

    /* renamed from: L */
    private final void m57364L(AttributeSet attributeSet) {
        Resources resources = getResources();
        this.f82886a.mo36593a(C58485gu.m89848p(resources.getString(R.string.og_my_account_desc_long_length), resources.getString(R.string.og_my_account_desc_meduim_length), resources.getString(R.string.og_my_account_desc_short_length)));
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C30747br.f82992a, R.attr.ogAccountMenuStyle, 2132149621);
        try {
            mo47684o(C30906af.m57697a(context, obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        zVar.mo35823c(this, 90139);
    }

    /* renamed from: e */
    public final void mo36389e(C30305n nVar, C63644b bVar, C30922i iVar) {
        this.f82888j = nVar;
        mo35630b(nVar.mo35864o());
        C30901aa aaVar = new C30901aa(new C30739bj(this, nVar, bVar));
        aaVar.f83316d = iVar.mo35755b();
        aaVar.f83317e = iVar.mo35754a();
        setOnClickListener(new C30938y(aaVar));
    }

    /* renamed from: f */
    public final void mo36390f() {
        int i = 8;
        if (C30281j.m56319c(this.f82888j.mo35858i().f81934a.f81883d) != null && this.f82888j.mo35852b().mo35558i(C30281j.m56319c(this.f82888j.mo35858i().f81934a.f81883d))) {
            i = 0;
        }
        setVisibility(i);
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        zVar.mo35825e(this);
    }

    public MyAccountChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57364L(attributeSet);
    }

    public MyAccountChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57364L(attributeSet);
    }
}
