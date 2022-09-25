package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.material.progressindicator.C44842af;
import com.google.android.material.progressindicator.C44849g;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.bo */
/* compiled from: PG */
public final class C30387bo extends C30417cr {

    /* renamed from: g */
    public LinearProgressIndicator f82141g;

    public C30387bo(ViewGroup viewGroup, Context context, C30897z zVar) {
        super(viewGroup, context, zVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo35937a(C2391v vVar, C30365at atVar) {
        C30385bm bmVar = (C30385bm) atVar;
        super.mo35937a(vVar, bmVar);
        C2332ag agVar = bmVar.f82140a;
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo35955b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f82107a).inflate(R.layout.og_progress_card_content, viewGroup);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) inflate.findViewById(R.id.og_card_progress_indicator);
        this.f82141g = linearProgressIndicator;
        int dimensionPixelSize = this.f82107a.getResources().getDimensionPixelSize(R.dimen.progress_bar_round_corners);
        C44849g gVar = linearProgressIndicator.f117002a;
        if (gVar.f117016b != dimensionPixelSize) {
            gVar.f117016b = Math.min(dimensionPixelSize, gVar.f117015a / 2);
        }
        ((C44842af) linearProgressIndicator.f117002a).mo48266a();
        linearProgressIndicator.invalidate();
        TextView textView = (TextView) inflate.findViewById(R.id.og_card_progress_subtitle);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo35947c(C2391v vVar) {
        super.mo35947c(vVar);
        C30385bm bmVar = (C30385bm) this.f82112f;
        C58838bb.m90866a(bmVar, "setCardModel has to be called before attaching view.");
        C2332ag agVar = bmVar.f82140a;
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ void mo35956e(C2391v vVar, C30398bz bzVar) {
        C30385bm bmVar = (C30385bm) bzVar;
        super.mo35937a(vVar, bmVar);
        C2332ag agVar = bmVar.f82140a;
        throw null;
    }
}
