package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.CountDownTimer;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bq */
/* compiled from: PG */
final class C132188bq extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ TextView f360807a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f360808b;

    /* renamed from: c */
    final /* synthetic */ C132189br f360809c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C132188bq(C132189br brVar, TextView textView, ArrayList arrayList) {
        super(60000, 5000);
        this.f360809c = brVar;
        this.f360807a = textView;
        this.f360808b = arrayList;
    }

    public final void onFinish() {
        this.f360809c.mo110529a();
    }

    public final void onTick(long j) {
        this.f360807a.setText((CharSequence) this.f360808b.get(this.f360809c.f360812c));
        C132189br brVar = this.f360809c;
        int i = brVar.f360812c + 1;
        brVar.f360812c = i;
        if (i == this.f360808b.size()) {
            this.f360809c.f360812c = 0;
        }
    }
}
