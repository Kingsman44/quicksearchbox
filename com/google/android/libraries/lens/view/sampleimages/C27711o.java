package com.google.android.libraries.lens.view.sampleimages;

import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import com.bumptech.glide.C6007z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.sampleimages.widget.C27714b;
import com.google.android.libraries.lens.view.sampleimages.widget.C27715c;
import com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.material.progressindicator.C44856n;
import com.google.android.material.progressindicator.C44865w;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.sampleimages.o */
/* compiled from: PG */
public final class C27711o {

    /* renamed from: a */
    public final C28443m f75660a;

    /* renamed from: b */
    private final C47770dh f75661b;

    /* renamed from: c */
    private final C28306ab f75662c;

    public C27711o(C28443m mVar, C47770dh dhVar, C28306ab abVar) {
        this.f75660a = mVar;
        this.f75661b = dhVar;
        this.f75662c = abVar;
    }

    /* renamed from: a */
    public final void mo33190a(View view, C27698b bVar) {
        C58838bb.m90869d(view instanceof SampleImageCard, "The view card must be instance of SampleImageCard.");
        SampleImageCard sampleImageCard = (SampleImageCard) view;
        C27715c b = sampleImageCard.mo17754z();
        String str = bVar.f75636h;
        C27710n nVar = new C27710n(this, sampleImageCard, bVar);
        C47274n nVar2 = b.f75672a;
        ((C6007z) ((C6007z) b.f75673b.mo51286a().mo11864b().mo12448j(str).mo11962O(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET)).mo11964Q(C44865w.m79636j(nVar2, new C44856n(nVar2, (AttributeSet) null, 0, R.style.SampleImageLoadingIndicator)))).mo12439a(new C27714b(nVar)).mo12454r(b.f75674c);
        mo33192c(sampleImageCard, bVar.f75637i);
    }

    /* renamed from: b */
    public final void mo33191b(View view, View.OnClickListener onClickListener, String str) {
        view.setOnClickListener(new C47591co(this.f75661b, str, new C27709m(this, onClickListener)));
    }

    /* renamed from: c */
    public final void mo33192c(View view, int i) {
        C28306ab abVar = this.f75662c;
        abVar.mo33802c(view, abVar.f76990a.mo33805a(C28427h.m53115a(i)));
    }
}
