package com.google.android.apps.gsa.staticplugins.p7960g.p7961a;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.assist.p501a.C9316d;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.a.h */
/* compiled from: PG */
public final class C101270h extends C90888av {

    /* renamed from: a */
    public final C9321i f282635a;

    /* renamed from: b */
    public final C9313a f282636b;

    /* renamed from: c */
    public final C9318f f282637c;

    /* renamed from: d */
    public final C68214a f282638d;

    /* renamed from: e */
    public final int f282639e;

    /* renamed from: f */
    private final Bundle f282640f;

    /* renamed from: g */
    private final AssistStructure f282641g;

    /* renamed from: h */
    private final AssistContent f282642h;

    /* renamed from: i */
    private final Context f282643i;

    /* renamed from: j */
    private final C86124t f282644j;

    /* renamed from: k */
    private final Future f282645k;

    /* renamed from: l */
    private final C90931ca f282646l;

    /* renamed from: m */
    private final C22871g f282647m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101270h(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, Context context, C86124t tVar, C9321i iVar, Future future, C9313a aVar, C9318f fVar, C90931ca caVar, int i, C68214a aVar2, C22871g gVar) {
        super("AssistDataBuilder.ProcessTask", 1, 0);
        this.f282640f = bundle;
        this.f282641g = assistStructure;
        this.f282642h = assistContent;
        this.f282643i = context;
        this.f282644j = tVar;
        this.f282635a = iVar;
        this.f282645k = future;
        this.f282636b = aVar;
        this.f282637c = fVar;
        this.f282646l = caVar;
        this.f282639e = i;
        this.f282638d = aVar2;
        this.f282647m = gVar;
    }

    /* renamed from: b */
    public final Object mo92211b(SettableFuture settableFuture, String str) {
        try {
            return C90877ak.m148472f(settableFuture);
        } catch (InterruptedException unused) {
            this.f282636b.mo17503a(14);
            return null;
        } catch (CancellationException unused2) {
            this.f282636b.mo17503a(15);
            return null;
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C101272j.f282651a.mo56226d()).mo56382g(e)).mo56372aa(13838)).mo56389s("ExecutionException when processing %s", str);
            return null;
        }
    }

    public final void run() {
        AtomicBoolean atomicBoolean;
        SettableFuture settableFuture;
        int i;
        SettableFuture settableFuture2 = new SettableFuture();
        SettableFuture settableFuture3 = new SettableFuture();
        SettableFuture settableFuture4 = new SettableFuture();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        C9321i iVar = this.f282635a;
        C9410f fVar = iVar.f32346g;
        C9316d b = iVar.mo17525b(this.f282637c);
        if (b != null) {
            boolean z = fVar == null;
            this.f282646l.mo85142g(C47638k.m84751b(settableFuture2, settableFuture4, settableFuture3).mo51521b(C101267e.f282629a, C60826bg.f164896a), new C101269g(this, settableFuture2, settableFuture3, settableFuture4));
            if (z) {
                AtomicBoolean atomicBoolean4 = new AtomicBoolean(false);
                Bundle bundle = this.f282640f;
                AssistStructure assistStructure = this.f282641g;
                AssistContent assistContent = this.f282642h;
                Context context = this.f282643i;
                C101263a aVar = r1;
                C86124t tVar = this.f282644j;
                AtomicBoolean atomicBoolean5 = atomicBoolean4;
                settableFuture = settableFuture3;
                i = -1;
                C9410f fVar2 = fVar;
                atomicBoolean = atomicBoolean3;
                C101263a aVar2 = new C101263a(settableFuture2, bundle, assistStructure, assistContent, context, tVar, this.f282635a, this.f282636b, b.mo17519g(), atomicBoolean5);
                if (this.f282644j.mo79746e(C90126fx.f251426ib)) {
                    C22871g gVar = this.f282647m;
                    Objects.requireNonNull(aVar);
                    gVar.mo28212l("AssistDataBuilder.ProcessTask#processAppPackage", new C101268f(aVar));
                } else {
                    this.f282646l.mo85139d(aVar);
                }
                int a = b.mo17514a();
                if (a != -1) {
                    this.f282646l.mo85137b(new C101271i("AppPackage", settableFuture2, this.f282636b, atomicBoolean5), (long) a);
                } else {
                    settableFuture2.mo57356n(fVar2);
                }
            } else {
                atomicBoolean = atomicBoolean3;
                settableFuture = settableFuture3;
                i = -1;
            }
            if (b.mo17521i()) {
                this.f282646l.mo85139d(new C101266d(settableFuture4, this.f282645k, atomicBoolean2, this.f282636b, z));
                int d = b.mo17517d();
                if (d != i) {
                    this.f282646l.mo85137b(new C101271i("ScreenshotAvailability", settableFuture4, this.f282636b, atomicBoolean), (long) d);
                }
            } else {
                settableFuture4.mo57356n((Object) null);
            }
            if (b.mo17520h()) {
                C90931ca caVar = this.f282646l;
                caVar.mo85139d(new C101265c(settableFuture, this.f282635a, this.f282645k, this.f282636b, z, atomicBoolean2, caVar, this.f282637c));
                if (b.mo17517d() != i) {
                    this.f282646l.mo85137b(new C101271i("Screenshot", settableFuture, this.f282636b, atomicBoolean2), (long) b.mo17517d());
                    return;
                }
                return;
            }
            settableFuture.mo57356n((Object) null);
        }
    }
}
