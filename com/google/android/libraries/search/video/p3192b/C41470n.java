package com.google.android.libraries.search.video.p3192b;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.video.players.C41591v;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.search.video.b.n */
/* compiled from: PG */
final class C41470n implements C41591v {

    /* renamed from: a */
    private final View f108324a;

    /* renamed from: b */
    private final TextView f108325b;

    /* renamed from: c */
    private final TextView f108326c;

    /* renamed from: d */
    private final View f108327d;

    /* renamed from: e */
    private final View f108328e;

    /* renamed from: f */
    private final boolean f108329f;

    /* renamed from: g */
    private final boolean f108330g;

    /* renamed from: h */
    private final boolean f108331h;

    /* renamed from: i */
    private final C41468l f108332i;

    public C41470n(View view, boolean z, String str, boolean z2, C41468l lVar) {
        this.f108324a = view.findViewById(R.id.load_indicator);
        TextView textView = (TextView) view.findViewById(R.id.preview_label);
        this.f108325b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.short_video_preview_label);
        this.f108326c = textView2;
        this.f108327d = view.findViewById(R.id.launch_on_3P_app_icon);
        this.f108328e = view.findViewById(R.id.play_button);
        textView.setText(str);
        textView2.setText(str);
        this.f108329f = z;
        this.f108330g = !C58837ba.m90859h(str);
        this.f108331h = z2;
        this.f108332i = lVar;
    }

    /* renamed from: a */
    public final void mo42106a(C41592w wVar, int i, int i2) {
        if (i != i2) {
            int i3 = i - 1;
            if (i != 0) {
                int i4 = 0;
                switch (i3) {
                    case 0:
                    case 6:
                        this.f108328e.setVisibility((this.f108332i == C41468l.STANDARD || this.f108332i == C41468l.SMALL) ? 0 : 8);
                        if (this.f108329f) {
                            View view = this.f108327d;
                            if (this.f108332i != C41468l.STANDARD) {
                                i4 = 8;
                            }
                            view.setVisibility(i4);
                        }
                        this.f108325b.setVisibility(8);
                        this.f108326c.setVisibility(8);
                        this.f108324a.setVisibility(8);
                        return;
                    case 1:
                        View view2 = this.f108324a;
                        if (this.f108332i != C41468l.STANDARD) {
                            i4 = 8;
                        }
                        view2.setVisibility(i4);
                        this.f108325b.setVisibility(8);
                        this.f108326c.setVisibility(8);
                        this.f108327d.setVisibility(8);
                        this.f108328e.setVisibility(8);
                        return;
                    case 2:
                    case 3:
                        this.f108324a.setVisibility(8);
                        if (!this.f108330g) {
                            return;
                        }
                        if (this.f108331h) {
                            TextView textView = this.f108326c;
                            if (this.f108332i != C41468l.STANDARD) {
                                i4 = 8;
                            }
                            textView.setVisibility(i4);
                            return;
                        }
                        TextView textView2 = this.f108325b;
                        if (this.f108332i != C41468l.STANDARD) {
                            i4 = 8;
                        }
                        textView2.setVisibility(i4);
                        return;
                    case 4:
                    case 5:
                        this.f108324a.setVisibility(8);
                        if (!this.f108330g) {
                            return;
                        }
                        if (this.f108331h) {
                            this.f108326c.setVisibility(8);
                            return;
                        }
                        TextView textView3 = this.f108325b;
                        if (this.f108332i != C41468l.STANDARD) {
                            i4 = 8;
                        }
                        textView3.setVisibility(i4);
                        return;
                    default:
                        return;
                }
            } else {
                throw null;
            }
        }
    }
}
