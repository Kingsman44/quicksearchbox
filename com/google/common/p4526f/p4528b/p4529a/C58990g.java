package com.google.common.p4526f.p4528b.p4529a;

import android.content.Context;
import android.os.Process;
import android.text.format.DateFormat;
import com.google.common.p4526f.C59090j;
import com.google.common.p4526f.p4528b.C59008ac;
import com.google.common.p4526f.p4528b.C59011af;
import com.google.common.p4526f.p4528b.C59014ai;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59036k;
import com.google.common.p4526f.p4528b.C59037l;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b.a.g */
/* compiled from: PG */
public final class C58990g extends C58982a {

    /* renamed from: a */
    public final C59002s f156851a;

    /* renamed from: b */
    public final C58991h f156852b;

    /* renamed from: c */
    public final Context f156853c;

    public C58990g(Context context, C60887da daVar, C58991h hVar) {
        super("FileLoggerBackend");
        this.f156853c = context;
        this.f156852b = hVar;
        this.f156851a = new C59002s(new C58989f(this), (long) hVar.mo56255b(), hVar.mo56254a(), new C60904dr(daVar));
    }

    /* renamed from: a */
    public final void mo36921a(C59031f fVar) {
        C59037l lVar;
        StringBuilder sb = new StringBuilder();
        int intValue = fVar.mo56309l().intValue();
        sb.append(intValue >= 1000 ? "E " : intValue >= 900 ? "W " : intValue >= 800 ? "I " : "D ");
        sb.append(fVar.mo56308k());
        sb.append(": ");
        C59037l f = C59011af.m91226f();
        if (this.f156852b.mo56258e()) {
            lVar = fVar.mo56305h();
        } else {
            lVar = C59036k.f156958a;
        }
        C59014ai.f156908a.mo56278a(fVar, C59008ac.m91215g(f, lVar), sb);
        Throwable th = (Throwable) fVar.mo56305h().mo56312d(C59090j.f157047a);
        if (th != null) {
            sb.append(" ");
            sb.append(th);
        }
        C59002s sVar = this.f156851a;
        sVar.f156875e.execute(new C59001r(sVar, String.format(Locale.US, "%s %d %d %s", new Object[]{DateFormat.format("MM-dd HH:mm:ss.sss", TimeUnit.NANOSECONDS.toMillis(fVar.mo56303d())), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), sb.toString()})));
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        return this.f156852b.mo56259f(level);
    }
}
