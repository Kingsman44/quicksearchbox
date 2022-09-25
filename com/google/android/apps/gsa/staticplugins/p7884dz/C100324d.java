package com.google.android.apps.gsa.staticplugins.p7884dz;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.dz.d */
/* compiled from: PG */
public final class C100324d implements C90991b {

    /* renamed from: a */
    public static final C59071e f280546a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dz.d");

    /* renamed from: b */
    private static final SimpleDateFormat f280547b = new SimpleDateFormat("MM-dd HH:mm:ss.SSS yyyy", Locale.US);

    /* renamed from: c */
    private static C100324d f280548c = null;

    /* renamed from: d */
    private final Queue f280549d = new C58781rt(new C58425eo(20));

    public C100324d() {
        if (f280548c != null) {
            C59104x c = f280546a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TestingEventLogger");
            ((C59052c) ((C59052c) c).mo56372aa(33310)).mo56386p("creating multiple instances!");
        }
        f280548c = this;
    }

    /* renamed from: a */
    public final void mo91885a(String str, String str2) {
        this.f280549d.add(new C100323c(System.currentTimeMillis(), str, str2));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        synchronized (this.f280549d) {
            for (C100323c cVar : this.f280549d) {
                fVar.mo85292s(C90752i.m148233g(String.format(Locale.US, "%s: %s, %s", new Object[]{f280547b.format(new Date(cVar.f280545c)), cVar.f280543a, cVar.f280544b})));
            }
        }
    }
}
