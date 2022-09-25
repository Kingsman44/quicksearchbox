package com.google.android.libraries.abuse.reporting;

import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel;
import com.google.p335a.p336a.C6582d;
import com.google.p335a.p336a.C6594p;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.abuse.reporting.ao */
/* compiled from: PG */
public final class C146726ao extends Fragment {

    /* renamed from: a */
    public String f396232a;

    /* renamed from: b */
    public String f396233b;

    /* renamed from: c */
    public String f396234c;

    /* renamed from: d */
    public String f396235d;

    /* renamed from: e */
    public String f396236e;

    /* renamed from: f */
    public String f396237f;

    /* renamed from: g */
    public String f396238g;

    /* renamed from: h */
    public String f396239h;

    /* renamed from: i */
    public LinearLayout f396240i;

    /* renamed from: j */
    public ReportAbuseHorizontalScrollView f396241j;

    /* renamed from: k */
    public int f396242k = 0;

    /* renamed from: l */
    public Handler f396243l;

    /* renamed from: m */
    private ProgressBar f396244m;

    /* renamed from: n */
    private RelativeLayout f396245n;

    /* renamed from: o */
    private Button f396246o;

    /* renamed from: p */
    private Button f396247p;

    /* renamed from: q */
    private Button f396248q;

    /* renamed from: r */
    private Button f396249r;

    /* renamed from: s */
    private ImageButton f396250s;

    /* renamed from: t */
    private Button f396251t;

    /* renamed from: a */
    public final int mo123556a() {
        return getView().findViewById(R.id.cards_area).getWidth() / this.f396242k;
    }

    /* renamed from: b */
    public final int mo123557b() {
        return mo123565j() ? -mo123556a() : mo123556a();
    }

