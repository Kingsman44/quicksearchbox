package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93666w;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class LocalResultsView extends C93666w {

    /* renamed from: a */
    public C93454au f260754a;

    /* renamed from: b */
    protected ViewGroup f260755b;

    /* renamed from: c */
    public final List f260756c = new ArrayList();

    /* renamed from: d */
    protected LayoutInflater f260757d;

    /* renamed from: e */
    protected WebImageView f260758e;

    /* renamed from: f */
    protected int f260759f;

    /* renamed from: g */
    protected int f260760g;

    /* renamed from: h */
    protected int f260761h;

    /* renamed from: i */
    public boolean f260762i;

    /* renamed from: v */
    private C91189au f260763v;

    public LocalResultsView(Context context) {
        super(context);
    }

    /* renamed from: g */
    private final void m153776g(C93454au auVar) {
        this.f260758e.setOnClickListener(new C93453at(this, auVar));
    }

    /* renamed from: h */
    private final void m153777h(View view, String str, String str2, String str3, int i, View.OnClickListener onClickListener) {
        ((TextView) view.findViewById(R.id.local_results_item_title)).setText(str);
        ((TextView) view.findViewById(R.id.local_results_item_address)).setText(str2);
        TextView textView = (TextView) view.findViewById(R.id.local_results_item_phone_number);
        if (TextUtils.isEmpty(str3)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str3);
        }
        View findViewById = view.findViewById(R.id.local_results_item_content);
        findViewById.getClass();
        if (i == 4) {
            C89941l.m146512c(findViewById, 7613);
            findViewById.setOnClickListener(new C93452as(onClickListener));
        } else {
            findViewById.setOnClickListener(onClickListener);
        }
        this.f260755b.addView(view);
        this.f260756c.add(view);
        this.f260759f++;
    }

    /* renamed from: a */
    public void mo87727a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.local_results_divider, this.f260755b, false);
        this.f260755b.addView(inflate);
        this.f260756c.add(inflate);
    }

    /* renamed from: d */
    public final void mo87730d() {
        for (View removeView : this.f260756c) {
            this.f260755b.removeView(removeView);
        }
        this.f260756c.clear();
        this.f260759f = 0;
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
        this.f260758e.setEnabled(z);
        for (View enabled : this.f260756c) {
            enabled.setEnabled(z);
        }
    }

    /* renamed from: f */
    public final void mo87732f() {
        mo87728b(((LocationArgument) this.f261447m).mo81313h());
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        WebImageView webImageView = (WebImageView) findViewById(R.id.local_results_card_map);
        this.f260758e = webImageView;
        webImageView.f227358h = new C93449ap(this);
        C89941l.m146512c(webImageView, 7615);
        this.f260755b = (ViewGroup) findViewById(R.id.local_results_container);
        this.f260760g = R.layout.small_location_argument_editor;
        this.f260761h = R.layout.local_results_item_2;
    }

    public LocalResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public final void mo87729c(C93454au auVar, C91189au auVar2, LayoutInflater layoutInflater) {
        auVar.getClass();
        auVar2.getClass();
        layoutInflater.getClass();
        this.f260754a = auVar;
        this.f260763v = auVar2;
        this.f260757d = layoutInflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87728b(com.google.p4152bb.p4153a.C55114gj r14) {
        /*
            r13 = this;
            r14.getClass()
            com.google.protobuf.cq r0 = r14.f145037b
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x002b
            com.google.android.apps.gsa.now.shared.ui.WebImageView r0 = r13.f260758e
            android.content.res.Resources r3 = r13.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.google.protobuf.cq r5 = r14.f145037b
            java.lang.Object r5 = r5.get(r2)
            com.google.bb.a.gh r5 = (com.google.p4152bb.p4153a.C55112gh) r5
            java.lang.String r5 = r5.f145027i
            r4[r2] = r5
            r5 = 2132089151(0x7f15193f, float:1.9818606E38)
            java.lang.String r3 = r3.getString(r5, r4)
            r0.setContentDescription(r3)
        L_0x002b:
            int r0 = r14.f145041f
            r3 = 2
            r4 = 4
            if (r0 == r1) goto L_0x0041
            if (r0 == r3) goto L_0x003f
            r5 = 3
            if (r0 == r5) goto L_0x0042
            if (r0 == r4) goto L_0x003d
            r5 = 5
            if (r0 == r5) goto L_0x0042
            r5 = 0
            goto L_0x0042
        L_0x003d:
            r5 = 4
            goto L_0x0042
        L_0x003f:
            r5 = 2
            goto L_0x0042
        L_0x0041:
            r5 = 1
        L_0x0042:
            int r0 = r14.f145036a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x005f
            com.google.protobuf.z r0 = r14.f145039d
            byte[] r0 = r0.mo59174N()
            int r3 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r2, r3)
            if (r0 == 0) goto L_0x005f
            com.google.android.apps.gsa.now.shared.ui.WebImageView r3 = r13.f260758e
            r3.setImageBitmap(r0)
            com.google.android.apps.gsa.staticplugins.actionsui.au r0 = r13.f260754a
            r13.m153776g(r0)
            goto L_0x0071
        L_0x005f:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r0 = r13.f260758e
            java.lang.String r3 = r14.f145038c
            android.net.Uri r3 = android.net.Uri.parse(r3)
            com.google.android.apps.gsa.shared.y.au r6 = r13.f260763v
            r0.mo76737h(r3, r6)
            com.google.android.apps.gsa.staticplugins.actionsui.au r0 = r13.f260754a
            r13.m153776g(r0)
        L_0x0071:
            r13.mo87730d()
            com.google.protobuf.cq r0 = r14.f145037b
            int r0 = r0.size()
            java.lang.String r3 = ""
            if (r0 != r1) goto L_0x00a6
            com.google.protobuf.cq r14 = r14.f145037b
            java.lang.Object r14 = r14.get(r2)
            com.google.bb.a.gh r14 = (com.google.p4152bb.p4153a.C55112gh) r14
            if (r5 != r4) goto L_0x008c
            java.lang.String r0 = r14.f145029k
            r10 = r0
            goto L_0x008d
        L_0x008c:
            r10 = r3
        L_0x008d:
            android.view.LayoutInflater r0 = r13.f260757d
            int r1 = r13.f260760g
            android.view.ViewGroup r3 = r13.f260755b
            android.view.View r7 = r0.inflate(r1, r3, r2)
            java.lang.String r8 = r14.f145021c
            java.lang.String r9 = r14.f145028j
            com.google.android.apps.gsa.staticplugins.actionsui.aq r12 = new com.google.android.apps.gsa.staticplugins.actionsui.aq
            r12.<init>(r13, r14)
            r6 = r13
            r11 = r5
            r6.m153777h(r7, r8, r9, r10, r11, r12)
            return
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            com.google.protobuf.cq r1 = r14.f145037b
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x010c
            com.google.protobuf.cq r1 = r14.f145037b
            java.lang.Object r1 = r1.get(r0)
            com.google.bb.a.gh r1 = (com.google.p4152bb.p4153a.C55112gh) r1
            if (r5 != r4) goto L_0x00bd
            java.lang.String r6 = r1.f145029k
            r10 = r6
            goto L_0x00be
        L_0x00bd:
            r10 = r3
        L_0x00be:
            java.lang.String r8 = r1.f145021c
            java.lang.String r9 = r1.f145028j
            com.google.android.apps.gsa.staticplugins.actionsui.ar r12 = new com.google.android.apps.gsa.staticplugins.actionsui.ar
            r12.<init>(r13, r1)
            android.view.LayoutInflater r1 = r13.f260757d
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2130903114(0x7f03004a, float:1.7413037E38)
            java.lang.String[] r6 = r6.getStringArray(r7)
            int r7 = r13.f260759f
            int r11 = r6.length
            if (r7 < r11) goto L_0x00da
            goto L_0x00fa
        L_0x00da:
            int r7 = r13.f260761h
            android.view.ViewGroup r11 = r13.f260755b
            android.view.View r7 = r1.inflate(r7, r11, r2)
            r1 = 2131432964(0x7f0b1604, float:1.84877E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.getClass()
            int r11 = r13.f260759f
            r6 = r6[r11]
            r1.setText(r6)
            r6 = r13
            r11 = r5
            r6.m153777h(r7, r8, r9, r10, r11, r12)
        L_0x00fa:
            com.google.protobuf.cq r1 = r14.f145037b
            int r1 = r1.size()
            int r1 = r1 + -1
            if (r0 >= r1) goto L_0x0109
            android.view.LayoutInflater r1 = r13.f260757d
            r13.mo87727a(r1)
        L_0x0109:
            int r0 = r0 + 1
            goto L_0x00a7
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.LocalResultsView.mo87728b(com.google.bb.a.gj):void");
    }
}
