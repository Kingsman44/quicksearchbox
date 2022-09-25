package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.C19244ag;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.p1611f.p1612a.C19321a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5218j.C67175t;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.soda.f.i */
/* compiled from: PG */
final class C19329i {

    /* renamed from: a */
    public static final C59071e f54086a = C59071e.m91332i("com.google.android.libraries.assistant.soda.f.i");

    /* renamed from: b */
    public static final ByteBuffer f54087b = ByteBuffer.allocateDirect(0);

    /* renamed from: c */
    public final Executor f54088c;

    /* renamed from: d */
    public final C19321a f54089d = new C19321a();

    /* renamed from: e */
    public Soda f54090e = null;

    /* renamed from: f */
    public boolean f54091f = false;

    /* renamed from: g */
    public long f54092g = 0;

    /* renamed from: h */
    public C67175t f54093h;

    /* renamed from: i */
    public final C19244ag f54094i = new C19244ag();

    /* renamed from: j */
    public final C19244ag f54095j = new C19244ag();

    public C19329i(C60887da daVar) {
        this.f54088c = new C60904dr(daVar);
    }

    /* renamed from: a */
    public final void mo24465a() {
        C19328h hVar = new C19328h(this);
        C60856cj.m92903l(C47810es.m84977q(hVar), this.f54088c);
    }
}
