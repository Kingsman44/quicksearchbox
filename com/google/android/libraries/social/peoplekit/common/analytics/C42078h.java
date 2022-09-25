package com.google.android.libraries.social.peoplekit.common.analytics;

import android.text.TextUtils;
import com.google.android.libraries.social.p3260a.C41901a;
import com.google.android.libraries.social.p3260a.p3263b.C41903a;
import java.util.Arrays;
import p5602o.p5607c.p5608a.p5609a.C71904c;

/* renamed from: com.google.android.libraries.social.peoplekit.common.analytics.h */
/* compiled from: PG */
public final class C42078h implements C41901a {

    /* renamed from: a */
    public final C41903a f109992a;

    /* renamed from: b */
    public final C71904c f109993b;

    /* renamed from: c */
    public final boolean f109994c;

    /* renamed from: d */
    private final String f109995d;

    public C42078h(String str, C41903a aVar, C71904c cVar, boolean z) {
        this.f109995d = str;
        this.f109992a = aVar;
        this.f109993b = cVar;
        this.f109994c = z;
    }

    /* renamed from: a */
    public final void mo44359a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C42078h) {
            C42078h hVar = (C42078h) obj;
            if (!TextUtils.equals(this.f109995d, hVar.f109995d) || !this.f109992a.equals(hVar.f109992a) || !this.f109993b.equals(hVar.f109993b) || this.f109994c != hVar.f109994c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f109995d, this.f109992a, this.f109993b});
    }
}
