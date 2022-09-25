package android.support.p031v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.am */
/* compiled from: PG */
final class C0296am {
    /* renamed from: a */
    static float m742a(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* renamed from: b */
    static int m743b(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    /* renamed from: c */
    static int m744c(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* renamed from: d */
    static long m745d(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* renamed from: e */
    static long m746e(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* renamed from: f */
    static long m747f(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* renamed from: g */
    static long m748g(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* renamed from: h */
    static long m749h(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* renamed from: i */
    static PlaybackState.Builder m750i() {
        return new PlaybackState.Builder();
    }

    /* renamed from: j */
    static PlaybackState.CustomAction.Builder m751j(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* renamed from: k */
    static PlaybackState.CustomAction m752k(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* renamed from: l */
    static PlaybackState m753l(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* renamed from: m */
    static Bundle m754m(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* renamed from: n */
    static CharSequence m755n(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* renamed from: o */
    static CharSequence m756o(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* renamed from: p */
    static String m757p(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* renamed from: q */
    static List m758q(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* renamed from: r */
    static void m759r(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* renamed from: s */
    static void m760s(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    /* renamed from: t */
    static void m761t(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    /* renamed from: u */
    static void m762u(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    /* renamed from: v */
    static void m763v(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* renamed from: w */
    static void m764w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: x */
    static void m765x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }
}
