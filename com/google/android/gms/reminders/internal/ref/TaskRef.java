package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145823ac;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskId;

/* compiled from: PG */
public class TaskRef extends C145815a implements Task {

    /* renamed from: f */
    private boolean f394217f = false;

    /* renamed from: g */
    private TaskIdRef f394218g;

    /* renamed from: h */
    private boolean f394219h = false;

    /* renamed from: i */
    private DateTimeRef f394220i;

    /* renamed from: j */
    private boolean f394221j = false;

    /* renamed from: k */
    private DateTimeRef f394222k;

    /* renamed from: l */
    private boolean f394223l = false;

    /* renamed from: m */
    private LocationRef f394224m;

    /* renamed from: n */
    private boolean f394225n = false;

    /* renamed from: o */
    private LocationGroupRef f394226o;

    /* renamed from: p */
    private boolean f394227p = false;

    /* renamed from: q */
    private RecurrenceInfoRef f394228q;

    /* renamed from: r */
    private boolean f394229r = false;

    /* renamed from: s */
    private ExternalApplicationLinkRef f394230s;

    public TaskRef(DataHolder dataHolder, int i) {
        super(dataHolder, i, BuildConfig.FLAVOR);
    }

    /* renamed from: A */
    public final Long mo122061A() {
        return mo122099t(mo122100u("archived_time_ms"));
    }

    /* renamed from: B */
    public final Long mo122062B() {
        return mo122099t(mo122100u("created_time_millis"));
    }

    /* renamed from: C */
    public final Long mo122063C() {
        return mo122099t(mo122100u("due_date_millis"));
    }

    /* renamed from: D */
    public final Long mo122064D() {
        return mo122099t(mo122100u("fired_time_millis"));
    }

    /* renamed from: E */
    public final Long mo122065E() {
        return mo122099t(mo122100u("location_snoozed_until_ms"));
    }

    /* renamed from: F */
    public final Long mo122066F() {
        return mo122099t(mo122100u("snoozed_time_millis"));
    }

    /* renamed from: G */
    public final String mo122067G() {
        return mo119337kv(mo122100u("title"));
    }

    /* renamed from: H */
    public final byte[] mo122068H() {
        return mo119334g(mo122100u("assistance"));
    }

    /* renamed from: I */
    public final byte[] mo122069I() {
        return mo119334g(mo122100u("extensions"));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        return new TaskEntity(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Task)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return TaskEntity.m237499c(this, (Task) obj);
    }

    /* renamed from: h */
    public final DateTime mo122071h() {
        if (!this.f394219h) {
            this.f394219h = true;
            if (DateTimeRef.m237173q(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("due_date_"))) {
                this.f394220i = null;
            } else {
                this.f394220i = new DateTimeRef(this.f389974a, this.f389975b, this.f394233d.concat("due_date_"));
            }
        }
        return this.f394220i;
    }

    public final int hashCode() {
        return TaskEntity.m237498b(this);
    }

    /* renamed from: i */
    public final DateTime mo122072i() {
        if (!this.f394221j) {
            this.f394221j = true;
            if (DateTimeRef.m237173q(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("event_date_"))) {
                this.f394222k = null;
            } else {
                this.f394222k = new DateTimeRef(this.f389974a, this.f389975b, this.f394233d.concat("event_date_"));
            }
        }
        return this.f394222k;
    }

    /* renamed from: j */
    public final ExternalApplicationLink mo122073j() {
        if (!this.f394229r) {
            this.f394229r = true;
            DataHolder dataHolder = this.f389974a;
            int i = this.f389975b;
            int i2 = this.f394234e;
            String str = this.f394233d;
            if (!dataHolder.mo119320d(ExternalApplicationLinkRef.m237273v(str, "link_application"), i, i2) || !dataHolder.mo119320d(ExternalApplicationLinkRef.m237273v(str, "link_id"), i, i2)) {
                this.f394230s = new ExternalApplicationLinkRef(this.f389974a, this.f389975b, this.f394233d);
            } else {
                this.f394230s = null;
            }
        }
        return this.f394230s;
    }

