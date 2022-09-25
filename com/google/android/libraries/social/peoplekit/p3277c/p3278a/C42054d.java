package com.google.android.libraries.social.peoplekit.p3277c.p3278a;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.material.button.MaterialButton;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.c.a.d */
/* compiled from: PG */
public final class C42054d {

    /* renamed from: a */
    public final Activity f109906a;

    /* renamed from: b */
    public final PeopleKitConfig f109907b;

    /* renamed from: c */
    public final View f109908c;

    /* renamed from: d */
    public String f109909d;

    /* renamed from: e */
    public final PeopleKitVisualElementPath f109910e;

    /* renamed from: f */
    public final PeopleKitSelectionModel f109911f;

    /* renamed from: g */
    public final C41960a f109912g;

    /* renamed from: h */
    public final PeopleKitDataLayer f109913h;

    /* renamed from: i */
    public final C42075e f109914i;

    /* renamed from: j */
    public C42141b f109915j;

    public C42054d(Activity activity, PeopleKitConfig peopleKitConfig, PeopleKitSelectionModel peopleKitSelectionModel, C41960a aVar, PeopleKitDataLayer peopleKitDataLayer, C42075e eVar, PeopleKitVisualElementPath peopleKitVisualElementPath, C42141b bVar) {
        this.f109906a = activity;
        this.f109907b = peopleKitConfig;
        this.f109911f = peopleKitSelectionModel;
        this.f109912g = aVar;
        this.f109913h = peopleKitDataLayer;
        this.f109914i = eVar;
        C42087a.m73675a(bVar);
        this.f109915j = bVar;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144445H));
        peopleKitVisualElementPath2.mo44564a(peopleKitVisualElementPath.f109973a);
        this.f109910e = peopleKitVisualElementPath2;
        eVar.mo44577c(-1, peopleKitVisualElementPath2);
        C42087a.m73676b(this.f109915j);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.peoplekit_message_bar, (ViewGroup) null);
        this.f109908c = inflate;
        ((MaterialButton) inflate.findViewById(R.id.peoplekit_send_button)).setOnClickListener(new C42051a(this));
        ((TextView) inflate.findViewById(R.id.peoplekit_message_bar_sharing_as)).setText(activity.getString(R.string.peoplekit_message_bar_sharing_as, new Object[]{((PeopleKitConfigImpl) peopleKitConfig).f110234a}));
        EditText editText = (EditText) inflate.findViewById(R.id.peoplekit_message_bar);
        editText.setOnFocusChangeListener(new C42052b(this, editText, eVar));
        editText.addTextChangedListener(new C42053c(this, eVar));
        mo44539b();
    }

    /* renamed from: a */
    public final String mo44538a() {
        return ((EditText) this.f109908c.findViewById(R.id.peoplekit_message_bar)).getText().toString();
    }

    /* renamed from: b */
    public final void mo44539b() {
        int i = this.f109915j.f110282a;
        if (i != 0) {
            this.f109908c.setBackgroundColor(C1878d.m5128a(this.f109906a, i));
        }
        EditText editText = (EditText) this.f109908c.findViewById(R.id.peoplekit_message_bar);
        int i2 = this.f109915j.f110286e;
        if (i2 != 0) {
            editText.setTextColor(C1878d.m5128a(this.f109906a, i2));
            ((TextView) this.f109908c.findViewById(R.id.peoplekit_message_bar_sharing_as)).setTextColor(C1878d.m5128a(this.f109906a, this.f109915j.f110286e));
            ((TextView) this.f109908c.findViewById(R.id.peoplekit_message_bar_sharing_as_helper)).setTextColor(C1878d.m5128a(this.f109906a, this.f109915j.f110286e));
        }
        int i3 = this.f109915j.f110291j;
        if (i3 != 0) {
            editText.setHintTextColor(C1878d.m5128a(this.f109906a, i3));
        }
        if (this.f109915j.f110284c != 0) {
            this.f109908c.findViewById(R.id.peoplekit_message_bar_sharing_as_container).setBackgroundColor(C1878d.m5128a(this.f109906a, this.f109915j.f110284c));
        }
        if (this.f109915j.f110293l != 0) {
            this.f109908c.findViewById(R.id.message_bar_divider).setBackgroundColor(C1878d.m5128a(this.f109906a, this.f109915j.f110293l));
        }
        MaterialButton materialButton = (MaterialButton) this.f109908c.findViewById(R.id.peoplekit_send_button);
        if (materialButton.getVisibility() == 0) {
            int i4 = this.f109915j.f110297p;
            if (i4 != 0) {
                materialButton.mo47556m(ColorStateList.valueOf(C1878d.m5128a(this.f109906a, i4)));
            }
            int i5 = this.f109915j.f110292k;
            if (i5 != 0) {
                materialButton.setTextColor(C1878d.m5128a(this.f109906a, i5));
            }
        }
    }

    /* renamed from: c */
    public final void mo44540c() {
        this.f109908c.findViewById(R.id.peoplekit_send_button).setVisibility(8);
    }
}
