package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import androidx.p104d.p105a.C2169h;
import com.google.android.gms.wearable.C146409d;
import com.google.android.gms.wearable.C146531n;
import com.google.android.gms.wearable.C146536s;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.nh */
/* compiled from: PG */
public final class C96428nh implements C96410mq {

    /* renamed from: a */
    public static final C59071e f269754a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.nh");

    /* renamed from: b */
    final C146531n f269755b;

    /* renamed from: c */
    final C146409d f269756c;

    public C96428nh(Context context) {
        this.f269755b = C146536s.m238540c(context);
        this.f269756c = C146536s.m238538a(context);
    }

    /* renamed from: a */
    public final C60870cx mo90111a(C96201ex exVar) {
        return C2169h.m6027a(new C96421na(this, exVar));
    }

    /* renamed from: b */
    public final C60870cx mo90112b(C96201ex exVar) {
        return C2169h.m6027a(new C96419mz(this, exVar));
    }

    /* renamed from: c */
    public final C60870cx mo90113c(String str, int i) {
        return C2169h.m6027a(new C96416mw(this, i, str));
    }

    /* renamed from: d */
    public final C60870cx mo90114d(String str, byte[] bArr) {
        return C2169h.m6027a(new C96426nf(this, str, bArr));
    }

    /* renamed from: e */
    public final C60870cx mo90115e(String str, byte[] bArr, Duration duration) {
        return C2169h.m6027a(new C96417mx(this, str, bArr, duration));
    }
}
