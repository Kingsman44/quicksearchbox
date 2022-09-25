package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.contact.Relationship;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93566bq;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58827ar;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class PersonSelectItem extends C93566bq implements C93434aa {

    /* renamed from: A */
    private TextView f260764A;

    /* renamed from: B */
    private TextView f260765B;

    /* renamed from: C */
    private TextView f260766C;

    /* renamed from: D */
    private TextView f260767D;

    /* renamed from: E */
    private TextView f260768E;

    /* renamed from: F */
    private TextView f260769F;

    /* renamed from: G */
    private ImageView f260770G;

    /* renamed from: H */
    private View f260771H;

    /* renamed from: I */
    private View f260772I;

    /* renamed from: J */
    private View f260773J;

    /* renamed from: K */
    private View f260774K;

    /* renamed from: a */
    final Resources f260775a;

    /* renamed from: b */
    public boolean f260776b;

    /* renamed from: c */
    private Person f260777c;

    /* renamed from: d */
    private boolean f260778d;

    /* renamed from: e */
    private boolean f260779e;

    /* renamed from: f */
    private boolean f260780f;

    /* renamed from: w */
    private boolean f260781w;

    /* renamed from: x */
    private boolean f260782x;

    /* renamed from: y */
    private Contact f260783y;

    /* renamed from: z */
    private C93497c f260784z;

    public PersonSelectItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: v */
    private final void m153784v() {
        m153787z(8, this.f260767D, this.f260768E, this.f260770G, this.f260769F, this.f260766C);
    }

    /* renamed from: w */
    private final boolean m153785w() {
        PersonDisambiguation personDisambiguation = (PersonDisambiguation) ((PersonArgument) this.f261447m).f236203n;
        return personDisambiguation != null && personDisambiguation.mo81543l();
    }

    /* renamed from: x */
    private static final void m153786x(TextView textView, CharSequence charSequence, boolean z, int i) {
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(charSequence);
            if (z) {
                textView.setTypeface(Typeface.DEFAULT, 2);
            }
            C89941l.m146512c(textView, i);
        }
    }

    /* renamed from: z */
    private static final void m153787z(int i, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo87734a() {
        return this.f260777c;
    }

    /* renamed from: b */
    public final void mo87735b(boolean z) {
        View view = this.f260774K;
        if (view != null) {
            if (z) {
                view.setBackgroundResource(R.drawable.person_argument_contact_pill);
            } else {
                view.setBackground((Drawable) null);
            }
        }
        View view2 = this.f260773J;
        if (view2 == null) {
            return;
        }
        if (z) {
            view2.setBackgroundResource(R.drawable.person_argument_contact_pill_catcher);
        } else {
            view2.setBackground((Drawable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo87736c() {
        super.mo87736c();
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87732f() {
        /*
            r18 = this;
            r6 = r18
            super.mo87732f()
            android.content.res.Resources r0 = r18.getResources()
            r1 = 2132085938(0x7f150cb2, float:1.9812089E38)
            java.lang.String r7 = r0.getString(r1)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r0 = r6.f261447m
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r0 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument) r0
            java.lang.Object r1 = r0.f236203n
            r8 = r1
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r8 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r8
            boolean r1 = r6.f261449o
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0.mo81317h()
            if (r1 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002f
            boolean r1 = r8.mo81544m()
            if (r1 == 0) goto L_0x002f
            r11 = 1
            goto L_0x0030
        L_0x002f:
            r11 = 0
        L_0x0030:
            int r1 = r0.mo81275j()
            r12 = 3
            if (r1 != r12) goto L_0x003f
            boolean r1 = r18.mo87740ig()
            if (r1 == 0) goto L_0x003f
            r13 = 1
            goto L_0x0040
        L_0x003f:
            r13 = 0
        L_0x0040:
            int r1 = r0.mo81275j()
            r14 = 2
            if (r1 != r14) goto L_0x004f
            boolean r1 = r18.mo87740ig()
            if (r1 == 0) goto L_0x004f
            r15 = 1
            goto L_0x0050
        L_0x004f:
            r15 = 0
        L_0x0050:
            boolean r16 = r18.m153785w()
            boolean r1 = r0.f236147h
            r5 = 8
            if (r1 == 0) goto L_0x00a5
            if (r8 == 0) goto L_0x00a5
            if (r16 != 0) goto L_0x00a5
            if (r15 != 0) goto L_0x00a5
            if (r13 != 0) goto L_0x00a5
            android.widget.TextView r0 = r6.f260764A
            r1 = 4
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.f260765B
            r0.setVisibility(r10)
            java.lang.String r0 = r8.mo81532a()
            boolean r1 = r8.mo81544m()
            if (r1 == 0) goto L_0x0083
            android.os.Parcelable r1 = r8.f236364c
            r1.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r1 = (com.google.android.apps.gsa.search.shared.contact.Person) r1
            java.lang.String r1 = r1.f236373d
            if (r1 == 0) goto L_0x0083
            r0 = r1
        L_0x0083:
            android.widget.TextView r1 = r6.f260765B
            android.content.res.Resources r2 = r18.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r10] = r0
            r0 = 2132082901(0x7f1500d5, float:1.980593E38)
            java.lang.String r0 = r2.getString(r0, r3)
            r1.setText(r0)
            android.widget.TextView r0 = r6.f260765B
            android.graphics.Typeface r1 = r0.getTypeface()
            r0.setTypeface(r1, r14)
            r18.m153784v()
            goto L_0x0213
        L_0x00a5:
            if (r16 == 0) goto L_0x0137
            boolean r0 = r6.f261449o
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r6.f260780f
            if (r0 == 0) goto L_0x00b4
            android.widget.TextView r0 = r6.f260764A
            r0.setVisibility(r5)
        L_0x00b4:
            com.google.android.apps.gsa.search.shared.contact.RelationshipStatus r0 = r8.f236395k
            com.google.android.apps.gsa.search.shared.contact.Relationship r0 = r0.f236410c
            r1 = 0
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = r0.mo81592d()
            r7 = r0
            goto L_0x00c2
        L_0x00c1:
            r7 = r1
        L_0x00c2:
            android.os.Parcelable r0 = r8.f236364c
            r0.getClass()
            r2 = r0
            com.google.android.apps.gsa.search.shared.contact.Person r2 = (com.google.android.apps.gsa.search.shared.contact.Person) r2
            boolean r0 = r8.mo81607C()
            if (r0 != 0) goto L_0x00ef
            android.os.Parcelable r0 = r8.f236364c
            r0.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r0 = (com.google.android.apps.gsa.search.shared.contact.Person) r0
            boolean r0 = r8.mo81583v()
            if (r0 != 0) goto L_0x00de
            goto L_0x00ef
        L_0x00de:
            com.google.android.apps.gsa.search.shared.contact.Contact[] r0 = new com.google.android.apps.gsa.search.shared.contact.Contact[r9]
            android.os.Parcelable r1 = r8.f236412o
            r1.getClass()
            com.google.android.apps.gsa.search.shared.contact.Contact r1 = (com.google.android.apps.gsa.search.shared.contact.Contact) r1
            r0[r10] = r1
            java.util.ArrayList r0 = com.google.common.p4522b.C58597ky.m90212c(r0)
            r3 = r0
            goto L_0x00f0
        L_0x00ef:
            r3 = r1
        L_0x00f0:
            java.util.Set r4 = r8.f236392h
            r17 = 0
            r0 = r18
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r17
            r5 = r7
            r0.mo87742k(r1, r2, r3, r4, r5)
            if (r7 != 0) goto L_0x011b
            android.content.res.Resources r0 = r18.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r9]
            android.os.Parcelable r2 = r8.f236364c
            r2.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r2 = (com.google.android.apps.gsa.search.shared.contact.Person) r2
            java.lang.String r2 = r2.f236373d
            r1[r10] = r2
            r2 = 2132085939(0x7f150cb3, float:1.981209E38)
            java.lang.String r7 = r0.getString(r2, r1)
            goto L_0x0213
        L_0x011b:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r14]
            android.os.Parcelable r2 = r8.f236364c
            r2.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r2 = (com.google.android.apps.gsa.search.shared.contact.Person) r2
            java.lang.String r2 = r2.f236373d
            r1[r10] = r2
            r1[r9] = r7
            r2 = 2132085940(0x7f150cb4, float:1.9812093E38)
            java.lang.String r7 = r0.getString(r2, r1)
            goto L_0x0213
        L_0x0137:
            if (r13 == 0) goto L_0x0169
            android.widget.TextView r0 = r6.f260766C
            android.content.res.Resources r1 = r18.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = r8.f236394j
            r2[r10] = r3
            r3 = 2132090081(0x7f151ce1, float:1.9820492E38)
            java.lang.String r1 = r1.getString(r3, r2)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            android.content.res.Resources r0 = r18.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r2 = r8.f236394j
            r1[r10] = r2
            r2 = 2132090082(0x7f151ce2, float:1.9820494E38)
            java.lang.String r7 = r0.getString(r2, r1)
            r18.m153784v()
            goto L_0x0213
        L_0x0169:
            if (r15 == 0) goto L_0x01e6
            java.util.Set r0 = r0.mo81316g()
            int r1 = r0.size()
            r2 = 2132085928(0x7f150ca8, float:1.9812069E38)
            r3 = 2132085927(0x7f150ca7, float:1.9812067E38)
            if (r1 != r9) goto L_0x01af
            com.google.android.apps.gsa.search.shared.contact.c r1 = com.google.android.apps.gsa.search.shared.contact.C87515c.EMAIL
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            com.google.android.apps.gsa.search.shared.contact.c r0 = (com.google.android.apps.gsa.search.shared.contact.C87515c) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01a9
            if (r0 == r9) goto L_0x01a2
            if (r0 == r14) goto L_0x019b
            if (r0 == r12) goto L_0x0194
            goto L_0x01af
        L_0x0194:
            r3 = 2132085931(0x7f150cab, float:1.9812075E38)
            r2 = 2132085932(0x7f150cac, float:1.9812077E38)
            goto L_0x01af
        L_0x019b:
            r3 = 2132085935(0x7f150caf, float:1.9812083E38)
            r2 = 2132085936(0x7f150cb0, float:1.9812085E38)
            goto L_0x01af
        L_0x01a2:
            r3 = 2132085933(0x7f150cad, float:1.9812079E38)
            r2 = 2132085934(0x7f150cae, float:1.981208E38)
            goto L_0x01af
        L_0x01a9:
            r3 = 2132085929(0x7f150ca9, float:1.981207E38)
            r2 = 2132085930(0x7f150caa, float:1.9812073E38)
        L_0x01af:
            android.widget.TextView r0 = r6.f260766C
            android.content.res.Resources r1 = r18.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r9]
            android.os.Parcelable r5 = r8.f236364c
            r5.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r5 = (com.google.android.apps.gsa.search.shared.contact.Person) r5
            java.lang.String r5 = r5.f236373d
            r4[r10] = r5
            java.lang.String r1 = r1.getString(r3, r4)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            android.content.res.Resources r0 = r18.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r9]
            android.os.Parcelable r3 = r8.f236364c
            r3.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r3 = (com.google.android.apps.gsa.search.shared.contact.Person) r3
            java.lang.String r3 = r3.f236373d
            r1[r10] = r3
            java.lang.String r7 = r0.getString(r2, r1)
            r18.m153784v()
            goto L_0x0213
        L_0x01e6:
            boolean r0 = r0.mo81317h()
            if (r0 == 0) goto L_0x020a
            if (r11 == 0) goto L_0x0206
            android.os.Parcelable r0 = r8.f236364c
            r0.getClass()
            r1 = r0
            com.google.android.apps.gsa.search.shared.contact.Person r1 = (com.google.android.apps.gsa.search.shared.contact.Person) r1
            com.google.android.apps.gsa.search.shared.contact.c r0 = com.google.android.apps.gsa.search.shared.contact.C87515c.PERSON
            com.google.common.b.qy r3 = new com.google.common.b.qy
            r3.<init>(r0)
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r18
            r0.mo87742k(r1, r2, r3, r4, r5)
            goto L_0x0213
        L_0x0206:
            r18.m153784v()
            goto L_0x0213
        L_0x020a:
            boolean r0 = r18.mo87740ig()
            if (r0 != 0) goto L_0x0213
            r18.m153784v()
        L_0x0213:
            r6.setContentDescription(r7)
            if (r13 != 0) goto L_0x0227
            if (r15 == 0) goto L_0x021b
            goto L_0x0227
        L_0x021b:
            android.view.View[] r0 = new android.view.View[r9]
            android.widget.TextView r1 = r6.f260766C
            r0[r10] = r1
            r1 = 8
            m153787z(r1, r0)
            goto L_0x0241
        L_0x0227:
            r1 = 8
            android.view.View[] r0 = new android.view.View[r9]
            android.widget.TextView r2 = r6.f260766C
            r0[r10] = r2
            m153787z(r10, r0)
            com.google.android.apps.gsa.staticplugins.actionsui.c r0 = r6.f260784z
            if (r0 == 0) goto L_0x0241
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x0241
            com.google.android.apps.gsa.staticplugins.actionsui.c r0 = r6.f260784z
            r0.cancel(r9)
        L_0x0241:
            boolean r0 = r6.f261449o
            if (r0 != 0) goto L_0x0249
            if (r16 == 0) goto L_0x0249
            r0 = 1
            goto L_0x024a
        L_0x0249:
            r0 = 0
        L_0x024a:
            r6.mo87735b(r0)
            if (r16 != 0) goto L_0x0255
            if (r11 == 0) goto L_0x0252
            goto L_0x0255
        L_0x0252:
            r5 = 8
            goto L_0x0256
        L_0x0255:
            r5 = 0
        L_0x0256:
            android.view.View[] r0 = new android.view.View[r12]
            android.view.View r1 = r6.f260772I
            r0[r10] = r1
            android.view.View r1 = r6.f260773J
            r0[r9] = r1
            android.view.View r1 = r6.f260774K
            r0[r14] = r1
            m153787z(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.PersonSelectItem.mo87732f():void");
    }

    /* renamed from: g */
    public final boolean mo87737g() {
        if (this.f261447m == null) {
            return true;
        }
        if (m153785w()) {
            return false;
        }
        return mo87983C();
    }

    /* renamed from: h */
    public final boolean mo87738h() {
        if (this.f261253h || this.f261447m == null) {
            return true;
        }
        return !m153785w() && !this.f261449o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ boolean mo87739i(Argument argument) {
        PersonArgument personArgument = (PersonArgument) argument;
        if (this.f261449o && personArgument.mo81260hB() && personArgument.mo81317h()) {
            return true;
        }
        PersonDisambiguation personDisambiguation = (PersonDisambiguation) personArgument.f236203n;
        boolean z = personDisambiguation != null && (personDisambiguation.mo81543l() || personDisambiguation.mo81607C());
        if (this.f260780f && this.f260770G != null && z) {
            Parcelable parcelable = personDisambiguation.f236364c;
            parcelable.getClass();
            if (((Person) parcelable).f236371b == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: ig */
    public final boolean mo87740ig() {
        if (this.f261449o && ((PersonArgument) this.f261447m).mo81260hB() && ((PersonArgument) this.f261447m).mo81317h()) {
            return true;
        }
        if (!super.mo87740ig() || ((PersonArgument) this.f261447m).mo81317h()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final View[] mo87741j() {
        View view = this.f260772I;
        if (view != null) {
            return new View[]{view};
        } else if (((PersonArgument) this.f261447m).mo81291z()) {
            return new View[]{this.f260766C};
        } else {
            ArrayList c = C58597ky.m90212c(this.f260770G, this.f260767D, this.f260768E);
            TextView textView = this.f260769F;
            if (textView != null) {
                c.add(textView);
            }
            return (View[]) c.toArray(new View[c.size()]);
        }
    }

    /* renamed from: k */
    public final void mo87742k(Person person, List list, Set set, Comparator comparator, String str) {
        String str2;
        String str3;
        boolean z;
        String str4;
        this.f260777c = person;
        m153786x(this.f260767D, person.f236373d, false, 6738);
        String str5 = null;
        if (list == null) {
            str3 = null;
            str2 = null;
        } else {
            if (list.size() != 1 || (set != null && set.size() > 1)) {
                if (comparator != null) {
                    Collections.sort(list, comparator);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Contact contact = (Contact) it.next();
                    C87515c cVar = contact.f236350a;
                    C87515c cVar2 = C87515c.EMAIL;
                    int ordinal = cVar.ordinal();
                    if (ordinal == 0) {
                        linkedHashSet2.add(this.f260775a.getString(R.string.person_select_item_email_app_name));
                    } else if (ordinal == 1) {
                        linkedHashSet2.add(this.f260775a.getString(R.string.person_select_item_sms_app_name));
                    } else if (ordinal == 3) {
                        try {
                            PackageManager packageManager = getContext().getPackageManager();
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.google.android.talk", 0);
                            if (applicationInfo != null && applicationInfo.enabled) {
                                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                                String obj = applicationLabel != null ? applicationLabel.toString() : null;
                                if (!TextUtils.isEmpty(obj)) {
                                    linkedHashSet2.add(obj);
                                } else {
                                    linkedHashSet2.add(this.f260775a.getString(R.string.person_select_item_hangouts_app_name));
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    } else if (ordinal == 4) {
                        String str6 = contact.f236357h;
                        if (!TextUtils.isEmpty(str6)) {
                            linkedHashSet2.add(str6);
                        }
                    }
                    String str7 = contact.f236355f;
                    if (!TextUtils.isEmpty(str7)) {
                        linkedHashSet.add(str7);
                    }
                }
                String string = getResources().getString(R.string.person_select_item_secondary_text_delimiter);
                if (set == null || set.size() <= 1) {
                    str3 = TextUtils.join(string, linkedHashSet);
                } else {
                    str3 = TextUtils.join(string, linkedHashSet2);
                }
            } else {
                Contact contact2 = (Contact) list.get(0);
                this.f260783y = contact2;
                if (contact2.f236350a.f236427g) {
                    str3 = contact2.mo81519d();
                    str2 = this.f260783y.f236355f;
                } else {
                    str3 = contact2.f236355f;
                }
            }
            str2 = null;
        }
        if (this.f260776b) {
            C58827ar arVar = new C58827ar(", ");
            Set<Relationship> unmodifiableSet = Collections.unmodifiableSet(person.f236388s);
            HashSet g = C58758qx.m90649g(unmodifiableSet.size());
            for (Relationship relationship : unmodifiableSet) {
                g.add(relationship.mo81589a(relationship.f236405a));
            }
            str3 = arVar.mo56098e(C58570jy.m90158j(g.iterator(), Collections.unmodifiableSet(person.f236389t).iterator()));
        }
        if (person.f236382m) {
            Context context = getContext();
            Object[] objArr = new Object[1];
            if (!TextUtils.isEmpty(person.f236383n)) {
                if (person.f236383n.length() == 1) {
                    str5 = person.f236383n.toUpperCase(person.f236370a);
                } else {
                    str5 = String.valueOf(person.f236383n.substring(0, 1).toUpperCase(person.f236370a)).concat(String.valueOf(person.f236383n.substring(1)));
                }
            }
            objArr[0] = str5;
            str3 = context.getString(R.string.inferred_from_gmail, objArr);
            z = true;
        } else {
            z = false;
        }
        PersonArgument personArgument = (PersonArgument) this.f261447m;
        C58838bb.m90883r(personArgument == null || !personArgument.mo81318i());
        if (TextUtils.isEmpty(str3)) {
            m153787z(8, this.f260768E);
            if (TextUtils.isEmpty(str2)) {
                str4 = getResources().getString(R.string.person_select_item_content_description_nolabel, new Object[]{person.f236373d});
            } else {
                str4 = getResources().getString(R.string.person_select_item_content_description, new Object[]{person.f236373d, str2});
            }
        } else {
            m153786x(this.f260768E, str3, z, true != person.f236382m ? 6733 : 8600);
            str4 = getResources().getString(R.string.person_select_item_content_description, new Object[]{person.f236373d, str3});
        }
        setContentDescription(str4);
        if (!TextUtils.isEmpty(str)) {
            m153786x(this.f260769F, str, false, 7299);
        } else {
            m153787z(8, this.f260769F);
        }
        if (this.f260778d) {
            m153787z(8, this.f260771H);
        } else {
            m153787z(0, this.f260771H);
        }
        ImageView imageView = this.f260770G;
        if (imageView == null || person.f236371b == 0) {
            m153787z(8, imageView, this.f260767D, this.f260769F);
            return;
        }
        C93474bb bbVar = new C93474bb(this.f260775a, this.f260770G, this.f260781w, this.f260782x);
        this.f260784z = bbVar;
        bbVar.execute(new Person[]{person});
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f260764A = (TextView) findViewById(R.id.argument_label);
        this.f260765B = (TextView) findViewById(R.id.argument_prompt);
        this.f260766C = (TextView) findViewById(R.id.argument_value);
        this.f260767D = (TextView) findViewById(R.id.contact_name);
        this.f260768E = (TextView) findViewById(R.id.contact_value);
        this.f260769F = (TextView) findViewById(R.id.contact_pending_relationship);
        this.f260770G = (ImageView) findViewById(R.id.contact_image);
        this.f260771H = findViewById(R.id.action_editor_message_separator);
        this.f260772I = findViewById(R.id.contact_pill);
        this.f260773J = findViewById(R.id.contact_pill_click_catcher);
        this.f260774K = findViewById(R.id.contact_pill_content);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        TextView textView;
        super.setOnClickListener(onClickListener);
        if (this.f260779e && (textView = this.f260767D) != null) {
            textView.setTextColor(getResources().getColorStateList(R.color.card_link_text));
            this.f260767D.setTypeface(Typeface.create("sans-serif-condensed", 2));
        }
    }

    public PersonSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f260775a = context.getResources();
        context.getContentResolver();
        C89941l.m146512c(this, 6737);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C93480bh.f260876a, i, 0);
        this.f260781w = obtainStyledAttributes.getBoolean(1, false);
        this.f260782x = obtainStyledAttributes.getBoolean(4, false);
        this.f260778d = obtainStyledAttributes.getBoolean(3, false);
        this.f260779e = obtainStyledAttributes.getBoolean(0, false);
        this.f260780f = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }
}
