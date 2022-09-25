package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8391b;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.p6491a.C84347af;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14186b;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14170k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Optional;

@Deprecated
/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b.c */
/* compiled from: PG */
public final class C109616c implements C14186b {

    /* renamed from: d */
    private static final C59071e f305262d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b.c");

    /* renamed from: a */
    public final AtomicLong f305263a = new AtomicLong();

    /* renamed from: b */
    public final LongSparseArray f305264b = new LongSparseArray();

    /* renamed from: c */
    public Optional f305265c;

    /* renamed from: e */
    private final C84347af f305266e;

    public C109616c(C84347af afVar) {
        this.f305266e = afVar;
        this.f305265c = Optional.empty();
    }

    /* renamed from: a */
    public final C14187c mo21509a(long j) {
        return (C14187c) this.f305264b.get(j);
    }

    /* renamed from: b */
    public final void mo97914b(BundledMessageNotification bundledMessageNotification, NotificationWrapper notificationWrapper) {
        C59104x d = f305262d.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MessageStore");
        ((C59052c) ((C59052c) d).mo56372aa(24959)).mo56386p("#processMorrisMessageNotification()");
        if (!this.f305265c.isEmpty()) {
            long andIncrement = this.f305263a.getAndIncrement();
            this.f305264b.put(andIncrement, new C109618e(andIncrement, bundledMessageNotification, notificationWrapper, this.f305266e));
            ((C14170k) this.f305265c.get()).mo21507a(Long.valueOf(andIncrement));
        }
    }

    /* renamed from: c */
    public final void mo21510c(long j) {
        this.f305264b.remove(j);
    }

    /* renamed from: d */
    public final void mo21511d() {
        this.f305265c = Optional.empty();
    }

    /* renamed from: e */
    public final void mo21512e(C14170k kVar) {
        this.f305265c = Optional.m71637of(kVar);
    }
}