    /* renamed from: k */
    public final Location mo122074k() {
        if (!this.f394223l) {
            this.f394223l = true;
            DataHolder dataHolder = this.f389974a;
            int i = this.f389975b;
            int i2 = this.f394234e;
            String str = this.f394233d;
            if (!dataHolder.mo119320d(LocationRef.m237273v(str, "lat"), i, i2) || !dataHolder.mo119320d(LocationRef.m237273v(str, "lng"), i, i2) || !dataHolder.mo119320d(LocationRef.m237273v(str, "name"), i, i2) || !dataHolder.mo119320d(LocationRef.m237273v(str, "radius_meters"), i, i2) || !dataHolder.mo119320d(LocationRef.m237273v(str, "location_type"), i, i2) || !FeatureIdProtoRef.m237187j(dataHolder, i, i2, str.concat("location_")) || !dataHolder.mo119320d(LocationRef.m237273v(str, "display_address"), i, i2) || !AddressRef.m237149p(dataHolder, i, i2, str.concat("address_")) || !dataHolder.mo119320d(LocationRef.m237273v(str, "location_alias_id"), i, i2)) {
                this.f394224m = new LocationRef(this.f389974a, this.f389975b, this.f394233d);
            } else {
                this.f394224m = null;
            }
        }
        return this.f394224m;
    }

    /* renamed from: l */
    public final LocationGroup mo122075l() {
        if (!this.f394225n) {
            this.f394225n = true;
            DataHolder dataHolder = this.f389974a;
            int i = this.f389975b;
            int i2 = this.f394234e;
            String str = this.f394233d;
            if (!dataHolder.mo119320d(LocationGroupRef.m237273v(str, "location_query"), i, i2) || !dataHolder.mo119320d(LocationGroupRef.m237273v(str, "location_query_type"), i, i2) || !ChainInfoRef.m237164j(dataHolder, i, i2, str) || !CategoryInfoRef.m237159k(dataHolder, i, i2, str)) {
                this.f394226o = new LocationGroupRef(this.f389974a, this.f389975b, this.f394233d);
            } else {
                this.f394226o = null;
            }
        }
        return this.f394226o;
    }

    /* renamed from: m */
    public final RecurrenceInfo mo122076m() {
        if (!this.f394227p) {
            this.f394227p = true;
            DataHolder dataHolder = this.f389974a;
            int i = this.f389975b;
            int i2 = this.f394234e;
            String str = this.f394233d;
            if (!RecurrenceRef.m237222p(dataHolder, i, i2, str) || !dataHolder.mo119320d(RecurrenceInfoRef.m237273v(str, "recurrence_id"), i, i2) || !dataHolder.mo119320d(RecurrenceInfoRef.m237273v(str, "recurrence_master"), i, i2) || !dataHolder.mo119320d(RecurrenceInfoRef.m237273v(str, "recurrence_exceptional"), i, i2)) {
                this.f394228q = new RecurrenceInfoRef(this.f389974a, this.f389975b, this.f394233d);
            } else {
                this.f394228q = null;
            }
        }
        return this.f394228q;
    }

    /* renamed from: n */
    public final TaskId mo122077n() {
        if (!this.f394217f) {
            this.f394217f = true;
            DataHolder dataHolder = this.f389974a;
            int i = this.f389975b;
            int i2 = this.f394234e;
            String str = this.f394233d;
            if (!dataHolder.mo119320d(TaskIdRef.m237273v(str, "client_assigned_id"), i, i2) || !dataHolder.mo119320d(TaskIdRef.m237273v(str, "client_assigned_thread_id"), i, i2)) {
                this.f394218g = new TaskIdRef(this.f389974a, this.f389975b, this.f394233d);
            } else {
                this.f394218g = null;
            }
        }
        return this.f394218g;
    }

    /* renamed from: o */
    public final Boolean mo122078o() {
        return Boolean.valueOf(mo119330d(mo122100u("archived")));
    }

    /* renamed from: p */
    public final Boolean mo122079p() {
        return Boolean.valueOf(mo119330d(mo122100u("deleted")));
    }

    /* renamed from: q */
    public final Boolean mo122080q() {
        return Boolean.valueOf(mo119330d(mo122100u("pinned")));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145823ac.m237566a(new TaskEntity(this), parcel, i);
    }

    /* renamed from: x */
    public final Boolean mo122082x() {
        return Boolean.valueOf(mo119330d(mo122100u("snoozed")));
    }

    /* renamed from: y */
    public final Integer mo122083y() {
        return mo122098s(mo122100u("experiment"));
    }

    /* renamed from: z */
    public final Integer mo122084z() {
        return mo122098s(mo122100u("task_list"));
    }
}
