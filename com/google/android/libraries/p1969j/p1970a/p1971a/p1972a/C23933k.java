package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.libraries.p1969j.p1970a.p1974b.C23964n;

/* renamed from: com.google.android.libraries.j.a.a.a.k */
/* compiled from: PG */
public final class C23933k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f65431a;

    /* renamed from: b */
    final /* synthetic */ String f65432b;

    /* renamed from: c */
    final /* synthetic */ C23939q f65433c;

    public C23933k(C23939q qVar, View.OnClickListener onClickListener, String str) {
        this.f65433c = qVar;
        this.f65431a = onClickListener;
        this.f65432b = str;
    }

    public final void onClick(View view) {
        ((C23964n) this.f65431a).f65523a.mo29377n();
        this.f65433c.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f65432b)));
    }
}
