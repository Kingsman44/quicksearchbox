package com.google.android.apps.gsa.nga.shared.p6326ao.p6327a;

import android.app.ActivityOptions;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.C74722bz;
import com.google.android.apps.gsa.nga.shared.android.IntentLauncherActivity;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80963a;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80970b;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80998r;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80999s;
import com.google.android.apps.gsa.nga.shared.p6334b.C81015a;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.gsa.nga.shared.p6361q.C81449a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ao.a.f */
/* compiled from: PG */
public class C80969f implements C80970b, C81449a, C80999s {

    /* renamed from: b */
    public static final /* synthetic */ int f221966b = 0;

    /* renamed from: c */
    private static final C58974d f221967c = C58974d.m91136j();

    /* renamed from: a */
    public final AtomicReference f221968a = new AtomicReference();

    /* renamed from: d */
    private final Object f221969d = new Object();

    /* renamed from: e */
    private final Context f221970e;

    /* renamed from: f */
    private final KeyguardManager f221971f;

    /* renamed from: g */
    private final AtomicReference f221972g = new AtomicReference();

    /* renamed from: h */
    private final AtomicReference f221973h = new AtomicReference();

    /* renamed from: i */
    private final Queue f221974i = new ArrayDeque();

    /* renamed from: j */
    private final C81016b f221975j;

    static {
        Duration.ofSeconds(10);
    }

    public C80969f(C81016b bVar, Context context) {
        this.f221975j = bVar;
        this.f221970e = context;
        this.f221971f = (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    /* renamed from: n */
    private static String m128822n(Intent intent) {
        String stringExtra = intent.getStringExtra("utterance_id");
        if (stringExtra != null) {
            return stringExtra;
        }
        ((C58970a) ((C58970a) f221967c.mo56225c()).mo56372aa(6540)).mo56386p("Unexpected empty utteranceId");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final void mo74740a() {
        mo74752m(C80965b.f221962a, BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public final void mo74741b(Intent intent) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 31) {
            bundle = ActivityOptions.makeBasic().toBundle();
            bundle.putInt("android.activity.splashScreenStyle", 1);
        } else {
            bundle = null;
        }
        if (this.f221971f.isKeyguardLocked()) {
            IntentLauncherActivity.m128791a(this.f221970e, intent, false, bundle);
        } else {
            this.f221970e.startActivity(intent, bundle);
        }
    }

    /* renamed from: c */
    public final void mo74742c(Intent intent) {
        mo74752m(new C80967d(intent), m128822n(intent));
    }

    /* renamed from: d */
    public final void mo74743d(Intent intent) {
        mo74752m(new C80966c(intent), m128822n(intent));
    }

    /* renamed from: e */
    public final void mo74744e(C80963a aVar) {
        C80964a.m128821a(this.f221968a, aVar);
    }

    /* renamed from: f */
    public final void mo74745f() {
        this.f221972g.set((Object) null);
    }

    /* renamed from: g */
    public final void mo74746g(C74722bz bzVar) {
        synchronized (this.f221969d) {
            C80964a.m128821a(this.f221973h, bzVar);
        }
    }

    /* renamed from: h */
    public final void mo74747h(Consumer consumer) {
        C80963a aVar = (C80963a) this.f221968a.get();
        if (aVar != null) {
            ((C80998r) consumer).accept(aVar);
        } else {
            this.f221972g.set(consumer);
        }
    }

    /* renamed from: i */
    public final void mo74748i(C80963a aVar) {
        this.f221968a.set(aVar);
        Consumer consumer = (Consumer) this.f221972g.getAndSet((Object) null);
        if (consumer != null) {
            consumer.accept(aVar);
        }
        synchronized (this.f221974i) {
            while (!this.f221974i.isEmpty()) {
                ((Consumer) this.f221974i.remove()).accept(aVar);
            }
        }
    }

    /* renamed from: j */
    public final void mo74749j(C80963a aVar) {
        if (this.f221968a.get() == null) {
            mo74748i(aVar);
        }
    }

    /* renamed from: k */
    public final void mo74750k(C74722bz bzVar) {
        synchronized (this.f221969d) {
            this.f221973h.set(bzVar);
        }
    }

    /* renamed from: l */
    public final void mo74751l(Configuration configuration) {
        C80968e eVar = new C80968e(configuration);
        C80963a aVar = (C80963a) this.f221968a.get();
        if (aVar != null) {
            eVar.accept(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo74752m(Consumer consumer, String str) {
        C80963a aVar = (C80963a) this.f221968a.get();
        if (aVar != null) {
            consumer.accept(aVar);
            return;
        }
        synchronized (this.f221974i) {
            this.f221974i.add(consumer);
        }
        C81016b bVar = this.f221975j;
        C81015a aVar2 = new C81015a();
        aVar2.mo74799g(str);
        bVar.mo74800a(aVar2.mo74793a());
    }

    public C80969f(C81016b bVar, Context context, KeyguardManager keyguardManager) {
        this.f221975j = bVar;
        this.f221970e = context;
        this.f221971f = keyguardManager;
    }
}
