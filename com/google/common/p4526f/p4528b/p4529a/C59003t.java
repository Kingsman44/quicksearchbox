package com.google.common.p4526f.p4528b.p4529a;

import com.google.common.p4526f.p4528b.C59033h;
import com.google.common.p4526f.p4528b.C59044s;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b.a.t */
/* compiled from: PG */
public final class C59003t implements C58984c {

    /* renamed from: a */
    public final Level f156879a;

    /* renamed from: b */
    public final Set f156880b;

    /* renamed from: c */
    public final C59044s f156881c;

    /* renamed from: d */
    private final boolean f156882d;

    /* renamed from: e */
    private volatile C59004u f156883e;

    public C59003t() {
        this(Level.ALL, false, C59005v.f156888a, C59005v.f156889b);
    }

    public C59003t(Level level, boolean z, Set set, C59044s sVar) {
        this.f156879a = level;
        this.f156882d = z;
        this.f156880b = set;
        this.f156881c = sVar;
    }

    /* renamed from: a */
    public final C59033h mo36920a(String str) {
        if (!this.f156882d || !str.contains(".")) {
            return new C59005v(str, this.f156879a, this.f156880b, this.f156881c);
        }
        C59004u uVar = this.f156883e;
        if (uVar == null) {
            synchronized (this) {
                uVar = this.f156883e;
                if (uVar == null) {
                    uVar = new C59004u((String) null, this.f156879a, false, this.f156880b, this.f156881c);
                    this.f156883e = uVar;
                }
            }
        }
        return uVar;
    }

    /* renamed from: b */
    public final C59003t mo56270b(boolean z) {
        return new C59003t(z ? Level.ALL : Level.OFF, this.f156882d, this.f156880b, this.f156881c);
    }
}
