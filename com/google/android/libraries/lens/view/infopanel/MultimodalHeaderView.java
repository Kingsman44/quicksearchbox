package com.google.android.libraries.lens.view.infopanel;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class MultimodalHeaderView extends C27088cf implements C47231d {

    /* renamed from: a */
    private C26994al f73507a;

    @Deprecated
    public MultimodalHeaderView(Context context) {
        super(context);
        m49977e();
    }

    /* renamed from: e */
    private final void m49977e() {
        if (this.f73507a == null) {
            try {
                this.f73507a = ((C26998ap) mo32528b().mo17653jN()).mo32458Q();
                C47400m a = C47389c.m84226a(getContext());
                a.f123128b = this;
                C26994al alVar = this.f73507a;
                a.mo51254d(a.f123128b.findViewById(R.id.header_thumbnail), new C26995am(alVar));
                a.mo51254d(a.f123128b.findViewById(R.id.header_multimodal_add_query_chip), new C26996an(alVar));
                a.mo51254d(a.f123128b.findViewById(R.id.header_multimodal_modify_query_chip), new C26997ao(alVar));
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof C47211g)) {
                    String cls = getClass().toString();
                    throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final C26994al mo17754z() {
        C26994al alVar = this.f73507a;
        if (alVar != null) {
            return alVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m49977e();
    }

    public MultimodalHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultimodalHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MultimodalHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public MultimodalHeaderView(C47274n nVar) {
        super(nVar);
        m49977e();
    }
}
