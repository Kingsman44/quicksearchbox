package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.ondevice.p2025e.C24434a;
import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4563i.C59880ap;
import com.google.common.p4552o.p4563i.C59887aw;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59943cy;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.af.b */
/* compiled from: PG */
public final class C25055b implements C25083m {

    /* renamed from: a */
    private final C24434a f68292a;

    /* renamed from: b */
    private C58833ax f68293b = C58836b.f156633a;

    /* renamed from: c */
    private boolean f68294c = true;

    public C25055b(C24434a aVar) {
        this.f68292a = aVar;
    }

    /* renamed from: e */
    private final void m46352e() {
        this.f68293b = C24435b.m45508a(C58833ax.m90834k(this.f68292a));
    }

    /* renamed from: a */
    public final void mo30242a() {
        if (this.f68294c) {
            this.f68294c = false;
        } else {
            this.f68293b = C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public final void mo30243b(Long l, Long l2) {
        if (this.f68292a.mo29875b()) {
            if (!this.f68293b.mo56113h()) {
                m46352e();
            }
            C24434a j = ((C24434a) this.f68293b.mo56107c()).mo29874a().mo29883j();
            double longValue = (double) (l2.longValue() - l.longValue());
            Double.isNaN(longValue);
            Double valueOf = Double.valueOf(longValue / 1000000.0d);
            C24434a j2 = j.mo29874a().mo29883j();
            String.format(Locale.ENGLISH, "%.2f", new Object[]{valueOf});
            j2.mo29880g();
            C24434a j3 = j.mo29874a().mo29883j();
            Locale locale = Locale.ENGLISH;
            double longValue2 = (double) l2.longValue();
            Double.isNaN(longValue2);
            String.format(locale, "%.2f", new Object[]{Double.valueOf(longValue2 / 1000000.0d)});
            j3.mo29880g();
        }
    }

    /* renamed from: c */
    public final void mo30244c(Long l, Long l2, C59898bg bgVar) {
        if (this.f68292a.mo29875b()) {
            if (!this.f68293b.mo56113h()) {
                m46352e();
            }
            C24434a j = ((C24434a) this.f68293b.mo56107c()).mo29874a().mo29883j();
            C59880ap apVar = bgVar.f161888t;
            if (apVar == null) {
                apVar = C59880ap.f161815c;
            }
            Long valueOf = Long.valueOf(Duration.ofNanos(l2.longValue() - l.longValue()).toMillis());
            C24434a d = j.mo29877d();
            String.format(Locale.ENGLISH, "%d", new Object[]{valueOf});
            d.mo29880g();
            if ((apVar.f161817a & 1) != 0) {
                C62910ar arVar = apVar.f161818b;
                if (arVar == null) {
                    arVar = C62910ar.f169858c;
                }
                Duration d2 = C62950b.m95473d(arVar);
                C24434a d3 = j.mo29877d();
                String.format(Locale.ENGLISH, "%d", new Object[]{Long.valueOf(d2.toMillis())});
                d3.mo29880g();
            }
            C24434a j2 = j.mo29874a().mo29883j();
            String.format(Locale.ENGLISH, "%d", new Object[]{Long.valueOf(Duration.ofNanos(l2.longValue()).toMillis())});
            j2.mo29880g();
        }
    }

    /* renamed from: d */
    public final void mo30245d(Long l, Long l2, C59898bg bgVar) {
        if (this.f68292a.mo29875b()) {
            if (!this.f68293b.mo56113h()) {
                m46352e();
            }
            C24434a j = ((C24434a) this.f68293b.mo56107c()).mo29874a().mo29883j();
            C59943cy cyVar = bgVar.f161881m;
            if (cyVar == null) {
                cyVar = C59943cy.f162002g;
            }
            C59887aw awVar = bgVar.f161883o;
            if (awVar == null) {
                awVar = C59887aw.f161829g;
            }
            C24434a a = j.mo29874a();
            double longValue = (double) (l2.longValue() - l.longValue());
            Double.isNaN(longValue);
            Double valueOf = Double.valueOf(longValue / 1000000.0d);
            C24434a j2 = a.mo29883j();
            String.format(Locale.ENGLISH, "%.2f", new Object[]{valueOf});
            j2.mo29880g();
            if ((awVar.f161831a & 16) != 0) {
                C24434a j3 = a.mo29874a().mo29883j();
                String.format(Locale.ENGLISH, "%d", new Object[]{Long.valueOf(awVar.f161835e)});
                j3.mo29880g();
            }
            for (Map.Entry entry : Collections.unmodifiableMap(cyVar.f162009f).entrySet()) {
                C24434a a2 = a.mo29874a();
                String str = (String) entry.getKey();
                a2.mo29883j();
                String.format(Locale.ENGLISH, "%.2f", new Object[]{entry.getValue()});
                a2.mo29880g();
            }
            C24434a j4 = j.mo29874a().mo29883j();
            Locale locale = Locale.ENGLISH;
            double longValue2 = (double) l2.longValue();
            Double.isNaN(longValue2);
            String.format(locale, "%.2f", new Object[]{Double.valueOf(longValue2 / 1000000.0d)});
            j4.mo29880g();
            C24434a a3 = j.mo29874a();
            int i = cyVar.f162005b;
            int i2 = cyVar.f162006c;
            int i3 = cyVar.f162007d;
            a3.mo29883j();
            String.format(Locale.ENGLISH, "Words : %d <br> Lines : %d <br> Paragraphs : %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3)});
            a3.mo29880g();
        }
    }
}
