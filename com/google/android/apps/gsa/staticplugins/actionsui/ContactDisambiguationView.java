package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.contact.TwoStepDisambiguation;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class ContactDisambiguationView extends C93437ad {

    /* renamed from: f */
    private final View.OnClickListener f260743f;

    /* renamed from: g */
    private ViewGroup f260744g;

    /* renamed from: h */
    private ViewGroup f260745h;

    public ContactDisambiguationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.util.Set, java.lang.Object] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ android.view.View mo87719a(android.os.Parcelable r7, java.lang.Object r8, boolean r9, java.util.Comparator r10) {
        /*
            r6 = this;
            r1 = r7
            com.google.android.apps.gsa.search.shared.contact.Person r1 = (com.google.android.apps.gsa.search.shared.contact.Person) r1
            if (r9 == 0) goto L_0x0011
            boolean r7 = r6.f260792e
            if (r7 == 0) goto L_0x000d
            r7 = 2131625687(0x7f0e06d7, float:1.887859E38)
            goto L_0x001c
        L_0x000d:
            r7 = 2131626391(0x7f0e0997, float:1.8880017E38)
            goto L_0x001c
        L_0x0011:
            boolean r7 = r6.f260792e
            if (r7 == 0) goto L_0x0019
            r7 = 2131625688(0x7f0e06d8, float:1.8878591E38)
            goto L_0x001c
        L_0x0019:
            r7 = 2131626393(0x7f0e0999, float:1.888002E38)
        L_0x001c:
            android.view.LayoutInflater r0 = r6.f260789b
            r2 = 0
            android.view.View r7 = r0.inflate(r7, r6, r2)
            com.google.android.apps.gsa.staticplugins.actionsui.PersonSelectItem r7 = (com.google.android.apps.gsa.staticplugins.actionsui.PersonSelectItem) r7
            r7.mo87735b(r2)
            r7.mo87736c()
            int r0 = r1.f236390u
            if (r0 != 0) goto L_0x0031
            r0 = 6737(0x1a51, float:9.44E-42)
        L_0x0031:
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r7, r0)
            r0 = 2131429932(0x7f0b0a2c, float:1.848155E38)
            android.view.View r0 = r7.findViewById(r0)
            r2 = 6738(0x1a52, float:9.442E-42)
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r0, r2)
            r7.f260776b = r9
            if (r9 != 0) goto L_0x0059
            com.google.android.apps.gsa.search.shared.contact.c r9 = com.google.android.apps.gsa.search.shared.contact.C87515c.PERSON
            boolean r9 = r8.contains(r9)
            if (r9 != 0) goto L_0x0059
            r9 = 0
            java.util.List r2 = r1.mo81562k(r8, r9)
            r5 = 0
            r0 = r7
            r3 = r8
            r4 = r10
            r0.mo87742k(r1, r2, r3, r4, r5)
            goto L_0x0061
        L_0x0059:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            r0.mo87742k(r1, r2, r3, r4, r5)
        L_0x0061:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.ContactDisambiguationView.mo87719a(android.os.Parcelable, java.lang.Object, boolean, java.util.Comparator):android.view.View");
    }

    /* renamed from: b */
    public final void mo87720b(C93436ac acVar) {
        C58838bb.m90868c(acVar instanceof C93696u);
        this.f260791d = acVar;
    }

    /* renamed from: c */
    public final void mo87721c(Disambiguation disambiguation, Set set, Comparator comparator) {
        super.mo87751e(disambiguation, set, comparator);
        List list = ((TwoStepDisambiguation) disambiguation).f236411n;
        if (!disambiguation.mo81544m() || list == null || list.isEmpty() || (disambiguation.mo81544m() && ((PersonDisambiguation) disambiguation).f236395k.mo81601c())) {
            this.f260744g.setVisibility(8);
            if (this.f260792e) {
                if (this.f260745h == null) {
                    this.f260745h = (ViewGroup) inflate(getContext(), R.layout.immersive_person_disambig_title, (ViewGroup) null);
                }
                ViewGroup viewGroup = this.f260745h;
                C89941l.m146512c(viewGroup, 21999);
                viewGroup.setVisibility(0);
                addView(viewGroup, 0);
                ((TextView) viewGroup.findViewById(R.id.contact_name)).setText(getResources().getString(R.string.actionsui_immersive_contact_disambiguation_header_label, new Object[]{disambiguation.mo81532a()}));
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.f260744g;
        viewGroup2.setVisibility(0);
        this.f260744g.removeAllViews();
        if (this.f260744g.getParent() == null) {
            addView(this.f260744g);
        }
        boolean z = this.f260792e;
        int i = true != z ? R.layout.disambiguation_item_divider_for_sub_items : R.layout.immersive_disambiguation_sub_item_divider;
        int i2 = true != z ? R.layout.contact_detail_select_item : R.layout.immersive_contact_detail_select_item;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ContactDetailSelectItem contactDetailSelectItem = (ContactDetailSelectItem) this.f260789b.inflate(i2, viewGroup2, false);
            Contact contact = (Contact) list.get(i3);
            contact.getClass();
            contactDetailSelectItem.f260742a = contact;
            C58838bb.m90868c(contact.mo81529l());
            if (contact.f236350a.f236427g) {
                contactDetailSelectItem.mo87718b(R.id.contact_detail_value, contact.mo81519d());
            } else {
                contactDetailSelectItem.mo87717a(R.id.contact_detail_value);
            }
            String str = contact.f236355f;
            if (TextUtils.isEmpty(str)) {
                contactDetailSelectItem.mo87717a(R.id.contact_detail_label);
            } else {
                contactDetailSelectItem.mo87718b(R.id.contact_detail_label, str);
            }
            C89941l.m146512c(contactDetailSelectItem, 6734);
            C89941l.m146512c(contactDetailSelectItem.findViewById(R.id.contact_detail_label), 6732);
            C89941l.m146512c(contactDetailSelectItem.findViewById(R.id.contact_detail_value), 6733);
            viewGroup2.addView(contactDetailSelectItem);
            this.f260790c.add(contactDetailSelectItem);
            if (i3 < size - 1) {
                mo87750d(this.f260789b, viewGroup2, i);
            }
            if (size != 1) {
                contactDetailSelectItem.setOnClickListener(this.f260743f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f260744g = (ViewGroup) findViewById(R.id.contact_details);
    }

    public ContactDisambiguationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactDisambiguationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f260743f = new C93695t(this);
    }
}
