package com.google.common.p4526f.p4528b.p4529a;

import android.util.Log;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59090j;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4528b.C58981a;
import com.google.common.p4526f.p4528b.C59008ac;
import com.google.common.p4526f.p4528b.C59011af;
import com.google.common.p4526f.p4528b.C59014ai;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59041p;
import com.google.common.p4526f.p4528b.C59044s;
import com.google.common.p4526f.p4528b.C59047v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b.a.v */
/* compiled from: PG */
public final class C59005v extends C58982a {

    /* renamed from: a */
    public static final Set f156888a;

    /* renamed from: b */
    public static final C59044s f156889b;

    /* renamed from: c */
    public static final C59003t f156890c = new C59003t();

    /* renamed from: d */
    private final String f156891d;

    /* renamed from: e */
    private final Level f156892e;

    /* renamed from: f */
    private final Set f156893f;

    /* renamed from: g */
    private final C59044s f156894g;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C58976aa[]{C59090j.f157047a, C58975e.f156826a})));
        f156888a = unmodifiableSet;
        f156889b = new C59041p(C59047v.m91309a(unmodifiableSet));
    }

    public C59005v(String str, Level level, Set set, C59044s sVar) {
        super(str);
        this.f156891d = C58995l.m91183b(str);
        this.f156892e = level;
        this.f156893f = set;
        this.f156894g = sVar;
    }

    /* renamed from: e */
    public static void m91200e(C59031f fVar, String str, Level level, Set set, C59044s sVar) {
        String str2;
        C59008ac g = C59008ac.m91215g(C59011af.m91226f(), fVar.mo56305h());
        boolean z = fVar.mo56309l().intValue() < level.intValue();
        if (z || C59014ai.m91241b(fVar, g, set)) {
            StringBuilder sb = new StringBuilder();
            if (!z || fVar.mo56306i() == null) {
                C58981a.m91151c(fVar, sb);
                C59014ai.m91242c(g, sVar, sb);
            } else {
                sb.append("(REDACTED) ");
                sb.append(fVar.mo56306i().f156911b);
            }
            str2 = sb.toString();
        } else {
            str2 = C59014ai.m91240a(fVar);
        }
        Throwable th = (Throwable) fVar.mo56305h().mo56312d(C59090j.f157047a);
        int a = C58995l.m91182a(fVar.mo56309l());
        if (a == 2) {
            Log.v(str, str2, th);
        } else if (a == 3) {
            Log.d(str, str2, th);
        } else if (a == 4) {
            Log.i(str, str2, th);
        } else if (a != 5) {
            Log.e(str, str2, th);
        } else {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: a */
    public final void mo36921a(C59031f fVar) {
        m91200e(fVar, this.f156891d, this.f156892e, this.f156893f, this.f156894g);
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        int a = C58995l.m91182a(level);
        return Log.isLoggable(this.f156891d, a) || Log.isLoggable("all", a);
    }
}
