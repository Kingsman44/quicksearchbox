package com.google.android.libraries.componentview.components.p1682a;

import com.google.android.libraries.componentview.components.base.C20069c;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19766k;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19767l;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.componentview.components.a.af */
/* compiled from: PG */
public class C19787af extends C20483n {

    /* renamed from: a */
    public final C20601ca f55280a;

    /* renamed from: b */
    public final C20537f f55281b;

    /* renamed from: c */
    public C19767l f55282c;

    /* renamed from: d */
    public C20069c f55283d;

    public C19787af(C56425d dVar, C20601ca caVar, C20537f fVar) {
        super(dVar);
        this.f55280a = caVar;
        this.f55281b = fVar;
    }

    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19766k kVar = (C19766k) this.f55282c.toBuilder();
            kVar.copyOnWrite();
            C19767l lVar = (C19767l) kVar.instance;
            lVar.f55229i = dVar;
            lVar.f55221a |= 128;
            this.f55282c = (C19767l) kVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19767l.f55219k, this.f55282c);
        return (C56425d) cVar.build();
    }

    /* renamed from: kx */
    public final void mo25108kx() {
        String str;
        try {
            long currentTimeMillis = System.currentTimeMillis() - Long.parseLong(this.f55282c.f55222b);
            if (currentTimeMillis < Long.parseLong(this.f55282c.f55224d)) {
                this.f55283d.mo25244m(this.f55282c.f55223c);
                return;
            }
            C19767l lVar = this.f55282c;
            StringBuilder sb = new StringBuilder();
            long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis);
            if (days > 0) {
                sb.append(days);
                sb.append(lVar.f55226f);
                str = sb.toString();
            } else {
                long hours = TimeUnit.MILLISECONDS.toHours(currentTimeMillis);
                if (hours > 0) {
                    sb.append(hours);
                    sb.append(lVar.f55227g);
                    str = sb.toString();
                } else {
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis);
                    if (minutes > 0) {
                        sb.append(minutes);
                        sb.append(lVar.f55228h);
                    }
                    str = sb.toString();
                }
            }
            this.f55283d.mo25244m(String.format(this.f55282c.f55225e, new Object[]{str}));
        } catch (NumberFormatException unused) {
            C20598by G = mo25418G();
            G.mo25535e(C19742a.COMPONENT_INFLATION_FAILURE);
            G.mo25536f("Illegal arguments: |starting_time_millis| and |initial_freshness_period_millis| must both be serialized long numbers.");
            C19767l lVar2 = this.f55282c;
            String str2 = lVar2.f55222b;
            String str3 = lVar2.f55224d;
            G.mo25534d("FreshnessLabelComponent with starting_time_millis: " + str2 + " and initial_freshness_period_millis: " + str3);
            C20520h.m38498c("FreshnessLabelComponent", G.mo25531a(), this.f55280a, new Object[0]);
        }
    }
}
