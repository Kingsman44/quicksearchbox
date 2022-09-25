package com.google.android.apps.gsa.speech.hotword.p7282a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.material.bottomsheet.C44555f;
import com.google.android.material.bottomsheet.C44565p;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.hotword.a.f */
/* compiled from: PG */
public final class C92349f extends C44565p {

    /* renamed from: a */
    public static final C59071e f257454a = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.a.f");

    /* renamed from: c */
    public final int f257455c;

    /* renamed from: d */
    public float f257456d = 0.0f;

    /* renamed from: e */
    public int f257457e = 0;

    /* renamed from: f */
    public NestedScrollView f257458f;

    /* renamed from: g */
    public View f257459g;

    /* renamed from: h */
    public LinearLayout f257460h;

    /* renamed from: i */
    public View f257461i;

    /* renamed from: j */
    public FloatingActionButton f257462j;

    /* renamed from: k */
    public FooterLayout f257463k;

    /* renamed from: l */
    final ViewTreeObserver.OnGlobalLayoutListener f257464l = new C92346c(this);

    /* renamed from: m */
    final C44555f f257465m = new C92347d(this);

    /* renamed from: t */
    private final int f257466t;

    /* renamed from: u */
    private final int f257467u;

    /* renamed from: v */
    private View f257468v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92349f(Context context, int i, int i2) {
        super(context);
        int i3 = context.getResources().getConfiguration().uiMode;
        this.f257467u = i3;
        this.f257466t = i;
        this.f257455c = i2;
    }

    /* renamed from: a */
    public final void mo86996a(C22871g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        setOnShowListener(new C92344a(this, gVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86997g(android.view.View r9) {
        /*
            r8 = this;
            float r0 = r8.f257456d
            int r9 = r9.getHeight()
            float r9 = (float) r9
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r8.mo47541h()
            int r1 = r1.mo47504A()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x002d
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0025
            float r9 = r9 - r1
            float r0 = r0 * r9
            int r9 = java.lang.Math.round(r0)
            float r9 = (float) r9
            float r1 = r1 + r9
            goto L_0x0035
        L_0x0025:
            float r0 = r0 + r2
            float r0 = r0 * r1
            int r9 = java.lang.Math.round(r0)
            goto L_0x0034
        L_0x002d:
            float r0 = r0 + r2
            float r0 = r0 * r9
            int r9 = java.lang.Math.round(r0)
        L_0x0034:
            float r1 = (float) r9
        L_0x0035:
            float r9 = r8.f257456d
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto L_0x003f
            r9 = 0
            goto L_0x0052
        L_0x003f:
            int r9 = r8.f257455c
            float r9 = (float) r9
            float r9 = java.lang.Math.max(r9, r1)
            android.view.View r0 = r8.f257459g
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r9 = r9 - r0
            float r9 = java.lang.Math.min(r3, r9)
        L_0x0052:
            r0 = 1
            r1 = 0
            r2 = 8
            int r4 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x0087
            android.view.View r4 = r8.f257468v
            int r4 = r4.getBottom()
            androidx.core.widget.NestedScrollView r5 = r8.f257458f
            int r5 = r5.getBottom()
            androidx.core.widget.NestedScrollView r6 = r8.f257458f
            int r6 = r6.getScrollY()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r5 = r5 + r6
            if (r4 <= r5) goto L_0x0072
            goto L_0x0087
        L_0x0072:
            android.widget.LinearLayout r9 = r8.f257460h
            r9.setTranslationY(r3)
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r8.f257462j
            r9.mo48051g(r2, r0)
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r9 = r8.f257463k
            r9.setVisibility(r1)
            android.view.View r9 = r8.f257461i
            r9.setVisibility(r2)
            return
        L_0x0087:
            android.widget.LinearLayout r3 = r8.f257460h
            r3.setTranslationY(r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r8.f257462j
            int r9 = r9.getVisibility()
            if (r9 != r2) goto L_0x009f
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r8.f257462j
            r9.mo48051g(r1, r0)
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r9 = r8.f257463k
            r0 = 4
            r9.setVisibility(r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.hotword.p7282a.C92349f.mo86997g(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        if ((this.f257467u & 32) != 0 && (getContext().getResources().getConfiguration().uiMode & 32) == 0) {
            mo1197b().mo1191s(2);
        }
        super.onCreate(bundle);
    }

    public final void setContentView(View view) {
        C59104x b = f257454a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BottomSheetDialog");
        ((C59052c) ((C59052c) b).mo56372aa(12460)).mo56386p("#setContentView");
        this.f257468v = view;
        View inflate = View.inflate(getContext(), R.layout.scrollable_bottom_sheet_layout, (ViewGroup) null);
        this.f257459g = inflate;
        NestedScrollView nestedScrollView = (NestedScrollView) inflate.findViewById(R.id.bottom_sheet_scrollview);
        this.f257458f = nestedScrollView;
        nestedScrollView.addView(this.f257468v);
        this.f257460h = (LinearLayout) this.f257459g.findViewById(R.id.bottom_sheet_footer_container);
        this.f257461i = this.f257459g.findViewById(R.id.bottom_sheet_footer_separator);
        this.f257463k = (FooterLayout) this.f257459g.findViewById(R.id.bottom_sheet_opa_footer);
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.f257459g.findViewById(R.id.bottom_sheet_opa_scroll_button);
        this.f257462j = floatingActionButton;
        floatingActionButton.setOnClickListener(new C92348e(this));
        super.setContentView(this.f257459g);
        mo47541h().mo47508F(this.f257465m);
        mo47541h().mo47516N(Math.round(((float) this.f257466t) * 0.6f));
    }

    public final void show() {
        this.f257459g.getViewTreeObserver().addOnGlobalLayoutListener(this.f257464l);
        super.show();
    }
}
