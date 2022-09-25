package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40218a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.BubbleView;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.c */
/* compiled from: PG */
public final class C40192c extends Dialog {

    /* renamed from: a */
    public C40193d f105590a;

    /* renamed from: b */
    public BubbleView f105591b;

    /* renamed from: c */
    private final AccountId f105592c;

    /* renamed from: d */
    private final C40206q f105593d;

    /* renamed from: e */
    private final int f105594e;

    /* renamed from: f */
    private final int f105595f;

    /* renamed from: g */
    private final C40191b f105596g;

    /* renamed from: h */
    private final C40218a f105597h;

    public C40192c(Context context, AccountId accountId, C40206q qVar, int i, int i2, C40191b bVar, C40218a aVar) {
        super(context, 2132150898);
        this.f105592c = accountId;
        this.f105593d = qVar;
        this.f105594e = i;
        this.f105595f = i2;
        this.f105596g = bVar;
        this.f105597h = aVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCancelable(false);
        BubbleView a = this.f105596g.mo42304a();
        this.f105591b = a;
        a.setLayoutDirection(this.f105594e);
        Window window = getWindow();
        window.getClass();
        BubbleView bubbleView = this.f105591b;
        C40206q qVar = this.f105593d;
        int i = this.f105595f;
        AccountId accountId = this.f105592c;
        C40218a aVar = this.f105597h;
        C40193d dVar = new C40193d();
        dVar.mo51130t(window, bubbleView, bubbleView.getContext());
        dVar.f105600c = bubbleView;
        dVar.f105601d = i;
        dVar.f105602e = qVar;
        dVar.f105604g = aVar;
        dVar.f105603f = accountId;
        this.f105590a = dVar;
        dVar.mo19987jP(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f105590a.mo51128g();
        this.f105590a.mo51127f();
    }

    public final void onStop() {
        C40193d dVar = this.f105590a;
        dVar.getClass();
        dVar.mo51126e();
        this.f105590a.mo22016h();
        this.f105590a.mo51129jQ();
        super.onStop();
    }
}
