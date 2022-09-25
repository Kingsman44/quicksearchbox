package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145844p;
import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;

/* compiled from: PG */
public class RecurrenceRef extends C145815a implements Recurrence {

    /* renamed from: f */
    private boolean f394203f = false;

    /* renamed from: g */
    private RecurrenceStartRef f394204g;

    /* renamed from: h */
    private boolean f394205h = false;

    /* renamed from: i */
    private RecurrenceEndRef f394206i;

    /* renamed from: j */
    private boolean f394207j = false;

    /* renamed from: k */
    private DailyPatternRef f394208k;

    /* renamed from: l */
    private boolean f394209l = false;

    /* renamed from: m */
    private WeeklyPatternRef f394210m;

    /* renamed from: n */
    private boolean f394211n = false;

    /* renamed from: o */
    private MonthlyPatternRef f394212o;

    /* renamed from: p */
    private boolean f394213p = false;

    /* renamed from: q */
    private YearlyPatternRef f394214q;

    public RecurrenceRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: p */
    public static boolean m237222p(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "recurrence_frequency"), i, i2) && dataHolder.mo119320d(m237273v(str, "recurrence_every"), i, i2) && RecurrenceStartRef.m237232i(dataHolder, i, i2, str) && RecurrenceEndRef.m237211l(dataHolder, i, i2, str) && DailyPatternRef.m237168k(dataHolder, i, i2, str) && WeeklyPatternRef.m237266i(dataHolder, i, i2, str) && MonthlyPatternRef.m237206k(dataHolder, i, i2, str) && YearlyPatternRef.m237269j(dataHolder, i, i2, str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        return new RecurrenceEntity(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Recurrence)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceEntity.m237442c(this, (Recurrence) obj);
    }

    /* renamed from: h */
    public final DailyPattern mo122045h() {
        if (!this.f394207j) {
            this.f394207j = true;
            if (DailyPatternRef.m237168k(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394208k = null;
            } else {
                this.f394208k = new DailyPatternRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394208k;
    }

    public final int hashCode() {
        return RecurrenceEntity.m237441b(this);
    }

    /* renamed from: i */
    public final MonthlyPattern mo122046i() {
        if (!this.f394211n) {
            this.f394211n = true;
            if (MonthlyPatternRef.m237206k(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394212o = null;
            } else {
                this.f394212o = new MonthlyPatternRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394212o;
    }

    /* renamed from: j */
    public final RecurrenceEnd mo122047j() {
        if (!this.f394205h) {
            this.f394205h = true;
            if (RecurrenceEndRef.m237211l(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394206i = null;
            } else {
                this.f394206i = new RecurrenceEndRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394206i;
    }

    /* renamed from: k */
    public final RecurrenceStart mo122048k() {
        if (!this.f394203f) {
            this.f394203f = true;
            if (RecurrenceStartRef.m237232i(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394204g = null;
            } else {
                this.f394204g = new RecurrenceStartRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394204g;
    }

    /* renamed from: l */
    public final WeeklyPattern mo122049l() {
        if (!this.f394209l) {
            this.f394209l = true;
            if (WeeklyPatternRef.m237266i(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394210m = null;
            } else {
                this.f394210m = new WeeklyPatternRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394210m;
    }

    /* renamed from: m */
    public final YearlyPattern mo122050m() {
        if (!this.f394213p) {
            this.f394213p = true;
            if (YearlyPatternRef.m237269j(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394214q = null;
            } else {
                this.f394214q = new YearlyPatternRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394214q;
    }

    /* renamed from: n */
    public final Integer mo122051n() {
        return mo122098s(mo122100u("recurrence_every"));
    }

    /* renamed from: o */
    public final Integer mo122052o() {
        return mo122098s(mo122100u("recurrence_frequency"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145844p.m237594a(new RecurrenceEntity(this), parcel, i);
    }
}
