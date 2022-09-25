package com.google.android.libraries.social.peoplekit.common.analytics;

import android.text.TextUtils;
import com.google.android.libraries.social.p3260a.C41901a;
import java.util.Arrays;
import p5602o.p5607c.p5608a.p5609a.C71904c;
import p5602o.p5607c.p5608a.p5609a.C71913l;

/* renamed from: com.google.android.libraries.social.peoplekit.common.analytics.g */
/* compiled from: PG */
public final class C42077g implements C41901a {

    /* renamed from: a */
    public final C71913l f109989a;

    /* renamed from: b */
    public final C71904c f109990b;

    /* renamed from: c */
    private final String f109991c;

    public C42077g(String str, C71913l lVar, C71904c cVar) {
        this.f109991c = str;
        this.f109989a = lVar;
        this.f109990b = cVar;
    }

    /* renamed from: a */
    public final void mo44359a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C42077g) {
            C42077g gVar = (C42077g) obj;
            if (!TextUtils.equals(this.f109991c, gVar.f109991c) || !this.f109989a.equals(gVar.f109989a) || !this.f109990b.equals(gVar.f109990b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f109991c, this.f109989a, this.f109990b});
    }
}
