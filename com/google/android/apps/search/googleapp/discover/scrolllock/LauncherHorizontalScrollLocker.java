package com.google.android.apps.search.googleapp.discover.scrolllock;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.util.concurrent.C60888db;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class LauncherHorizontalScrollLocker implements C2376g {

    /* renamed from: a */
    public final C46439e f366560a;

    /* renamed from: b */
    public final C60888db f366561b;

    /* renamed from: c */
    public boolean f366562c;

    /* renamed from: d */
    public final Set f366563d = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: e */
    public final C46440f f366564e = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            String str = (String) obj;
            C69664n.m101061g(str, "input");
            LauncherHorizontalScrollLocker.this.f366563d.remove(str);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            String str = (String) obj;
            Void voidR = (Void) obj2;
            C69664n.m101061g(str, "input");
            LauncherHorizontalScrollLocker.this.f366563d.remove(str);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    public LauncherHorizontalScrollLocker(C46439e eVar, C60888db dbVar) {
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        this.f366560a = eVar;
        this.f366561b = dbVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f366560a.mo50429i(this.f366564e);
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        this.f366563d.clear();
        this.f366562c = false;
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        this.f366562c = true;
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
