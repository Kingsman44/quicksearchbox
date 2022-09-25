package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c;

import com.google.common.p4526f.C59071e;
import java.util.HashSet;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b */
/* compiled from: PG */
public final class C129584b {

    /* renamed from: a */
    public static final C59071e f355670a = C59071e.m91331h();

    /* renamed from: b */
    public boolean f355671b;

    /* renamed from: c */
    public final HashSet f355672c;

    /* renamed from: d */
    public final HashSet f355673d;

    /* renamed from: e */
    private final C129612d f355674e;

    /* renamed from: f */
    private final String[] f355675f;

    public C129584b(C129612d dVar, String[] strArr) {
        C69664n.m101061g(dVar, "transitionManager");
        this.f355674e = dVar;
        this.f355675f = strArr;
        this.f355671b = dVar.mo109118c();
        this.f355672c = C69531o.m100935l(strArr);
        this.f355673d = C69531o.m100935l(strArr);
    }

    /* renamed from: a */
    public final void mo109119a(String str) {
        this.f355673d.toString();
        if (this.f355673d.remove(str) && this.f355673d.isEmpty() && this.f355671b) {
            this.f355671b = false;
            this.f355674e.mo109117b();
        }
    }

    public final String toString() {
        String[] strArr = this.f355675f;
        HashSet hashSet = this.f355673d;
        return "PostponeLatch(releaseKeys=" + strArr + ", remainKeys=" + hashSet + ")";
    }
}
