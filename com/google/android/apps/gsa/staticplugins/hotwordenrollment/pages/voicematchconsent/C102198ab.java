package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.graphics.drawable.Drawable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83960b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7986i.C101864a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.ab */
/* compiled from: PG */
final class C102198ab implements C83960b {

    /* renamed from: a */
    final /* synthetic */ C102199ac f285141a;

    public C102198ab(C102199ac acVar) {
        this.f285141a = acVar;
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
    public final /* synthetic */ Drawable mo77385d() {
        return null;
    }

    /* renamed from: e */
    public final /* synthetic */ Integer mo77386e() {
        return null;
    }

    /* renamed from: f */
    public final Integer mo77387f() {
        if (this.f285141a.f285143b.mo56113h()) {
            return null;
        }
        return Integer.valueOf(true != this.f285141a.f285145d ? R.raw.asst_voice_match_light : R.raw.asst_voice_match_dark);
    }

    /* renamed from: g */
    public final String mo77388g() {
        if (!this.f285141a.f285143b.mo56113h()) {
            return BuildConfig.FLAVOR;
        }
        C102199ac acVar = this.f285141a;
        if (acVar.f285145d) {
            return ((C101864a) acVar.f285143b.mo56107c()).mo92643a();
        }
        return ((C101864a) acVar.f285143b.mo56107c()).mo92644b();
    }

    /* renamed from: h */
    public final String mo77389h() {
        if (!this.f285141a.f285142a.mo70887e().mo70853a().mo70880d()) {
            return null;
        }
        C102199ac acVar = this.f285141a;
        if (acVar.f285144c) {
            return null;
        }
        return true != acVar.f285145d ? "https://www.gstatic.com/bisto/oobe/voice_match/wearos_hey_g_light.json" : "https://www.gstatic.com/bisto/oobe/voice_match/wearos_hey_g_dark.json";
    }
}
