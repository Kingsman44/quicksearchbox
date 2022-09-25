package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58881cr;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55419v;
import java.util.Comparator;

/* compiled from: PG */
public class ProviderDisambiguationView extends C93561bl {

    /* renamed from: g */
    private final C88511e f261095g;

    public ProviderDisambiguationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Drawable mo87906c(Parcelable parcelable) {
        C55361pn pnVar = (C55361pn) ((ProtoLiteParcelable) parcelable).mo84190c(C55361pn.f145866g);
        int a = C55419v.m87685a(pnVar.f145872e);
        if (a != 0 && a == 13) {
            return getContext().getResources().getDrawable(R.drawable.ic_sms_black_blue, getContext().getTheme());
        }
        return this.f261095g.mo82072a(pnVar, getContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ String mo87907f(Parcelable parcelable) {
        return ((C55361pn) ((ProtoLiteParcelable) parcelable).mo84190c(C55361pn.f145866g)).f145869b;
    }

    /* renamed from: g */
    public final void mo87908g(Disambiguation disambiguation) {
        super.mo87751e(disambiguation, (Object) null, (Comparator) null);
        if (this.f260792e && disambiguation.f236363b.size() == 1) {
            ((View) this.f260790c.get(0)).setOnClickListener(this.f260788a);
        }
    }

    public ProviderDisambiguationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProviderDisambiguationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261095g = new C88511e((C58881cr) null);
    }
}
