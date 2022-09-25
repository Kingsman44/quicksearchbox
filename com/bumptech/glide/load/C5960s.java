package com.bumptech.glide.load;

import androidx.p060c.C0977g;
import com.bumptech.glide.p291h.C5617d;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.s */
/* compiled from: PG */
public final class C5960s implements C5955n {

    /* renamed from: b */
    public final C0977g f17620b = new C5617d();

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0977g gVar = this.f17620b;
            if (i < gVar.f3122d) {
                C5959r rVar = (C5959r) gVar.mo3702e(i);
                Object h = this.f17620b.mo3708h(i);
                C5958q qVar = rVar.f17617b;
                if (rVar.f17619d == null) {
                    rVar.f17619d = rVar.f17618c.getBytes(C5955n.f17613a);
                }
                qVar.mo12320a(rVar.f17619d, h, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final Object mo12401b(C5959r rVar) {
        return this.f17620b.containsKey(rVar) ? this.f17620b.get(rVar) : rVar.f17616a;
    }

    /* renamed from: c */
    public final void mo12402c(C5960s sVar) {
        this.f17620b.mo3712j(sVar.f17620b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5960s) {
            return this.f17620b.equals(((C5960s) obj).f17620b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17620b.hashCode();
    }

    public final String toString() {
        String obj = this.f17620b.toString();
        return "Options{values=" + obj + "}";
    }
}
