package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58832aw;
import java.util.List;

/* compiled from: PG */
public abstract class TwoStepDisambiguation extends Disambiguation {

    /* renamed from: n */
    public List f236411n;

    /* renamed from: o */
    public Parcelable f236412o;

    /* renamed from: p */
    public Parcelable f236413p;

    public TwoStepDisambiguation(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f236411n = parcel.readArrayList(classLoader);
        this.f236412o = parcel.readParcelable(classLoader);
    }

    /* renamed from: A */
    public final boolean mo81605A() {
        return this.f236413p != null;
    }

    /* renamed from: B */
    public final boolean mo81606B() {
        List list = this.f236411n;
        return list != null && list.size() > 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = r2.f236411n;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo81607C() {
        /*
            r2 = this;
            boolean r0 = r2.mo81544m()
            r1 = 0
            if (r0 == 0) goto L_0x001e
            android.os.Parcelable r0 = r2.f236364c
            r0.getClass()
            boolean r0 = r2.mo81582u(r0)
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r2.f236411n
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001e
            r0 = 1
            return r0
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.contact.TwoStepDisambiguation.mo81607C():boolean");
    }

    /* renamed from: D */
    public final boolean mo81608D() {
        return this.f236412o != null;
    }

    /* renamed from: E */
    public final boolean mo81609E() {
        Parcelable parcelable = this.f236412o;
        boolean z = parcelable != null;
        this.f236413p = parcelable;
        this.f236412o = null;
        this.f236411n = null;
        return z;
    }

    /* renamed from: b */
    public final void mo81533b() {
        if (!mo81544m()) {
            super.mo81533b();
        } else if (this.f236412o == null) {
            Parcelable parcelable = this.f236364c;
            parcelable.getClass();
            mo81611x(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo81537e(Parcelable parcelable) {
        super.mo81537e(parcelable);
        mo81611x(parcelable);
    }

    /* renamed from: h */
    public final boolean mo81540h() {
        List list = this.f236411n;
        return (list != null && list.size() > 1) || super.mo81540h();
    }

    /* renamed from: j */
    public final boolean mo81542j(Disambiguation disambiguation) {
        if (!super.mo81542j(disambiguation) || !(disambiguation instanceof TwoStepDisambiguation)) {
            return false;
        }
        TwoStepDisambiguation twoStepDisambiguation = (TwoStepDisambiguation) disambiguation;
        Parcelable parcelable = this.f236412o;
        if (parcelable != null && parcelable.equals(twoStepDisambiguation.f236412o)) {
            return true;
        }
        if (C58832aw.m90831a(this.f236411n, twoStepDisambiguation.f236411n) && this.f236412o == null && twoStepDisambiguation.f236412o == null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo81545n() {
        List list;
        if (super.mo81545n()) {
            return true;
        }
        if (this.f236412o != null || !mo81544m()) {
            return false;
        }
        Parcelable parcelable = this.f236364c;
        parcelable.getClass();
        if (!mo81582u(parcelable) || ((list = this.f236411n) != null && list.isEmpty())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo81546o() {
        return super.mo81546o() | mo81609E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract List mo81579r(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo81581t(List list) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract boolean mo81582u(Parcelable parcelable);

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.f236411n);
        parcel.writeParcelable(this.f236412o, i);
    }

    /* renamed from: x */
    public final void mo81611x(Parcelable parcelable) {
        mo81581t(mo81582u(parcelable) ? mo81579r(parcelable) : null);
    }

    /* renamed from: y */
    public final void mo81612y(List list, boolean z) {
        mo81581t(list);
        if (z) {
            this.f236366e = true;
        }
        mo81534c();
    }

    /* renamed from: z */
    public final void mo81613z() {
        if (mo81609E()) {
            mo81533b();
            this.f236366e = true;
            mo81534c();
        }
    }

    /* renamed from: w */
    public final void mo81610w(Parcelable parcelable, boolean z) {
        parcelable.getClass();
        this.f236412o = parcelable;
        this.f236413p = null;
        if (z) {
            this.f236366e = true;
        }
        mo81534c();
    }

    public TwoStepDisambiguation(TwoStepDisambiguation twoStepDisambiguation) {
        super(twoStepDisambiguation);
        this.f236411n = twoStepDisambiguation.f236411n;
        this.f236412o = twoStepDisambiguation.f236412o;
    }

    public TwoStepDisambiguation(String str, List list) {
        super(str, list, false, false);
    }
}
