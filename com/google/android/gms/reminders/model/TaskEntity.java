package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class TaskEntity extends AbstractSafeParcelable implements Task {
    public static final Parcelable.Creator CREATOR = new C145823ac();

    /* renamed from: a */
    public final TaskIdEntity f394310a;

    /* renamed from: b */
    public final Integer f394311b;

    /* renamed from: c */
    public final String f394312c;

    /* renamed from: d */
    public final Long f394313d;

    /* renamed from: e */
    public final Long f394314e;

    /* renamed from: f */
    public final Boolean f394315f;

    /* renamed from: g */
    public final Boolean f394316g;

    /* renamed from: h */
    public final Boolean f394317h;

    /* renamed from: i */
    public final Boolean f394318i;

    /* renamed from: j */
    public final Long f394319j;

    /* renamed from: k */
    public final DateTimeEntity f394320k;

    /* renamed from: l */
    public final DateTimeEntity f394321l;

    /* renamed from: m */
    public final LocationEntity f394322m;

    /* renamed from: n */
    public final LocationGroupEntity f394323n;

    /* renamed from: o */
    public final Long f394324o;

    /* renamed from: p */
    public final byte[] f394325p;

    /* renamed from: q */
    public final RecurrenceInfoEntity f394326q;

    /* renamed from: r */
    public final byte[] f394327r;

    /* renamed from: s */
    public final Integer f394328s;

    /* renamed from: t */
    public final ExternalApplicationLinkEntity f394329t;

    /* renamed from: u */
    public final Long f394330u;

    /* renamed from: v */
    public final Long f394331v;

    public TaskEntity(Task task) {
        this(task.mo122077n(), task.mo122084z(), task.mo122067G(), task.mo122062B(), task.mo122061A(), task.mo122078o(), task.mo122079p(), task.mo122080q(), task.mo122082x(), task.mo122066F(), task.mo122071h(), task.mo122072i(), task.mo122074k(), task.mo122075l(), task.mo122065E(), task.mo122069I(), task.mo122076m(), task.mo122068H(), task.mo122083y(), task.mo122073j(), task.mo122064D(), task.mo122063C(), false);
    }

    public TaskEntity(TaskIdEntity taskIdEntity, Integer num, String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l3, DateTimeEntity dateTimeEntity, DateTimeEntity dateTimeEntity2, LocationEntity locationEntity, LocationGroupEntity locationGroupEntity, Long l4, byte[] bArr, RecurrenceInfoEntity recurrenceInfoEntity, byte[] bArr2, Integer num2, ExternalApplicationLinkEntity externalApplicationLinkEntity, Long l5, Long l6) {
        this.f394310a = taskIdEntity;
        this.f394311b = num;
        this.f394312c = str;
        this.f394313d = l;
        this.f394314e = l2;
        this.f394315f = bool;
        this.f394316g = bool2;
        this.f394317h = bool3;
        this.f394318i = bool4;
        this.f394319j = l3;
        this.f394320k = dateTimeEntity;
        this.f394321l = dateTimeEntity2;
        this.f394322m = locationEntity;
        this.f394323n = locationGroupEntity;
        this.f394324o = l4;
        this.f394325p = bArr;
        this.f394326q = recurrenceInfoEntity;
        this.f394327r = bArr2;
        this.f394328s = num2;
        this.f394329t = externalApplicationLinkEntity;
        this.f394330u = l5;
        this.f394331v = l6;
    }

    /* renamed from: b */
    public static int m237498b(Task task) {
        return Arrays.hashCode(new Object[]{task.mo122077n(), task.mo122084z(), task.mo122067G(), task.mo122062B(), task.mo122061A(), task.mo122078o(), task.mo122079p(), task.mo122080q(), task.mo122082x(), task.mo122066F(), task.mo122071h(), task.mo122072i(), task.mo122074k(), task.mo122075l(), task.mo122065E(), task.mo122069I(), task.mo122076m(), task.mo122068H(), task.mo122083y(), task.mo122073j(), task.mo122064D()});
    }

    /* renamed from: c */
    public static boolean m237499c(Task task, Task task2) {
        return C143912ba.m233950b(task.mo122077n(), task2.mo122077n()) && C143912ba.m233950b(task.mo122084z(), task2.mo122084z()) && C143912ba.m233950b(task.mo122067G(), task2.mo122067G()) && C143912ba.m233950b(task.mo122062B(), task2.mo122062B()) && C143912ba.m233950b(task.mo122061A(), task2.mo122061A()) && C143912ba.m233950b(task.mo122078o(), task2.mo122078o()) && C143912ba.m233950b(task.mo122079p(), task2.mo122079p()) && C143912ba.m233950b(task.mo122080q(), task2.mo122080q()) && C143912ba.m233950b(task.mo122082x(), task2.mo122082x()) && C143912ba.m233950b(task.mo122066F(), task2.mo122066F()) && C143912ba.m233950b(task.mo122071h(), task2.mo122071h()) && C143912ba.m233950b(task.mo122072i(), task2.mo122072i()) && C143912ba.m233950b(task.mo122074k(), task2.mo122074k()) && C143912ba.m233950b(task.mo122075l(), task2.mo122075l()) && C143912ba.m233950b(task.mo122065E(), task2.mo122065E()) && Arrays.equals(task.mo122069I(), task2.mo122069I()) && C143912ba.m233950b(task.mo122076m(), task2.mo122076m()) && C143912ba.m233950b(task.mo122068H(), task2.mo122068H()) && C143912ba.m233950b(task.mo122083y(), task2.mo122083y()) && C143912ba.m233950b(task.mo122073j(), task2.mo122073j()) && C143912ba.m233950b(task.mo122064D(), task2.mo122064D());
    }

    /* renamed from: A */
    public final Long mo122061A() {
        return this.f394314e;
    }

    /* renamed from: B */
    public final Long mo122062B() {
        return this.f394313d;
    }

    /* renamed from: C */
    public final Long mo122063C() {
        return this.f394331v;
    }

    /* renamed from: D */
    public final Long mo122064D() {
        return this.f394330u;
    }

    /* renamed from: E */
    public final Long mo122065E() {
        return this.f394324o;
    }

    /* renamed from: F */
    public final Long mo122066F() {
        return this.f394319j;
    }

    /* renamed from: G */
    public final String mo122067G() {
        return this.f394312c;
    }

    /* renamed from: H */
    public final byte[] mo122068H() {
        return this.f394327r;
    }

    /* renamed from: I */
    public final byte[] mo122069I() {
        return this.f394325p;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Task)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237499c(this, (Task) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final DateTime mo122071h() {
        return this.f394320k;
    }

    public final int hashCode() {
        return m237498b(this);
    }

    /* renamed from: i */
    public final DateTime mo122072i() {
        return this.f394321l;
    }

    /* renamed from: j */
    public final ExternalApplicationLink mo122073j() {
        return this.f394329t;
    }

    /* renamed from: k */
    public final Location mo122074k() {
        return this.f394322m;
    }

    /* renamed from: l */
    public final LocationGroup mo122075l() {
        return this.f394323n;
    }

    /* renamed from: m */
    public final RecurrenceInfo mo122076m() {
        return this.f394326q;
    }

    /* renamed from: n */
    public final TaskId mo122077n() {
        return this.f394310a;
    }

    /* renamed from: o */
    public final Boolean mo122078o() {
        return this.f394315f;
    }

    /* renamed from: p */
    public final Boolean mo122079p() {
        return this.f394316g;
    }

    /* renamed from: q */
    public final Boolean mo122080q() {
        return this.f394317h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145823ac.m237566a(this, parcel, i);
    }

    /* renamed from: x */
    public final Boolean mo122082x() {
        return this.f394318i;
    }

    /* renamed from: y */
    public final Integer mo122083y() {
        return this.f394328s;
    }

    /* renamed from: z */
    public final Integer mo122084z() {
        return this.f394311b;
    }

    public TaskEntity(TaskId taskId, Integer num, String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l3, DateTime dateTime, DateTime dateTime2, Location location, LocationGroup locationGroup, Long l4, byte[] bArr, RecurrenceInfo recurrenceInfo, byte[] bArr2, Integer num2, ExternalApplicationLink externalApplicationLink, Long l5, Long l6, boolean z) {
        TaskIdEntity taskIdEntity;
        DateTimeEntity dateTimeEntity;
        DateTimeEntity dateTimeEntity2;
        LocationEntity locationEntity;
        LocationGroupEntity locationGroupEntity;
        RecurrenceInfoEntity recurrenceInfoEntity;
        TaskId taskId2 = taskId;
        DateTime dateTime3 = dateTime;
        DateTime dateTime4 = dateTime2;
        Location location2 = location;
        LocationGroup locationGroup2 = locationGroup;
        RecurrenceInfo recurrenceInfo2 = recurrenceInfo;
        ExternalApplicationLink externalApplicationLink2 = externalApplicationLink;
        this.f394311b = num;
        this.f394312c = str;
        this.f394313d = l;
        this.f394314e = l2;
        this.f394315f = bool;
        this.f394316g = bool2;
        this.f394317h = bool3;
        this.f394318i = bool4;
        this.f394319j = l3;
        this.f394324o = l4;
        this.f394325p = bArr;
        this.f394327r = bArr2;
        this.f394328s = num2;
        this.f394330u = l5;
        this.f394331v = l6;
        if (z) {
            this.f394310a = (TaskIdEntity) taskId2;
            this.f394320k = (DateTimeEntity) dateTime3;
            this.f394321l = (DateTimeEntity) dateTime4;
            this.f394322m = (LocationEntity) location2;
            this.f394323n = (LocationGroupEntity) locationGroup2;
            this.f394326q = (RecurrenceInfoEntity) recurrenceInfo2;
            this.f394329t = (ExternalApplicationLinkEntity) externalApplicationLink2;
            return;
        }
        ExternalApplicationLinkEntity externalApplicationLinkEntity = null;
        if (taskId2 == null) {
            taskIdEntity = null;
        } else {
            taskIdEntity = new TaskIdEntity(taskId);
        }
        this.f394310a = taskIdEntity;
        if (dateTime3 == null) {
            dateTimeEntity = null;
        } else {
            dateTimeEntity = new DateTimeEntity(dateTime3);
        }
        this.f394320k = dateTimeEntity;
        if (dateTime4 == null) {
            dateTimeEntity2 = null;
        } else {
            dateTimeEntity2 = new DateTimeEntity(dateTime4);
        }
        this.f394321l = dateTimeEntity2;
        if (location2 == null) {
            locationEntity = null;
        } else {
            locationEntity = new LocationEntity(location2);
        }
        this.f394322m = locationEntity;
        if (locationGroup2 == null) {
            locationGroupEntity = null;
        } else {
            locationGroupEntity = new LocationGroupEntity(locationGroup2);
        }
        this.f394323n = locationGroupEntity;
        if (recurrenceInfo2 == null) {
            recurrenceInfoEntity = null;
        } else {
            recurrenceInfoEntity = new RecurrenceInfoEntity(recurrenceInfo2);
        }
        this.f394326q = recurrenceInfoEntity;
        this.f394329t = externalApplicationLink2 != null ? new ExternalApplicationLinkEntity(externalApplicationLink2) : externalApplicationLinkEntity;
    }
}
