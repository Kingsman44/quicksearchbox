package com.google.android.gms.reminders.model;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.reminders.model.ab */
/* compiled from: PG */
public final class C145822ab {

    /* renamed from: a */
    public String f394341a;

    /* renamed from: b */
    public Long f394342b;

    /* renamed from: c */
    public Boolean f394343c;

    /* renamed from: d */
    public Boolean f394344d;

    /* renamed from: e */
    public Boolean f394345e;

    /* renamed from: f */
    public Boolean f394346f;

    /* renamed from: g */
    public Long f394347g;

    /* renamed from: h */
    public byte[] f394348h;

    /* renamed from: i */
    public byte[] f394349i;

    /* renamed from: j */
    private TaskId f394350j;

    /* renamed from: k */
    private Integer f394351k;

    /* renamed from: l */
    private Long f394352l;

    /* renamed from: m */
    private Long f394353m;

    /* renamed from: n */
    private DateTime f394354n;

    /* renamed from: o */
    private DateTime f394355o;

    /* renamed from: p */
    private Location f394356p;

    /* renamed from: q */
    private LocationGroup f394357q;

    /* renamed from: r */
    private RecurrenceInfo f394358r;

    /* renamed from: s */
    private Integer f394359s;

    /* renamed from: t */
    private ExternalApplicationLink f394360t;

    public C145822ab() {
    }

    public C145822ab(Task task) {
        LocationGroupEntity locationGroupEntity;
        RecurrenceInfoEntity recurrenceInfoEntity;
        ExternalApplicationLinkEntity externalApplicationLinkEntity = null;
        this.f394350j = task.mo122077n() == null ? null : new TaskIdEntity(task.mo122077n());
        this.f394351k = task.mo122084z();
        this.f394341a = task.mo122067G();
        this.f394352l = task.mo122062B();
        this.f394342b = task.mo122061A();
        this.f394343c = task.mo122078o();
        this.f394344d = task.mo122079p();
        this.f394345e = task.mo122080q();
        this.f394346f = task.mo122082x();
        this.f394353m = task.mo122066F();
        this.f394354n = task.mo122071h() == null ? null : new DateTimeEntity(task.mo122071h());
        this.f394355o = task.mo122072i() == null ? null : new DateTimeEntity(task.mo122072i());
        this.f394356p = task.mo122074k() == null ? null : new LocationEntity(task.mo122074k());
        if (task.mo122075l() == null) {
            locationGroupEntity = null;
        } else {
            locationGroupEntity = new LocationGroupEntity(task.mo122075l());
        }
        this.f394357q = locationGroupEntity;
        this.f394347g = task.mo122065E();
        this.f394348h = task.mo122069I();
        if (task.mo122076m() == null) {
            recurrenceInfoEntity = null;
        } else {
            recurrenceInfoEntity = new RecurrenceInfoEntity(task.mo122076m());
        }
        this.f394358r = recurrenceInfoEntity;
        this.f394349i = task.mo122068H();
        this.f394359s = task.mo122083y();
        this.f394360t = task.mo122073j() != null ? new ExternalApplicationLinkEntity(task.mo122073j()) : externalApplicationLinkEntity;
    }

    /* renamed from: a */
    public final Task mo122169a() {
        return new TaskEntity(this.f394350j, this.f394351k, this.f394341a, this.f394352l, this.f394342b, this.f394343c, this.f394344d, this.f394345e, this.f394346f, this.f394353m, this.f394354n, this.f394355o, this.f394356p, this.f394357q, this.f394347g, this.f394348h, this.f394358r, this.f394349i, this.f394359s, this.f394360t, (Long) null, (Long) null, true);
    }

    /* renamed from: b */
    public final void mo122170b(DateTime dateTime) {
        if (dateTime == null) {
            dateTime = null;
        }
        this.f394354n = dateTime;
    }

    /* renamed from: c */
    public final void mo122171c(Location location) {
        if (location == null) {
            location = null;
        }
        this.f394356p = location;
    }

    /* renamed from: d */
    public final void mo122172d(LocationGroup locationGroup) {
        if (locationGroup == null) {
            locationGroup = null;
        }
        this.f394357q = locationGroup;
    }

    /* renamed from: e */
    public final void mo122173e(RecurrenceInfo recurrenceInfo) {
        if (recurrenceInfo == null) {
            recurrenceInfo = null;
        }
        this.f394358r = recurrenceInfo;
    }

    /* renamed from: f */
    public final void mo122174f(TaskId taskId) {
        this.f394350j = taskId != null ? (TaskId) taskId.mo119345a() : null;
    }

    /* renamed from: g */
    public final void mo122175g(Integer num) {
        boolean z = true;
        if (!(num.intValue() == 16 || num.intValue() == 1 || num.intValue() == 8 || num.intValue() == 10 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 15 || num.intValue() == 4 || num.intValue() == 14 || num.intValue() == 11 || num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 13 || num.intValue() == 12 || num.intValue() == 7 || num.intValue() == 9)) {
            z = false;
        }
        C143919bh.m233960c(z, "Invalid constant for SystemListId. Use value in ModelConstants");
        this.f394351k = num;
    }
}
