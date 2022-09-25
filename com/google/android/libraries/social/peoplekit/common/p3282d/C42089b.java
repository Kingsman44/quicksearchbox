package com.google.android.libraries.social.peoplekit.common.p3282d;

import android.content.Context;
import androidx.core.content.C1882h;
import com.google.android.libraries.social.p3260a.p3265d.C41911d;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.social.peoplekit.common.d.b */
/* compiled from: PG */
public final class C42089b {

    /* renamed from: a */
    private static final String[] f110021a = {"android.permission.READ_CONTACTS"};

    /* renamed from: b */
    private final Context f110022b;

    /* renamed from: c */
    private final C42090c f110023c;

    /* renamed from: d */
    private final boolean f110024d;

    /* renamed from: e */
    private final C42075e f110025e;

    /* renamed from: f */
    private boolean f110026f;

    /* renamed from: g */
    private PeopleKitVisualElementPath f110027g;

    /* renamed from: h */
    private final List f110028h = new ArrayList();

    public C42089b(Context context, C42090c cVar, boolean z, C42075e eVar) {
        this.f110022b = context;
        this.f110023c = cVar;
        this.f110024d = z;
        this.f110025e = eVar;
    }

    /* renamed from: c */
    public static boolean m73679c(Context context) {
        return C1882h.m5137c(context, "android.permission.READ_CONTACTS") != -1;
    }

    /* renamed from: g */
    private final void m73680g(C41911d dVar, boolean z) {
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(dVar));
        if (z) {
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144452O));
        }
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144476q));
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = this.f110027g;
        if (peopleKitVisualElementPath2 != null) {
            peopleKitVisualElementPath.mo44564a(peopleKitVisualElementPath2.f109973a);
        }
        this.f110025e.mo44577c(4, peopleKitVisualElementPath);
    }

    /* renamed from: h */
    private final boolean m73681h() {
        return !mo44601d() || this.f110023c.mo44451b();
    }

    /* renamed from: a */
    public final void mo44599a(C42088a aVar) {
        this.f110028h.add(aVar);
    }

    /* renamed from: b */
    public final void mo44600b(PeopleKitVisualElementPath peopleKitVisualElementPath) {
        if (this.f110024d && !m73679c(this.f110022b) && m73681h() && !this.f110026f) {
            C42075e eVar = this.f110025e;
            PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144476q));
            peopleKitVisualElementPath2.mo44564a(peopleKitVisualElementPath.f109973a);
            eVar.mo44577c(-1, peopleKitVisualElementPath2);
            this.f110026f = true;
            this.f110027g = peopleKitVisualElementPath;
            this.f110023c.mo44450a(f110021a);
        }
    }

    /* renamed from: d */
    public final boolean mo44601d() {
        return this.f110022b.getSharedPreferences("SHARED_PREFS_SENDKIT", 0).getBoolean("PERMISSION_PROMPT_SHOWN_BEFORE", false);
    }

    /* renamed from: e */
    public final boolean mo44602e() {
        return this.f110024d && !m73679c(this.f110022b) && m73681h();
    }

    /* renamed from: f */
    public final void mo44603f(int i, int[] iArr) {
        this.f110026f = false;
        if (i == 1234) {
            this.f110022b.getSharedPreferences("SHARED_PREFS_SENDKIT", 0).edit().putBoolean("PERMISSION_PROMPT_SHOWN_BEFORE", true).apply();
            if (iArr.length <= 0 || iArr[0] != 0) {
                for (C42088a a : this.f110028h) {
                    a.mo44411a();
                }
                if (m73681h()) {
                    m73680g(C54941a.f144451N, false);
                } else {
                    m73680g(C54941a.f144451N, true);
                }
            } else {
                for (C42088a b : this.f110028h) {
                    b.mo44412b();
                }
                m73680g(C54941a.f144450M, false);
            }
        }
    }
}
