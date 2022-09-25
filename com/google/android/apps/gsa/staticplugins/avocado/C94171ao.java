package com.google.android.apps.gsa.staticplugins.avocado;

import android.graphics.drawable.Drawable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83960b;
import com.google.android.googlequicksearchbox.R;
import com.p232a.p233a.C4734bp;
import com.p232a.p233a.C4747cb;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ao */
/* compiled from: PG */
final class C94171ao implements C83960b {

    /* renamed from: a */
    final /* synthetic */ C94172ap f263118a;

    public C94171ao(C94172ap apVar) {
        this.f263118a = apVar;
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
        C94172ap apVar = this.f263118a;
        return new C4747cb(C4734bp.m13119e(apVar.f263120b, true != apVar.f263119a ? R.raw.hotword_enrollment_hand_back_material_next : R.raw.hotword_enrollment_hand_back_material_next_dark));
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
        return true != this.f263118a.f263119a ? "https://www.gstatic.com/assistant/verticals/family/voice_match/aadc_child_to_parent_light.json" : "https://www.gstatic.com/assistant/verticals/family/voice_match/aadc_child_to_parent_dark.json";
    }
}
