package com.google.android.apps.gsa.speech.hotword.p7285c.p7286a;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.a.c */
/* compiled from: PG */
final class C92358c extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ Context f257497a;

    /* renamed from: b */
    final /* synthetic */ String f257498b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92358c(Context context, String str) {
        super("Show toast");
        this.f257497a = context;
        this.f257498b = str;
    }

    public final void run() {
        Toast.makeText(this.f257497a, this.f257498b, 0).show();
    }
}
