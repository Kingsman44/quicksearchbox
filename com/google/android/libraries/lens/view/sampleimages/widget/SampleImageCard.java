package com.google.android.libraries.lens.view.sampleimages.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.p3674l.p3681e.C47413b;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class SampleImageCard extends C27718f implements C47231d, C47413b {

    /* renamed from: a */
    private C27715c f75668a;

    /* renamed from: b */
    private final TypedArray f75669b;

    @Deprecated
    public SampleImageCard(Context context) {
        super(context);
        this.f75669b = null;
        m51561f();
    }

    /* renamed from: f */
    private final void m51561f() {
        if (this.f75668a == null) {
            try {
                this.f75668a = ((C27716d) mo33200d().mo17653jN()).mo33198U();
                TypedArray typedArray = this.f75669b;
                if (typedArray != null) {
                    typedArray.recycle();
                }
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
    public final TypedArray mo30879a() {
        return this.f75669b;
    }

    /* renamed from: b */
    public final C27715c mo17754z() {
        C27715c cVar = this.f75668a;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4740J();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m51561f();
    }

    public SampleImageCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75669b = context.obtainStyledAttributes(attributeSet, C27713a.f75670a);
    }

    public SampleImageCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75669b = context.obtainStyledAttributes(attributeSet, C27713a.f75670a, i, 0);
    }

    public SampleImageCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f75669b = context.obtainStyledAttributes(attributeSet, C27713a.f75670a, i, i2);
    }

    public SampleImageCard(C47274n nVar) {
        super(nVar);
        this.f75669b = null;
        m51561f();
    }
}
