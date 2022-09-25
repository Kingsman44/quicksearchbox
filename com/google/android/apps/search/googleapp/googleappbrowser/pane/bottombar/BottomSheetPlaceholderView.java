package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class BottomSheetPlaceholderView extends C136082bh implements C47231d {

    /* renamed from: a */
    public C136069az f370498a;

    @Deprecated
    public BottomSheetPlaceholderView(Context context) {
        super(context);
        m220899e();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private final void m220899e() {
        if (this.f370498a == null) {
            try {
                C136076bb bbVar = (C136076bb) mo112743b().mo17653jN();
                C136068ay ayVar = new C136068ay(this);
                C47240i.m84036c(ayVar);
                try {
                    C136069az i = bbVar.mo112732i();
                    this.f370498a = i;
                    if (i == null) {
                        C47240i.m84035b(ayVar);
                    }
                    this.f370498a.f370601d = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f370498a == null) {
                        C47240i.m84035b(ayVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final C136069az mo17754z() {
        C136069az azVar = this.f370498a;
        if (azVar != null) {
            return azVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m220899e();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m220899e();
        C136069az azVar = this.f370498a;
        BottomSheetPlaceholderView bottomSheetPlaceholderView = azVar.f370585a;
        if (!azVar.f370586b) {
            i2 = azVar.f370587c;
        }
        bottomSheetPlaceholderView.setMeasuredDimension(i, i2);
    }

    public BottomSheetPlaceholderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomSheetPlaceholderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomSheetPlaceholderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public BottomSheetPlaceholderView(C47274n nVar) {
        super(nVar);
        m220899e();
    }
}
