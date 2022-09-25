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
public final class ThumbnailHeaderView extends C27090ch implements C47231d {

    /* renamed from: a */
    private C27072bz f73508a;

    @Deprecated
    public ThumbnailHeaderView(Context context) {
        super(context);
        m49980e();
    }

    /* renamed from: e */
    private final void m49980e() {
        if (this.f73508a == null) {
            try {
                this.f73508a = ((C27084cb) mo32532b().mo17653jN()).mo32522R();
                C47400m a = C47389c.m84226a(getContext());
                a.f123128b = this;
                a.mo51254d(a.f123128b.findViewById(R.id.header_thumbnail), new C27083ca(this.f73508a));
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
    public final C27072bz mo17754z() {
        C27072bz bzVar = this.f73508a;
        if (bzVar != null) {
            return bzVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m49980e();
    }

    public ThumbnailHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThumbnailHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ThumbnailHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ThumbnailHeaderView(C47274n nVar) {
        super(nVar);
        m49980e();
    }
}
