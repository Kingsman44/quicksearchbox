package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import android.app.KeyguardManager;
import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import androidx.activity.result.C0816c;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33170a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.d */
/* compiled from: PG */
public final class C33190d implements C33170a {
    @Deprecated

    /* renamed from: a */
    public static final ActivityResult f88768a = new ActivityResult(0, (Intent) null);

    /* renamed from: b */
    public final Fragment f88769b;

    /* renamed from: c */
    public final KeyguardManager f88770c;

    /* renamed from: d */
    public final C0167am f88771d;

    /* renamed from: e */
    public C0816c f88772e;

    /* renamed from: f */
    public C0815b f88773f;

    /* renamed from: g */
    private final C32953f f88774g;

    public C33190d(Fragment fragment, KeyguardManager keyguardManager, C32953f fVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(keyguardManager, "keyguardManager");
        this.f88769b = fragment;
        this.f88770c = keyguardManager;
        this.f88774g = fVar;
        this.f88771d = fragment.getActivity();
    }

    /* renamed from: a */
    public final void mo38559a(Intent intent, KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        C60870cx a = this.f88774g.mo38395a(intent);
        C33187a aVar = new C33187a(keyguardDismissCallback, this);
        C60856cj.m92911t(a, C47810es.m84974n(aVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo38560b(Intent intent, C0815b bVar) {
        C69664n.m101061g(intent, "intent");
        C69664n.m101061g(bVar, "callback");
        C60870cx d = this.f88774g.mo38398d();
        C33189c cVar = new C33189c(bVar, this, intent);
        C60856cj.m92911t(d, C47810es.m84974n(cVar), C60826bg.f164896a);
    }
}
