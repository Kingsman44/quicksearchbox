package com.google.android.libraries.lens.view.p2082av;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.lens.view.av.f */
/* compiled from: PG */
public final class C25582f extends C25589m implements C47231d {

    /* renamed from: a */
    private C25586j f69609a;

    public C25582f(C47274n nVar) {
        super(nVar);
        m47187d();
    }

    /* renamed from: d */
    private final void m47187d() {
        if (this.f69609a == null) {
            try {
                this.f69609a = ((C25587k) mo30679b().mo17653jN()).mo30677V();
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
    public final C25586j mo17754z() {
        C25586j jVar = this.f69609a;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m47187d();
    }
}
