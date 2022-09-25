package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7483a;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.a.c */
/* compiled from: PG */
public abstract class C95173c {

    /* renamed from: a */
    public static final C59071e f266276a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.b.a.c");

    /* renamed from: b */
    public static final long f266277b = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: c */
    public final String f266278c;

    /* renamed from: d */
    public final Object f266279d = new Object();

    /* renamed from: e */
    public final C60888db f266280e;

    /* renamed from: f */
    public final C89656k f266281f;

    /* renamed from: g */
    public TextToSpeech f266282g;

    /* renamed from: h */
    public boolean f266283h;

    /* renamed from: i */
    public long f266284i = 3;

    /* renamed from: j */
    private int f266285j;

    public C95173c(String str, C60888db dbVar, C89656k kVar) {
        this.f266278c = str;
        this.f266280e = dbVar;
        this.f266281f = kVar;
    }

    /* renamed from: a */
    public final TextToSpeech mo89080a() {
        TextToSpeech textToSpeech;
        synchronized (this.f266279d) {
            textToSpeech = this.f266282g;
        }
        return textToSpeech;
    }

    /* renamed from: b */
    public final String mo89081b() {
        String str;
        synchronized (this.f266279d) {
            str = this.f266278c + this.f266285j;
        }
        return str;
    }

    /* renamed from: c */
    public final String mo89082c() {
        String b;
        synchronized (this.f266279d) {
            this.f266285j++;
            b = mo89081b();
        }
        return b;
    }

    /* renamed from: e */
    public abstract void mo89084e(Context context);

    /* renamed from: d */
    public final void mo89083d(Context context) {
        synchronized (this.f266279d) {
            if (this.f266282g != null) {
                C89655j.m145957a("Already initialized!");
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            this.f266282g = new TextToSpeech(context.getApplicationContext(), new C95171a(this, context), "com.google.android.tts");
        }
    }
}
