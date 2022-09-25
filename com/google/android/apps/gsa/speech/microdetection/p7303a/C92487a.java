package com.google.android.apps.gsa.speech.microdetection.p7303a;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.a */
/* compiled from: PG */
public final class C92487a {

    /* renamed from: a */
    public static final C92487a f258105a = new C92487a((String) null, 0, false, C90584f.UNKNOWN);

    /* renamed from: b */
    public static final C92487a f258106b = new C92487a((String) null, 1, false, C90584f.UNKNOWN);

    /* renamed from: c */
    public final int f258107c;

    /* renamed from: d */
    public final String f258108d;

    /* renamed from: e */
    private final boolean f258109e;

    /* renamed from: f */
    private final C90584f f258110f;

    public C92487a(String str, int i, boolean z, C90584f fVar) {
        C90584f fVar2 = C90584f.UNKNOWN;
        this.f258108d = str;
        this.f258107c = i;
        this.f258109e = z;
        this.f258110f = fVar;
    }

    /* renamed from: a */
    public final boolean mo87253a() {
        return this == f258106b;
    }

    /* renamed from: b */
    public final boolean mo87254b() {
        return this.f258107c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C92487a) {
            C92487a aVar = (C92487a) obj;
            if (this.f258107c == aVar.f258107c && TextUtils.equals(this.f258108d, aVar.f258108d) && this.f258110f == aVar.f258110f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f258108d;
        return (str == null ? 0 : str.hashCode()) + this.f258107c;
    }

    public final String toString() {
        return "HotwordModelInfo[prompt: " + this.f258108d + ", state: " + this.f258107c + ", speaker-id supported: " + this.f258109e + ", modelType: " + this.f258110f + "]";
    }
}
