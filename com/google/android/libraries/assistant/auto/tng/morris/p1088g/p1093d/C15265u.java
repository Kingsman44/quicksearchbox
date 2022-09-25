package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14555no;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.u */
/* compiled from: PG */
public final class C15265u {

    /* renamed from: a */
    public static final /* synthetic */ int f45794a = 0;

    /* renamed from: b */
    private static final int[] f45795b = {R.id.loading_shimmer_1, R.id.loading_shimmer_2, R.id.loading_shimmer_3, R.id.loading_shimmer_4};

    /* renamed from: c */
    private final C14132bf f45796c;

    /* renamed from: d */
    private ViewGroup f45797d;

    /* renamed from: e */
    private TextView f45798e;

    /* renamed from: f */
    private ImageView f45799f;

    /* renamed from: g */
    private C14555no f45800g;

    /* renamed from: h */
    private final List f45801h = new ArrayList();

    public C15265u(C14132bf bfVar) {
        this.f45796c = bfVar;
    }

    /* renamed from: a */
    public final void mo22150a(C14555no noVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        String str;
        if (!noVar.equals(this.f45800g)) {
            if (this.f45797d == null) {
                LayoutInflater.from(contextThemeWrapper).inflate(R.layout.expanded_voice_plate, viewGroup, true);
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.expanded_voice_plate_task_view);
                this.f45797d = viewGroup2;
                viewGroup2.getClass();
                this.f45798e = (TextView) viewGroup2.findViewById(R.id.voice_plate_transcribed_text);
                ViewGroup viewGroup3 = this.f45797d;
                viewGroup3.getClass();
                this.f45799f = (ImageView) viewGroup3.findViewById(R.id.voice_plate_opa_icon);
                C14132bf bfVar = this.f45796c;
                ViewGroup viewGroup4 = this.f45797d;
                viewGroup4.getClass();
                bfVar.mo21444a(viewGroup4, 150460);
            }
            int i = 8;
            if (noVar.f44012c) {
                for (int i2 = 0; i2 < 4 && this.f45801h.size() <= 4; i2++) {
                    List list = this.f45801h;
                    ViewGroup viewGroup5 = this.f45797d;
                    viewGroup5.getClass();
                    list.add(C15352z.m31953e(viewGroup5.findViewById(f45795b[i2]), 0));
                }
                ViewGroup viewGroup6 = this.f45797d;
                viewGroup6.getClass();
                viewGroup6.findViewById(R.id.loading_shimmer_group).setVisibility(0);
                ImageView imageView = this.f45799f;
                imageView.getClass();
                imageView.setVisibility(8);
                TextView textView = this.f45798e;
                textView.getClass();
                textView.setVisibility(8);
            } else {
                Collection.EL.forEach(this.f45801h, C15264t.f45793a);
                this.f45801h.clear();
                ViewGroup viewGroup7 = this.f45797d;
                viewGroup7.getClass();
                viewGroup7.findViewById(R.id.loading_shimmer_group).setVisibility(8);
                ImageView imageView2 = this.f45799f;
                imageView2.getClass();
                if (true == noVar.f44011b) {
                    i = 0;
                }
                imageView2.setVisibility(i);
                TextView textView2 = this.f45798e;
                textView2.getClass();
                textView2.setVisibility(0);
                TextView textView3 = this.f45798e;
                textView3.getClass();
                if (noVar.f44011b) {
                    str = contextThemeWrapper.getString(R.string.voice_plate_welcome_message);
                } else {
                    str = noVar.f44010a;
                }
                textView3.setText(str);
            }
            this.f45800g = noVar;
        }
    }

    /* renamed from: b */
    public final void mo22151b() {
        this.f45797d = null;
        this.f45798e = null;
        this.f45799f = null;
        this.f45800g = null;
        Collection.EL.forEach(this.f45801h, C15263s.f45792a);
        this.f45801h.clear();
    }
}
