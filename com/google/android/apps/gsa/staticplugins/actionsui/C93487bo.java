package com.google.android.apps.gsa.staticplugins.actionsui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58759qy;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bo */
/* compiled from: PG */
public final class C93487bo extends C93692q implements C93488bp {

    /* renamed from: g */
    public LinearLayout f260902g;

    /* renamed from: h */
    private final View.OnClickListener f260903h = new C93483bk(this);

    /* renamed from: i */
    private final View.OnClickListener f260904i = new C93484bl(this);

    /* renamed from: j */
    private final View.OnClickListener f260905j = new C93485bm(this);

    /* renamed from: k */
    private final LayoutInflater f260906k = ((LayoutInflater) getContext().getSystemService("layout_inflater"));

    /* renamed from: l */
    private C93498d f260907l;

    /* renamed from: m */
    private View f260908m;

    /* renamed from: n */
    private TextView f260909n;

    /* renamed from: o */
    private LinearLayout f260910o;

    /* renamed from: p */
    private ImageView f260911p;

    public C93487bo(Context context) {
        super(context);
    }

    /* renamed from: H */
    private final void m153924H(List list, int i) {
        List list2 = list;
        int i2 = i;
        if (list2 != null && !list.isEmpty()) {
            ViewGroup viewGroup = null;
            LinearLayout linearLayout = (LinearLayout) this.f260906k.inflate(R.layout.qp_contact_info_group, (ViewGroup) null);
            int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics());
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                Contact contact = (Contact) list2.get(i3);
                LinearLayout linearLayout2 = (LinearLayout) this.f260906k.inflate(R.layout.qp_contact_info, viewGroup);
                linearLayout2.setTag(contact);
                ImageView imageView = (ImageView) linearLayout2.findViewById(R.id.action_icon);
                LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(R.id.contact_detail_info);
                if (i3 == 0) {
                    if (i2 == 0 || i2 == 1) {
                        imageView.setImageResource(R.drawable.quantum_ic_call_white_24);
                    } else if (i2 != 2) {
                        imageView.setImageResource(R.drawable.ic_place);
                    } else {
                        imageView.setImageResource(R.drawable.ic_email);
                    }
                    linearLayout2.findViewById(R.id.separator).setVisibility(8);
                    linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop() + applyDimension, linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
                    i3 = 0;
                }
                if (i3 == size - 1) {
                    linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom() + applyDimension);
                }
                TextView textView = (TextView) linearLayout2.findViewById(R.id.value);
                textView.setText(contact.f236354e);
                ((TextView) linearLayout2.findViewById(R.id.label)).setText(contact.f236355f);
                if (i2 == 0 || i2 == 1) {
                    linearLayout2.setOnClickListener(this.f260903h);
                    textView.setLineSpacing(0.0f, 1.0f);
                } else if (i2 != 2) {
                    linearLayout2.setOnClickListener(this.f260905j);
                    textView.setMaxLines(5);
                } else {
                    linearLayout2.setOnClickListener(this.f260904i);
                    textView.setLineSpacing(0.0f, 1.0f);
                }
                linearLayout.addView(linearLayout2);
                i3++;
                viewGroup = null;
            }
            this.f260910o.addView(linearLayout);
        }
    }

    /* renamed from: I */
    private final void m153925I(int i, boolean z) {
        this.f260902g.setVisibility(true != z ? 8 : 0);
        this.f260910o.removeAllViews();
        mo87833n(i);
        C88507a aVar = this.f239232a;
        aVar.getClass();
        ((C93489bq) aVar).mo87824F();
    }

    /* renamed from: A */
    public final void mo87783A() {
        m153925I(R.string.show_contact_information_edit_contact, true);
    }

    /* renamed from: B */
    public final void mo87784B(List list) {
        m153924H(list, 2);
    }

    /* renamed from: C */
    public final void mo87785C() {
        this.f260902g.setVisibility(8);
        this.f260910o.removeAllViews();
        this.f261495f.setVisibility(0);
        mo88147w(true, false);
    }

    /* renamed from: D */
    public final void mo87786D() {
        m153925I(R.string.show_contact_information_edit_contact, true);
    }

    /* renamed from: E */
    public final void mo87787E(List list, boolean z) {
        m153924H(list, z ? 1 : 0);
    }

    /* renamed from: F */
    public final void mo87788F() {
        m153925I(R.string.show_contact_information_edit_contact, true);
    }

    /* renamed from: G */
    public final void mo87789G(List list) {
        m153924H(list, 3);
    }

    /* renamed from: a */
    public final void mo87790a(PersonDisambiguation personDisambiguation) {
        C87515c cVar = C87515c.PHONE_NUMBER;
        C88507a aVar = this.f239232a;
        aVar.getClass();
        int i = ((ShowContactInformationAction) ((C93489bq) aVar).f239226b).f236057i;
        if (i == 1) {
            cVar = C87515c.PHONE_NUMBER;
        } else if (i == 2) {
            cVar = C87515c.EMAIL;
        } else if (i == 3) {
            cVar = C87515c.POSTAL_ADDRESS;
        }
        this.f261494e.mo87721c(personDisambiguation, new C58759qy(cVar), (Comparator) null);
        this.f261494e.setVisibility(0);
        mo88147w(!personDisambiguation.mo81544m(), true);
        mo88147w(false, false);
        this.f260908m.setVisibility(8);
    }

    /* renamed from: ie */
    public final void mo87791ie() {
        this.f261495f.setText(R.string.action_contact_not_found);
        this.f261495f.setVisibility(0);
        m153925I(R.string.contact_select_dialog_find_contact, false);
    }

    /* renamed from: if */
    public final void mo87792if() {
        m153925I(R.string.show_contact_information_edit_contact, true);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C93487bo.class.getCanonicalName());
    }

    /* renamed from: q */
    public final void mo87794q() {
    }

    /* renamed from: t */
    public final View mo87752t(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C93498d i = mo87828i(layoutInflater, viewGroup, R.layout.show_contact_information_card);
        this.f260907l = i;
        View findViewById = i.findViewById(R.id.action_card_content_view);
        this.f260908m = findViewById;
        findViewById.setVisibility(8);
        this.f261494e = (ContactDisambiguationView) this.f260907l.findViewById(R.id.contact_disambiguation_view);
        this.f261494e.mo87720b(new C93431a(this));
        this.f261494e.setLayoutTransition(new LayoutTransition());
        mo88146v(false);
        this.f261495f = (TextView) this.f260908m.findViewById(R.id.contact_not_found);
        this.f260902g = (LinearLayout) this.f260908m.findViewById(R.id.qp_contact_profile_container);
        this.f260911p = (ImageView) this.f260908m.findViewById(R.id.headshot);
        this.f260909n = (TextView) this.f260902g.findViewById(R.id.qp_contact_name);
        this.f260910o = (LinearLayout) this.f260908m.findViewById(R.id.qp_contact_detail_info);
        this.f260907l.mo87711m();
        this.f260907l.mo87704g(true);
        return this.f260907l;
    }

    /* renamed from: x */
    public final void mo87795x() {
        this.f260910o.removeAllViews();
        this.f261495f.setVisibility(8);
    }

    /* renamed from: y */
    public final void mo87796y(Person person) {
        this.f260909n.setText(person.f236373d);
        if (person.f236371b > 0) {
            new C93486bn(this, getResources(), this.f260911p).execute(new Person[]{person});
        }
        this.f260910o.removeAllViews();
    }

    /* renamed from: z */
    public final void mo87797z(boolean z, boolean z2) {
        mo88146v(!z);
        int i = 0;
        if (z2) {
            mo87831l(R.drawable.quantum_ic_mode_edit_white_24);
            mo87833n(R.string.show_contact_information_edit_contact);
            mo87832m(0);
            mo87835p(true);
        }
        if (z && this.f260908m.getVisibility() != 0) {
            setVisibility(8);
            setVisibility(0);
        }
        View view = this.f260908m;
        if (true != z) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
