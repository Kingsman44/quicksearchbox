package com.google.android.apps.gsa.search.shared.actions.core;

import android.os.Parcel;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.C87518f;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58759qy;

/* compiled from: PG */
public abstract class CommunicationAction extends NewVisitableAbstractVoiceAction {

    /* renamed from: f */
    public PersonDisambiguation f236042f;

    /* renamed from: g */
    public C87518f f236043g;

    protected CommunicationAction(Parcel parcel) {
        super(parcel);
        this.f236042f = (PersonDisambiguation) parcel.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: M */
    public boolean mo81133M() {
        throw null;
    }

    /* renamed from: N */
    public abstract CommunicationAction mo81148N(PersonDisambiguation personDisambiguation);

    /* renamed from: O */
    public abstract C87515c mo81149O();

    /* renamed from: P */
    public final void mo81150P(C87518f fVar) {
        this.f236043g = fVar;
        PersonDisambiguation personDisambiguation = this.f236042f;
        if (personDisambiguation != null) {
            personDisambiguation.f236368g = fVar;
        }
    }

    /* renamed from: e */
    public final C87456t mo81064e() {
        return new C87403b(this, new C58759qy(mo81149O()), C58729pv.f156485a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f236042f, 0);
    }

    public CommunicationAction(PersonDisambiguation personDisambiguation) {
        this.f236042f = personDisambiguation;
    }
}
