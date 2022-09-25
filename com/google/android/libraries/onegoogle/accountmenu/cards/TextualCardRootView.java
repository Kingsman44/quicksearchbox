package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30913am;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.material.chip.Chip;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* compiled from: PG */
class TextualCardRootView extends FrameLayout implements C30872ae {

    /* renamed from: a */
    public C30913am f82046a;

    /* renamed from: b */
    public C30913am f82047b;

    /* renamed from: c */
    public C58833ax f82048c;

    /* renamed from: d */
    private Chip f82049d;

    /* renamed from: e */
    private Chip f82050e;

    /* renamed from: f */
    private int f82051f;

    public TextualCardRootView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        if (this.f82048c.mo56113h()) {
            zVar.mo35822b(this.f82049d, ((C30397by) this.f82048c.mo56107c()).mo35965b());
            zVar.mo35822b(this.f82050e, ((C30397by) this.f82048c.mo56107c()).mo35966c());
        }
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        if (this.f82048c.mo56113h()) {
            zVar.mo35825e(this.f82049d);
            zVar.mo35825e(this.f82050e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f82049d = (Chip) findViewById(R.id.og_text_card_action);
        this.f82050e = (Chip) findViewById(R.id.og_text_card_secondary_action);
        this.f82046a = new C30913am(this.f82049d);
        this.f82047b = new C30913am(this.f82050e);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.f82051f) {
            this.f82051f = size;
            this.f82046a.mo36594b(size);
            this.f82047b.mo36594b(this.f82051f);
        }
        super.onMeasure(i, i2);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f82048c = C58836b.f156633a;
    }
}
