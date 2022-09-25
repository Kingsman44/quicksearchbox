package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.monet.C90165af;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90326d;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105452v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.er */
/* compiled from: PG */
public class C105598er extends C105486an {

    /* renamed from: t */
    public String f294640t = BuildConfig.FLAVOR;

    /* renamed from: u */
    private ImageView f294641u;

    /* renamed from: v */
    private View f294642v;

    /* renamed from: w */
    private TextView f294643w;

    public C105598er(C22945j jVar, C105452v vVar, Context context, C90326d dVar, C90320d dVar2, C90314b bVar, C91142g gVar, C90165af afVar) {
        super(jVar, vVar, context, dVar, dVar2, bVar, gVar, afVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo94837e() {
        return R.layout.rounded_minus_one_header;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo94838g(boolean z) {
        super.mo94838g(z);
        Resources resources = this.f294235b.getResources();
        if (!z) {
            C2043bi.m5531Y(this.f294642v, ColorStateList.valueOf(resources.getColor(R.color.agsa_color_light_surface_elevation_2)));
        } else {
            C2043bi.m5531Y(this.f294642v, ColorStateList.valueOf(resources.getColor(R.color.agsa_color_dark_surface_elevation_2)));
        }
    }

    /* renamed from: iw */
    public void mo28299iw() {
        super.mo28299iw();
        TextView textView = (TextView) this.f294242i.findViewById(R.id.voice_hint_text);
        this.f294643w = textView;
        textView.addOnLayoutChangeListener(new C105594en(this));
        View findViewById = this.f294242i.findViewById(R.id.search_box);
        this.f294642v = findViewById;
        findViewById.setOnClickListener(new C105595eo(this));
        ImageView imageView = (ImageView) this.f294242i.findViewById(R.id.mic_button);
        this.f294641u = imageView;
        imageView.setBackgroundResource(R.drawable.ic_mic);
        this.f294641u.setContentDescription(this.f294235b.getString(R.string.accessibility_voice_search_button));
        this.f294641u.setOnClickListener(new C105596ep(this));
        ((C23249a) ((C105452v) this.f294234a).mo94644h()).mo28726b(new C105597eq(this));
        int a = C90686c.m148055a(this.f294235b, 4);
        int dimensionPixelSize = this.f294235b.getResources().getDimensionPixelSize(R.dimen.rounded_header_side_padding);
        ViewGroup.LayoutParams layoutParams = this.f294243j.getLayoutParams();
        layoutParams.width = a + dimensionPixelSize + dimensionPixelSize;
        this.f294243j.setLayoutParams(layoutParams);
    }

    /* renamed from: r */
    public final void mo94926r() {
        boolean z = true;
        if (!TextUtils.isEmpty(this.f294640t)) {
            double ceil = Math.ceil((double) this.f294643w.getPaint().measureText(this.f294640t));
            int measuredWidth = this.f294643w.getMeasuredWidth();
            int dimensionPixelSize = this.f294235b.getResources().getDimensionPixelSize(R.dimen.rounded_header_hint_padding);
            if (measuredWidth - (dimensionPixelSize + dimensionPixelSize) < ((int) ceil)) {
                z = false;
            }
            C58976aa aaVar = C58975e.f156826a;
        }
        if (!TextUtils.isEmpty(this.f294640t) && z) {
            C58976aa aaVar2 = C58975e.f156826a;
            if (!this.f294643w.getText().toString().equals(this.f294640t)) {
                this.f294643w.setAlpha(0.0f);
                this.f294643w.setText(this.f294640t);
                this.f294643w.animate().alpha(1.0f).setDuration(500);
                boolean booleanValue = ((Boolean) ((C23249a) ((C105452v) this.f294234a).mo94610f()).mo28725a()).booleanValue();
                String str = (String) ((C23249a) ((C105452v) this.f294234a).mo94642d()).mo28725a();
                String str2 = (String) ((C23249a) ((C105452v) this.f294234a).mo94643g()).mo28725a();
                if (booleanValue) {
                    if (!str2.isEmpty()) {
                        this.f294643w.setTextColor(Color.parseColor(str2));
                        return;
                    }
                } else if (!str.isEmpty()) {
                    this.f294643w.setTextColor(Color.parseColor(str));
                    return;
                }
                this.f294643w.setTextColor(this.f294235b.getResources().getColor(R.color.search_plate_hint_color));
            }
        } else if (!this.f294643w.getText().toString().isEmpty()) {
            C58976aa aaVar3 = C58975e.f156826a;
            this.f294643w.animate().cancel();
            this.f294643w.setText(BuildConfig.FLAVOR);
            this.f294643w.setAlpha(0.0f);
        }
    }
}
