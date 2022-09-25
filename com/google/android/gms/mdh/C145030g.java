package com.google.android.gms.mdh;

/* renamed from: com.google.android.gms.mdh.g */
/* compiled from: PG */
public final class C145030g {

    /* renamed from: a */
    public int f392048a = 1;

    /* renamed from: b */
    public SyncSubPolicy f392049b = new C145076j().mo120584a();

    /* renamed from: c */
    public SyncSubPolicy f392050c = null;

    /* renamed from: d */
    public SyncSubPolicy f392051d = new C145076j().mo120584a();

    /* renamed from: e */
    public SyncSubPolicy f392052e = null;

    /* renamed from: f */
    public Integer f392053f = null;

    /* renamed from: a */
    public final SyncPolicy mo120557a() {
        int i = this.f392048a;
        SyncSubPolicy syncSubPolicy = this.f392049b;
        SyncSubPolicy syncSubPolicy2 = this.f392050c;
        SyncSubPolicy syncSubPolicy3 = syncSubPolicy2 == null ? syncSubPolicy : syncSubPolicy2;
        SyncSubPolicy syncSubPolicy4 = this.f392051d;
        SyncSubPolicy syncSubPolicy5 = this.f392052e;
        return new SyncPolicy(i, syncSubPolicy, syncSubPolicy3, syncSubPolicy4, syncSubPolicy5 == null ? syncSubPolicy4 : syncSubPolicy5, this.f392053f, false, false);
    }
}
