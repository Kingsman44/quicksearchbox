package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import android.app.DirectAction;
import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.service.voice.VoiceInteractionSession;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120058d;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120059e;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33500a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33506c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2591a.C33501a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2591a.C33502b;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2592b.C33505a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.p */
/* compiled from: PG */
public final class C120031p extends VoiceInteractionSession implements C33504b, C33506c {

    /* renamed from: a */
    public static final C59071e f334185a = C59071e.m91331h();

    /* renamed from: b */
    public final IBinder f334186b;

    /* renamed from: c */
    public final C120058d f334187c;

    /* renamed from: d */
    public final C120124o f334188d;

    /* renamed from: e */
    public final C33502b f334189e;

    /* renamed from: f */
    public final C81016b f334190f;

    /* renamed from: g */
    public C120059e f334191g;

    /* renamed from: h */
    private final C47770dh f334192h;

    /* renamed from: i */
    private final C33505a f334193i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120031p(Context context, IBinder iBinder, Bundle bundle, C33501a aVar, C81016b bVar, C120058d dVar, C47770dh dhVar, C33505a aVar2) {
        super(context);
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "apaVoiceInteractionSessionCallbacksFactory");
        C69664n.m101061g(bVar, "assistInteractionSessionStarter");
        C69664n.m101061g(dVar, "sessionConformityClient");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f334186b = iBinder;
        this.f334190f = bVar;
        this.f334187c = dVar;
        this.f334192h = dhVar;
        this.f334193i = aVar2;
        this.f334188d = C120032q.m198936a(bundle, C120124o.APA);
        this.f334189e = aVar.mo38912a(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        p5462h.p5472e.C69598b.m101013a(r2, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m198932a(java.lang.String r2, p5462h.p5473f.p5474a.C69615a r3) {
        /*
            r1 = this;
            com.google.apps.tiktok.tracing.dh r0 = r1.f334192h
            com.google.apps.tiktok.tracing.ax r2 = r0.mo51613c(r2)
            r3.mo5672a()     // Catch:{ all -> 0x000e }
            r3 = 0
            p5462h.p5472e.C69598b.m101013a(r2, r3)
            return
        L_0x000e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a.C120031p.m198932a(java.lang.String, h.f.a.a):void");
    }

    /* renamed from: h */
    public final void mo38925h(DirectAction directAction, Bundle bundle, CancellationSignal cancellationSignal, Executor executor, C33500a aVar) {
        C69664n.m101061g(directAction, "action");
        C69664n.m101061g(executor, "resultExecutor");
        performDirectAction(directAction, bundle, cancellationSignal, executor, Consumer.Wrapper.convert(new C120028m(aVar)));
    }

    /* renamed from: i */
    public final void mo38926i(VoiceInteractionSession.ActivityId activityId, CancellationSignal cancellationSignal, Executor executor, C33500a aVar) {
        C69664n.m101061g(executor, "resultExecutor");
        requestDirectActions(activityId, cancellationSignal, executor, Consumer.Wrapper.convert(new C120029n(aVar)));
    }

    /* renamed from: l */
    public final void mo38927l(VoiceInteractionSession.Insets insets) {
        this.f334193i.f89653a.set(insets);
    }

    public final void onBackPressed() {
        m198932a("AgsaApaVoiceInteractionSession#onBackPressed", new C120016a(this));
    }

    public final void onCloseSystemDialogs() {
        m198932a("AgsaApaVoiceInteractionSession#onCloseSystemDialogs", new C120017b(this));
    }

    public final void onComputeInsets(VoiceInteractionSession.Insets insets) {
        VoiceInteractionSession.Insets insets2;
        super.onComputeInsets(insets);
        C33505a aVar = this.f334193i;
        if (insets != null && (insets2 = (VoiceInteractionSession.Insets) aVar.f89653a.get()) != null) {
            insets.touchableInsets = insets2.touchableInsets;
            insets.touchableRegion.set(insets2.touchableRegion);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C69664n.m101061g(configuration, "newConfig");
        m198932a("AgsaApaVoiceInteractionSession#onConfigurationChanged", new C120018c(this));
    }

    public final void onCreate() {
        m198932a("AgsaApaVoiceInteractionSession#onCreate", new C120019d(this));
    }

    public final void onDestroy() {
        m198932a("AgsaApaVoiceInteractionSession#onDestroy", new C120020e(this));
    }

    public final void onDirectActionsInvalidated(VoiceInteractionSession.ActivityId activityId) {
        C69664n.m101061g(activityId, "activityId");
        m198932a("AgsaApaVoiceInteractionSession#onDirectActionsInvalidated", new C120021f(this, activityId));
    }

    public final void onHandleAssist(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent) {
        m198932a("AgsaApaVoiceInteractionSession#onHandleAssist", new C120023h(this, bundle, assistStructure, assistContent));
    }

    public final void onHandleAssistSecondary(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, int i2) {
        m198932a("AgsaApaVoiceInteractionSession#onHandleAssistSecondary", new C120024i(this, bundle, assistStructure, assistContent, i, i2));
    }

    public final void onHandleScreenshot(Bitmap bitmap) {
        m198932a("AgsaApaVoiceInteractionSession#onHandleScreenshot", new C120025j(this, bitmap));
    }

    public final void onHide() {
        m198932a("AgsaApaVoiceInteractionSession#onHide", new C120026k(this));
    }

    public final void onShow(Bundle bundle, int i) {
        m198932a("AgsaApaVoiceInteractionSession#onShow", new C120027l(this, bundle, i));
    }

    public final void onHandleAssist(VoiceInteractionSession.AssistState assistState) {
        C69664n.m101061g(assistState, "state");
        m198932a("AgsaApaVoiceInteractionSession#onHandleAssistQ", new C120022g(this, assistState));
    }
}
