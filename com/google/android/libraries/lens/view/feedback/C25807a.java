package com.google.android.libraries.lens.view.feedback;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.p2014e.C24226r;

/* renamed from: com.google.android.libraries.lens.view.feedback.a */
/* compiled from: PG */
public final class C25807a extends C25827q {

    /* renamed from: a */
    private final Bitmap f70118a;

    /* renamed from: b */
    private final C24226r f70119b;

    public C25807a(Bitmap bitmap, C24226r rVar) {
        if (bitmap != null) {
            this.f70118a = bitmap;
            if (rVar != null) {
                this.f70119b = rVar;
                return;
            }
            throw new NullPointerException("Null source");
        }
        throw new NullPointerException("Null bitmap");
    }

    /* renamed from: a */
    public final Bitmap mo30948a() {
        return this.f70118a;
    }

    /* renamed from: b */
    public final C24226r mo30949b() {
        return this.f70119b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25827q) {
            C25827q qVar = (C25827q) obj;
            return this.f70118a.equals(qVar.mo30948a()) && this.f70119b.equals(qVar.mo30949b());
        }
    }

    public final int hashCode() {
        return ((this.f70118a.hashCode() ^ 1000003) * 1000003) ^ this.f70119b.hashCode();
    }

    public final String toString() {
        String obj = this.f70118a.toString();
        String obj2 = this.f70119b.toString();
        return "FeedbackImage{bitmap=" + obj + ", source=" + obj2 + "}";
    }
}
