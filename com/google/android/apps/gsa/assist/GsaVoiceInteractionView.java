package com.google.android.apps.gsa.assist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.assist.p501a.C9329q;
import com.google.android.apps.gsa.search.shared.overlay.C87664m;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.searchplate.C88890a;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.shared.p7130s.C90475a;
import com.google.android.apps.gsa.shared.util.C90742az;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class GsaVoiceInteractionView extends RelativeLayout implements C87664m {

    /* renamed from: a */
    public final C90758bb f32314a = new C90758bb();

    /* renamed from: b */
    public SearchPlate f32315b;

    /* renamed from: c */
    public C87673aa f32316c;

    /* renamed from: d */
    public C9329q f32317d;

    /* renamed from: e */
    private final Context f32318e;

    /* renamed from: f */
    private final C9401cf f32319f = new C9401cf();

    public GsaVoiceInteractionView(Context context) {
        super(context);
        this.f32318e = context;
    }

    /* renamed from: a */
    public final void mo17500a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        SearchPlate searchPlate = (SearchPlate) findViewById(R.id.search_plate);
        this.f32315b = searchPlate;
        searchPlate.mo82682o(new C90742az(this.f32314a));
        this.f32315b.mo82676i(new C9400ce(this));
        setBackground(new C88890a(this.f32318e.getResources().getColor(R.color.screen_assist_search_scrim), this.f32318e.getResources().getColor(R.color.activity_background), this.f32318e.getResources().getColor(R.color.status_bar_background), this.f32318e.getResources().getDimensionPixelSize(this.f32318e.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
        this.f32315b.mo82680m(8, 0, true, true);
        setAccessibilityDelegate(this.f32319f);
        super.onFinishInflate();
    }

    public GsaVoiceInteractionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((C90475a) context.getApplicationContext()).mo65449gt();
        this.f32318e = context;
    }

    public GsaVoiceInteractionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32318e = context;
    }
}
