package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.p293a.C5679av;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.bumptech.glide.load.o */
/* compiled from: PG */
public final class C5956o implements C5964w {

    /* renamed from: b */
    private final Collection f17614b;

    public C5956o(Collection collection) {
        if (!collection.isEmpty()) {
            this.f17614b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        for (C5964w a : this.f17614b) {
            a.mo12041a(messageDigest);
        }
    }

    /* renamed from: b */
    public final C5679av mo12295b(Context context, C5679av avVar, int i, int i2) {
        C5679av avVar2 = avVar;
        for (C5964w b : this.f17614b) {
            C5679av b2 = b.mo12295b(context, avVar2, i, i2);
            if (avVar2 != null && !avVar2.equals(avVar) && !avVar2.equals(b2)) {
                avVar2.mo12162e();
            }
            avVar2 = b2;
        }
        return avVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5956o) {
            return this.f17614b.equals(((C5956o) obj).f17614b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17614b.hashCode();
    }

    @SafeVarargs
    public C5956o(C5964w... wVarArr) {
        this.f17614b = Arrays.asList(wVarArr);
    }
}
