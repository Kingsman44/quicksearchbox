package com.google.common.base;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.common.base.cf */
/* compiled from: PG */
public final class C58869cf {

    /* renamed from: a */
    public final C58912v f156673a;

    /* renamed from: b */
    public final boolean f156674b;

    /* renamed from: c */
    public final int f156675c;

    /* renamed from: d */
    private final C58868ce f156676d;

    public C58869cf(C58868ce ceVar) {
        this(ceVar, false, C58909s.f156747a, Integer.MAX_VALUE);
    }

    private C58869cf(C58868ce ceVar, boolean z, C58912v vVar, int i) {
        this.f156676d = ceVar;
        this.f156674b = z;
        this.f156673a = vVar;
        this.f156675c = i;
    }

    /* renamed from: c */
    public static C58869cf m90937c(C58915y yVar) {
        C58838bb.m90873h(!yVar.mo56089a(BuildConfig.FLAVOR).mo56088d(), "The pattern may not match the empty string: %s", yVar);
        return new C58869cf(new C58861by(yVar));
    }

    /* renamed from: d */
    public static C58869cf m90938d(String str) {
        C58838bb.m90869d(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return m90936b(new C58903m(str.charAt(0)));
        }
        return new C58869cf(new C58859bw(str));
    }

    /* renamed from: e */
    public static C58869cf m90939e(Pattern pattern) {
        return m90937c(new C58822am(pattern));
    }

    /* renamed from: a */
    public final C58869cf mo56151a() {
        return new C58869cf(this.f156676d, true, this.f156673a, this.f156675c);
    }

    /* renamed from: f */
    public final C58869cf mo56152f(C58912v vVar) {
        vVar.getClass();
        return new C58869cf(this.f156676d, this.f156674b, vVar, this.f156675c);
    }

    /* renamed from: g */
    public final Iterable mo56153g(CharSequence charSequence) {
        charSequence.getClass();
        return new C58865cb(this, charSequence);
    }

    /* renamed from: h */
    public final Iterator mo56154h(CharSequence charSequence) {
        return this.f156676d.mo56147a(this, charSequence);
    }

    /* renamed from: j */
    public final C58869cf mo56156j() {
        return new C58869cf(this.f156676d, this.f156674b, this.f156673a, 2);
    }

    /* renamed from: b */
    public static C58869cf m90936b(C58912v vVar) {
        vVar.getClass();
        return new C58869cf(new C58857bu(vVar));
    }

    /* renamed from: i */
    public final List mo56155i(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h = mo56154h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add((String) h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
