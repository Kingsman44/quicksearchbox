package com.google.android.libraries.lens.view.session.ondevice.p2168c;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.c.a */
/* compiled from: PG */
public final class C27927a extends C27942p {

    /* renamed from: a */
    private final C58485gu f76076a;

    /* renamed from: b */
    private final C56224ae f76077b;

    /* renamed from: c */
    private final String f76078c;

    /* renamed from: d */
    private final C58833ax f76079d;

    public C27927a(C58485gu guVar, C56224ae aeVar, String str, C58833ax axVar) {
        if (guVar != null) {
            this.f76076a = guVar;
            if (aeVar != null) {
                this.f76077b = aeVar;
                this.f76078c = str;
                this.f76079d = axVar;
                return;
            }
            throw new NullPointerException("Null boundingBox");
        }
        throw new NullPointerException("Null lines");
    }

    /* renamed from: a */
    public final C58833ax mo33399a() {
        return this.f76079d;
    }

    /* renamed from: b */
    public final C58485gu mo33400b() {
        return this.f76076a;
    }

    /* renamed from: c */
    public final C56224ae mo33401c() {
        return this.f76077b;
    }

    /* renamed from: d */
    public final String mo33402d() {
        return this.f76078c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27942p) {
            C27942p pVar = (C27942p) obj;
            return C58597ky.m90218i(this.f76076a, pVar.mo33400b()) && this.f76077b.equals(pVar.mo33401c()) && this.f76078c.equals(pVar.mo33402d()) && this.f76079d.equals(pVar.mo33399a());
        }
    }

    public final int hashCode() {
        return ((((((this.f76076a.hashCode() ^ 1000003) * 1000003) ^ this.f76077b.hashCode()) * 1000003) ^ this.f76078c.hashCode()) * 1000003) ^ this.f76079d.hashCode();
    }

    public final String toString() {
        String obj = this.f76076a.toString();
        String obj2 = this.f76077b.toString();
        String str = this.f76078c;
        String obj3 = this.f76079d.toString();
        return "ParagraphWithId{lines=" + obj + ", boundingBox=" + obj2 + ", visualObjectId=" + str + ", paragraphId=" + obj3 + "}";
    }
}
