package com.google.android.libraries.geller.portable.database;

import android.content.Context;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protos.p4985f.p5030q.p5032b.C65021af;

/* renamed from: com.google.android.libraries.geller.portable.database.a */
/* compiled from: PG */
public final class C21953a extends C21961i {

    /* renamed from: a */
    public boolean f60559a;

    /* renamed from: b */
    public int f60560b;

    /* renamed from: c */
    public C58833ax f60561c;

    /* renamed from: d */
    public byte f60562d;

    /* renamed from: e */
    private Context f60563e;

    /* renamed from: f */
    private String f60564f;

    /* renamed from: g */
    private boolean f60565g;

    /* renamed from: h */
    private boolean f60566h;

    /* renamed from: i */
    private C58833ax f60567i;

    /* renamed from: j */
    private C58833ax f60568j;

    /* renamed from: k */
    private C65021af f60569k;

    public C21953a() {
        C58836b bVar = C58836b.f156633a;
        this.f60567i = bVar;
        this.f60568j = bVar;
        this.f60561c = bVar;
    }

    /* renamed from: a */
    public final C21962j mo27268a() {
        if (this.f60562d == 15 && this.f60563e != null && this.f60564f != null && this.f60569k != null) {
            return new C21962j(this.f60563e, this.f60564f, this.f60565g, this.f60566h, this.f60559a, this.f60560b, this.f60567i, this.f60568j, this.f60561c, this.f60569k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f60563e == null) {
            sb.append(" context");
        }
        if (this.f60564f == null) {
            sb.append(" databaseId");
        }
        if ((this.f60562d & 1) == 0) {
            sb.append(" isReadOnly");
        }
        if ((this.f60562d & 2) == 0) {
            sb.append(" enableWAL");
        }
        if ((this.f60562d & 4) == 0) {
            sb.append(" isLegacySQLite");
        }
        if ((this.f60562d & 8) == 0) {
            sb.append(" databaseVersion");
        }
        if (this.f60569k == null) {
            sb.append(" flags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo27269b(Context context) {
        if (context != null) {
            this.f60563e = context;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: c */
    public final void mo27270c(String str) {
        if (str != null) {
            this.f60564f = str;
            return;
        }
        throw new NullPointerException("Null databaseId");
    }

    /* renamed from: d */
    public final void mo27271d(C65021af afVar) {
        if (afVar != null) {
            this.f60569k = afVar;
            return;
        }
        throw new NullPointerException("Null flags");
    }

    /* renamed from: e */
    public final void mo27272e(boolean z) {
        this.f60565g = z;
        this.f60562d = (byte) (this.f60562d | 1);
    }

    /* renamed from: f */
    public final void mo27273f(C58833ax axVar) {
        if (axVar != null) {
            this.f60568j = axVar;
            return;
        }
        throw new NullPointerException("Null optionalAccountPdsMap");
    }

    /* renamed from: g */
    public final void mo27274g(C58833ax axVar) {
        if (axVar != null) {
            this.f60567i = axVar;
            return;
        }
        throw new NullPointerException("Null optionalCustomizedGellerStorage");
    }

    /* renamed from: h */
    public final void mo27275h() {
        this.f60566h = true;
        this.f60562d = (byte) (this.f60562d | 2);
    }
}
