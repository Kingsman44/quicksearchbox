package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* compiled from: PG */
public class SimpleActionView extends LinearLayout implements C30872ae {

    /* renamed from: a */
    public C58833ax f83110a;

    public SimpleActionView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        if (this.f83110a.mo56113h()) {
            zVar.mo35823c(this, ((Integer) this.f83110a.mo56107c()).intValue());
        }
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        if (this.f83110a.mo56113h()) {
            zVar.mo35825e(this);
        }
    }

    public SimpleActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f83110a = C58836b.f156633a;
    }
}
