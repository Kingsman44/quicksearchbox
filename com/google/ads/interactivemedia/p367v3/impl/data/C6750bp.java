package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.agt;
import com.google.ads.interactivemedia.p367v3.internal.alb;
import com.google.ads.interactivemedia.p367v3.internal.ald;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bp */
/* compiled from: PG */
final class C6750bp extends agt {
    public C6751bq read(alb alb) {
        if (alb.mo14838p() != 9) {
            return new C6751bq(alb.mo14829g());
        }
        alb.mo14831i();
        return null;
    }

    public void write(ald ald, C6751bq bqVar) {
        if (bqVar == null) {
            ald.mo14851g();
        } else {
            ald.mo14855k(bqVar.getName());
        }
    }
}
