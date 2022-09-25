package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.ag */
/* compiled from: PG */
abstract class C30179ag extends FrameLayout implements C30872ae {

    /* renamed from: a */
    public boolean f81610a;

    /* renamed from: b */
    private boolean f81611b;

    public C30179ag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public abstract int mo35608a();

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        if (this.f81610a) {
            zVar.mo35823c(this, mo35608a());
            this.f81611b = true;
        }
    }

    /* renamed from: c */
    public final void mo35631c(C30897z zVar, C28353e eVar) {
        if (this.f81610a) {
            zVar.mo35824d(this, mo35608a(), eVar);
            this.f81611b = true;
        }
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        if (this.f81610a && this.f81611b) {
            zVar.mo35825e(this);
            this.f81611b = false;
        }
    }
}
