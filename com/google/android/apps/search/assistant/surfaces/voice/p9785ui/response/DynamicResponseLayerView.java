package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web.C130201ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web.C130222q;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web.C130230y;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.DynamicResponseLayerView */
/* compiled from: PG */
public final class DynamicResponseLayerView extends C130173aw implements C47231d {

    /* renamed from: a */
    public C130250e f356834a;

    @Deprecated
    public DynamicResponseLayerView(Context context) {
        super(context);
        m212475e();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private final void m212475e() {
        if (this.f356834a == null) {
            try {
                C130268g gVar = (C130268g) mo33195b().mo17653jN();
                C130233d dVar = new C130233d(this);
                C47240i.m84036c(dVar);
                try {
                    C130250e d = gVar.mo109617d();
                    this.f356834a = d;
                    if (d == null) {
                        C47240i.m84035b(dVar);
                    }
                    this.f356834a.f357109h = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f356834a == null) {
                        C47240i.m84035b(dVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final C130250e mo17754z() {
        C130250e eVar = this.f356834a;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m212475e();
        C130250e eVar = this.f356834a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            ((C59052c) ((C59052c) C130250e.f357078a.mo56224b()).mo56372aa(38739)).mo56386p("Touch event stops TTS");
            eVar.f357080c.mo107935k();
            if (eVar.f357084g && eVar.f357083f.mo109620b(motionEvent, motionEvent)) {
                return true;
            }
        }
        if (eVar.f357084g) {
            eVar.f357082e.f6015a.f6014a.onTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4740J();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m212475e();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C130222q a;
        int i3;
        super.onMeasure(i, i2);
        m212475e();
        C130250e eVar = this.f356834a;
        C130201ah ahVar = (C130201ah) eVar.f357081d.getChildFragmentManager().f634a.mo671c("web_content_root_fragment");
        if (!(ahVar == null || (a = ahVar.mo17754z().mo109572a()) == null || !a.isResumed())) {
            C130230y f = a.mo17754z();
            int a2 = eVar.mo109608a();
            Fragment c = eVar.f357081d.getChildFragmentManager().f634a.mo671c("ASSISTANT_HEADER_FRAGMENT_TAG");
            if (c == null) {
                i3 = 0;
            } else {
                View requireView = c.requireView();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) requireView.getLayoutParams();
                int height = requireView.getHeight();
                layoutParams.getClass();
                i3 = height + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int i4 = a2 - i3;
            ((C59052c) ((C59052c) C130230y.f357000a.mo56224b()).mo56372aa(38780)).mo56387q("set web view height %d px", i4);
            View requireView2 = f.f357007h.requireView();
            ViewGroup.LayoutParams layoutParams2 = requireView2.getLayoutParams();
            layoutParams2.getClass();
            layoutParams2.height = i4;
            requireView2.requestLayout();
        }
        int a3 = eVar.mo109608a();
        ContentScrollView contentScrollView = (ContentScrollView) eVar.f357079b.findViewById(R.id.assistant_response_layer_scrollable_content);
        if (contentScrollView.f356833a != a3) {
            ((C59052c) ((C59052c) C130250e.f357078a.mo56224b()).mo56372aa(38737)).mo56387q("adjust content scroll view height cap to %d px", a3);
            contentScrollView.f356833a = a3;
        }
    }

    public DynamicResponseLayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DynamicResponseLayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DynamicResponseLayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DynamicResponseLayerView(C47274n nVar) {
        super(nVar);
        m212475e();
    }
}
