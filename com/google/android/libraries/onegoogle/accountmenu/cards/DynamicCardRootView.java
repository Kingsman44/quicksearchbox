package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
class DynamicCardRootView extends ConstraintLayout implements C30872ae {

    /* renamed from: a */
    public C58833ax f82043a;

    /* renamed from: b */
    public C58833ax f82044b;

    /* renamed from: c */
    public boolean f82045c;

    public DynamicCardRootView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final C58485gu mo35906a() {
        C58480gp gpVar = new C58480gp(4);
        C30872ae aeVar = (C30872ae) findViewById(R.id.og_text_card_root);
        if (aeVar != null) {
            gpVar.mo55395g(aeVar);
        }
        return gpVar.mo55394f();
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        if (this.f82043a.mo56113h()) {
            zVar.mo35822b(this, ((Integer) this.f82043a.mo56107c()).intValue());
        }
        this.f82045c = true;
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        this.f82045c = false;
        if (this.f82043a.mo56113h()) {
            zVar.mo35825e(this);
        }
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C58836b bVar = C58836b.f156633a;
        this.f82043a = bVar;
        this.f82044b = bVar;
    }
}
