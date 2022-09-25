package com.google.android.apps.gsa.shared.p7129r;

import android.content.Context;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.RadioButton;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.shared.r.p */
/* compiled from: PG */
public final class C90474p {

    /* renamed from: h */
    private static final C59071e f252728h = C59071e.m91332i("com.google.android.apps.gsa.shared.r.p");

    /* renamed from: a */
    public final C90473o f252729a;

    /* renamed from: b */
    public final Context f252730b;

    /* renamed from: c */
    public final C90466h f252731c;

    /* renamed from: d */
    public final String f252732d;

    /* renamed from: e */
    public CheckBox f252733e;

    /* renamed from: f */
    public CheckBox f252734f;

    /* renamed from: g */
    public RadioButton f252735g;

    /* renamed from: i */
    private final boolean f252736i;

    /* renamed from: j */
    private final LayoutInflater f252737j;

    /* renamed from: k */
    private final Date f252738k;

    public C90474p(Context context, C90473o oVar, C90466h hVar, String str, boolean z, Date date) {
        this.f252730b = context;
        this.f252729a = oVar;
        this.f252731c = hVar;
        this.f252736i = z;
        this.f252737j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f252732d = str;
        this.f252738k = date;
    }

    /* renamed from: a */
    public final boolean mo84223a() {
        C0391l lVar = new C0391l(this.f252730b, R.style.FeedbackAlertDialogTheme);
        lVar.mo1307l(R.string.state_dump_consent_title);
        lVar.f1347a.f1335p = new C90470l(this);
        lVar.setPositiveButton(R.string.state_dump_consent_yes, new C90472n(this, true));
        boolean z = false;
        C0392m create = lVar.setNegativeButton(R.string.state_dump_consent_no, new C90472n(this, false)).create();
        create.f1349a.mo1109d(this.f252737j.inflate(R.layout.state_dump_consent_dialog, (ViewGroup) null));
        try {
            create.show();
            View e = create.mo1197b().mo1177e(R.id.sensitive_state_dump_checkbox);
            e.getClass();
            this.f252734f = (CheckBox) e;
            View e2 = create.mo1197b().mo1177e(R.id.sensitive_state_dump_consent_save_prompt);
            e2.getClass();
            this.f252733e = (CheckBox) e2;
            String str = this.f252732d;
            if (str != null && str.equals(this.f252731c.mo84211a())) {
                z = true;
            }
            this.f252733e.setChecked(z);
            if (z) {
                this.f252734f.setChecked(this.f252731c.mo84214d());
            } else {
                this.f252734f.setChecked(true);
            }
            if (!this.f252736i || this.f252732d == null) {
                this.f252733e.setVisibility(8);
            }
            if (this.f252738k == null) {
                View e3 = create.mo1197b().mo1177e(R.id.state_dump_read_from_disk_section);
                e3.getClass();
                e3.setVisibility(8);
            } else {
                View e4 = create.mo1197b().mo1177e(R.id.state_dump_option_toggle_read_from_disk);
                e4.getClass();
                this.f252735g = (RadioButton) e4;
            }
            return true;
        } catch (WindowManager.BadTokenException unused) {
            ((C59052c) ((C59052c) f252728h.mo56225c()).mo56372aa(10584)).mo56386p("Fail to show state dump consent form: BadTokenException");
            return false;
        }
    }
}
