package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.q */
/* compiled from: PG */
public final class C115447q implements C115446p {

    /* renamed from: a */
    private final C23112h f320286a;

    public C115447q(C23112h hVar) {
        this.f320286a = hVar;
    }

    /* renamed from: A */
    public final void mo101917A(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("paragraphIndex", Integer.valueOf(i).intValue());
        bundle.putInt("wordOffset", Integer.valueOf(i2).intValue());
        this.f320286a.mo28345s("onSnapToWord_int_int", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: B */
    public final void mo101918B() {
        this.f320286a.mo28345s("onTextHighlightingTogglePressed", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: C */
    public final void mo101919C(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        this.f320286a.mo28345s("onUserNavigation_java.lang.String", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: D */
    public final void mo101920D() {
        this.f320286a.mo28345s("onWebPageLoaded", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: e */
    public final void mo101875e() {
        this.f320286a.mo28345s("onAlertDismissed", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: f */
    public final void mo101876f() {
        this.f320286a.mo28345s("onFastForward", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: h */
    public final void mo101877h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", Integer.valueOf(i).intValue());
        this.f320286a.mo28345s("onMediaItemSelected_int", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: i */
    public final void mo101878i(float f) {
        Bundle bundle = new Bundle();
        bundle.putFloat("newSpeed", Float.valueOf(f).floatValue());
        this.f320286a.mo28345s("onPlaybackSpeedChanged_float", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: j */
    public final void mo101879j() {
        this.f320286a.mo28345s("onRewind", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: k */
    public final void mo101880k(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("seekPositionMillis", Long.valueOf(j).longValue());
        this.f320286a.mo28345s("onSeekTo_long", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: l */
    public final void mo101881l(byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenshot", bArr);
        this.f320286a.mo28345s("onSendFeedback_byte[]", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: m */
    public final void mo101882m(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", Integer.valueOf(i).intValue());
        this.f320286a.mo28345s("onShowInfo_int", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: n */
    public final void mo101883n() {
        this.f320286a.mo28345s("onShowPlaylist", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: o */
    public final void mo101884o() {
        this.f320286a.mo28345s("onSkipNext", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: p */
    public final void mo101885p() {
        this.f320286a.mo28345s("onTogglePlayPause", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: s */
    public final void mo101927s() {
        this.f320286a.mo28345s("onActivityResumed", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: t */
    public final void mo101928t() {
        this.f320286a.mo28345s("onActivityStopped", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: u */
    public final void mo101929u() {
        this.f320286a.mo28345s("onChangeLanguagePressed", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: v */
    public final void mo101930v() {
        this.f320286a.mo28345s("onChangeVoicePressed", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: w */
    public final void mo101931w() {
        this.f320286a.mo28345s("onChangingSpeedDone", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: x */
    public final void mo101932x() {
        this.f320286a.mo28345s("onChangingSpeedStarted", "SpeakrMediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: y */
    public final void mo101933y(byte[] bArr, C115435e eVar, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenshot", bArr);
        C115435e.values();
        bundle.putInt("feedbackType", eVar.ordinal());
        bundle.putString("word", str);
        bundle.putString("surroundingText", str2);
        this.f320286a.mo28345s("onSendCategorizedFeedback_byte[]_com.google.android.apps.gsa.staticplugins.opamediaplayer.shared.speakr.FeedbackType_java.lang.String_java.lang.String", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: z */
    public final void mo101934z(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("paragraphIndex", Integer.valueOf(i).intValue());
        this.f320286a.mo28345s("onSnapToParagraph_int", "SpeakrMediaPlayerEventsDispatcher", bundle);
    }
}
