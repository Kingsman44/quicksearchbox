package com.google.android.libraries.search.assistant.notification.data;

import android.net.Uri;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.c */
/* compiled from: PG */
public final class C34882c extends C34898s {

    /* renamed from: a */
    public String f92536a;

    /* renamed from: b */
    public String f92537b;

    /* renamed from: c */
    public final Optional f92538c = Optional.empty();

    /* renamed from: d */
    public Optional f92539d = Optional.empty();

    /* renamed from: e */
    public Optional f92540e = Optional.empty();

    /* renamed from: f */
    public boolean f92541f;

    /* renamed from: g */
    public String f92542g;

    /* renamed from: h */
    public Optional f92543h = Optional.empty();

    /* renamed from: i */
    public final Optional f92544i = Optional.empty();

    /* renamed from: j */
    public Optional f92545j = Optional.empty();

    /* renamed from: k */
    public CharSequence f92546k;

    /* renamed from: l */
    public byte f92547l;

    /* renamed from: c */
    public final /* synthetic */ void mo39591c(Uri uri) {
        this.f92540e = Optional.m71637of(uri);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo39593e(Long l) {
        this.f92543h = Optional.m71637of(l);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo39595g(String str) {
        this.f92536a = str;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo39596h(String str) {
        this.f92539d = Optional.m71637of(str);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo39597i(boolean z) {
        this.f92541f = z;
        this.f92547l = 1;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo39598j(String str) {
        if (str != null) {
            this.f92542g = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo39599k(String str) {
        if (str != null) {
            this.f92537b = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }
}
