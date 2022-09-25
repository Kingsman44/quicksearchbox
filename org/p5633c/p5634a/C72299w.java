package org.p5633c.p5634a;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import org.p5633c.p5634a.p5635a.C72140h;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5637c.C72195d;
import org.p5633c.p5634a.p5637c.C72202k;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: org.c.a.w */
/* compiled from: PG */
public final class C72299w extends C72140h implements Serializable, C72151ai {
    private static final long serialVersionUID = -268716875315837168L;

    /* renamed from: a */
    public final long f192455a;

    /* renamed from: b */
    public final C72132a f192456b;

    public C72299w() {
        Map map = C72285i.f192411a;
        throw null;
    }

    private Object readResolve() {
        if (this.f192456b == null) {
            return new C72299w(this.f192455a, C72156ab.f192017E);
        }
        return !C72288l.f192416b.equals(this.f192456b.mo63325C()) ? new C72299w(this.f192455a, this.f192456b.mo63347d()) : this;
    }

    /* renamed from: a */
    public final int mo63391a(C72151ai aiVar) {
        if (this == aiVar) {
            return 0;
        }
        if (aiVar instanceof C72299w) {
            C72299w wVar = (C72299w) aiVar;
            if (this.f192456b.equals(wVar.f192456b)) {
                long j = this.f192455a;
                long j2 = wVar.f192455a;
                if (j < j2) {
                    return -1;
                }
                if (j != j2) {
                    return 1;
                }
                return 0;
            }
        }
        return super.compareTo(aiVar);
    }

    /* renamed from: b */
    public final int mo63392b(C72283g gVar) {
        if (gVar != null) {
            return gVar.mo63646a(this.f192456b).mo63444a(this.f192455a);
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((C72151ai) obj);
    }

    /* renamed from: d */
    public final int mo63682d() {
        return this.f192456b.mo63352i().mo63444a(this.f192455a);
    }

    /* renamed from: e */
    public final int mo63438e() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72299w) {
            C72299w wVar = (C72299w) obj;
            if (this.f192456b.equals(wVar.f192456b)) {
                if (this.f192455a == wVar.f192455a) {
                    return true;
                }
                return false;
            }
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C72132a mo63439f() {
        return this.f192456b;
    }

    /* renamed from: g */
    public final int mo63683g() {
        return this.f192456b.mo63357n().mo63444a(this.f192455a);
    }

    /* renamed from: h */
    public final C72233e mo63395h(int i, C72132a aVar) {
        if (i == 0) {
            return aVar.mo63370z();
        }
        if (i == 1) {
            return aVar.mo63363t();
        }
        if (i == 2) {
            return aVar.mo63352i();
        }
        if (i == 3) {
            return aVar.mo63359p();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    /* renamed from: i */
    public final boolean mo63397i(C72283g gVar) {
        return gVar.mo63646a(this.f192456b).mo63558E();
    }

    /* renamed from: j */
    public final int mo63684j() {
        return this.f192456b.mo63360q().mo63444a(this.f192455a);
    }

    /* renamed from: k */
    public final int mo63685k() {
        return this.f192456b.mo63362s().mo63444a(this.f192455a);
    }

    /* renamed from: l */
    public final int mo63686l() {
        return this.f192456b.mo63363t().mo63444a(this.f192455a);
    }

    /* renamed from: m */
    public final int mo63687m() {
        return this.f192456b.mo63366v().mo63444a(this.f192455a);
    }

    /* renamed from: n */
    public final int mo63688n() {
        return this.f192456b.mo63370z().mo63444a(this.f192455a);
    }

    /* renamed from: o */
    public final Date mo63689o() {
        Date date = new Date(mo63688n() - 1900, mo63686l() - 1, mo63682d(), mo63683g(), mo63685k(), mo63687m());
        date.setTime(date.getTime() + ((long) mo63684j()));
        TimeZone timeZone = TimeZone.getDefault();
        Calendar instance = Calendar.getInstance(timeZone);
        instance.setTime(date);
        C72299w p = m106840p(instance);
        if (p.mo63401t(this)) {
            while (p.mo63401t(this)) {
                instance.setTimeInMillis(instance.getTimeInMillis() + 60000);
                p = m106840p(instance);
            }
            while (!p.mo63401t(this)) {
                instance.setTimeInMillis(instance.getTimeInMillis() - 1000);
                p = m106840p(instance);
            }
            instance.setTimeInMillis(instance.getTimeInMillis() + 1000);
        } else if (p.equals(this)) {
            Calendar instance2 = Calendar.getInstance(timeZone);
            instance2.setTimeInMillis(instance.getTimeInMillis() - ((long) timeZone.getDSTSavings()));
            if (m106840p(instance2).equals(this)) {
                instance = instance2;
            }
        }
        return instance.getTime();
    }

    public final String toString() {
        return C72267x.f192324e.mo63597c(this);
    }

    /* renamed from: p */
    public static C72299w m106840p(Calendar calendar) {
        if (calendar != null) {
            int i = calendar.get(0);
            int i2 = calendar.get(1);
            if (i != 1) {
                i2 = 1 - i2;
            }
            return new C72299w(i2, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14), C72156ab.f192017E);
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public C72299w(int i, int i2, int i3, int i4, int i5, int i6, int i7, C72132a aVar) {
        C72132a d = C72285i.m106775c(aVar).mo63347d();
        long c = d.mo63346c(i, i2, i3, i4, i5, i6, i7);
        this.f192456b = d;
        this.f192455a = c;
    }

    /* renamed from: c */
    public final int mo63437c(int i) {
        if (i == 0) {
            return this.f192456b.mo63370z().mo63444a(this.f192455a);
        }
        if (i == 1) {
            return this.f192456b.mo63363t().mo63444a(this.f192455a);
        }
        if (i == 2) {
            return this.f192456b.mo63352i().mo63444a(this.f192455a);
        }
        if (i == 3) {
            return this.f192456b.mo63359p().mo63444a(this.f192455a);
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public C72299w(long j, C72132a aVar) {
        C72132a c = C72285i.m106775c(aVar);
        this.f192455a = c.mo63325C().mo63664k(C72288l.f192416b, j);
        this.f192456b = c.mo63347d();
    }

    public C72299w(Object obj) {
        C72202k b = C72195d.m106217a().mo63537b(obj);
        C72132a c = C72285i.m106775c(b.mo63534f(obj));
        C72132a d = c.mo63347d();
        this.f192456b = d;
        int[] e = b.mo63542e(this, obj, c, C72267x.f192328i);
        this.f192455a = d.mo63345b(e[0], e[1], e[2], e[3]);
    }
}