    /* renamed from: c */
    public final void mo123558c(ReportAbuseCardConfigParcel reportAbuseCardConfigParcel) {
        ViewGroup viewGroup = (ViewGroup) getView();
        C146713ab abVar = (C146713ab) getActivity();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uraw_card, (ViewGroup) viewGroup.findViewById(R.id.cards_area), false);
        ((TextView) inflate.findViewById(R.id.card_header_text)).setText(reportAbuseCardConfigParcel.f396175a);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.card_content_area);
        ArrayList arrayList = reportAbuseCardConfigParcel.f396176b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C6594p pVar = (C6594p) arrayList.get(i);
            C146714ac.m239056b(pVar.f19608g, pVar.f19609h, 0, C146714ac.m239055a(pVar.f19608g), viewGroup2, abVar);
        }
        ArrayList arrayList2 = reportAbuseCardConfigParcel.f396177c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C6582d dVar = (C6582d) arrayList2.get(i2);
            if (dVar.f19575c != 0) {
                C146714ac.m239056b(dVar.f19574b, dVar.f19577e, 1, C146714ac.m239055a(dVar.f19574b), viewGroup2, abVar);
            }
        }
        if (reportAbuseCardConfigParcel.f396178d != null) {
            TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_message, viewGroup2, false);
            textView.setText(reportAbuseCardConfigParcel.f396178d.f19592e);
            viewGroup2.addView(textView);
        }
        ReportAbuseCardConfigParcel.ButtonState buttonState = reportAbuseCardConfigParcel.f396182h;
        if (buttonState != null) {
            ((RadioButton) viewGroup2.getChildAt(buttonState.f396183a)).setChecked(true);
        }
        this.f396240i.addView(inflate, new RelativeLayout.LayoutParams(viewGroup.getWidth(), (viewGroup.getHeight() - viewGroup.findViewById(R.id.component_header).getHeight()) - viewGroup.findViewById(R.id.footer_buttons_area).getHeight()));
        this.f396242k++;
    }

    /* renamed from: d */
    public final void mo123559d(int i, boolean z) {
        Button button = (Button) getView().findViewById(R.id.accept_message_button);
        Button button2 = (Button) getView().findViewById(R.id.done_button);
        Button button3 = (Button) getView().findViewById(R.id.next_button);
        Button button4 = (Button) getView().findViewById(R.id.submit_button);
        button.setVisibility(8);
        button2.setVisibility(8);
        button3.setVisibility(8);
        button4.setVisibility(8);
        if (i != 0) {
            if (i != 1) {
                button = i != 2 ? i != 3 ? i != 4 ? null : button4 : button3 : button2;
            }
            button.setEnabled(z);
            button.setVisibility(0);
        }
    }

    /* renamed from: e */
    public final void mo123560e(boolean z) {
        this.f396246o.setEnabled(z);
        this.f396247p.setEnabled(z);
        this.f396248q.setEnabled(z);
        this.f396249r.setEnabled(z);
        this.f396250s.setEnabled(z);
        this.f396251t.setEnabled(z);
    }

    /* renamed from: f */
    public final void mo123561f() {
        this.f396245n.setVisibility(0);
        this.f396244m.setVisibility(8);
    }

    /* renamed from: g */
    public final void mo123562g() {
        this.f396245n.setVisibility(8);
        this.f396244m.setVisibility(0);
    }

    /* renamed from: h */
    public final void mo123563h() {
        if (this.f396240i.getChildCount() > 0) {
            for (int i = 0; i < this.f396240i.getChildCount() - 1; i++) {
                View childAt = this.f396240i.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    childAt.setFocusable(false);
                    ((ViewGroup) childAt).setDescendantFocusability(393216);
                }
            }
            LinearLayout linearLayout = this.f396240i;
            View childAt2 = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt2 instanceof ViewGroup) {
                childAt2.setFocusable(true);
                ((ViewGroup) childAt2).setDescendantFocusability(C89885b.HTTP_VALUE);
                View findViewById = childAt2.findViewById(R.id.card_header_text);
                if (findViewById != null) {
                    findViewById.sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123564i(com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r7) {
        /*
            r6 = this;
            int r0 = r7.f396181g
            com.google.a.a.j r1 = r7.f396178d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel$ButtonState r2 = r7.f396182h
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0023
            java.util.ArrayList r2 = r7.f396177c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0018
            if (r0 == r3) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 2
            goto L_0x0023
        L_0x0018:
            if (r0 == r5) goto L_0x0023
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.f19590c
            if (r1 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            r6.mo123559d(r0, r1)
            int r7 = r7.f396180f
            android.view.View r0 = r6.getView()
            r1 = 2131436775(0x7f0b24e7, float:1.849543E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            android.view.View r1 = r6.getView()
            r2 = 2131429228(0x7f0b076c, float:1.8480123E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r2 = 8
            r0.setVisibility(r2)
            r1.setVisibility(r2)
            if (r7 == r5) goto L_0x0054
            if (r7 == r3) goto L_0x0050
            return
        L_0x0050:
            r0.setVisibility(r4)
            return
        L_0x0054:
            r1.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146726ao.mo123564i(com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel):void");
    }

    /* renamed from: j */
    public final boolean mo123565j() {
        return C2043bi.m5577f(getView()) == 1;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.component, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title_text)).setText(this.f396232a);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.cancel_button);
        imageButton.setContentDescription(this.f396233b);
        imageButton.setOnClickListener(new C146721aj(this));
        this.f396241j = (ReportAbuseHorizontalScrollView) inflate.findViewById(R.id.cards_area_wrapper);
        this.f396240i = (LinearLayout) inflate.findViewById(R.id.cards_area);
        this.f396244m = (ProgressBar) inflate.findViewById(R.id.loading_indicator);
        this.f396245n = (RelativeLayout) inflate.findViewById(R.id.footer_buttons_area);
        this.f396246o = (Button) inflate.findViewById(R.id.accept_message_button);
        this.f396247p = (Button) inflate.findViewById(R.id.done_button);
        this.f396248q = (Button) inflate.findViewById(R.id.next_button);
        this.f396249r = (Button) inflate.findViewById(R.id.submit_button);
        this.f396250s = (ImageButton) inflate.findViewById(R.id.back_button);
        this.f396251t = (Button) inflate.findViewById(R.id.undo_button);
        this.f396246o.setOnClickListener(new C146722ak(this, 2, 1));
        this.f396246o.setText(this.f396236e);
        this.f396247p.setOnClickListener(new C146722ak(this, 2, 2));
        this.f396247p.setText(this.f396237f);
        this.f396248q.setOnClickListener(new C146722ak(this, 2, 3));
        this.f396248q.setText(this.f396238g);
        this.f396249r.setOnClickListener(new C146722ak(this, 2, 4));
        this.f396249r.setText(this.f396239h);
        this.f396250s.setOnClickListener(new C146722ak(this, 1, 1));
        this.f396250s.setContentDescription(this.f396234c);
        this.f396251t.setText(this.f396235d);
        this.f396251t.setOnClickListener(new C146722ak(this, 1, 2));
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f396243l.removeCallbacksAndMessages((Object) null);
    }

    public final void onStart() {
        super.onStart();
        this.f396243l = new Handler();
    }
}
