package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.os.Parcelable;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.core.CommunicationAction;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.q */
/* compiled from: PG */
public abstract class C93692q extends C93507m implements C93691p {

    /* renamed from: e */
    protected ContactDisambiguationView f261494e;

    /* renamed from: f */
    protected TextView f261495f = ((TextView) findViewById(R.id.contact_not_found));

    public C93692q(Context context) {
        super(context, "CommunicationActionCImp");
    }

    /* renamed from: d */
    public final void mo88145d(PersonDisambiguation personDisambiguation) {
        TextView textView = this.f261495f;
        if (textView != null) {
            textView.setVisibility(8);
        }
        mo88146v(true);
        this.f261494e.setClickable(false);
        this.f261494e.mo87721c(personDisambiguation, new C58759qy(C87515c.PERSON), (Comparator) null);
        mo88147w(false, true);
        Parcelable parcelable = personDisambiguation.f236364c;
        parcelable.getClass();
        if (((Person) parcelable).f236372c == null) {
            mo87835p(false);
            return;
        }
        mo87832m(101);
        mo87835p(true);
        mo87833n(R.string.remember);
        mo87834o(7287);
        mo87831l(R.drawable.ic_action_check);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo88146v(boolean z) {
        this.f261494e.setVisibility(true != z ? 8 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo88147w(boolean z, boolean z2) {
        if (z) {
            mo87831l(R.drawable.ic_action_people_all);
            mo87833n(true != z2 ? R.string.contact_select_dialog_find_contact : R.string.contact_select_dialog_find_another_contact);
            mo87832m(100);
            C89941l.m146512c(findViewById(R.id.action_confirm_bar), 6735);
        }
        mo87835p(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo87830k(int i) {
        if (i == 100) {
            C88507a aVar = this.f239232a;
            aVar.getClass();
            ((C93693r) aVar).mo82051n();
        } else if (i == 101) {
            mo87835p(false);
            C88507a aVar2 = this.f239232a;
            aVar2.getClass();
            C93693r rVar = (C93693r) aVar2;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 153;
            int i2 = rVar.mo82042e().f146230cP;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164093a |= 256;
            ufVar2.f164264s = i2;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            rVar.f239225a.mo82112t(((CommunicationAction) rVar.f239226b).f236042f);
            ((CommunicationAction) rVar.f239226b).f235985a.mo81126n();
            rVar.mo82050m(2, 3);
            rVar.f239225a.mo82075B(rVar.f239226b);
            rVar.mo82057t();
            rVar.f239225a.mo82100h(false, rVar.f239226b);
        } else {
            super.mo87830k(i);
        }
    }
}
