package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.Fragment;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.p109f.p110a.C2249w;
import androidx.p109f.p110a.C2251y;
import androidx.p109f.p110a.C2252z;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web.C130201ah;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.k */
/* compiled from: PG */
public final class C130274k {

    /* renamed from: b */
    private static final C59071e f357113b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.k");

    /* renamed from: c */
    private static final C2249w f357114c = new C130273j();

    /* renamed from: a */
    public final View f357115a;

    /* renamed from: d */
    private final Fragment f357116d;

    /* renamed from: e */
    private final C127118j f357117e;

    /* renamed from: f */
    private final C2251y f357118f;

    /* renamed from: g */
    private int f357119g = 0;

    public C130274k(Fragment fragment, View view, C127118j jVar) {
        this.f357116d = fragment;
        this.f357115a = view;
        this.f357117e = jVar;
        C2251y yVar = new C2251y(this, f357114c);
        C2252z zVar = new C2252z();
        zVar.mo5596b(0.75f);
        zVar.mo5597c(200.0f);
        yVar.f6330o = zVar;
        yVar.mo5587f(new C130272i(this));
        this.f357118f = yVar;
    }

    /* renamed from: a */
    public final void mo109619a(int i) {
        if (i <= this.f357119g && i >= 0) {
            ViewGroup.LayoutParams layoutParams = this.f357115a.getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = i;
            this.f357115a.requestLayout();
        }
    }

    /* renamed from: b */
    public final boolean mo109620b(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (((C130201ah) this.f357116d.getChildFragmentManager().f634a.mo671c("web_content_root_fragment")) == null && ((ContentScrollView) this.f357115a.findViewById(R.id.assistant_response_layer_scrollable_content)).f356833a >= this.f357115a.findViewById(R.id.assistant_response_layer_content).getHeight()) {
            ViewGroup.LayoutParams layoutParams = this.f357115a.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.height == -2) {
                this.f357119g = this.f357115a.getHeight();
            }
            int x = (int) (motionEvent2.getX() - motionEvent.getX());
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            if (Math.abs(x) > Math.abs(y)) {
                return false;
            }
            int height = this.f357115a.getHeight() - y;
            if (motionEvent2.getActionMasked() == 3 || motionEvent2.getActionMasked() == 1) {
                if (motionEvent2.getActionMasked() != 3) {
                    double d = (double) this.f357119g;
                    Double.isNaN(d);
                    if (((double) height) < d * 0.6d) {
                        ((C59052c) ((C59052c) f357113b.mo56224b()).mo56372aa(38740)).mo56386p("Drag to dismiss");
                        this.f357117e.mo107933i();
                        return true;
                    }
                }
                if (height < this.f357119g) {
                    int height2 = this.f357115a.getHeight();
                    int i = this.f357119g;
                    if (height2 != i) {
                        this.f357118f.mo5589h((float) height2);
                        this.f357118f.mo5593i((float) i);
                        this.f357118f.mo5585d();
                    }
                    return true;
                }
            } else {
                ViewConfiguration.get(this.f357115a.getContext());
                if (Math.hypot((double) Math.abs(x), (double) Math.abs(y)) < ((double) ViewConfiguration.getTouchSlop())) {
                    return false;
                }
                mo109619a(height);
                return true;
            }
        }
        return false;
    }
}
