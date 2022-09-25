package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8925c;

import android.util.Log;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119095ad;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119107ap;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119111c;

/* renamed from: com.google.android.apps.h.a.a.a.c.a */
/* compiled from: PG */
public final class C119117a implements C119095ad {
    /* renamed from: a */
    public final void mo30713a() {
        Log.d("SpeakrLoggingListener", "onFinishedReading");
    }

    /* renamed from: b */
    public final void mo30714b(int i) {
        Log.d("SpeakrLoggingListener", String.format("onParagraphChanged, paragraphIndex:%s", new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: c */
    public final void mo30715c() {
        Log.d("SpeakrLoggingListener", "onPreloaded");
    }

    /* renamed from: d */
    public final void mo30716d() {
        Log.d("SpeakrLoggingListener", "onSetupComplete");
    }

    /* renamed from: e */
    public final void mo30717e(C119107ap apVar) {
        Log.d("SpeakrLoggingListener", String.format("onWordChanged, %s", new Object[]{apVar}));
    }

    /* renamed from: f */
    public final void mo30718f(C119111c cVar, int i) {
        Log.d("SpeakrLoggingListener", "onError");
    }

    /* renamed from: g */
    public final void mo30719g(int i) {
        Object[] objArr = new Object[1];
        objArr[0] = i != 1 ? "EXPLICIT_RESUME" : "DOWNLOAD_COMPLETE";
        Log.d("SpeakrLoggingListener", String.format("onResumed, reason:%s", objArr));
    }

    /* renamed from: h */
    public final void mo30720h() {
        Log.d("SpeakrLoggingListener", "onImage");
    }

    /* renamed from: i */
    public final /* synthetic */ void mo30721i() {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo30722j() {
    }

    /* renamed from: k */
    public final void mo30723k(int i) {
        Object[] objArr = new Object[1];
        objArr[0] = i != 1 ? i != 2 ? "ERROR" : "EXPLICIT_PAUSE" : "WAITING_FOR_DOWNLOAD";
        Log.d("SpeakrLoggingListener", String.format("onPaused, reason:%s", objArr));
    }
}
