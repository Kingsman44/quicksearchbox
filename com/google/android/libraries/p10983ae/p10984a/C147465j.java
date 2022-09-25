package com.google.android.libraries.p10983ae.p10984a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.p2230c.p2234c.C28759a;
import com.google.android.libraries.storage.p3304a.p3309d.p3310a.C42770a;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58585km;
import java.io.File;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.ae.a.j */
/* compiled from: PG */
public final class C147465j {

    /* renamed from: a */
    public final String f398060a;

    /* renamed from: b */
    public final File f398061b;

    /* renamed from: c */
    public final String f398062c;

    /* renamed from: d */
    public final C147476u f398063d;

    /* renamed from: e */
    public final C58585km f398064e = new C58331bb();

    /* renamed from: f */
    final boolean f398065f;

    /* renamed from: g */
    final boolean f398066g;

    /* renamed from: h */
    int f398067h = 0;

    /* renamed from: i */
    public C147463h f398068i = null;

    /* renamed from: j */
    public int f398069j = -1;

    /* renamed from: k */
    public final int f398070k = -1;

    /* renamed from: l */
    public final C28759a f398071l;

    /* renamed from: m */
    public final C42770a f398072m;

    /* renamed from: n */
    private boolean f398073n = false;

    /* renamed from: o */
    private C147464i f398074o = C147464i.WIFI_ONLY;

    public C147465j(C147476u uVar, String str, File file, String str2, C28759a aVar, C42770a aVar2) {
        this.f398060a = str;
        this.f398061b = file;
        this.f398062c = str2;
        this.f398071l = aVar;
        this.f398063d = uVar;
        this.f398072m = aVar2;
        boolean b = C147460e.m240404b(str);
        this.f398065f = b;
        boolean startsWith = str.startsWith("file:");
        this.f398066g = startsWith;
        if (startsWith || b) {
            this.f398074o = C147464i.NONE;
        }
    }

    /* renamed from: a */
    public final synchronized C147464i mo124201a() {
        return this.f398074o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo124202b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo124203c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo124204d() {
        this.f398073n = true;
    }

    /* renamed from: e */
    public final synchronized boolean mo124205e() {
        return this.f398073n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C147465j)) {
            return false;
        }
        C147465j jVar = (C147465j) obj;
        if (!C58832aw.m90831a(this.f398060a, jVar.f398060a) || !C58832aw.m90831a(this.f398061b, jVar.f398061b) || !C58832aw.m90831a(this.f398062c, jVar.f398062c) || !C58832aw.m90831a(this.f398074o, jVar.f398074o) || this.f398073n != jVar.f398073n) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo124207f(C147464i iVar) {
        if (!this.f398066g && !this.f398065f) {
            this.f398074o = iVar;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f398060a, this.f398061b, this.f398062c, this.f398074o, Boolean.valueOf(this.f398073n)});
    }

    public final String toString() {
        C58830au a = C58831av.m90828a(C147465j.class);
        a.mo56102b(BuildConfig.FLAVOR, this.f398060a);
        a.mo56102b("targetDirectory", this.f398061b);
        a.mo56102b("fileName", this.f398062c);
        a.mo56102b("requiredConnectivity", this.f398074o);
        a.mo56103c("canceled", String.valueOf(this.f398073n));
        return a.toString();
    }
}
