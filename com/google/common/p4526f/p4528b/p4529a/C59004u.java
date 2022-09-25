package com.google.common.p4526f.p4528b.p4529a;

import android.util.Log;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59044s;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b.a.u */
/* compiled from: PG */
final class C59004u extends C58982a {

    /* renamed from: a */
    private final Level f156884a;

    /* renamed from: b */
    private final boolean f156885b;

    /* renamed from: c */
    private final Set f156886c;

    /* renamed from: d */
    private final C59044s f156887d;

    public C59004u(String str, Level level, boolean z, Set set, C59044s sVar) {
        super(str);
        this.f156884a = level;
        this.f156885b = z;
        this.f156886c = set;
        this.f156887d = sVar;
    }

    /* renamed from: a */
    public final void mo36921a(C59031f fVar) {
        String str = (String) fVar.mo56305h().mo56312d(C58975e.f156826a);
        if (str == null) {
            str = mo56247d();
        }
        if (str == null) {
            str = fVar.mo56304e().mo56239b();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        String b = C58995l.m91183b(str);
        Level l = fVar.mo56309l();
        if (!this.f156885b) {
            int a = C58995l.m91182a(l);
            if (!Log.isLoggable(b, a) && !Log.isLoggable("all", a)) {
                return;
            }
        }
        C59005v.m91200e(fVar, b, this.f156884a, this.f156886c, this.f156887d);
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        return true;
    }
}
