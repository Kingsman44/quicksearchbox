package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.graphics.drawable.Drawable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83960b;
import com.google.android.googlequicksearchbox.R;
import com.p232a.p233a.C4734bp;
import com.p232a.p233a.C4747cb;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.n */
/* compiled from: PG */
final class C102112n implements C83960b {

    /* renamed from: a */
    final /* synthetic */ C102113o f284859a;

    public C102112n(C102113o oVar) {
        this.f284859a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo77382a() {
        return 360;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo77383b() {
        return 360;
    }

    /* renamed from: c */
    public final /* synthetic */ int mo77384c() {
        return 10000;
    }

    /* renamed from: d */
    public final Drawable mo77385d() {
        C102113o oVar = this.f284859a;
        return new C4747cb(C4734bp.m13119e(oVar.f284861b, true != oVar.f284860a ? R.raw.hotword_enrollment_hand_off_material_next : R.raw.hotword_enrollment_hand_off_material_next_dark));
    }

    /* renamed from: e */
    public final /* synthetic */ Integer mo77386e() {
        return null;
    }

    /* renamed from: f */
    public final /* synthetic */ Integer mo77387f() {
        return null;
    }

    /* renamed from: g */
    public final String mo77388g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: h */
    public final String mo77389h() {
        return true != this.f284859a.f284860a ? "https://www.gstatic.com/assistant/verticals/family/voice_match/aadc_parent_to_child_light.json" : "https://www.gstatic.com/assistant/verticals/family/voice_match/aadc_parent_to_child_dark.json";
    }
}
