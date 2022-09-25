package com.google.android.apps.gsa.speech.p7292i;

import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.speech.i.a */
/* compiled from: PG */
public final class C92429a {

    /* renamed from: a */
    private static final C59071e f257783a = C59071e.m91332i("com.google.android.apps.gsa.speech.i.a");

    /* renamed from: b */
    private final Set f257784b;

    /* renamed from: c */
    private final C92473f f257785c;

    /* renamed from: d */
    private final C89994f f257786d;

    /* renamed from: e */
    private final C68214a f257787e;

    /* renamed from: f */
    private Boolean f257788f;

    public C92429a(Set set, C92473f fVar, C89994f fVar2, C68214a aVar) {
        this.f257784b = set;
        this.f257785c = fVar;
        this.f257786d = fVar2;
        this.f257787e = aVar;
    }

    /* renamed from: e */
    private final boolean m151813e(boolean z) {
        C92473f fVar = this.f257785c;
        if (!fVar.f258008D && fVar.f258035w && !C92473f.m152085a(fVar.f258014b) && this.f257784b.contains(1) && this.f257785c.f258014b != C90536a.HOTWORD && !this.f257785c.f258016d) {
            return z || !this.f257786d.mo83874aK();
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m151814f() {
        if (this.f257785c.f258014b == C90536a.HOTWORD || !this.f257784b.contains(2) || this.f257786d.mo83872aI()) {
            return false;
        }
        return (this.f257785c.f258016d || mo87094d()) && !this.f257785c.f258020h;
    }

    /* renamed from: a */
    public final int mo87091a() {
        C90536a aVar = C90536a.INTENT_API;
        if (this.f257785c.f258014b.ordinal() == 6) {
            return 4;
        }
        if (m151814f()) {
            return 2;
        }
        if (!m151813e(false)) {
            ((C59052c) ((C59052c) f257783a.mo56226d()).mo56372aa(12596)).mo56389s("No primary engine for mode: %s", this.f257785c.f258014b);
            return 0;
        } else if (mo87094d()) {
            return 1;
        } else {
            ((C59052c) ((C59052c) f257783a.mo56224b()).mo56372aa(12597)).mo56386p("Offline: Embedded engine only");
            return 1;
        }
    }

    /* renamed from: b */
    public final int mo87092b() {
        C90536a aVar = C90536a.INTENT_API;
        if (this.f257785c.f258014b.ordinal() == 6 || mo87091a() != 2 || !m151813e(false)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: d */
    public final boolean mo87094d() {
        if (this.f257788f == null) {
            this.f257788f = Boolean.valueOf(((C89037bh) this.f257787e.mo27525b()).mo27377b().mo83040a());
        }
        return this.f257788f.booleanValue();
    }

    /* renamed from: c */
    public final List mo87093c() {
        ArrayList e = C58597ky.m90214e(4);
        if (m151813e(true)) {
            e.add(1);
        }
        if (m151814f()) {
            e.add(2);
        }
        if (this.f257784b.contains(4) && this.f257785c.f258014b == C90536a.HOTWORD) {
            e.add(4);
        }
        return e;
    }
}
