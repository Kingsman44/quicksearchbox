package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.slice.Slice;
import androidx.slice.widget.SliceView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.slices.C19233i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.DefaultSliceCardView */
/* compiled from: PG */
public final class DefaultSliceCardView extends FrameLayout implements C129285j {

    /* renamed from: a */
    private static final C59071e f355050a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.DefaultSliceCardView");

    /* renamed from: b */
    private SliceView f355051b;

    public DefaultSliceCardView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo108937a(int i) {
        SliceView sliceView = this.f355051b;
        if (sliceView == null) {
            ((C59052c) ((C59052c) f355050a.mo56226d()).mo56372aa(38220)).mo56386p("Failed to set slice view mode, slice view is null");
        } else {
            sliceView.mo8673h(i);
        }
    }

    /* renamed from: b */
    public final void mo108938b(Slice slice) {
        SliceView sliceView = this.f355051b;
        if (sliceView == null) {
            ((C59052c) ((C59052c) f355050a.mo56226d()).mo56372aa(38221)).mo56386p("Failed to set slice, slice view is null");
        } else {
            sliceView.mo8671f(slice);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        SliceView sliceView = (SliceView) findViewById(R.id.assistant_slice_view);
        sliceView.getClass();
        this.f355051b = sliceView;
        sliceView.mo8668c(new C19233i(getContext()));
    }

    public DefaultSliceCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DefaultSliceCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
