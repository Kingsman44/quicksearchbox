package com.google.android.apps.gsa.staticplugins.p7960g.p7961a;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.databinding.C0118a;
import android.os.Bundle;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.a.a */
/* compiled from: PG */
final class C101263a extends C90888av {

    /* renamed from: a */
    private final SettableFuture f282599a;

    /* renamed from: b */
    private final Bundle f282600b;

    /* renamed from: c */
    private final AssistStructure f282601c;

    /* renamed from: d */
    private final AssistContent f282602d;

    /* renamed from: e */
    private final Context f282603e;

    /* renamed from: f */
    private final C86124t f282604f;

    /* renamed from: g */
    private final C9321i f282605g;

    /* renamed from: h */
    private final C9313a f282606h;

    /* renamed from: i */
    private final boolean f282607i;

    /* renamed from: j */
    private final AtomicBoolean f282608j;

    public C101263a(SettableFuture settableFuture, Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, Context context, C86124t tVar, C9321i iVar, C9313a aVar, boolean z, AtomicBoolean atomicBoolean) {
        super("AssistDataBuilder.ProcessAppPackage", 1, 0);
        this.f282599a = settableFuture;
        this.f282600b = bundle;
        this.f282601c = assistStructure;
        this.f282602d = assistContent;
        this.f282603e = context;
        this.f282604f = tVar;
        this.f282605g = iVar;
        this.f282606h = aVar;
        this.f282607i = z;
        this.f282608j = atomicBoolean;
    }

    public final void run() {
        try {
            C9410f b = C101272j.m167533b(this.f282600b, this.f282601c, this.f282602d, this.f282603e, this.f282604f, this.f282605g, this.f282607i, this.f282606h);
            if (this.f282608j.compareAndSet(false, true)) {
                this.f282599a.mo57356n(b);
            }
        } catch (IllegalStateException e) {
            C0118a.m116x(C101272j.f282651a.mo56225c(), "processAppPackage failed", 13826, e, C38505d.f101864b, 191576088);
            if (this.f282608j.compareAndSet(false, true)) {
                this.f282599a.mo57357o(e);
            }
        }
    }
}
