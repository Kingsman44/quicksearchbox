package com.google.android.libraries.social.populous;

import android.os.Parcelable;
import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public abstract class Autocompletion implements Parcelable {

    /* renamed from: a */
    private ContactMethodField[] f110363a = null;

    /* renamed from: f */
    public static C42150ad m74017f() {
        C42145a aVar = new C42145a();
        C58485gu m = C58485gu.m89845m();
        if (m != null) {
            aVar.f110383a = m;
            return aVar;
        }
        throw new NullPointerException("Null matchesList");
    }

    /* renamed from: a */
    public abstract Group mo44772a();

    /* renamed from: b */
    public abstract Person mo44773b();

    /* renamed from: c */
    public abstract C42309ch mo44774c();

    /* renamed from: d */
    public abstract C41932g mo44775d();

    /* renamed from: e */
    public abstract C58485gu mo44776e();

    /* renamed from: g */
    public final ContactMethodField[] mo44828g() {
        if (this.f110363a == null) {
            this.f110363a = mo44774c() == C42309ch.PERSON ? (ContactMethodField[]) mo44773b().f110371g.toArray(new ContactMethodField[0]) : new ContactMethodField[0];
        }
        return this.f110363a;
    }
}
