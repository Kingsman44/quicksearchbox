package com.google.android.apps.search.googleapp.tabs.manager;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p096h.C1950c;
import androidx.core.widget.C2134u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.ab */
/* compiled from: PG */
final class C139719ab extends C46756m {

    /* renamed from: a */
    final /* synthetic */ C139720ac f379764a;

    public C139719ab(C139720ac acVar) {
        this.f379764a = acVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo18113a(ViewGroup viewGroup) {
        return (TabView) this.f379764a.f379770c.getLayoutInflater().inflate(R.layout.googleapp_tabs_manager_tab, viewGroup, false);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18114b(View view, Object obj) {
        Drawable drawable;
        C139713a aVar = (C139713a) obj;
        C139737d g = ((TabView) view).mo17754z();
        C28306ab abVar = g.f379829d;
        TabView tabView = g.f379827b;
        C28313c a = g.f379830e.mo33805a(C28427h.m53115a(110662));
        a.mo33858f(C28375ak.m53059a((long) aVar.f379757d.hashCode()));
        abVar.mo33802c(tabView, a);
        g.f379829d.mo33802c(g.f379832g, g.f379830e.mo33805a(C28427h.m53115a(110653)));
        g.f379829d.mo33802c(g.f379833h, g.f379830e.mo33805a(C28427h.m53115a(110651)));
        TextView textView = (TextView) g.f379827b.findViewById(R.id.googleapp_tabs_manager_tab_title);
        textView.setText(aVar.f379756c);
        Resources resources = g.f379827b.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.googleapp_tabs_manager_tab_fav_icon_size);
        if ((aVar.f379754a.f362921a & 32) != 0) {
            drawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(aVar.f379759f.mo59041m()));
        } else if (!aVar.f379760g) {
            drawable = g.f379826a.getDrawable(R.drawable.googleg_standard_color_24);
        } else {
            drawable = g.f379826a.getDrawable(R.drawable.quantum_ic_web_vd_theme_24);
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
            C2134u.m5912d(textView, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if ((aVar.f379754a.f362921a & 16) != 0) {
            g.f379832g.setImageBitmap(BitmapFactory.decodeStream(aVar.f379758e.mo59041m()));
        } else {
            g.f379832g.setImageDrawable(new ColorDrawable(g.f379826a.getColor(R.color.agsa_color_background)));
        }
        ImageView imageView = g.f379832g;
        Context context = g.f379826a;
        C1950c a2 = C1950c.m5272a();
        imageView.setContentDescription(context.getString(R.string.googleapp_tabs_manager_tab_description, new Object[]{a2.mo5101f(aVar.f379756c, a2.f5867d)}));
        g.f379832g.setOnClickListener(new C47591co(g.f379828c, "TabScreenshot onClick", new C139731b(g, aVar)));
        Resources resources2 = g.f379826a.getResources();
        if (aVar.f379755b) {
            g.f379827b.mo47610k(ColorStateList.valueOf(g.f379826a.getColor(R.color.agsa_color_primary_variant)));
            g.f379827b.mo47611m(resources2.getDimensionPixelOffset(R.dimen.googleapp_tabs_manager_tab_active_stroke_width));
            g.f379827b.setElevation((float) resources2.getDimensionPixelOffset(R.dimen.googleapp_tabs_manager_tab_active_elevation));
            g.f379827b.setOutlineAmbientShadowColor(g.f379826a.getColor(R.color.agsa_color_primary));
            g.f379827b.setOutlineSpotShadowColor(g.f379826a.getColor(R.color.agsa_color_primary));
        } else {
            g.f379827b.mo47611m(0);
            g.f379827b.setElevation((float) resources2.getDimensionPixelOffset(R.dimen.googleapp_tabs_manager_tab_elevation));
        }
        View view2 = g.f379833h;
        Context context2 = g.f379826a;
        C1950c a3 = C1950c.m5272a();
        view2.setContentDescription(context2.getString(R.string.googleapp_tabs_manager_close_tab_button_description, new Object[]{a3.mo5101f(aVar.f379756c, a3.f5867d)}));
        g.f379833h.setOnClickListener(new C47591co(g.f379828c, "TabCloseButton onClick", new C139735c(g, aVar)));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo50773c(View view) {
        C139737d g = ((TabView) view).mo17754z();
        C28306ab.m52929e(g.f379833h);
        C28306ab.m52929e(g.f379832g);
        C28306ab.m52929e(g.f379827b);
    }
}
