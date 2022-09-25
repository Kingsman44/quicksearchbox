package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.ak */
/* compiled from: PG */
final class C93263ak extends BroadcastReceiver {

    /* renamed from: a */
    public final SettableFuture f260039a;

    /* renamed from: b */
    private final C93269aq f260040b;

    /* renamed from: c */
    private final AtomicInteger f260041c;

    /* renamed from: d */
    private final C93260ah f260042d;

    public C93263ak(C93269aq aqVar, SettableFuture settableFuture, int i, C93260ah ahVar) {
        this.f260040b = aqVar;
        this.f260039a = settableFuture;
        this.f260042d = ahVar;
        this.f260041c = new AtomicInteger(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87592a(int i) {
        this.f260039a.mo57356n(C87421i.m141588a(i));
        C93260ah ahVar = this.f260042d;
        ahVar.f260034c.mo87596d(ahVar.f260032a, 5);
        ahVar.f260033b.mo87591b();
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.voicesearch.action.SMS_STATUS".equals(intent.getAction())) {
            int resultCode = getResultCode();
            if (resultCode == 0) {
                mo87592a(23);
            } else if (resultCode != -1) {
                mo87592a(24);
            } else {
                int decrementAndGet = this.f260041c.decrementAndGet();
                this.f260040b.mo87598a();
                if (decrementAndGet <= 0) {
                    this.f260039a.mo57356n(C87421i.f236079a);
                    C93260ah ahVar = this.f260042d;
                    ahVar.f260034c.mo87596d(ahVar.f260032a, 2);
                    ahVar.f260033b.mo87591b();
                }
            }
        }
    }
}
